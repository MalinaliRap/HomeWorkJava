/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


import java.util.ArrayList;

/* cadigo baseado em https://www.caelum.com.br/apostila-java-estrutura-dados/filas/#7-9-exercicios-fila */

/**
 *
 * @author a1372920
 */
public class Fila<T> {
 
    ArrayList<T> cells = new ArrayList();

    public Fila( ) {
    
        
    }

  public void insere( T cidade) {
    // implementação
      cells.add(cidade);
      
  }

  public T remove() {
    // implementação
      return this.cells.remove(0);
  }

  public boolean vazia() {
    // implementação
      return this.cells.size() == 0;
  }
  
  public int size(){
      return this.cells.size();
  }
}
