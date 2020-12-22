package tn.esprit.spring.tp1springaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
@ComponentScan({"tn.esprit.spring.tp1springaop.control,tn.esprit.spring.tp1springaop.service,tn.esprit.spring.tp1springaop.config"})
public class Tp1SpringAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp1SpringAopApplication.class, args);
    }

}
