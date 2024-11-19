package com.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation can be used to define patterns for ReplayMod's preprocessor. This class file is linked in the build.gradle file,
 * so make sure the path is correct.
 *
 * @see <a href="https://github.com/ReplayMod/preprocessor?tab=readme-ov-file#patterns">ReplayMod's preprocessor example</a>
 */
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface Pattern {
}
