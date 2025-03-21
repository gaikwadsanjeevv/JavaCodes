package oops3;

public class ChangeOfMotelName {
    static String motelName; 
    String roomType;
    int roomNumber;

   
    static void changeMotelName(String newName) {
        motelName = newName;
    }

    public static void main(String[] args) {
       
        ChangeOfMotelName.motelName = "Motel 6";
        System.out.println("Motel Name : " + ChangeOfMotelName.motelName);
        System.out.println("Access directly Motel Name : " + motelName);

       
        ChangeOfMotelName motel1 = new ChangeOfMotelName();
        motel1.changeMotelName("Holiday Inn");
        ChangeOfMotelName motel2 = new ChangeOfMotelName();

        // Displaying the motel names
        System.out.println("motel1 name : " + motel1.motelName);
        System.out.println("motel2 name : " + motel2.motelName);
    }
}
