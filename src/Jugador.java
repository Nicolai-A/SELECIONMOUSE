public class Jugador {
    private String nombre;
    private String ubiccion;
    private float rendimiento;
    private float precio;
    private int anio;

    public Jugador() {
    }

    public Jugador(String nombre, String ubiccion, float rendimiento, float precio, int anio) {
        this.nombre = nombre;
        this.ubiccion = ubiccion;
        this.rendimiento = rendimiento;
        this.precio = precio;
        this.anio = anio;
    }

    public String getUbiccion() {
        return ubiccion;
    }

    public void setUbiccion(String ubiccion) {
        this.ubiccion = ubiccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(float rendimiento) {
        this.rendimiento = rendimiento;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


    @Override
    public String toString() {
        return "Jugador " +
                "nombre: " + nombre +
                ", ubiccion: " + ubiccion  +
                ", rendimiento: " + rendimiento +
                ", precio: " + precio +
                ", anio: " + anio + "\n";
    }
}
