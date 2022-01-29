package com.example.boris.demo.produitsrestcontrollers;

import com.example.boris.demo.entities.Produit;
import com.example.boris.demo.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRestController {
    @Autowired
    ProduitService produitService;

    @RequestMapping(method = RequestMethod.GET)
    List<Produit> getAllProduits(){
        return produitService.getAllProduits();
    }

    @RequestMapping(value ="/{id}", method = RequestMethod.GET)
    public Produit getProduitById(@PathVariable("id") Long id){
        return produitService.getProduit(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Produit createProduit(@RequestBody Produit produit){

        return produitService.saveProduit(produit);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Produit updateProduit(@RequestBody Produit produit){
        return produitService.updateProduit(produit);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public void deleteProduit(@PathVariable("id") Long id){
        produitService.deleteProduitById(id);

    }

    @RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET)
    public List<Produit> getProduitsByCatId(@PathVariable("idCat") Long idCat) {
        return produitService.findByCategorieIdCat(idCat);
    }
}
