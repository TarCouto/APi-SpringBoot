package conective.food.api.ong;

public record DadosListagemOng(String usuario, String senha) {
    
    public static DadosListagemOng fromOng(Ongs ong){
        return new DadosListagemOng(ong.getUsuario(),ong.getSenha());
    }
}
