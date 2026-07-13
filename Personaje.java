package programacion;
import java.util.*;

public class Personaje {
    private int salud;
    private String nombre;
    private int nv;

    public Personaje(String nombre, int salud,int nv){
        this.nombre = nombre;
        this.salud= salud;
        this.nv=nv;
    }
    public void atacar() {
    }
    public String getnombre(){
        return nombre;
    }
    public void setnombre(){
        this.nombre=nombre;
    }
    public int getsalud(){
        return salud;
    }
    public void setsalud(){
        this.salud=salud;
    }
    public int getnv(){
        return nv;
    }
    public void setnvl(){
        this.nv=nv;
    }
}
