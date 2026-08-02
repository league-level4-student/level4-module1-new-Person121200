package _03_Text_Funkifier;

import java.util.ArrayList;

public class NumberString implements TextFunkifier{
	private String unfunkifiedText;
	
	
	public NumberString(String unfunkifiedText) {
		this.unfunkifiedText = unfunkifiedText;
	}
	@Override
	public String funkifyText() {
		String temp = "";
		char charAt= ' ';
		for(int i = 0; i < unfunkifiedText.length(); i++) {
			charAt = unfunkifiedText.charAt(i);
			temp += charAt;
			if(charAt != ' ') {
				char lowercase = Character.toLowerCase(charAt);
				int position = lowercase-'a'+1;
				temp +=position;
			}
		}
		return temp;
	}

}
//