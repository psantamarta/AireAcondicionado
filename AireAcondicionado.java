
public class AireAcondicionado{
    
    private double temperatura;
    private double min;
    private double max;
    private double incremento;

    public AireAcondicionado(double minimo, double maximo){
        temperatura = 15.0;
        min = minimo;
        max = maximo;
        incremento = 5.0;
    }

    public double getTemperatura(){
        return temperatura;
    }
    
    public void setIncremento(double nuevoIncremento){
        temperatura =  nuevaTemperatura;
    }
    
    public void subirTemperatura(){   
        if (temperatura + incremento <= max ){
            temperatura = temperatura + incremento;
       }
    }
    
    public void bajarTemperatura(){ 
        if (temperatura - incremento >= min ){
            temperatura = temperatura - incremento;
       }
    }
    
    
}
