package com.hta.elevator.common.annotaion;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface EntityOperator {

	public String operatorNaem() default "";
}
