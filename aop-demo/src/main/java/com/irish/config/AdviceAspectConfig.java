package com.irish.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AdviceAspectConfig {

  
	/**
	 *  每种通配符表示的含义: | *表示任意字符  | ..表示本包和子包 或者是任意参数  | 
	 *  切入点：修饰符是public ,返回值任意类型，  service包和他的子包，以Service结尾的类，任意的方法
	 */
    @Pointcut("execution(public * com.irish.service..*Service.*(..))")
    public void matchServiceMethod(){}

   
    /**
               * 可以在方法执行的前后添加非功能性的代码
    */
    @Around("matchServiceMethod()")
    public java.lang.Object after(ProceedingJoinPoint joinPoint){
        System.out.println("###before");
        java.lang.Object result = null;
        try{
        	System.out.println("方法参数:");
        	java.lang.Object[] args = joinPoint.getArgs();
        	System.out.println("被代理的对象"+joinPoint.getTarget());
            result = joinPoint.proceed(joinPoint.getArgs());
            System.out.println("###after returning");
        }catch (Throwable e){
            System.out.println("###after throwing");
            e.printStackTrace();
            
        }finally {
            System.out.println("###finally");
        }
        return result;
    }

}
