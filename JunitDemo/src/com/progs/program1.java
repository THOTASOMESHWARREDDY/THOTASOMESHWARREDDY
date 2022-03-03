package com.progs;
class BugException extends Exception{
	public BugException(String message) {
		super(message);
	}
}
public class program1 {
	public int solution(String input) throws BugException
	{
		int sum=0;
		for(char c: input.toCharArray())
		{
			if(!Character.isLetterOrDigit(c))
				throw new BugException("invalid character");
			else if(Character.isDigit(c))
				sum=sum+Character.getNumericValue(c);
		}
		return sum;
	}

}
