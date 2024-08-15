package edu.unisabana.pizzafactory.models.concreteMoldeador;

import edu.unisabana.pizzafactory.models.moldeador;

import java.util.logging.Level;
import java.util.logging.Logger;


public class moldeadorPizzaDelgada implements moldeador{
 
  @Override
  public void moldearPizzaPequenna() {
    Logger.getLogger(moldeadorPizzaDelgada.class.getName())
      .log(Level.INFO, "[O] Moldeando pizza pequenna de masa convencional.");

  }

  @Override
  public void moldearPizzaMediana() {
    Logger.getLogger(moldeadorPizzaDelgada.class.getName())
      .log(Level.INFO, "[O] Moldeando pizza mediana de masa convencional.");

  }
}
