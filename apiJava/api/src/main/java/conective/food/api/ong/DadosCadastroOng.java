package conective.food.api.ong;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroOng(
        @NotBlank
        String usuario,
        @NotBlank
        String senha
) {
    }

