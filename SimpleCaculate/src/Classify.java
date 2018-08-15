import java.util.ArrayList;

public class Classify {
	private String[] arrString;
	
	public Classify(String str) {
		char[] list = str.toCharArray();
		ArrayList<String> AL = new ArrayList<String>();
		StringBuffer Buffer = new StringBuffer("");
		
		for(char ch : list) {
			
			if((ch -'0' < 0 || ch - '9' > 9) && ch != '.') {
				
				if(Buffer.length() != 0) {
					AL.add(Buffer.toString());
					Buffer = new StringBuffer("");	
				}
				
			AL.add(String.valueOf(ch));
			}

			else {
				Buffer.append(ch);
			}
		}
		
		arrString = (String[]) AL.toArray(new String[0]);  
	}
	
	public String[] getString() {
		return arrString;
	}
}
