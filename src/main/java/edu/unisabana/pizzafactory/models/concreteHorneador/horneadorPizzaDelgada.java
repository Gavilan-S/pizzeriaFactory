package edu.unisabana.pizzafactory.models.concreteHorneador;

import edu.unisabana.pizzafactory.models.horneador;

import java.util.logging.Level;
import java.util.logging.Logger;


public class horneadorPizzaDelgada implements horneador{

  @Override
  public void hornear() {
    Logger.getLogger(horneadorPizzaDelgada.class.getName())
      .log(Level.INFO, "[~~] Horneando la pizza delgada con masa convencional.");
  }
}
