package modelos;

public class estadopartida {
    private int VidasRestantes;
    private int PantallaActual;

    public estadopartida(int vidasRestantes, int pantallaActual) {
       this.VidasRestantes = vidasRestantes;
        this.PantallaActual = pantallaActual;
    }

    public int getVidasRestantes() {
        return VidasRestantes;
    }

    public void setVidasRestantes(int vidasRestantes) {
        VidasRestantes = vidasRestantes;
    }

    public int getPantallaActual() {
        return PantallaActual;
    }

    public void setPantallaActual(int pantallaActual) {
        PantallaActual = pantallaActual;
    }
}
