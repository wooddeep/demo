package com.example.demo

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.springframework.stereotype.Component

@Aspect
@Component
class DemoAspect {

    @Pointcut("execution(public * com.example.demo.*Controller..*.*(..))")
    fun webLog() {
    }

    @Before("webLog()")
    fun beforMethod(joinPoint: JoinPoint) {
        val sb = StringBuffer()
        for (str:Any in joinPoint.args) {
            sb.append("args:${str.toString()}|")
        }
        println(sb.toString())
    }
}