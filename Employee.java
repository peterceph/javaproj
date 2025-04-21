public class Employee {
    private int ID;
    private String name;
    private String dept;
    private int salary;
    private String number;

    Employee(){
        this.ID = 0;
        this.name = "";
        this.dept = "";
        this.salary = 0;
        this.number = "";
    }

    Employee(int ID, String name, String dept, int salary, String number){
        this.ID = ID;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.number = number;
    }


         /*********** Get / Set ID ****************/

        public int getID(){
        return ID;
    }
        public void setID(int ID){
        this.ID = ID;
    }
        /*********** Get / Set Name ****************/

        public String getName(){
        return name;
        }
        public void setName(String name){
        this.name = name;
        }

        /*********** Get / Set Department ****************/
        public String getDept(){
        return dept;
        }
        public void setDept(String dept){
        this.dept = dept;
        }
        /*********** Get / Set Salary ****************/
        public int getSalary(){
        return salary;
        }
        public void setSalary(int salary){
        this.salary = salary;
        }

        /*********** Get / Set Number ****************/
        public String getNumber(){
            return number;
        }
        public void setNumber(String number){
            this.number = number;
        }

}

