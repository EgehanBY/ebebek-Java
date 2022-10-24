public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee (String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary <= 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }
    public double raiseSalary() {
        if ((2021 - this.hireYear) > 19) {
            return this.salary * 0.15;
        } else if ((2021 - this.hireYear > 9) && (2021 - this.hireYear < 20)) {
            return this.salary * 0.10;
        } else if ((2021 - this.hireYear) < 10) {
            return this.salary * 0.05;
        } else {
            return 0;
        }
    }

    public void calculation  (Employee employee) {
        double sum = this.salary - tax() + bonus() + raiseSalary();
        System.out.println("Adı : " + this.name);
        System.out.println("Maaş : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıc Yılı : " + this.hireYear);
        System.out.println("Vergi Tutarı : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Maaş Zammı : " + this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + sum);
    }
}
