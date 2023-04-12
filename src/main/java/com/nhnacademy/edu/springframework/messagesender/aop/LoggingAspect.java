package com.nhnacademy.edu.springframework.messagesender.aop;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.annotation.ElapsedTimeLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.util.Arrays;
import java.util.Objects;

@Aspect
@Component
public class LoggingAspect {

    //    @Around("execution(public * *.sendMessage(..)) && args(user, ..)")
//    @Around("@annotation(com.nhnacademy.edu.springframework.messagesender.annotation.ElapsedTimeLog) && args(user,..)" )
    @Around("@annotation(com.nhnacademy.edu.springframework.messagesender.annotation.ElapsedTimeLog) && args(user,..)")

    public Object loggingExecutionTime(ProceedingJoinPoint pjp, User user) {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object rt = null;
        try {
            rt = pjp.proceed();

        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            stopWatch.stop();
            System.out.println("\n//--------------------------------------//");
            System.out.println(user.getPhoneNumber());
            System.out.println(stopWatch.prettyPrint());
            System.out.println("//--------------------------------------//\n");

        }
        return rt;


    }
}
