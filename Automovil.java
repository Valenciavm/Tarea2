
public class Automovil {
   
    private String marca, modelo, color;
    private static short cilindraje;
    
    public Automovil(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Automovil(String modelo, String color){
        this.marca = "Ferrari";
        this.modelo = modelo;
        this.color = color;
    }
    
    public Automovil(short cilindraje){

        this.cilindraje = cilindraje;
    }

 

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(short cilindraje) {
        Automovil.cilindraje = cilindraje;
    }
}
