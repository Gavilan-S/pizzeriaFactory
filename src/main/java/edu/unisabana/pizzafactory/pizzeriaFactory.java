package edu.unisabana.pizzafactory;

import edu.unisabana.pizzafactory.models.*;

public interface pizzeriaFactory {
  amasador createAmasador();
  horneador createHorneador();
  moldeador createMoldeador();
}
