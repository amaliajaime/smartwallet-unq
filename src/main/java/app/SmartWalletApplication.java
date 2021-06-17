package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import java.nio.file.FileStore;

@SpringBootApplication
@ComponentScan
public class SmartWalletApplication extends SpringBootServletInitializer {

        public static void main(String[] args) {
            SpringApplication.run(SmartWalletApplication.class, args);
        }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SmartWalletApplication.class);
    }

}