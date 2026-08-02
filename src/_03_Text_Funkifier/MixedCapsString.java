package _03_Text_Funkifier;

public class MixedCapsString {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {
        this.unfunkifiedText = unfunkifiedText;

    }

	public Object funkifyText() {
		String temp = "";
		unfunkifiedText = unfunkifiedText.toLowerCase();
		for(int i = 0; i<unfunkifiedText.length(); i++) {
			if(i%2 !=0) {
				temp+=unfunkifiedText.substring(i, i+1).toUpperCase();
			}
			else {
				temp +=unfunkifiedText.charAt(i);
			}
		}
		return temp ;
	}

}
