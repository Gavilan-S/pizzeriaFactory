package edu.unisabana.pizzafactory.factories;

import edu.unisabana.pizzafactory.pizzeriaFactory;

import edu.unisabana.pizzafactory.models.amasador;
import edu.unisabana.pizzafactory.models.concreteAmasador.amasadorPizzaIntegral;

import edu.unisabana.pizzafactory.models.horneador;
import edu.unisabana.pizzafactory.models.concreteHorneador.horneadorPizzaIntegral;

import edu.unisabana.pizzafactory.models.moldeador;
import edu.unisabana.pizzafactory.models.concreteMoldeador.moldeadorPizzaIntegral;


public class integralFactory implements pizzeriaFactory{

  @Override
  public amasador createAmasador() {
    return new amasadorPizzaIntegral();
  }

  @Override
  public horneador createHorneador() {
    return new horneadorPizzaIntegral();
  }
  
  @Override
  public moldeador createMoldeador() {
    return new moldeadorPizzaIntegral();
  }
}
