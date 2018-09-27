package calculadora;
import static java.lang.Math.*; 
 import java.lang.StrictMath;
public class CalculadoraT{
    
   
  
    
    
    double angulo1;
    //double anguloRadianes=angulo;
    public boolean seno;
    public boolean cos;
    public boolean tan;
    public boolean cotan;
    public boolean csc;
    public boolean sec;
    public double resultado1;
    public String digito;
   

    public CalculadoraT(){
     this.digito="";
     this.seno=false;
       this.resultado1 = 0;
}
    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }
    public void agregarNum(int angulo){
        setDigito(digito+angulo);
    }
    
    
  
    
   public void seno(String angulo){//metodo
   this.resultado1=Double.parseDouble(angulo);
   angulo1=Double.parseDouble(angulo);
   this.resultado1=Math.toRadians(angulo1);
   seno=true;
   setDigito("");
    }
    public void cos(String angulo){//metodo
   this.resultado1=Double.parseDouble(angulo);
   angulo1=Double.parseDouble(angulo);
   this.resultado1=Math.toRadians(angulo1);
   seno=true;
   setDigito("");
    }
   public void tan(String angulo){//metodo
   this.resultado1=Double.parseDouble(angulo);
   angulo1=Double.parseDouble(angulo);
   this.resultado1=Math.toRadians(angulo1);
   seno=true;
   setDigito("");
    }
     public void cotan(String angulo){//metodo
   this.resultado1=Double.parseDouble(angulo);
   angulo1=Double.parseDouble(angulo);
   this.resultado1=Math.toRadians(angulo1);
   seno=true;
   setDigito("");
    }
       public void csc(String angulo){//metodo
   this.resultado1=Double.parseDouble(angulo);
   angulo1=Double.parseDouble(angulo);
   this.resultado1=Math.toRadians(angulo1);
   seno=true;
   setDigito("");
    }
   public void sec(String angulo){//metodo
   this.resultado1=Double.parseDouble(angulo);
   angulo1=Double.parseDouble(angulo);
   this.resultado1=Math.toRadians(angulo1);
   seno=true;
   setDigito("");
    }
    public double calculo(String numero){
   
   if(seno==true){
            resultado1=Math.asin(resultado1);
        }
   if(cos==true){
            resultado1=Math.acos(resultado1);
        }
   if(tan==true){
            resultado1=Math.atan(resultado1);
        }
   if(cotan==true){
            resultado1=1/(Math.atan(resultado1));
        }
    if(csc==true){
            resultado1=1/(Math.asin(resultado1));
        }
    if(sec==true){
            resultado1=1/(Math.acos(resultado1));
        }
   seno=false;
   cos=false;
   tan=false;
   cotan=false;
   sec=false;
   csc=false;
   
   return resultado1;
    }  
   
     
}
    

 