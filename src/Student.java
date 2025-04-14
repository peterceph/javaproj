/*In this I have applied the following knowledge:
- Classes & Objects
- Constructors & this Keyword
- Encapsulation (Getters & Setters)
- Static & Instance Variables & Methods
**/


public class Student {

    private int Id;
    private String Name;
    private String D_O_B;
    private char Gender;
    private String studentClass;
    private int No_Of_Subjects;
    private String Fee_Status;

//Now to the method for creating the objects

    Student(int Id, String Name, String D_O_B, String studentClass, int No_Of_Subjects, String Fee_Status) {
        this.Id = Id;
        this.Name = Name;
        this.D_O_B = D_O_B;
        this.Gender = Gender;
        this.studentClass = studentClass;
        this.No_Of_Subjects = No_Of_Subjects;
        this.Fee_Status = Fee_Status;
    }


    //Getter for Id
         public int getId() {
             return Id;
         }
        //Setter for Id
        public void setId (int Id){
                 this.Id = Id;
        }
         //Getter for Name
         public String getName(){
        return Name;
    }
        //Setter for Name
         public void setName(String Name){
        this.Name = Name;
    }

        //Getter for D_O_B
        public String getDOB(){
        return D_O_B;
        }

        //Setter for D_O_B
        public void setDOB(String D_O_B){
        this.D_O_B = D_O_B;
        }

        //Getter for Gender
        public char getGender() {
        return Gender;
    }

        //Setter for Gender

        public void setGender(char Gender){
        this.Gender = Gender;
        }

    //Getter for studentClass
        public String getstudentClass(){
            return studentClass;
        }

        //Setter for Level
        public void setstudentClass(String studentClass){
            this.studentClass = studentClass;
        }

        //Getter for No_Of_Subjects
         public int getNoOfSubjects(){
         return No_Of_Subjects;
         }

        //Setter for No_Of_Subjects
        public void  setNoOfSubjects(int No_Of_Subjects) {
        this.No_Of_Subjects = No_Of_Subjects ;
    }

        //Getter for Fee_Status
        public String getFeeStatus(){
        return Fee_Status;
        }

        //Setter for Fee_Status
            public void setFeeStatus(String Fee_Status){
           this.Fee_Status = Fee_Status;
            }


    void etudiant(){
    System.out.println("Your Student Identification number is: ");
    System.out.println("Your Name is: ");
    System.out.println("Your Class D_O_B is: ");
    System.out.println("Your are in:   ");
    System.out.println("You offer  " + No_Of_Subjects + "subjects");
    System.out.println("Your Fee status is:  ");

    }


    }


