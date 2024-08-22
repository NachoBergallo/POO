public class Juego {
    private int vidas;
    private int originales;

    public Juego(int vidas) {
        this.vidas = vidas;
        this.originales = vidas;
    }

    public void MuestraVidasRestantes(){
        System.out.println("vidas restantes: " + vidas);
    }

    public boolean Quitavida(){
        vidas--;
        return vidas > 0;
    }

    public void ReiniciaPartida(){
        this.vidas = originales;
    }
}
