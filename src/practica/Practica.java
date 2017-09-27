/*
 * Alumnos : Bueno Rosas Brayan Omar, López Esquivel Ándres
    
 * 
 * 
 */
package practica;

/**
 *
 * @author Bueno y Lopez
 */
public class Practica {

   
    public static void main(String[] args) {
        Coche coche = new Coche();
        Perrito doggy = new Perrito() {
            @Override
            public void ladra() {
                System.out.println("wau waua");
            }

            @Override
            public void camina() {
                   System.out.println("CHU CHU");
            }

            @Override
            public void comer() {
                System.out.println("ñom ñom ");
            }

            @Override
            public void perseguirgatos() {
                System.out.println("ven aca don gato!");
            }
        };
    }
    
}
