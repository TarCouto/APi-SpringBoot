package conective.food.api.controller;

import conective.food.api.ong.DadosCadastroOng;

import conective.food.api.ong.DadosListagemOng;
import conective.food.api.ong.Ongs;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import conective.food.api.ong.DadosListagemOng;



@RestController
    @RequestMapping("ongs")
    public class OngsController {

        @Autowired
        private OngsRepository repository;

        @PostMapping
        @Transactional
        public void cadastrar(@RequestBody DadosCadastroOng dados){

          repository.save(new Ongs(dados));
        }

        @GetMapping
        public Page<DadosListagemOng> listar(@PageableDefault(size = 10 , sort = {"usuario"}) Pageable paginacao){
            return repository.findAll(paginacao).map(DadosListagemOng::fromOng);
        }
        

}
