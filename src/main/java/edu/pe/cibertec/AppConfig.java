package edu.pe.cibertec;


import edu.pe.cibertec.beans.HolaMundo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public HolaMundo holamundoBean(){
        return new HolaMundo();
    }

}
