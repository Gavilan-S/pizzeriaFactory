package edu.unisabana.pizzafactory.factories;

import edu.unisabana.pizzafactory.pizzeriaFactory;

import edu.unisabana.pizzafactory.models.amasador;
import edu.unisabana.pizzafactory.models.concreteAmasador.amasadorPizzaDelgada;

import edu.unisabana.pizzafactory.models.horneador;
import edu.unisabana.pizzafactory.models.concreteHorneador.horneadorPizzaDelgada;

import edu.unisabana.pizzafactory.models.moldeador;
import edu.unisabana.pizzafactory.models.concreteMoldeador.moldeadorPizzaDelgada;


public class delgadaFactory implements pizzeriaFactory{

  @Override
  public amasador createAmasador() {
    return new amasadorPizzaDelgada();
  }

  @Override
  public horneador createHorneador() {
    return new horneadorPizzaDelgada();
  }
  
  @Override
  public moldeador createMoldeador() {
    return new moldeadorPizzaDelgada();
  }
}
