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
    public void imprimirTarefa (){
        System.out.println("Tarefa: " + nome);
        System.out.println("Data: " + dia + " / " + mes);
        System.out.println("Horário da Tarefa: " + hora + ":" + minuto);
    }
}
