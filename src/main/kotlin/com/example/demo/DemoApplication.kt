package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

//lihan@lihan:~ $ curl http://127.0.0.1:8080/student/add?name=lihan
//success
// lihan@lihan:~ $ curl http://127.0.0.1:8080/student/findByName?name=lihan
//[{"id":1,"name":"lihan"}]

// springboot中的IOC和AOP
// https://www.cnblogs.com/yulianggo/p/10467577.html
// https://blog.csdn.net/lmb55/article/details/82470388 AOP
// https://segmentfault.com/a/1190000018882531?utm_source=tag-newest springboot kotlin aop

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}
