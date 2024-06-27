package HandsOnJava;
import java.util.*;
public class UserInterface {
	public static CommissionInfo generateCommissionObtained(){
        CommissionInfo obj = x -> {
            double commission = 0.0;
            String type = x.getClassType();
            if(type.equals("SL") || type.equals("2S")){
                commission = 60.0;
            }
            else if(type.equals("1A") || type.equals("2A") || type.equals("3A")){
                commission = 100.0;
            }
            return commission;
        };
        return obj;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of passengers");
        int no_of_passengers = sc.nextInt();
        sc.nextLine();
        Tickets tkt[] = new Tickets[no_of_passengers];
        Tickets t =null;
        double com_Obtained = 0.0;
        for(int i=1;i<=no_of_passengers;i++){
            System.out.println("Details of Passenger "+i+":");
            t = new Tickets();
            System.out.println("Enter the pnr no:");
            long pnr_no = sc.nextLong();
            sc.nextLine();
            System.out.println("Enter passenger name:");
            String p_name = sc.nextLine();
            
            System.out.println("Enter seat no:");
            int seat_no = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter class type:");
            String class_type = sc.nextLine();
            
            System.out.println("Enter ticket fare:");
            double tkt_fare = sc.nextDouble();
            
            t.setPnrNo(pnr_no);
            t.setPassengerName(p_name);
            t.setSeatNo(seat_no);
            t.setClassType(class_type);
            t.setTicketFare(tkt_fare);
            CommissionInfo com = generateCommissionObtained();
            com_Obtained += com.calculateCommissionAmount(t);
            tkt[i-1] = t;
        }
        System.out.println("Commission Obtained");
        System.out.printf("Commission Obtained per each person:Rs.%.2f",com_Obtained);
    
    }
}
