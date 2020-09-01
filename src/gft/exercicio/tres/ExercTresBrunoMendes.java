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
			System.out.println("Nome do titular: "+contaCorrente.getTitular()+"\nNúmero da conta: "+contaCorrente.getNum()+"\nSaldo: "+contaCorrente.getSaldo());
			System.out.println("Rendimento em conta corrente: " + contaCorrente.rendimento());
	                System.out.println("Imposto: "+contaCorrente.calcularImposto());
	                
			//INSTANCIANDO OBJETO CONTA POUPANÇA E ATRIBUINDO VALORES
			ContaPoupanca contaPoupanca = new ContaPoupanca();
			contaPoupanca.setNum(7246);
			contaPoupanca.setSaldo(1000.0);
			contaPoupanca.setTitular("Clecio");
	                contaPoupanca.calcularImposto();
			System.out.println("");//ESPAÇAMENTO!
	        //SAIDA DE DADOS DA CONTA POUPANÇA
	                System.out.println("Nome do titular: "+contaPoupanca.getTitular()+"\nNúmero da conta: "+contaPoupanca.getNum()+"\nSaldo: "+contaPoupanca.getSaldo());
			System.out.println("Rendimento em conta poupança: " + contaPoupanca.rendimento());
	                System.out.println("Imposto: "+contaPoupanca.calcularImposto());
	        
	    }
	    
	}

