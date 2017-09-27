/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author Alumno
 */
public abstract class Perrito {
    private int edad=0;
    private String color="";
    private int comida=0;
    private int agua=0;

    public Perrito() {
    }

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
    
    public abstract void ladra();
   
    public abstract void camina();
    
    public abstract void comer();
    
    public abstract void perseguirgatos();
    
    public void ladra2 (){
        System.out.println("WOU WOU ");
    }
}
