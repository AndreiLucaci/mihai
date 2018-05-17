package models;

public class Om {
    private String _cnp;
    private String _nume;
    private Integer _varsta;
    private Sex _sex;
    private StareCivila _stareCivila;

    public Om(){ }

    public Om(String cnp, String nume, Integer varsta, Sex sex, StareCivila stareCivila) {
        set_cnp(cnp);
        set_nume(nume);
        set_varsta(varsta);
        set_sex(sex);
        set_stareCivila(stareCivila);
    }

    @Override
    public String toString() {
        return "Cnp='" + _cnp + '\'' +
                ", Nume='" + _nume + '\'' +
                ", Varsta=" + _varsta +
                ", Sex=" + _sex +
                ", StareCivila=" + _stareCivila;
    }

    public boolean estePensionar(){
        switch (_sex){
            case BARBAT:
                return _varsta >= 65;
            case FEMEIE:
                return _varsta >= 62;
            case ALTCEVA:
            default:
                return false;
        }
    }

    public String get_cnp() {
        return _cnp;
    }

    public void set_cnp(String cnp) {
        this._cnp = cnp;
    }

    public String get_nume() {
        return _nume;
    }

    public void set_nume(String nume) {
        this._nume = nume;
    }

    public Integer get_varsta() {
        return _varsta;
    }

    public void set_varsta(Integer varsta) {
        this._varsta = varsta;
    }

    public Sex get_sex() {
        return _sex;
    }

    public void set_sex(Sex sex) {
        this._sex = sex;
    }

    public StareCivila get_stareCivila() {
        return _stareCivila;
    }

    public void set_stareCivila(StareCivila stareCivila) {
        this._stareCivila = stareCivila;
    }
}
