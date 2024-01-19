package br.unisinos.testeMutantes;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PessoaTest {
  Pessoa pessoa;

  @Before
  public void setUp(){
    pessoa = new Pessoa();
  }

  @Test
  public void alteraNome() {
    pessoa.setNome("Maria");
    assertEquals("Maria", pessoa.getNome());
  }

  @Test
  public void alteraIdade() {
    pessoa.setIdade(19);
    assertEquals(19, pessoa.getIdade());
  }

  @Test
  public void verificaAniversario() {
    pessoa.setIdade(19);
    pessoa.fazAniversario();
    assertEquals(20, pessoa.getIdade());
  }

  @Test
  public void verificaMaiorIdade_false() {
    pessoa.setIdade(17);
    assertFalse(pessoa.ehMaiorIdade());
  }

  @Test
  public void verificaMaiorIdade_true() {
    pessoa.setIdade(18);
    assertTrue(pessoa.ehMaiorIdade());
  }

  @Test
  public void verificaConstrutorComParametros_nome_idade_profissao(){
    //vale ressaltar que o parâmetro 'profissão' não está sendo utilizado para nada na classe Pessoa

    Pessoa pessoaCriada = new Pessoa("Leonardo", 21, "desenvolvedor de software");
    assertNotNull(pessoaCriada);
  }
}
