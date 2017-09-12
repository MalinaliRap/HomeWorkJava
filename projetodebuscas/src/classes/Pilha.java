/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author Mali
 */

/* codigo baseado em https://www.caelum.com.br/apostila-java-estrutura-dados/pilhas/#6-4-operacoes-em-pilhas-remover-uma-peca */

public class Pilha<T>  {
   
   ArrayList<T> cells = new ArrayList();
   
   public void insere(T cidade) {
    // implementação
      this.cells.add(cidade);
  }

  public T remove() {
    // implementação
    return this.cells.remove(this.cells.size() - 1);
  
  }

  public boolean vazia() {
    // implementação
      return this.cells.size() == 0;
  }  
}
