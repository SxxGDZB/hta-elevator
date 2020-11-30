package com.hta.elevator.config.database;

/**
 * @author yjzn
 * @date 2019年12月19日15:37:31
 */

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

// 扫描 Mapper 接口并容器管理
@Configuration
@MapperScan(basePackages = DataSourceConfig.PACKAGE, sqlSessionFactoryRef = "SqlSessionFactory")
public class DataSourceConfig {

    // 精确到 slave 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.hta.elevator.mapper";
    static final String MAPPER_LOCATION = "classpath:mapper/*.xml";

    @Value("${hta.datasource.url}")
    private String url;

    @Value("${hta.datasource.username}")
    private String user;

    @Value("${hta.datasource.password}")
    private String password;

    @Value("${hta.datasource.driverClassName}")
    private String driverClass;

    @Bean(name = "htaDataSource")
    @Primary
    public DataSource htaDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "htaTransactionManager")
    @Primary
    public DataSourceTransactionManager htaTransactionManager() {
        return new DataSourceTransactionManager(htaDataSource());
    }

    @Bean(name = "SqlSessionFactory")
    @Primary
    public SqlSessionFactory SqlSessionFactory(@Qualifier("htaDataSource") DataSource htaDataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();

        //开启驼峰命名
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
        sessionFactory.setConfiguration(configuration);

        sessionFactory.setDataSource(htaDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(DataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
