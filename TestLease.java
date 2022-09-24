import java.util.Scanner;

//Denys Olaleye
//23.09.22

/*Create a class named TestLease whose main() method declares four Lease objects. Call a getData() method three times. Within the method, prompt a user 
for values for each field for a Lease, and return a Lease object to the main() method where it is assigned to one of main()’s Lease objects. Do not prompt the
user for values for the fourth Lease object, but let it continue to hold the default values. Then, in main(), pass one of the Lease objects to a showValues() 
method that displays the data. Then call the addPetFee() method using the passed Lease object and confirm that the fee explanation statement is displayed. Next, 
call the showValues() method for the Lease object again and confirm that the pet fee has been added to the rent. Finally, call the showValues() method with each
of the other three objects; confirm that two hold the values you supplied as input and one holds the constructor default values. Save the application as 
TestLease.java*/

public class TestLease 
{
	public static void main (String [] args)
	{
		//creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//declaring Lease objects
		Lease lease1 = new Lease();
		Lease lease2 = new Lease();
		Lease lease3 = new Lease();
//		lease lease4 = new Lease(); 
		
		//getData methods
		System.out.println(lease1.getName());
		System.out.println(lease1.getApartmentsNum());
		System.out.println(lease1.getTermOfLease());
		
		System.out.println("What is leaser name?");
		lease2.setName(input.next());
		System.out.println("What is the apartments number?");
		lease2.setApartmentsNum(Integer.parseInt(input.next()));
		System.out.println("What is the rental amount?");
		lease2.setMonthlyRent(Integer.parseInt(input.next()));
		System.out.println("What is the term of the lease?");
		lease2.setTermOfLease(Integer.parseInt(input.next()));
		
		showValues("Monthly rent lease 1 " +lease1.getMonthlyRent());
		showValues("Monthly rent lease 2 " +lease2.getMonthlyRent());
		
		
		showValues("Monthly rent lease 3 " +lease3.getMonthlyRent());
		lease3.addPetFee();
		showValues("Monthly rent lease 3 with pet " +lease3.getMonthlyRent());
		input.close();
		}
		
		public static void showValues(Object e)
		{
			System.out.println(e);
		}

}
