package pl.bykowski.ksb2;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloAspect {

    @Around("execution(String pl.bykowski.ksb2.Hello.sayHello())")
    private void aroundHello(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("aroundHello");
        joinPoint.proceed();
    }

    @Before("execution(String pl.bykowski.ksb2.Hello.sayHello())")
    private void beforeHello() {
        System.out.println("beforeHello");
    }

    @After("execution(String pl.bykowski.ksb2.Hello.sayHello())")
    private void afterHello() {
        System.out.println("afterHello");
    }


}
