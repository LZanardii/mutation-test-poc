package br.unisinos.testeMutantes;

public class Pessoa {
  private String nome;
  private int idade;

  public Pessoa() {
    this.nome = "";
  }

  public Pessoa(String nome, int idade, String profissao) {
    super();
    this.nome = nome;
    this.idade = idade;
  }

  public boolean ehMaiorIdade() {
    boolean maior = true;
    if(this.idade < 18) {
      maior = false;
    }
    return maior;
  }

  public void fazAniversario() {
    this.idade++;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

}
