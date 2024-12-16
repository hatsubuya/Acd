public class Data{
    
    private int dia;
    
    private int mes;
    
    private int ano;
    
    public Data(int dia,int mes,int ano){
        
        this.dia = dia;
        
        this.mes = mes;
        
        this.ano = ano;
        
    }
    
    public void ajustarData(int dia,int mes,int ano){
        
        this.dia = dia;
        
        this.mes = mes;
        
        this.ano = ano;
        
          dataValida(dia,mes,ano);
        
    }
    
    
    private void dataValida(int dia,int mes,int ano){
        
        int[] tipo1 = {1,3,5,7,8,10,12};
        
        int[] tipo2 = {4,6,9,11};
        
        boolean bisexto= false;
        
        boolean type1 = false;
        
        boolean type2 = false;
        
        if((ano % 4==0)&&(ano%100!=0)|| (ano%400 == 0))
        {
            bisexto = true;
        }
        
        for(int i :tipo1)
        {
            if(mes==i)
            {
                type1 = true;
                
                break;
            }
        }
        
        for(int j :tipo2){
            if(mes==j)
            {
                type2 = true;
                
                break;
            }
        }
        
        
        if(mes>12 || mes<1 || dia<1 || dia>31 || (dia>30 && !type1) || (dia>29 && !type2 && !type1)  || (dia >28 && !bisexto && mes==2)){
            
            System.out.println("data invalida");
        }
        
        else{
            System.out.println("data valida");
        }
            
        
        
    }
    
    public void mostrarData(){
        
        System.out.println("A data é:"+dia+ "\\" + mes + "\\" +ano);
        
    }
    
}
