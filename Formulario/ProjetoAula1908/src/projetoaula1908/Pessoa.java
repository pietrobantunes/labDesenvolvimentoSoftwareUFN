package projetoaula1908;

public class Pessoa {

    public String nome;
    public char sexo;
    public String idioma;

    public Pessoa(String nome, char sexo, String idioma) {
        this.nome = nome;
        this.sexo = sexo;
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Sexo: " + sexo + ", Idioma: " + idioma + "\n";
    }
    
    public Object[] obterDados(){
        return new Object[] {nome, sexo, idioma};
    }
}
