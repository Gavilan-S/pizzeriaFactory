package edu.unisabana.pizzafactory.models.concreteAmasador;

import edu.unisabana.pizzafactory.models.amasador;

import java.util.logging.Level;
import java.util.logging.Logger;


public class amasadorPizzaIntegral implements amasador{

  @Override
  public void amasar() {
    Logger.getLogger(amasadorPizzaIntegral.class.getName())
      .log(Level.INFO, "[@@] Amasando la pizza integral.");
  }
}
