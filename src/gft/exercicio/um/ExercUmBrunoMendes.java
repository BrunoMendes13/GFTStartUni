package gft.exercicio.um;

import java.util.Scanner;


public class ExercUmBrunoMendes {

  
    public static void main(String[] args) {
            //INSTANCIANDO E CRIANDO UM OBJETO Scanner()
        try (Scanner teclado = new Scanner(System.in)) {
            //CRIANDO VARIAVEL PARA CONTROLE DA ESTRUTURA DE REPETIÇÃO!
        int opc;
            //SISTEMA PARA EXIBIÇÃO DE NUMEROS IMPARES:
        do{ System.out.println("Seja bem-vindo ao Sistema de Números Ímpares!");
            //ENTRADA DE DADOS!
            System.out.println("Por favor, digite o primeiro número: ");
            Integer numero1 = teclado.nextInt();
            System.out.println("Por favor, digite o segundo número: ");
            Integer numero2 = teclado.nextInt();
            //VERIFICANDO SE OS NÚMERO SÃO MAIORES QUE ZERO, E SE O PRIMEIRO NÚMERO É MAIOR QUE O SEGUNDO!
            if ((numero1 > 0) && (numero1 < numero2)) {
            //SAIDA DE DADOS!
            System.out.println("\nOs números ímpares entre " + numero1 + " e " + numero2 + " são:");
            for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 1) {
            System.out.print(i + " ");
            }
            }
            //INDICANDO ERRO CASO O USÚARIO DIGITE VALORES INVÁLIDOS!     
            } else {
            System.out.println("Valores digitados inválidos, por favor, digite números maiores que zero!");
            }
            System.out.println("\nDeseja usar o programa novamente? \n1.Sim \n2.Não");
            opc = teclado.nextInt();
            //FIM DA ESTRUTURA DE REPETIÇÃO!
        }while(opc==1);
       }
    }
    
}
