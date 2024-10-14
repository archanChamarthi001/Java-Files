/*15. Create a class Student that stores the details like admin_no, stu_name, course_joined and fees_paid.
—> Courses are: JAVA, PYTHON.
—> The total fees for java is 10k and for python is 7.5k.
—> Provide a constructor to take required details.The default course is JAVA.
—> Provide the following methods: getTotalFee(), getDue(), getFeePaid(), payment(amount). 
*/

class Student {
    private int admin_no;
    private String stu_name;
    private String course_joined;
    private double fees_paid;

    // Constructor with default course as "JAVA"
    public Student(int admin_no, String stu_name, String course_joined, double fees_paid) {
        this.admin_no = admin_no;
        this.stu_name = stu_name;
        this.course_joined = course_joined.equalsIgnoreCase("PYTHON") ? "PYTHON" : "JAVA";
        this.fees_paid = fees_paid;
    }

    // Get total fee based on the course
    public double getTotalFee() {
        return course_joined.equals("PYTHON") ? 7500.0 : 10000.0;
    }

    // Get the amount due (total fee - paid fee)
    public double getDue() {
        return getTotalFee() - fees_paid;
    }

    // Get the fees paid
    public double getFeePaid() {
        return fees_paid;
    }

    // Method to make a payment
    public void payment(double amount) {
        if (amount > 0 && amount <= getDue()) {
            fees_paid += amount;
            System.out.println("Payment successful. Total fees paid: $" + fees_paid);
        } else {
            System.out.println("Invalid payment. Please check the amount.");
        }
    }

    public static void main(String[] args) {
        // Creating student with default course (JAVA)
        Student student1 = new Student(1001, "John Doe", "JAVA", 5000);
        Student student2 = new Student(1002, "David", "Python", 3000);

        System.out.println("Total Fee: " + student1.getTotalFee());
        System.out.println("Due Amount: " + student1.getDue());
        
        // Making payment
        student1.payment(2000);
        System.out.println("Remaining Due: " + student1.getDue());
    }
}
