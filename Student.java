public class Student {

       
    String name;
    int id;
    String course;
    String phoneNo;
    

    public Student(String name, int id, String course, String phoneNo){
        this.id = id;
        this.course = course;
        this.phoneNo = phoneNo;
       
    }


    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Course: " + course);
        System.out.println("Phone Number: " + phoneNo);
        
    }


    public static void main(String[] args) {
        Student student1 = new Student(
            "sanjeev ",    
            101,                
            "Computer Science", 
            "9876543210",       
            "123 Main Street"   
        );

        student1.displayDetails();
    }
}



