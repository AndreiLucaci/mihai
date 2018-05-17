import models.*;

public class Program {
    public static void main(String[] arguments){
        //lab4_partea1_1();

        //lab4_partea1_2();

        lab4_partea1_3();
    }

    private static void lab4_partea1_1() {
        Om omulet = new Om("1651028534865", "Omuletul racheta", 46, Sex.BARBAT, StareCivila.CASATORIT);
        Om omulet1 = new Om("1651028534865", "Omuletul racheta1", 7646, Sex.FEMEIE, StareCivila.VADUV);

        lab4_partea1_1_pensionar(omulet);
        lab4_partea1_1_pensionar(omulet1);
        lab4_partea1_sex(omulet);
        lab4_partea1_sex(omulet1);
    }

    private static void lab4_partea1_1_pensionar(Om omulet) {
        System.out.println(String.format("Este %s pensionar?", omulet.get_nume()));
        System.out.println(omulet.estePensionar() ? "Da" : "Nu");
    }

    private static void lab4_partea1_sex(Om omulet) {
        System.out.println(String.format("Ce sex are %s?", omulet.get_nume()));
        System.out.println(omulet.get_sex());
    }

    private static void lab4_partea1_2(){
        Student andrei =
                new Student(
                        "1234323454123", "Andrei", 25,
                        Sex.BARBAT, StareCivila.CASATORIT, "UBB",
                        "info", "engleza", 8,
                        9, 10);
        Student mihai =
                new Student(
                        "1232324542312", "Mihai", 19,
                        Sex.BARBAT, StareCivila.CASATORIT, "Poli",
                        "TCM", "engleza", 13,
                        11, 10);
        Student nati =
                new Student(
                        "1234323454323", "Nati", 24,
                        Sex.ALTCEVA, StareCivila.VADUV, "UMF",
                        "asistent", "romana", 3,
                        6, 6);

        lab4_partea1_2_bursa(andrei);
        lab4_partea1_2_bursa(mihai);
        lab4_partea1_2_bursa(nati);

        lab4_partea1_2_medie(andrei);
        lab4_partea1_2_medie(mihai);
        lab4_partea1_2_medie(nati);
    }

    private static void lab4_partea1_2_bursa(Student student){
        System.out.println(String.format("Bursa studentului %s", student.get_nume()));
        System.out.println(student.calculeazaTipulBursa());
    }

    private static void lab4_partea1_2_medie(Student student){
        System.out.println(String.format("Media studentului %s", student.get_nume()));
        System.out.println(student.calculeazaMediaNotelor());
    }

    private static void lab4_partea1_3(){
        Angajat andrei =
                new Angajat(
                        "1234323454123", "Andrei", 25,
                        Sex.BARBAT, StareCivila.CASATORIT, "Pepsi", "Master",
                        1600, "programtor", 5);
        Angajat mihai =
                new Angajat(
                        "1534623454123", "Mihai", 19,
                        Sex.BARBAT, StareCivila.NECASATORIT, "Pepsi", "Liceu",
                        700, "student", 1);
        Angajat nati =
                new Angajat(
                        "1234323454123", "Nati", 25,
                        Sex.BARBAT, StareCivila.CASATORIT, "Umf", "Colegiu",
                        1000, "asistent medical (baiat...) a.k.a. sugaci", 2);

        lab4_partea1_3_calculeazaSalar(andrei);
        lab4_partea1_3_calculeazaSalar(mihai);
        lab4_partea1_3_calculeazaSalar(nati);
    }

    private static void lab4_partea1_3_calculeazaSalar(Angajat angajat){
        System.out.println(String.format("Info angajat %s", angajat));
        System.out.println(String.format("Salarul total pentru angajatul %s", angajat.get_nume()));
        System.out.println(angajat.calculeazaSalar());
    }
}
