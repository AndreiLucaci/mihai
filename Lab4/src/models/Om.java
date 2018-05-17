package models;

public class Om {
    private String _cnp;
    private String _nume;
    private Integer _varsta;
    private Sex _sex;
    private String _stareCivila;

    public Om(){ }

    public Om(String cnp, String nume, Integer varsta, Sex sex, String stareCivila) {
        
    }

    public String get_cnp() {
        return _cnp;
    }

    public void set_cnp(String _cnp) {
        this._cnp = _cnp;
    }

    public String get_nume() {
        return _nume;
    }

    public void set_nume(String _nume) {
        this._nume = _nume;
    }

    public Integer get_varsta() {
        return _varsta;
    }

    public void set_varsta(Integer _varsta) {
        this._varsta = _varsta;
    }

    public Sex get_sex() {
        return _sex;
    }

    public void set_sex(Sex _sex) {
        this._sex = _sex;
    }

    public String get_stareCivila() {
        return _stareCivila;
    }

    public void set_stareCivila(String _stareCivila) {
        this._stareCivila = _stareCivila;
    }
}
