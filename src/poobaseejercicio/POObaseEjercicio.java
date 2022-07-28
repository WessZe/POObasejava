package poobaseejercicio;

public class POObaseEjercicio {

    public static void main(String[] args) {
        //ESTRUCTURAS BASICAS
        int numero = 0;
        //ESTRUCTURAS POO
        Billete quinientosLPS = new Billete();
        /*
    quinientosLPS.nombre = "Lempira";
    quinientosLPS.valor = 500;
         */
        quinientosLPS.setBillete("Lempira", 500);
        quinientosLPS.MostrarInformacion();

        ATM villanuevaatm = new ATM();
        villanuevaatm.setATM("BAC", 001, "MetroPlaza", "10:00 AM a 7:30 PM");
        villanuevaatm.MostrarInformacionATM();
    }
}
