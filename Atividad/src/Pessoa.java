public class Pessoa {
    private String nome;
    private String sobrenome;
    private String dataNascimento;
    private String email;
    private String telefone;

    // Construtor
    public Pessoa(String nome, String sobrenome, String dataNascimento, String email, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
    }

    // Métodos de ação
    public void andar() {
        System.out.println(nome + " está andando.");
    }

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void correr() {
        System.out.println(nome + " está correndo.");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    public static void main(String[] args) {
        // Criando uma instância da classe Pessoa
        Pessoa pessoa = new Pessoa("João", "Silva", "01/01/1990", "joao.silva@email.com", "123456789");

        // Definindo variáveis constantes
        final String CPF = "123.456.789-00";
        final String PAIS_NACIONALIDADE = "Brasil";

        // Exibindo os valores no console
        System.out.println("Nome completo: " + pessoa.nome + " " + pessoa.sobrenome);
        System.out.println("Email - Data de nascimento - Telefone: " + pessoa.email + " - " + pessoa.dataNascimento + " - " + pessoa.telefone);
        System.out.println("País da nacionalidade: " + PAIS_NACIONALIDADE);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return null;
    }

    public String getEmail() {
    }
}
