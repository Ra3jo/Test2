package com.example.test;

import com.example.test.ENTITY.Integration;
import com.example.test.REPOSITORYY.IntegrationRepository;
import com.example.test.SERVICE.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
      @Autowired
      private IntegrationRepository integrationRepository;
    @Override
    public void run(String... args) throws Exception {
        Integration integration= new Integration();
        integration.setProduct("COMPUTER");
        integration.setLocation("MBEYA");
        integration.setAddress("131,MBEYA");
        integrationRepository.save(integration);


        Integration integration1= new Integration();
        integration1.setProduct("bulb");
        integration1.setLocation("Mwanza");
        integration1.setAddress("105,Mwanza");
        integrationRepository.save(integration1);

    }
}
