package edu.unisabana.pizzafactory.models.concreteMoldeador;

import edu.unisabana.pizzafactory.models.moldeador;

import java.util.logging.Level;
import java.util.logging.Logger;


public class moldeadorPizzaGruesa implements moldeador{
 
  @Override
  public void moldearPizzaPequenna() {
    Logger.getLogger(moldeadorPizzaGruesa.class.getName())
      .log(Level.INFO, "[O] Moldeando pizza pequenna de masa convencional.");

  }

  @Override
  public void moldearPizzaMediana() {
    Logger.getLogger(moldeadorPizzaGruesa.class.getName())
      .log(Level.INFO, "[O] Moldeando pizza mediana de masa convencional.");

  }
}
