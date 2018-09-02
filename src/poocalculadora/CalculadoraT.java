
package poocalculadora;
import static java.lang.Math.*; 

public class CalculadoraT{
    double valor=0;
    double angulo;
    double anguloRadianes=angulo;
    public boolean seno;
    public double resultado;

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }
    public void agregarNum(int num){
        setAngulo(angulo+num);
    }
    public void seno(String num){//metodo
        this.resultado=Double.parseDouble(num);
        seno=true;
        
    }   
    public double calculo(String numero){
        if(seno==true){
            resultado= Math.sin(anguloRadianes);
        }
    seno=false;
     return resultado;
     }
    
    
    }
    

 