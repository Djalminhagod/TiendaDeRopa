package TiendaDeRopa;

public class Brand {
    private  String nombre;
    private  String pais;
    private  int prestigeScore;

    public Brand(String nombre, int prestigeScore, String pais) {
        this.nombre = nombre;
        this.prestigeScore = prestigeScore;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getPrestigeScore() {
        return prestigeScore;
    }

    public void setPrestigeScore(int prestigeScore) {
        this.prestigeScore = prestigeScore;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", prestigeScore=" + prestigeScore +
                '}';
    }
}
