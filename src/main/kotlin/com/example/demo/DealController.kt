package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController

class DealController{
    @Autowired
    lateinit var deal:Deal
    @RequestMapping("hello")
    fun helloWorld():String{
        return deal.show()
    }

}