public class Pessoa {
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void saudacao() {
        System.out.println("Olá, meu nome é " + nome);
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Carlos");
        pessoa.saudacao();
    }
}

// Orientação a Objetos