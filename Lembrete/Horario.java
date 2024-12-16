public class Horario {
    
    private int hora;
    
    private int min;

    public Horario(int hora, int min) {
        
        this.hora = hora;
        
        this.min = min;
    
        
    }

    public void ajustarHorario(int hora, int min) {
        
        this.hora = hora;
        
        this.min = min;
        
        imprimirHorario();
        
        if(!horarioValido())
        {
            System.out.println("horario invalido");
        }
        
        else
        {
            System.out.println("horario valido");
    
        }
        
    
        
    }

    public void imprimirHorario() {
        
        System.out.println("Hora: " + hora + " Minuto: " + min);
    }

    private boolean horarioValido() {
        
        return (hora >= 0 && hora <= 23) && (min >= 0 && min <= 59);
    
        
    }
}