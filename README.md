# shutdowndemo

Springboot shutdown gracefully in different ways.<br/>
more details, please clone this project to get.<br/>

```java
package com.hqs.springboot.shutdowndemo;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class ShutdowndemoApplication {

    public static void main(String[] args) {

        /* method 1: use curl -X POST http://localhost:3333/actuator/shutdown */
        SpringApplication.run(ShutdowndemoApplication.class, args);

        /* method 2: use ctx.close to shutdown all application context */
//        ConfigurableApplicationContext ctx = SpringApplication.run(ShutdowndemoApplication.class, args);
//        try {
//            TimeUnit.SECONDS.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        ctx.close();

          /* 
            method 3 : generate a pid in a specified path, while use command to shutdown pid :
            'cat /Users/huangqingshi/app.pid | xargs kill'
          */
//        SpringApplication application = new SpringApplication(ShutdowndemoApplication.class);
//        application.addListeners(new ApplicationPidFileWriter("/Users/huangqingshi/app.pid"));
//        application.run();

          /* method 4: exit this application using static method */
//        ConfigurableApplicationContext ctx = SpringApplication.run(ShutdowndemoApplication.class, args);
//        exitApplication(ctx);

         /* 
            method 5: using self-defined url in ShutDownController.java to shut down context :
            curl -X POST http://localhost:3333/shutDownContext 
         */

        System.out.println("Shutdown Demo Application started");
    }

    public static void exitApplication(ConfigurableApplicationContext context) {
        int exitCode = SpringApplication.exit(context, (ExitCodeGenerator) () -> 0);
        System.exit(exitCode);
    }

}
```
