import java.util.ArrayList;
import java.util.Scanner;

public class TesteAgenda{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String nomeTarefa;
        int dia, mes, hora, minuto, resposta;
        boolean continuar = true;

        while(continuar){
            System.out.println("Qual a Tarefa desejada ?");
            nomeTarefa = sc.nextLine();
            System.out.println("\nQual a data da Tarefa ?");
            System.out.println("DIA: ");
            dia = sc.nextInt();
            System.out.println("MÊS: ");
            mes = sc.nextInt();
            System.out.println("\nQual o horário da Tarefa ?");
            System.out.println("Hora: ");
            hora = sc.nextInt();
            System.out.println("Minuto: ");
            minuto = sc.nextInt();

            Agenda agenda =  new Agenda (nomeTarefa, dia, mes, hora, minuto);

            System.out.println("Deseja Cadas");
            
        }

    }
}