public class Student {

       
    String name;
    int id;
    String course;
    String phoneNo;
    String address;

    public Student(String name, int id, String course, String phoneNo,String address){
        this.id = id;
        this.course = course;
        this.phoneNo = phoneNo;
       this.address=address;
    }


    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Course: " + course);
        System.out.println("Phone Number: " + phoneNo);
        System.out.println("Address:"+address);
        
    }


    public static void main(String[] args) {
        Student student1 = new Student(
            "sanjeev ",    
            101,                
            "Computer Science", 
            "9876543210",       
            "BVB Back Gate"   
        );

        student1.displayDetails();
    }
}



