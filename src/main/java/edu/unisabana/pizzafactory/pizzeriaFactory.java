package edu.unisabana.pizzafactory;

import edu.unisabana.pizzafactory.models.*;

public interface pizzeriaFactory {
  amasador amasar();
  horneador hornear();
  moldeador moldear();
}
