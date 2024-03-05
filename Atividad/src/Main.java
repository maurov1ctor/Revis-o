public class Main {
    public static void main(String[] args) {
        // Criando uma instância da classe Pessoa
        Pessoa pessoa = new Pessoa("João", "Silva", "01/01/1990", "joao.silva@email.com", "123456789");

        // Definindo variáveis constantes
        final String CPF = "123.456.789-00";
        final String PAIS_NACIONALIDADE = "Brasil";

        // Exibindo os valores no console
        System.out.println("Nome completo: " + pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.println("Email - Data de nascimento - Telefone: " + pessoa.getEmail() + " - " + pessoa.getDataNascimento() + " - " + pessoa.getTelefone());
        System.out.println("País da nacionalidade: " + PAIS_NACIONALIDADE);

        // Executando algumas ações da pessoa
        pessoa.andar();
        pessoa.comer();
        pessoa.correr();
        pessoa.dormir();
    }
}
