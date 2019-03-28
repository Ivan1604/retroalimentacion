
package ec.edu.intsuperior.modelo;

/**
 *
 * @author PC-IVAN
 */
public class MiClase {
    
    
    public static void suma() {
        int x, y, z;
        x = 4;
        y = 6;
        z = x + y;
        System.out.println("La suma es : " + z);
    }

    public static int resta() {
        int x, y, z;
        x = 8;
        y = 2;
        z = x - y;
        return z;
    }

    public void multiplicacion() {
        int x, y, z;
        x = 5;
        y = 6;
        z = x * y;
        System.out.println("El producto es: " + z);
    }
    
    public float division(){
        float x,y;
        x=54;
        y=13;
        return x/y;
    }
    
    public static void max(){
        int x,y;
        x=3;
        y=2;
         if (x>y)
         System.out.println("El numero mayor es:"+ x);
         else 
         System.out.println("El numero mayor es:"+ y);
       
    }
    
    public static void promedio(){
        int x,y,z;
        float prom;
        x=9;
        y=3;
        z=7;
        prom=(float)(x+y+z)/3;
        
        System.out.println("El promedio es:" + prom+"/n");
        if (prom>=7){
             System.out.println("Exonerado");
        }else {
            if(prom>=4)
                System.out.println("Suspenso");
            else
                System.out.println("Pierde");
        }
        
    }
    
}
