package oops2;

// Implementation of static and instance data members

public class MotelInformation {
    static String mname;  // Static variable for Motel Name
    String vname;         
    int numOfMembers;     
    boolean car;          

    public static void main(String[] args) {
        
        MotelInformation.mname = "Vrindavan Motel";
        
        System.out.println("Information about Motel Public Entry Today:");
        System.out.println("Motel Name: " + MotelInformation.mname);

        
        MotelInformation visitor1 = new MotelInformation();
        MotelInformation visitor2 = new MotelInformation();

        
        visitor1.vname = "Alice";
        visitor1.numOfMembers = 2;
        visitor1.car = true;

       
        visitor2.vname = "Bob";
        visitor2.numOfMembers = 4;
        visitor2.car = false;

        // Displaying Visitor 1 Information
        System.out.println("\nVisitor 1 Name: " + visitor1.vname);
        System.out.println("Number of Members: " + visitor1.numOfMembers);
        System.out.println("Has a car: " + (visitor1.car ? "Yes" : "No"));

        // Displaying Visitor 2 Information
        System.out.println("\nVisitor 2 Name: " + visitor2.vname);
        System.out.println("Number of Members: " + visitor2.numOfMembers);
        System.out.println("Has a car: " + (visitor2.car ? "Yes" : "No"));
    }
}
