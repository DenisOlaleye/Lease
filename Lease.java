//Denys Olaleye
//23.09.22

/*Create a class named Lease with fields that hold an apartment tenant’s name, apartment number, monthly rent amount, and term of the lease in months.
Include a constructor that initializes the name to “XXX”, the apartment number to 0, the rent to 1000, and the term to 12. Also include methods to
get and set each of the fields. Include a nonstatic method named addPetFee() that adds $10 to the monthly rent value and calls a static method named
explainPetPolicy() that explains the pet fee. Save the class as Lease.java.*/

public class Lease 
{
	//declaring class fields
	String tenantsName;
	int apartmentNum;
	int monthlyRent;
	int termOfLease;
	
	//create a constructor that assigns values to class fields
	public Lease()
	{
		tenantsName = "XXX";
		apartmentNum = 0;
		monthlyRent = 1000;
		termOfLease = 12;
	}
	
	//write methods to set values to fields
	public void setName(String name)
	{
		tenantsName = name;
	}
	public void setApartmentsNum(int num)
	{
		apartmentNum = num;
	}
	public void setMonthlyRent(int rent)
	{
		monthlyRent = rent;
	}
	public void setTermOfLease(int term)
	{
		termOfLease = term;
	}
	
	//write methods to get fields values
	public String getName()
	{
		return tenantsName;
	}
	public int getApartmentsNum()
	{
		return apartmentNum;
	}
	public int getMonthlyRent()
	{
		return monthlyRent;
	}
	public int getTermOfLease()
	{
		return termOfLease;
	}
	
	//method to add pet fee to monthly 
	public int addPetFee()
	{
		int petFee = 10;
		monthlyRent = monthlyRent + petFee;
		explainPetPolicy();
		return monthlyRent;
	}
	
	//method that explains pet fee
	public static void explainPetPolicy()
	{
		System.out.println("If you want to hold a pet you shold pay $10 more every month)");
	}
}
