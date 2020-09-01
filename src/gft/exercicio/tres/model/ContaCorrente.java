package gft.exercicio.tres.model;

import gft.exercicio.tres.service.Imposto;

public class ContaCorrente extends Conta implements Imposto{
    //SOBREPONDO RENDIMENTO COM UMA TAXA!
     @Override
     public Double rendimento() {
	
    return this.getSaldo() * 0.03;
     }
    //METODO PARA CALCULAR IMPOSTO!
    @Override
     public Double calcularImposto() {	
      return this.rendimento() * 0.25;
    }
}
