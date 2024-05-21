import java.util.Scanner;

public class Agenda{
    public String nomeTarefa;
    public int dia, mes;
    public int hora,minuto;

    public Agenda (String nomeTarefa, int dia, int mes, int hora, int minuto){
        this.nomeTarefa = nomeTarefa;
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;
        this.minuto = minuto;
    }  

    public void perguntas(){
        try (Scanner sc = new Scanner(System.in)) {
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
        }

    }
    public void imprimirTarefa (){
        System.out.println("Tarefa: " + nomeTarefa);
        System.out.println("Data: " + dia + " / " + mes);
        System.out.println("Horário da Tarefa: " + hora + ":" + minuto);
    }
}