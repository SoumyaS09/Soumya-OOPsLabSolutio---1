package com.learning.CredentialService;

public class CredentialService {
	
public static void main (String[]args) {
		String result = generatePassword(8);
		System.out.println(result);
			 
	}

	public static String generatePassword(int length) {
		String password= "";
		
		for(int i= 0; i<length -2; i++) {
		password = password + randomCharacter("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");	
				
		}
			
		String radomNumber = randomCharacter("1234567890");
		password = insertAtRandom(password, radomNumber);
		String radomSymbol = randomCharacter("!@#$%&*<:<>=+");
		password = insertAtRandom(password, radomSymbol);
		return password;

	}

	public static String randomCharacter(String characters) {
	int n = characters.length();
	int r = (int)((n+1)*Math.random());
	return characters.substring(r, r+1);
			
	} 

	public static String insertAtRandom(String str, String toInsert) {
	int n= str.length();
	int r= (int) ((n+1)*Math.random());
	return str.substring (0,r) + toInsert + str.substring(r);		
		
	}
}
