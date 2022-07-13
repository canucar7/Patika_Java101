package StudentInformationSystem;

public class Student {

    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    double fizAvg,matAvg,kimAvg;

    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }


    }

    public void addBulkVerbalNote(int matSoz, int fizikSoz,int kimyaSoz){
        if (matSoz >= 0 && matSoz <= 100) {
            this.mat.noteSoz = matSoz;
        }

        if (fizikSoz >= 0 && fizikSoz <= 100) {
            this.fizik.noteSoz = fizikSoz;
        }

        if (kimyaSoz >= 0 && kimyaSoz <= 100) {
            this.kimya.noteSoz = kimyaSoz;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        fizAvg =(this.fizik.note*0.8)+(this.fizik.noteSoz*0.2);
        kimAvg =(this.kimya.note*0.6)+(this.kimya.noteSoz*0.4);
        matAvg =(this.mat.note*0.75)+(this.mat.noteSoz*0.25);
        double avg = (fizAvg + kimAvg + matAvg) / 3;

        this.avarage = (double) Math.round(avg*100)/100;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik, Sinav Notu : " + this.mat.note + " Sözlü Notu : " + this.mat.noteSoz + "  Oran --> sınav %75 sözlü %25" + " Ortalma : " + matAvg );
        System.out.println("Fizik, Sinav Notu : " + this.fizik.note + " Sözlü Notu : " + this.fizik.noteSoz + "  Oran --> sınav %80 sözlü %20" + " Ortalama : " + fizAvg);
        System.out.println("Kimya, Sinav Notu : " + this.kimya.note + " Sözlü Notu : " + this.kimya.noteSoz + "  Oran --> sınav %60 sözlü %40" + " Ortalama : " + kimAvg);

    }
}
