package recetas;


import java.util.HashSet;

public class Receta {
    private String nombre;
    private HashSet<Ingrediente> ingredientes;
    private double precioTotal;
    private int comensales;

    Receta(String nombre, int comensales, HashSet<Ingrediente> ingredientes){
        this.precioTotal= +20;
        this.nombre= nombre;
        this.comensales= comensales;
        this.ingredientes= ingredientes;
    }

    //Getters
    public int getComensales() {
        return comensales;
    }
    
    public HashSet<Ingrediente> getIngredientes() {
        return ingredientes;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecioTotal() {
        return precioTotal;
    }

    //Setters
    public void setComensales(int comensales) {
        this.comensales = comensales;
    }
    
    public void setIngredientes(HashSet<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    int establecerPrecioReceta(){
    return 0;
    }
}
