import java.util.Scanner;

public class Tarefa {
    private String nome;
    private int dia;
    private int mes;
    private int ano;
    private int hora;
    private int minuto;

    public Tarefa(String nome, int dia, int mes, int ano, int hora, int minuto) {
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano= ano;
        this.hora = hora;
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        return "Tarefa: " + nome + "\nData: " + dia + "/" + mes + "/" + ano + "\nHorário: " + hora + ":" + minuto;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas tarefas você deseja adicionar?");
        int numTarefas = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha

        Tarefa[] tarefas = new Tarefa[numTarefas];

        for (int i = 0; i < numTarefas; i++) {
            System.out.println("Digite o nome da tarefa:");
            String nomeTarefa = sc.nextLine();

            System.out.println("Digite o dia da tarefa:");
            int dia = sc.nextInt();

            System.out.println("Digite o mês da tarefa:");
            int mes = sc.nextInt();

            System.out.println("Digite o ano da tarefa:");
            int ano = sc.nextInt();

            System.out.println("Digite a hora da tarefa:");
            int hora = sc.nextInt();

            System.out.println("Digite os minutos da tarefa:");
            int minuto = sc.nextInt();

            tarefas[i] = new Tarefa(nomeTarefa, dia, mes, ano, hora, minuto);
            sc.nextLine(); // Consumir a quebra de linha
        }

        System.out.println("\nTarefas adicionadas:");
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }
}
