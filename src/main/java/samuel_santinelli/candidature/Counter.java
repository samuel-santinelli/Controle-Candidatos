package samuel_santinelli.candidature;

import java.util.Scanner;

import samuel_santinelli.candidature.errors.InvalidParamsException;


public class Counter {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int parameterOne = terminal.nextInt();
		System.out.println("Enter the second number: ");
		int parameterTwo = terminal.nextInt();
		
		try {
			
			count(parameterOne, parameterTwo);
		
		}catch (InvalidParamsException exception) {
			System.out.println(exception.getMessage());
		}
		
	}
	
    static void count(int parameterOne, int parameterTwo) throws InvalidParamsException {        
        if (parameterOne >= parameterTwo) {
            throw new InvalidParamsException("The second number must be bigger than the first number");
        }

        int contagem = parameterTwo - parameterOne;        
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Printing the number " + i);
        }
    }
}