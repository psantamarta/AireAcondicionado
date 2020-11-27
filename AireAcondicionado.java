
public class AireAcondicionado{
    
    private double temperatura;
    private double min;
    private double max;
    private double incremento;
    private int contador;
    private double minSeleccionada;
    private double maxSeleccionada;
    private double temperaturaActual;

    public AireAcondicionado(double minimo, double maximo){
        temperatura = 15.0;
        min = minimo;
        max = maximo;
        incremento = 5.0;
        contador = 0;
        minSeleccionada = temperatura;
        maxSeleccionada = temperatura;
        temperaturaActual = temperatura;
    }

    public double getTemperatura(){
        return temperatura;
    }
    
    public void setIncremento(double nuevoIncremento){
        incremento =  nuevoIncremento;
    }
    
    public void subirTemperatura(){   
       if (temperatura + incremento <= max ){
            temperatura = temperatura + incremento;
            temperaturaActual = temperatura;
            contador ++;
       }
       if (temperaturaActual > maxSeleccionada){
           maxSeleccionada = temperaturaActual;
       }
       
    }
    
    public void bajarTemperatura(){ 
        if (temperatura - incremento >= min ){
            temperatura = temperatura - incremento;
            temperaturaActual = temperatura;
            contador ++;
       }
       if (temperaturaActual < minSeleccionada){
           minSeleccionada = temperaturaActual;
       }
    }
    
    public void mostrarEstadisticas(){
        System.out.println("Temperatura actual: " + temperatura + "º, Temp. máxima posible: " + max + "º, Temp. mínima posible: " + min + "º, Temp. mínima seleccionada: " + minSeleccionada + "º, Temp. máxima seleccionada: " + maxSeleccionada + "º, Temp. cambiada " + contador + " veces");
    }
    
}
