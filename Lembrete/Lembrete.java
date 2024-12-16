public class Lembrete {
    
    private String descricao;
    
    private Data data;

    
    public Lembrete(String descricao, Data data) {
        
        this.descricao = descricao;
        
        this.data = data;
        
    }

    
    public void ajustarLembrete(String desc, Data data) {
        
        this.descricao = desc;
        
        this.data = data;
    }

    
    public String imprimirLembrete() {
        
        System.out.println();
        
        data.mostrarData();
        
        return "Descrição: " + descricao; 
        
    }
}