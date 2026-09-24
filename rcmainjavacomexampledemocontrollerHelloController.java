[1mdiff --git a/src/main/java/com/example/demo/controller/HelloController.java b/src/main/java/com/example/demo/controller/HelloController.java[m
[1mindex 41debfe..1969434 100644[m
[1m--- a/src/main/java/com/example/demo/controller/HelloController.java[m
[1m+++ b/src/main/java/com/example/demo/controller/HelloController.java[m
[36m@@ -1,5 +1,5 @@[m
 package com.example.demo.controller;[m
[31m-[m
[32m+[m[32mimport org.springframework.web.bind.annotation.PathVariable;[m
 import org.springframework.web.bind.annotation.GetMapping;[m
 import org.springframework.web.bind.annotation.RequestMapping;[m
 import org.springframework.web.bind.annotation.RestController;[m
[36m@@ -12,4 +12,9 @@[m [mpublic class HelloController {[m
     public String hello() {[m
         return "Hello! Spring Boot + Gradle is working.";[m
     }[m
[32m+[m[32m    @GetMapping("/hello/{name}")[m
[32m+[m[32m    public String helloByName(@PathVariable String name) {[m
[32m+[m[32m        return "Hello, " + name + "! Welcome to Spring Boot.";[m
[32m+[m[32m    }[m
 }[m
[41m+[m
