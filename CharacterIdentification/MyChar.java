package com.lavkush.CharacterIdentify;

public class MyChar {
	
	private char ch;
	
	public MyChar(char ch) {
		this.ch = ch;
	}
	
	public boolean isVowel() {
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
			return true;
		return false;
	}

	public boolean isConsonent() {
		if( isVowel() == false &&  isDigit() == false && isAlhpabet() == true )
			return true;
		return false;
	}
	
	public boolean isDigit() {
		//ASCII value of '0' is 48 and '9' is 57
		if(ch >= 48 && ch <= 57)
			return true;
		return false;
	}
	
	public boolean isAlhpabet() {
		//ASCII value of '0' is 48 and '9' is 57
		if((ch >= 65 && ch <= 90) || (ch>=97 && ch<=122))
			return true;
		return false;
	}
}
