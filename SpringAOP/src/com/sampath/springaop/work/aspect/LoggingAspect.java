package com.sampath.springaop.work.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	/*@Before("execution(public String getName())")
	public void LoggingAdvise(){
		System.out.println("Advise Run , Logging Aspect Called!");
	}*/
	
	/*@Before("execution(public String com.sampath.springaop.work.dto.Circle.getName())")
	public void LoggingAdvise(){
		System.out.println("Advise Run , Logging Aspect Called!");
	}*/
	
	/*@Before("execution(public * get*())")
	public void LoggingAdvise(){
		System.out.println("Advise Run , Logging Aspect Called!");
	}*/
	
	/*@Before("execution(public * get*(*))")
	public void LoggingAdvise(){
		System.out.println("Advise Run , Logging Aspect Called!");
	}*/
	
	/*@Before("execution(public * get*(..))")
	public void LoggingAdvise(){
		System.out.println("Advise Run , Logging Aspect Called!");
	}*/
	
	//--------------------------------------------------------------
	/*@Before("allTheGetters()")
	public void LoggingAdvise1(){
		System.out.println("Advise1 Run , Logging Aspect1 Called!");
	}
	
	@Before("allTheGetters()")
	public void LoggingAdvise2(){
		System.out.println("Advise2 Run , Logging Aspect2 Called!");
	}
	
	@Pointcut("execution(public * getName(..))")
	public void allTheGetters(){}*/
	//--------------------------------------------------------------
	
	/*@Before("allTheGetters()")
	public void LoggingAdvise1(){
		System.out.println("Advise1 Run , Logging Aspect1 Called!");
	}
	
	@Before("allTheGetters()")
	public void LoggingAdvise2(){
		System.out.println("Advise2 Run , Logging Aspect2 Called!");
	}*/
	
	/*@Pointcut("within(com.sampath.springaop.work.dto.Circle)")
	public void allTheGetters(){}*/
	
	/*@Pointcut("within(com.sampath.springaop.work.dto..*)")
	public void allTheGetters(){}*/
	
	//--------------------------------------------------------------
	
	/*@Pointcut("args(..)")
	public void allTheGetters(){}*/
	
	//--------------------------------------------------------------
	
	/*@Before("allTheGetters1() && allTheGetters2()")
	public void LoggingAdvise1(){
		System.out.println("Advise1 Run , Logging Aspect1 Called!");
	}
	
	@Before("allTheGetters2()")
	public void LoggingAdvise2(){
		System.out.println("Advise2 Run , Logging Aspect2 Called!");
	}
	
	@Pointcut("within(com.sampath.springaop.work.dto.Circle)")
	public void allTheGetters1(){}
	
	@Pointcut("execution(public * get*(..))")
	public void allTheGetters2(){}*/
	
	//--------------------------------------------------------------
	
	@Before("allTheGetters2()")
	public void LoggingAdvise1(JoinPoint joinPoint){
		System.out.println("Advise1 Run , Logging Aspect1 Called!");
		System.out.println(joinPoint.toString());
		System.out.println(joinPoint.getTarget());
	}
	
	@Before("args(name)")
	public void stringArgumentMethod(String name){
		System.out.println("String argument method: " + name);
	}
	
	@Pointcut("execution(public * get*(..))")
	public void allTheGetters1(){}
	
	@Pointcut("within(com.sampath.springaop.work.dto.Circle)")
	public void allTheGetters2(){}
	
}
	