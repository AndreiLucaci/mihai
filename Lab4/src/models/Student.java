package models;

public class Student extends Om{
    private String _universitatea;
    private String _facultea;
    private String _sectia;
    private double _nota1;
    private double _nota2;
    private double _nota3;

    public Student(String universitatea, String facultatea, String sectia, double nota1,double nota2,double nota3) {
        super();

        set_facultea(facultatea);
        set_universitatea(universitatea);
        set_sectia(sectia);
        set_nota1(nota1);
        set_nota2(nota2);
        set_nota3(nota3);
    }

    public Student(
            String cnp,
            String nume,
            int varsta,
            Sex sex,
            StareCivila stareCivila,
            String universitatea,
            String facultatea,
            String sectia,
            double nota1,
            double nota2,
            double nota3) {

        super(cnp, nume, varsta, sex, stareCivila);

        set_facultea(facultatea);
        set_universitatea(universitatea);
        set_sectia(sectia);
        set_nota1(nota1);
        set_nota2(nota2);
        set_nota3(nota3);
    }

    public double calculeazaMediaNotelor(){
       return (_nota1+_nota2+_nota3)/3;
    }

    public Bursa calculeazaTipulBursa(){
        double media = calculeazaMediaNotelor();

        if(media>=8 && media<9){
            return Bursa.STUDIU;
        }
        if(media>=9 && media<9.5){
            return Bursa.MERIT;
        }
        if(media>=9.50){
            return Bursa.EXCELENTA;
        }

        return Bursa.NIMIC;
    }

    public String get_universitatea() {
        return _universitatea;
    }

    public void set_universitatea(String _universitatea) {
        this._universitatea = _universitatea;
    }

    public String get_facultea() {
        return _facultea;
    }

    public void set_facultea(String _facultea) {
        this._facultea = _facultea;
    }

    public String get_sectia() {
        return _sectia;
    }

    public void set_sectia(String _sectia) {
        this._sectia = _sectia;
    }

    public double get_nota1() {
        return _nota1;
    }

    public void set_nota1(double _nota1) {
        this._nota1 = _nota1;
    }

    public double get_nota2() {
        return _nota2;
    }

    public void set_nota2(double _nota2) {
        this._nota2 = _nota2;
    }

    public double get_nota3() {
        return _nota3;
    }

    public void set_nota3(double _nota3) {
        this._nota3 = _nota3;
    }
}
