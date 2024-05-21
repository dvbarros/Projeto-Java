import java.util.ArrayList;
import java.util.Scanner;

public class TesteTarefa {
    public static void main(String[] args) {
        ArrayList<Tarefa> Agenda = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            int resposta = 1;
                while(resposta == 1){
                    Tarefa novaTarefa = new Tarefa();

                    novaTarefa.perguntas();
                    Agenda.add(novaTarefa);
                    
                    System.out.println("Tarefas Cadastradas: ");
                    
                    for(Tarefa tarefa : Agenda){
                        tarefa.imprimirTarefa();
                    }
                }
                System.out.println("Saída: ");
                resposta = sc.nextInt();
            }
        }
    }
