package br.com.dio;


import model.Gato;

public class PrimeiroPrograma
{
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);


        Livro livro1 = new Livro("O Problema dos 3 corpos", 300);
        System.out.println(livro1);

        Livro livro2 = new Livro("Seja Foda", 220);
        System.out.println(livro2);


     /*  int a = 5;
       int b = 5;
        System.out.println("Hello word "+ (a+b));*/
      

    }
}

class Livro {

    private String nome;
    private Integer numPaginas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;

    }
}