package gft.exercicio.um;

import java.util.Scanner;


public class ExercUmBrunoMendes {

  
    public static void main(String[] args) {
            //INSTANCIANDO E CRIANDO UM OBJETO Scanner()
        try (Scanner teclado = new Scanner(System.in)) {
            //CRIANDO VARIAVEL PARA CONTROLE DA ESTRUTURA DE REPETI��O!
        int opc;
            //SISTEMA PARA EXIBI��O DE NUMEROS IMPARES:
        do{ System.out.println("Seja bem-vindo ao Sistema de N�meros �mpares!");
            //ENTRADA DE DADOS!
            System.out.println("Por favor, digite o primeiro n�mero: ");
            Integer numero1 = teclado.nextInt();
            System.out.println("Por favor, digite o segundo n�mero: ");
            Integer numero2 = teclado.nextInt();
            //VERIFICANDO SE OS N�MERO S�O MAIORES QUE ZERO, E SE O PRIMEIRO N�MERO � MAIOR QUE O SEGUNDO!
            if ((numero1 > 0) && (numero1 < numero2)) {
            //SAIDA DE DADOS!
            System.out.println("\nOs n�meros �mpares entre " + numero1 + " e " + numero2 + " s�o:");
            for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 1) {
            System.out.print(i + " ");
            }
            }
            //INDICANDO ERRO CASO O US�ARIO DIGITE VALORES INV�LIDOS!     
            } else {
            System.out.println("Valores digitados inv�lidos, por favor, digite n�meros maiores que zero!");
            }
            System.out.println("\nDeseja usar o programa novamente? \n1.Sim \n2.N�o");
            opc = teclado.nextInt();
            //FIM DA ESTRUTURA DE REPETI��O!
        }while(opc==1);
       }
    }
    
}
