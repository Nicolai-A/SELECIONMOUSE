import java.lang.reflect.Array;
import java.util.ArrayList;

public class Equipo {
    private ArrayList<Jugador> equipo;


    public Equipo(){
        equipo = new ArrayList<>();
        predefinir();
    }

    public void predefinir (){
        equipo.add(new Jugador("Messi","Delantero",9.3f,450f,36));
        equipo.add(new Jugador("Pacho","Defensa",9.5f,250f,25));
        equipo.add(new Jugador("Ronaldo","Delantero",9.1f,500f,38));
        equipo.add(new Jugador("Pedri","MedioCampista",8.3f,100f,22));

    }

    public Jugador getValor(int indice) throws IllegalArgumentException {
        if(indice>=0 && indice < equipo.size()){
            return equipo.get(indice);
        }
        throw new IllegalArgumentException("Indice fuera de limites");
    }

    public float sumaTotal(){
        if (equipo.isEmpty()){
            return 0;
        }
        return sumaTotal(0);
    }

    private float sumaTotal(int indice){
        if (indice==equipo.size()){
            return 0;
        }else {
            return equipo.get(indice).getPrecio()+sumaTotal(indice+1);
        }

    }


    public int size() {
        return equipo.size();
    }

    public float sumaTotal2(String ubicacion){
        if (equipo.isEmpty()){
            return 0;
        }
        return sumaTotal2(0, ubicacion);
    }

    private float sumaTotal2(int indice, String ubicacion){
        if (indice==equipo.size()){
            return 0;
        }

        Jugador jugador = equipo.get(indice);

        if (jugador.getUbiccion().equalsIgnoreCase(ubicacion)){
            return jugador.getPrecio() + sumaTotal2(indice + 1, ubicacion);
        }else{
            return sumaTotal2(indice + 1, ubicacion);
        }


    }

}
