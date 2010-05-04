package com.philbeaudoin.gwtp.dispatch.client;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;

/**
 * Bind this annotation on the string you want to
 * use as a security cookie:
 * <pre>
 * bindConstant().annotatedWith(SecurityCookie.class).to("MYCOOKIE");
 * </pre>
 * See {@link DefaultSecurityCookieAccessor}.
 * 
 * @author Philippe Beaudoin
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@BindingAnnotation
public @interface SecurityCookie {}