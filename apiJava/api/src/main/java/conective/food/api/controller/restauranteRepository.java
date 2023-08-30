package conective.food.api.controller;

import conective.food.api.restaurante.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface restauranteRepository extends JpaRepository<Restaurante,String> {
}
