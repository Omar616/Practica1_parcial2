/*
 * Alumnos : Bueno Rosas Brayan Omar, López Esquivel Ándres  
   Grupo: 5IM8
   Fecha:25/09/2017
 */
package practica;

/**
 *
 * @author Bueno y Lopez
 */
public class Practica {

   
    public static void main(String[] args) {
        Coche coche = new Coche();//Instancia de la clase
        Perrito doggy = new Perrito() { // Creacion del objeto 
            //metodos abstractos de la clase perrito
            @Override
            public void ladra() {
                System.out.println("wau waua");
            }
           //metodos abstractos de la clase perrito
            @Override
            public void camina() {
                   System.out.println("CHU CHU");
            }
            //metodos abstractos de la clase perrito
            @Override
            public void comer() {
                System.out.println("ñom ñom ");
            }
            //metodos abstractos de la clase perrito
            @Override
            public void perseguirgatos() {
                System.out.println("ven aca don gato!");
            }
        };
    }
    
}
