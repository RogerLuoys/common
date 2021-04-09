package com.luoys.common.annotation;

import java.lang.annotation.*;

/**
 * 该入参可以为空
 */
@Documented
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.SOURCE)
public @interface Nullable {
}
