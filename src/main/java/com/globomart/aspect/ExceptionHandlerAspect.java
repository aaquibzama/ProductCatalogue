package com.globomart.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.hibernate.HibernateException;

import com.globomart.exception.SearchByIDException;

@Aspect
public class ExceptionHandlerAspect {

    @Around("execution(* com.globomart.controller.CatalogueController.*(..))")
    public Object intercept(ProceedingJoinPoint joinPoint) {
        try {
            return joinPoint.proceed();
        } catch (SearchByIDException e) {
        	return "Unable to find result";
        } catch (IllegalArgumentException | HibernateException e) {
        	return "Unable to process your request";
        } catch (Throwable e) {
        	return "An error occured";
        }
    }
}
