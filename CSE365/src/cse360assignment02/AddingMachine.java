package cse360assignment02;
/*
 Represents an adding machine with the ability to add, subtract, and get total.
 */
public class AddingMachine
{
	/*
	 total represents the total after the desired calculations
	 history represents all the history of the adding machine operations
	 */
	private int total;
	private String history = "0";
	/*
  constructor, creates an adding machine object and then adds 4, subtracts 2 and then adds 5.
	 */
	public static void main(String []args)
	{
		
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add (4); 
		myCalculator.subtract (2); 
		myCalculator.add(5);
		System.out.println(myCalculator.toString());
		
		
	}
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
	}
	/*
   gets the total, @return total
	 */
	public int getTotal () 
	{
		return total;
	}
	/*
   	adds a value @param value adds a value to previous total
   	history adds its previous self to its new calculations
	 */
	public void add (int value) 
	{
		total = total + value; 
		history += " + " + value;
	}
	/*
	subtracts a value @param value subtracts a value to previous total
	history adds its previous self to its new calculations
	 */
	public void subtract (int value) 
	{
		total = total - value;
		history += " - " + value;
	}
	/*
	thus function prints out the history of transactions 
	@return the history of the adding machine
	 */
	public String toString ()
	{
		return history + " ";
	}
	/*
	this method clears the memory of the adding machine, setting history to empty and total to 0
	 */
	public void clear() 
	{
		total = 0;
		history = "";
	}
}