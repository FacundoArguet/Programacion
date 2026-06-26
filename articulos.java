package programacion;


public class Articulos{

    private String code;
    private String nombre;
    private String desc;
    private String origen;
    private double precio;
    private double peso;


    public Articulos(String code,String nombre,String desc,String origen, double precio,double peso){
        this.code= code;
        this.nombre= nombre;
        this.desc= desc;
        this.origen=origen;
        this.precio=precio;
        this.peso=peso;
    }
    public String getCode(){
        return code;
        
    }
    public String getNombre(){
        return nombre;
        
    }
    public String getDesc(){
        return desc;
        
    }
    public String getOrigen(){
        return origen;
        
    }
    public double getPrecio(){
        return precio;
        
    }
    public double getPeso(){
        return peso;
    }
    public void setCode(String code){
        this.code=code;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDesc(String desc){
        this.desc=desc;
    }
    public void setOrigen(String origen){
        this.origen=origen;
    }
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public void setPeso(double peso){
        this.peso=peso;
    }
}
