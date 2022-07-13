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

        if (salary<1000){
            return salary;
        }
        else {
            double taxCost = salary * 0.03;
            return taxCost;
        }


    }


     public double bonus(){
        double extraHour=workHours - 40;

        if (workHours>40){
         double bonusSalary = extraHour*30;
         return bonusSalary;

        }

        return 0;
    }


    public double raiseSalary(){

        if (hireYear<=0 || hireYear>2021){
            System.out.println("Geçersiz bir çalışma yılı girdiniz, tekrar kontrol ediniz!");

        }else {
            int diffYear= 2021 - hireYear;
            double costOfRaise;

            if (diffYear<10 && diffYear>0){
                costOfRaise = salary * 0.05;
                return costOfRaise;
            }
            else if (diffYear>9 && diffYear<20){
                costOfRaise = salary * 0.1;
                return costOfRaise;
            }
            else if (diffYear>19){
                costOfRaise = salary * 0.15;
                return costOfRaise;
            } else if (diffYear==0) {
                return 0;
            }

        }


        return 0;
    }


    public String toString(){

        double tot = salary +bonus() - tax();
        double total = salary -tax() + bonus() + raiseSalary();

        System.out.println("Adı : " + name +
                "\nMaaşı : " + salary +
                "\nÇalişma saati : " + workHours +
                "\nBaşlangıç yılı : " + hireYear +
                "\nVergi :  " + tax() +
                "\nBonus : " + bonus() +
                "\nMaaş artışı : " + raiseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş : " + tot +
                "\nToplam maaş : " + total);

        return null;
    }

}
