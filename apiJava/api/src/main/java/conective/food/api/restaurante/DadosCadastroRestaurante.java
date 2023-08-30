package conective.food.api.restaurante;

import jakarta.validation.constraints.NotBlank;
import org.jetbrains.annotations.NotNull;

public record DadosCadastroRestaurante(

        @NotBlank
        String user,

        @NotBlank
        String senha

) {
}
