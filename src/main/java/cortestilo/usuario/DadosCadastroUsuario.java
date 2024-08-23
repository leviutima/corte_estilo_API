package cortestilo.usuario;

public record DadosCadastroUsuario(
        String nome,
        String telefone,
        String email,
        String mensagem) {

    public DadosCadastroUsuario {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("Mensagem: " + mensagem);
    }
}
