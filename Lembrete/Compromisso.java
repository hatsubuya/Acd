public class Compromisso {
    
    private String descricao;
    
    private Data data;
    
    private Horario hora;

    public Compromisso(String descricao, Data data, Horario hora) {
        
        this.descricao = descricao;
        
        this.data = data;
        
        this.hora = hora;
    }


    public void ajustarCompromisso(String descricao, Data data, Horario hora) {
        
        this.descricao = descricao;
        
        this.data = data;
        
        this.hora = hora;
    }


    public void imprimirCompromisso() {
        
        hora.imprimirHorario();
        
        data.mostrarData();
        
        System.out.println("Descrição: " + descricao);
        
        
    
    }
}