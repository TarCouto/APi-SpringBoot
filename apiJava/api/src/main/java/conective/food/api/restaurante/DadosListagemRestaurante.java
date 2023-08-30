package conective.food.api.restaurante;

public record DadosListagemRestaurante(String usuario, String senha) {
    public DadosListagemRestaurante(Restaurante restaurante){
        this(restaurante.getUsuario(), restaurante.getSenha());
    }
}
