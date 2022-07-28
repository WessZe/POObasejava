package poobaseejercicio;

public class ATM {

    private String nombre;
    private int codigoinventario;
    private String ubicacion;
    private String horario;

    public void setATM(String _nombre, int _codigoinventario, String _ubicacion, String _horario) {
        nombre = _nombre;
        codigoinventario = _codigoinventario;
        ubicacion = _ubicacion;
        horario = _horario;
    }

    public void MostrarInformacionATM() {
        System.out.println("ATM: " + nombre);
        System.out.println("Codigo: " + codigoinventario);
        System.out.println("Lugar: " + ubicacion);
        System.out.println("Horario de atencion: " + horario);
    }
}
