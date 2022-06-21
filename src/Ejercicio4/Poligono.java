package Ejercicio4;
public abstract class Poligono {
    protected int numeroLados;

    public Poligono(int numeroLados){
        this.numeroLados = numeroLados;
    }
    public int getNumeroLados(){
        return numeroLados;
    }
    @Override
    public String toString(){
        return "Numero de lados es: "+numeroLados;  
    }
    // Declaramos el método área como abstracto
    public abstract double area();
}
