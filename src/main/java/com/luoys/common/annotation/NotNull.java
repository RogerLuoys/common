package com.luoys.common.annotation;

import java.lang.annotation.*;

/**
 * 入参不能为空
 *
 * <ul><li>
 * The method does override or implement a method declared in a
 * supertype.
 * </li><li>
 * The method has a signature that is override-equivalent to that of
 * any public method declared in {@linkplain Object}.
 * </li></ul>
 *
 * @author  Peter von der Ah&eacute;
 * @author  Joshua Bloch
 * @jls 9.6.1.4 @NotNull
 * @since 1.5
 */
@Documented
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.SOURCE)
public @interface NotNull {
}
