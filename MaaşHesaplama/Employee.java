package MaaşHesaplama;

public class Employee {

    String name ;
    double salary ;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }

    public double tax(){

        if (this.salary<1000){
            return this.salary;
        }
        else {
            double taxCost = this.salary * 0.03;
            return taxCost;
        }


    }


     public double bonus(){
        double extraHour=this.workHours - 40;

        if (this.workHours>40){
         double bonusSalary = extraHour*30;
         return bonusSalary;

        }

        return 0;
    }


    public double raiseSalary(){

        if (this.hireYear<=0 || this.hireYear>2021){
            System.out.println("Geçersiz bir çalışma yılı girdiniz, tekrar kontrol ediniz!");

        }else {
            int diffYear= 2021 - this.hireYear;
            double costOfRaise;

            if (diffYear<10 && diffYear>0){
                costOfRaise = this.salary * 0.05;
                return costOfRaise;
            }
            else if (diffYear>9 && diffYear<20){
                costOfRaise = this.salary * 0.1;
                return costOfRaise;
            }
            else if (diffYear>19){
                costOfRaise = this.salary * 0.15;
                return costOfRaise;
            } else if (diffYear==0) {
                return 0;
            }

        }


        return 0;
    }


    public String toString(){

        double tot = this.salary +bonus() - tax();
        double total = this.salary -tax() + bonus() + raiseSalary();

        System.out.println("Adı : " + this.name +
                "\nMaaşı : " + this.salary +
                "\nÇalişma saati : " + this.workHours +
                "\nBaşlangıç yılı : " + this.hireYear +
                "\nVergi :  " + tax() +
                "\nBonus : " + bonus() +
                "\nMaaş artışı : " + raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş : " + tot +
                "\nToplam maaş : " + total);

        return null;
    }

}
