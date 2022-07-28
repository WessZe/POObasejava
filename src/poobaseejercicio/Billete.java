package poobaseejercicio;

public class Billete {
    //Propiedades, atruibutos, caracteristicas

    private String nombre;
    private int valor;
//Eventos, metodos, acciones

    public void setBillete(String _nombre, int _valor) {
        nombre = _nombre;
        valor = _valor;
    }

    public void MostrarInformacion() {
        System.out.println("Moneda: " + nombre);
        System.out.println("Valor: " + valor);
    }
}
