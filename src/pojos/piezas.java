package pojos;

public class piezas 
{

int idcomponente;
String marca;
String modelo;
int precio;
String estandar;

public piezas()
{
    
}

    public piezas(int idcomponente, String marca, String modelo, int precio, String estandar) {
        this.idcomponente = idcomponente;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.estandar = estandar;
    }

      
    public int getIdcomponente() {
        return idcomponente;
    }

    public void setIdcomponente(int idcomponente) {
        this.idcomponente = idcomponente;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEstandar() {
        return estandar;
    }

    public void setEstandar(String estandar) {
        this.estandar = estandar;
    }
    
    
}
