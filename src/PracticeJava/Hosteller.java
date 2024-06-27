package PracticeJava;

public class Hosteller extends Student{
    private String hostelName;
    private int roomNumber;
    
    public void setHostelName(String hostelName){
        this.hostelName = hostelName;
    }
    public String getHostelName(){
        return hostelName;
    }
    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }
    public int getRoomNumber(){
        return roomNumber;
    }
    public String toString(){
        System.out.println("The Student Details");
        return studentId+" "+name+" "+departmentId+" "+gender+" "+phone+" "+hostelName+" "+roomNumber;
    }
    public Hosteller() {
    	
    }
    public Hosteller(int new_roomNumber,String new_phoneNumber){
        this.roomNumber = new_roomNumber;
        this.phone = new_phoneNumber;
    }
	
}