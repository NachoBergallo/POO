public class Main {
    public static void main(String[] args) {
        Juego intento = new Juego(5);
        intento.MuestraVidasRestantes();
        intento.Quitavida();
        intento.MuestraVidasRestantes();
        intento.ReiniciaPartida();
        intento.MuestraVidasRestantes();
    }
}