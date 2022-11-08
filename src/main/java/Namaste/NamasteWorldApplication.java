package Namaste;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan
@ComponentScan
public class NamasteWorldApplication {
    public static void main(String[] args) {
        SpringApplication.run(NamasteWorldApplication.class,args);
    }
}
