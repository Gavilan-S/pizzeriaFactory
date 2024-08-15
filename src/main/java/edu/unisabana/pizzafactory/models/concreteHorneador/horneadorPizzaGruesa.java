package edu.unisabana.pizzafactory.models.concreteHorneador;

import edu.unisabana.pizzafactory.models.horneador;

import java.util.logging.Level;
import java.util.logging.Logger;


public class horneadorPizzaGruesa implements horneador{

  @Override
  public void hornear() {
    Logger.getLogger(horneadorPizzaGruesa.class.getName())
      .log(Level.INFO, "[~~] Horneando la pizza gruesa con masa convencional.");
  }
}
