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
public abstract class Perrito {//Declaracion de la clase perrito como abstracta
    //Variables caracteristicas de perrito
    private int edad=0;
    private String color="";
    private int comida=0;
    private int agua=0;
    //Constructor vacio para hacer instancias sin mandar parametros
    public Perrito() {
    }
     //Contructores que inciializanlas variablespermiten crear objetos con diferentes parametros  
    Perrito(int edad,String color,int comida,int agua){
        this.edad=edad;
        this.color=color;
        this.comida=comida;
        this.agua=agua;
    }
    
    Perrito(int edad,String color){
        this.edad=edad;
        this.color=color;
        
    }
    
    Perrito(int comida,int agua){
        this.comida=comida;
        this.agua=agua;
    }
    Perrito(int edad,String color,int comida){
        this.edad=edad;
        this.color=color;
        this.comida=comida;
    }
    Perrito(int edad){
        this.edad=edad;
       
    }
    Perrito(String color){
       
        this.color=color;
        
    }
    //Metodos abstractos que permiten que el mismo metodo tenga diferente comportamiento 
    // Al instanciar esta clase los metodos seran extraidos
    public abstract void ladra();
   
    public abstract void camina();
    
    public abstract void comer();
    
    public abstract void perseguirgatos();
    //Metodo con accion, no es abstracto 
    public void ladra2 (){
        System.out.println("WOU WOU ");
    }
}
