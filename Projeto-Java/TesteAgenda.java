import java.util.ArrayList;
import java.util.Scanner;

public class TesteAgenda{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String nomeTarefa;
        int dia, mes, ano, hora, minuto, resposta = 0;
        boolean continuar = true;

        while(continuar){
            System.out.println("Qual a Tarefa desejada ?");
            nomeTarefa = sc.nextLine();
            System.out.println("\nQual a data da Tarefa ?");
            System.out.println("DIA: ");
            dia = sc.nextInt();
            System.out.println("MÊS: ");
            mes = sc.nextInt();
            System.out.println("ANO: ");
            ano = sc.nextInt();
            System.out.println("\nQual o horário da Tarefa ?");
            System.out.println("Hora: ");
            hora = sc.nextInt();
            System.out.println("Minuto: ");
            minuto = sc.nextInt();

            Agenda agenda =  new Agenda (nomeTarefa, dia, mes, ano, hora, minuto);
            
            //loop para continuar ou não a adicionar tarefas
            while(resposta != 1 && resposta!= 2){
                System.out.println("Deseja Cadastrar outra tarefa? (1)SIM (2)NÃO");
                resposta = sc.nextInt();
                if(resposta ==2){
                continuar = false;
                }
            }
            resposta = 0;
        }

    }
}