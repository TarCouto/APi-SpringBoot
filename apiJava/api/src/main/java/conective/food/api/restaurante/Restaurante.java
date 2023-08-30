package conective.food.api.restaurante;


import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Table(name = "restaurantes")
@Entity(name = "restaurante")
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Restaurante {

@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String usuario;
    private String senha;

    public Restaurante(@NotNull DadosCadastroRestaurante dados) {
        this.usuario = dados.user();
        this.senha = dados.senha();

    }
}
