public class Employee {
    public double salary;
    public int hireYear,workHours;
    public String name;

    Employee(int hireYear,int workHours,double salary,String name){
        this.hireYear = hireYear;
        this.workHours = workHours;
        this.salary = salary;
        this.name = name;

    }
    public double tax(){
        if(this.salary>=1000){
            return this.salary* 0.03;
        }else{
            return 0.0;
        }
    }
    public double bonus(){
         int extraHours = this.workHours-40;
         if (extraHours>0){
             return 30 * extraHours;
         }
         return 0.0;

    }
    public double increase(){
        int year = 2020 - hireYear;
        if(year < 10){
            return this.salary*0.05;
        }else if(year >=10 && year<20 ){
            return this.salary*0.1;
        }else{
            return this.salary*0.2;
        }
    }

}
