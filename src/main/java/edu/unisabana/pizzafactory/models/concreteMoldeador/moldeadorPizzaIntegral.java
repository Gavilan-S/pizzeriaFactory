package edu.unisabana.pizzafactory.models.concreteMoldeador;

import edu.unisabana.pizzafactory.models.moldeador;

import java.util.logging.Level;
import java.util.logging.Logger;


public class moldeadorPizzaIntegral implements moldeador{
 
  @Override
  public void moldearPizzaPequenna() {
    Logger.getLogger(moldeadorPizzaIntegral.class.getName())
      .log(Level.INFO, "[O] Moldeando pizza pequena de masa integral.");

  }

  @Override
  public void moldearPizzaMediana() {
    Logger.getLogger(moldeadorPizzaIntegral.class.getName())
      .log(Level.INFO, "[O] Moldeando pizza mediana de masa integral.");

  }
} 
