package conective.food.api.controller;

import conective.food.api.restaurante.DadosCadastroRestaurante;
import conective.food.api.restaurante.DadosListagemRestaurante;
import conective.food.api.restaurante.Restaurante;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("restaurantes")
public class RestauranteController {

    @Autowired
    private restauranteRepository repository;


    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroRestaurante dados){
        repository.save(new Restaurante(dados));


    }
    @GetMapping
    public Page<DadosListagemRestaurante> listar(@PageableDefault(size = 10, sort = {"usuario"}) Pageable paginacao){

        return repository.findAll(paginacao).map(DadosListagemRestaurante::new);
    }


}
