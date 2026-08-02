package _03_Text_Funkifier;

import java.util.ArrayList;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
        String reversedString = "";
    	for(int i = this.unfunkifiedText.length()-1; i>=0; i--) {
    		reversedString += unfunkifiedText.charAt(i);
    	}
        return reversedString;

    }
}
