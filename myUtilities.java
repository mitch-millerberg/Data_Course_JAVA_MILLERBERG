package Week_12;
/*@auther Mitchell 
 *@ v1
 * 
 * Employee setStatus() method: Your test case should test that only the single
 * character values you chose to use for employee status 
 * (F= full time, C= contract, P=part time, ) are valid. 
 * Otherwise the test should fail.
 * 
	public void setStatus(String code) {
		switch (code) {
			case "F":
				this.status = "Full-time";
				break;
			case "P":
				this.status = "Part-time";
				break;
			case "C":
				this.status = "contractor";
				break;
			case "I":
				this.status = "Intern";
				break;
			default:
				this.status = "Unknown";
		}
 * 
 **
 *** 
 ****
 ***
 **
 *
 * Employee setBonus() method: Your test case should test that only the values
 * 0 and 1 are valid, any other value should fail the test.
 * 
 * public int boolean(int 1/0)
 * {
 * 		return 1= bonus
 * 			   0= no bonus
 * }
 * 
 **
 *** 
 ****
 ***
 **
 *
 * Employee setInsurance() method: Your test case should test that only the 
 * values 0, 1, 2 3, and 4 are valid, any other value should fail the test

	public  int (int 0,1,2,3,4)
	{
	return "insurance valid i > 5
	}

 */

public class MyUtilities 
{
	
	public int cubeIt(int n)
	{
		return n * n * n;
	}
	
	public int countSpaces(String s)
	{
		int counter = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == ' ')
			{
				counter++;
		}
		}
		return counter;
}
}
