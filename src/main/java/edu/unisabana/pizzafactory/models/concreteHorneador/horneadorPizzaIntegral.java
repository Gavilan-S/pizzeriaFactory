package edu.unisabana.pizzafactory.models.concreteHorneador;

import edu.unisabana.pizzafactory.models.horneador;

import java.util.logging.Level;
import java.util.logging.Logger;


public class horneadorPizzaIntegral implements horneador{
  
  @Override
  public void hornear() {
    Logger.getLogger(horneadorPizzaIntegral.class.getName())
      .log(Level.INFO, "[~~] Horneando la pizza integral.");
  }
}
