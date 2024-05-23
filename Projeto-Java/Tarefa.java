import java.util.Scanner;

public class Tarefa {
    public String nome;
    public int dia;
    public int mes;
    public int hora;
    public int minuto;
    
    public Tarefa (String nome, int dia, int mes, int hora, int minuto){
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;
        this.minuto = minuto;
    }
    
    @Override
    public String toString() {
        return "Tarefa: " + nome + "\nData: " + dia + "/" + mes + "\nHorário: " + hora + ":" + minuto;
    }

    public void perguntas(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\n\nDigite o nome da tarefa:");
            nome = sc.nextLine();

            System.out.println("Digite o dia da tarefa:");
            dia = sc.nextInt();

            System.out.println("Digite o mês da tarefa:");
            mes = sc.nextInt();

            System.out.println("Digite a hora da tarefa:");
            hora = sc.nextInt();

            System.out.println("Digite os minutos da tarefa:");
            minuto = sc.nextInt();

            sc.nextLine();
        }
    }
    public void imprimirTarefa (){
        System.out.println("Tarefa: " + nome);
        System.out.println("Data: " + dia + " / " + mes);
        System.out.println("Horário da Tarefa: " + hora + ":" + minuto);
    }
}
