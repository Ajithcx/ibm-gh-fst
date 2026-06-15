package fst;



class CustomException extends Exception {
	private String exceptionmessage = new String();
	public CustomException(String customString){
		this.exceptionmessage = customString;
	}
	@Override
	public String getMessage() {
		return exceptionmessage;
	}
}

public class Activity8 {
	
	static void exceptionTest(String str) throws CustomException{
		if (str == null) {
			throw new CustomException("Null Condition");
		}
		else
		{
			System.out.println(str);
		}
	}
	public static void main(String[] args) {
	
		try
		{
			Activity8.exceptionTest("Try Successful");
			Activity8.exceptionTest(null);
			Activity8.exceptionTest("Try Failed");
		}
		catch(CustomException cust)
		{
			System.out.println("Catch Successful! Message -> " + cust.getMessage());
		}
	}

}