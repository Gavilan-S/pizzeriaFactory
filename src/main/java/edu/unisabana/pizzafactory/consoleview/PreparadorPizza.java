package edu.unisabana.pizzafactory.consoleview;

import edu.unisabana.pizzafactory.ExcepcionParametrosInvalidos;
import edu.unisabana.pizzafactory.Ingrediente;

import edu.unisabana.pizzafactory.pizzeriaFactory;
import edu.unisabana.pizzafactory.factories.*;
import edu.unisabana.pizzafactory.typeOf.*;

import edu.unisabana.pizzafactory.models.concreteAmasador.*;
import edu.unisabana.pizzafactory.models.concreteHorneador.*;
import edu.unisabana.pizzafactory.models.concreteMoldeador.*;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PreparadorPizza {


  public static void main(String args[]){
    try {
      Ingrediente[] ingredientes=new Ingrediente[]{new Ingrediente("queso",1),new Ingrediente("jamon",2)};            
      PreparadorPizza pp=new PreparadorPizza();            
      pp.prepararPizza(ingredientes, typeOfTamanno.MEDIANO, typeOfGrosor.DELGADO);
    } catch (ExcepcionParametrosInvalidos ex) {
      Logger.getLogger(PreparadorPizza.class.getName()).log(Level.SEVERE, "Problema en la preparacion de la Pizza", ex);
    }

  }


  public void prepararPizza(Ingrediente[] ingredientes, typeOfTamanno tamanno, typeOfGrosor grosor)

  throws ExcepcionParametrosInvalidos {
    pizzeriaFactory delgadaFactory = new delgadaFactory();
    pizzeriaFactory gruesaFactory = new gruesaFactory();
    pizzeriaFactory integralFactory = new integralFactory();

    amasadorPizzaDelgada amasadorDelgada = (amasadorPizzaDelgada) delgadaFactory.createAmasador();
    amasadorPizzaGruesa amasadorGruesa = (amasadorPizzaGruesa) gruesaFactory.createAmasador();
    amasadorPizzaIntegral amasadorIntegral = (amasadorPizzaIntegral) integralFactory.createAmasador();

    horneadorPizzaDelgada horneadorDelgada = (horneadorPizzaDelgada) delgadaFactory.createHorneador();
    horneadorPizzaGruesa horneadorGruesa = (horneadorPizzaGruesa) gruesaFactory.createHorneador();
    horneadorPizzaIntegral horneadorIntegral = (horneadorPizzaIntegral) integralFactory.createHorneador();

    moldeadorPizzaDelgada moldeadorDelgada = (moldeadorPizzaDelgada) delgadaFactory.createMoldeador();
    moldeadorPizzaGruesa moldeadorGruesa = (moldeadorPizzaGruesa) gruesaFactory.createMoldeador();
    moldeadorPizzaIntegral moldeadorIntegral = (moldeadorPizzaIntegral) integralFactory.createMoldeador();

    // Grosor: Gruesa + Tamanno
    if (grosor == typeOfGrosor.GRUESO){
      amasadorGruesa.amasar();
      if (tamanno == typeOfTamanno.PEQUENNO){     
        moldeadorGruesa.moldearPizzaPequenna();
      }else if (tamanno == typeOfTamanno.MEDIANO){
        moldeadorGruesa.moldearPizzaMediana();
      }else {
        throw new ExcepcionParametrosInvalidos("Tamanno de la pizza invalido: " + tamanno);
      }
    // Grosor: Delgada + Delgada
    }else if (grosor == typeOfGrosor.DELGADO){
      amasadorDelgada.amasar();
      if (tamanno == typeOfTamanno.PEQUENNO){     
        moldeadorDelgada.moldearPizzaPequenna();
      }else if (tamanno == typeOfTamanno.MEDIANO){
        moldeadorDelgada.moldearPizzaMediana();
      }else {
        throw new ExcepcionParametrosInvalidos("Tamanno de la pizza invalido: " + tamanno);
      }
    // Integral + Tamanno
    }else if (grosor == typeOfGrosor.INTEGRAL){
      amasadorIntegral.amasar();
      if (tamanno == typeOfTamanno.PEQUENNO){     
        moldeadorIntegral.moldearPizzaPequenna();
      }else if (tamanno == typeOfTamanno.MEDIANO){
        moldeadorIntegral.moldearPizzaMediana();
      }else {
        throw new ExcepcionParametrosInvalidos("Tamanno de la pizza invalido: " + tamanno);
      }
    //Error
    }else {
      throw new ExcepcionParametrosInvalidos("Grosor de la pizza invalido en amasado: " + grosor);
    }

    aplicarIngredientes(ingredientes);

    if (grosor == typeOfGrosor.GRUESO){
      horneadorGruesa.hornear();
   }else if (grosor == typeOfGrosor.DELGADO){
      horneadorDelgada.hornear();
   }else if (grosor == typeOfGrosor.INTEGRAL){
      horneadorIntegral.hornear();
   //Error
    }else {
      throw new ExcepcionParametrosInvalidos("Grosor de la pizza invalido en horneado: " + grosor);
    }
  }

  private void aplicarIngredientes(Ingrediente[] ingredientes) {
    Logger.getLogger(PreparadorPizza.class.getName())
      .log(Level.INFO, "APLICANDO INGREDIENTES!:{0}", Arrays.toString(ingredientes));

    //CODIGO DE LLAMADO AL MICROCONTROLADOR



  }


}
