package edu.unisabana.pizzafactory.factories;

import edu.unisabana.pizzafactory.pizzeriaFactory;

import edu.unisabana.pizzafactory.models.amasador;
import edu.unisabana.pizzafactory.models.concreteAmasador.amasadorPizzaGruesa;

import edu.unisabana.pizzafactory.models.horneador;
import edu.unisabana.pizzafactory.models.concreteHorneador.horneadorPizzaGruesa;

import edu.unisabana.pizzafactory.models.moldeador;
import edu.unisabana.pizzafactory.models.concreteMoldeador.moldeadorPizzaGruesa;


public class gruesaFactory implements pizzeriaFactory{

  @Override
  public amasador createAmasador() {
    return new amasadorPizzaGruesa();
  }

  @Override
  public horneador createHorneador() {
    return new horneadorPizzaGruesa();
  }
  
  @Override
  public moldeador createMoldeador() {
    return new moldeadorPizzaGruesa();
  }
}
