package com.infopersona;

import com.infopersona.dao.InfoBasicaDao;
import com.infopersona.entity.InfoBasica;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@EnableEurekaClient
@SpringBootApplication
public class ServicioInfoPersonasApplication {

    @Autowired
    private InfoBasicaDao infoBasicaDao;

    public static void main(String[] args) {
        SpringApplication.run(ServicioInfoPersonasApplication.class, args);
    }


    @Bean
    InitializingBean sendDatabase() {
        return () -> {

            infoBasicaDao.save(new InfoBasica(1024462247L, "", new Date(), "Bogota D.C", "John", "Ochoa", "Mesa", new Date(), "Masculino", "john.ochoa@gmail.com", "Colombia", "Cundinamarca", "Bogota D.C", "Casado", "2", "O+", "Sanitas"));
            infoBasicaDao.save(new InfoBasica(1024462248L, "", new Date(), "Bogota D.C", "Natalia", "Rojas", "Barreto", new Date(), "Femenino", "natalia.rojas@gmail.com", "Colombia", "Cundinamarca", "Bogota D.C", "Casado", "2", "O+", "Sanitas"));

        };
    }

}
