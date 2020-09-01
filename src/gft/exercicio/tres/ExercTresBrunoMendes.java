package gft.exercicio.tres;

import gft.exercicio.tres.model.ContaCorrente;
import gft.exercicio.tres.model.ContaPoupanca;

public class ExercTresBrunoMendes {

	   public static void main(String[] args) {
			//INSTANCIANDO OBJETO CONTA CORRENTE E ATRIBUINDO VALORES
			ContaCorrente contaCorrente = new ContaCorrente();
			contaCorrente.setNum(1234);
			contaCorrente.setSaldo(1000.0);
			contaCorrente.setTitular("Henrique");
	                contaCorrente.calcularImposto();
	        //SAIDA DE DADOS DA CONTA CORRENTE
			System.out.println("Nome do titular: "+contaCorrente.getTitular()+"\nN�mero da conta: "+contaCorrente.getNum()+"\nSaldo: "+contaCorrente.getSaldo());
			System.out.println("Rendimento em conta corrente: " + contaCorrente.rendimento());
	                System.out.println("Imposto: "+contaCorrente.calcularImposto());
	                
			//INSTANCIANDO OBJETO CONTA POUPAN�A E ATRIBUINDO VALORES
			ContaPoupanca contaPoupanca = new ContaPoupanca();
			contaPoupanca.setNum(7246);
			contaPoupanca.setSaldo(1000.0);
			contaPoupanca.setTitular("Clecio");
	                contaPoupanca.calcularImposto();
			System.out.println("");//ESPA�AMENTO!
	        //SAIDA DE DADOS DA CONTA POUPAN�A
	                System.out.println("Nome do titular: "+contaPoupanca.getTitular()+"\nN�mero da conta: "+contaPoupanca.getNum()+"\nSaldo: "+contaPoupanca.getSaldo());
			System.out.println("Rendimento em conta poupan�a: " + contaPoupanca.rendimento());
	                System.out.println("Imposto: "+contaPoupanca.calcularImposto());
	        
	    }
	    
	}

