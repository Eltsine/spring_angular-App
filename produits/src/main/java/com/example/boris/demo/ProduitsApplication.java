package com.example.boris.demo;

import com.example.boris.demo.entities.Produit;
import com.example.boris.demo.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class ProduitsApplication implements CommandLineRunner {

    @Autowired
    ProduitService produitService;
    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(ProduitsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        produitService.saveProduit(new Produit("PC Toshiba", 5600.0, new Date()));
        repositoryRestConfiguration.exposeIdsFor(Produit.class);


    }
}
