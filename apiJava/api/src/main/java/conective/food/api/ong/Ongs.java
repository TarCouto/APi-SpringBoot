package conective.food.api.ong;

import conective.food.api.ong.DadosCadastroOng;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Table(name = "ongs")
@Entity(name = "ongs")
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Ongs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String usuario;
    private String senha;

    public Ongs(@NotNull DadosCadastroOng dados) {
        this.usuario = dados.usuario();
        this.senha = dados.senha();

    }
}