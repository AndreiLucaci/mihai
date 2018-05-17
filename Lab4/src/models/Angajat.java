package models;

public class Angajat extends Om {
    public String get_marca() {
        return _marca;
    }

    public void set_marca(String _marca) {
        this._marca = _marca;
    }

    public String get_gradDePregatire() {
        return _gradDePregatire;
    }

    public void set_gradDePregatire(String _gradDePregatire) {
        this._gradDePregatire = _gradDePregatire;
    }

    public double get_salarDeBaza() {
        return _salarDeBaza;
    }

    public void set_salarDeBaza(double _salarDeBaza) {
        this._salarDeBaza = _salarDeBaza;
    }

    public String get_functie() {
        return _functie;
    }

    public void set_functie(String _functie) {
        this._functie = _functie;
    }

    public int get_vechime() {
        return _vechime;
    }

    public void set_vechime(int _vechime) {
        this._vechime = _vechime;
    }

    private String _marca;
    private String _gradDePregatire;
    private double _salarDeBaza;
    private String _functie;
    private int _vechime;

    public Angajat(String marca, String gradDePregatire, double salarDeBaza, String functie, int vechime) {
        super();

        set_marca(marca);
        set_gradDePregatire(gradDePregatire);
        set_salarDeBaza(salarDeBaza);
        set_functie(functie);
        set_vechime(vechime);
    }

    public Angajat(String cnp, String nume, int varsta, Sex sex, StareCivila stareCivila,
                   String marca, String gradDePregatire, double salarDeBaza, String functie, int vechime) {
        super(cnp, nume, varsta, sex, stareCivila);

        set_marca(marca);
        set_gradDePregatire(gradDePregatire);
        set_salarDeBaza(salarDeBaza);
        set_functie(functie);
        set_vechime(vechime);
    }

    public double calculeazaSalar(){
        return _salarDeBaza * 12 * _vechime;
    }

    @Override
    public String toString() {
        return super.toString() + ", marca='" + _marca + '\'' +
                ", gradDePregatire='" + _gradDePregatire + '\'' +
                ", salarDeBaza=" + _salarDeBaza +
                ", functie='" + _functie + '\'' +
                ", vechime=" + _vechime;
    }
}
