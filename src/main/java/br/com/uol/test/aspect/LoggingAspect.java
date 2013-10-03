/**
 * 
 */
package br.com.uol.test.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author cad_rfirmino
 *
 */
@Aspect
public class LoggingAspect {

	@Before("execution(* br.com.uol.test.controller.*.*(..))")
	public void logBefore(JoinPoint joinPoint) {
 
		System.out.println("logBefore() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}
	
	@After("execution(* br.com.uol.test.controller.*.*(..))")
	public void logAfter(JoinPoint joinPoint) {
 
		System.out.println("logAfter() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
 
	}
}
