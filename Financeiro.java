import java.util.Scanner;

public class Financeiro {

    public static void main(String[] args) {
        System.out.println("--------------------------\nDados iniciais do cliente: \n\n\n\nNome: Melvin Satiro\nTipo de conta: Corrente\nSaldo inicial:R$ 3400,00\n--------------------------");


        System.out.println("Operações\n\n1- Consultar saldos\n2- Receber valor\n3- Transferir valor\n4- Sair\n\nDigite a opção desejada:");
        int saldo = 3400;

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();


        while(numero != 4){
            try {
                numero = scanner.nextInt();

            if(numero == 4){
                System.out.println("FIM");
                break;

                } else if(numero >= 5){
                    System.out.println("\nOpção invalida");

                }else if(numero <= 0){
                    System.out.println("\nOpção invalida");
                }

              else if(numero == 1){
                System.out.println( "\nO saldo atual é ="+ saldo);

            } else if(numero ==2){
                System.out.println("\nDigite o valor que irá receber");
                try {

                int recebendo = scanner.nextInt();
                if(recebendo >=1){

                saldo += recebendo;
                System.out.println("\nO saldo atual é ="+ saldo);

                } else if (recebendo <= 0) {
                    System.out.println("valor tem que ser positivo");
                } else {
                    System.out.println("Opção invalida");
                }


                }catch (java.util.InputMismatchException e){
                    System.out.println("\nEntrada inválida. Por favor, digite apenas números inteiros");//Limpa o buffer do scanner para evitar um loop infinito
scanner.next();
                }

                } else if (numero ==3){
                System.out.println("\nDigite o valor que deseja retirar");
                try {

                int saque = scanner.nextInt();

                if(saque <= 0){
                    System.out.println("\nO valor do saque deve ser positivo.");

                }else if(saque > saldo){
                    System.out.println("\nNão tem saldo suficente");

                }else {
                    saldo -= saque;
                    System.out.println("\nSaque realizado com sucesso!");
                }

                } catch (java.util.InputMismatchException e){
                    System.out.println("\nEntrada inválida. Por favor, digite apenas números inteiros");//Limpa o buffer do scanner para evitar um loop infinito
scanner.next();
                }

                    System.out.println("\nO saldo atual é ="+ saldo);
                }

                 System.out.println("\nOperações\n\n1- Consultar saldos\n2- Receber valor\n3- Transferir valor\n4- Sair\n\nDigite a opção desejada:");
    numero = scanner.nextInt(); // Pede a opção novamente dentro do loop

         }catch (java.util.InputMismatchException e){
                    System.out.println("\nEntrada inválida. Por favor, digite apenas números inteiros");//Limpa o buffer do scanner para evitar um loop infinito
scanner.next();
                }

        }
        scanner.close();
   }

}

