
public class botones {
    
    private static Interfaz formulario;
    private static Interfazz interfaz[];
    private static int contador;
    
    
    

public static void main (String[] args) {
    
    formulario = new Interfaz();
    interfaz = new Interfazz[100];
    // arreglo 0-99 elemntos del arreglo interfaz
    
    for (int i = 0; i< 100; i++){
        interfaz[i]=new Interfazz();
        
    }
    contador=0;
    
    formulario.setVisible(true);
    
    }
public static void guardar(String z, String l, String zn, String lat ){
    
   
    // creamos 4 variables 
    // zona Z, Longitud L,zonanombre ZN,Latitud Lat
    
    interfaz[contador].setIDZONA(z);
    interfaz[contador].setLatitud(l);
    interfaz[contador].setZonanombre(zn);
    interfaz[contador].setLongitud(lat);
    
    contador++;
    
}

public static void buscar(String bus){
 
        //creamos la variable
        //
        for (int j=0; j< interfaz.length; j++ ){
            
            if(interfaz[j].getIDZONA().equals(bus)){
                formulario.cargardatos(interfaz[j]);
            }
            
        }
        
       
}
    
    
}



   

