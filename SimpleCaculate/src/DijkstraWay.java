import java.util.Stack;

public class DijkstraWay {
	 private double num;
	 
	 public DijkstraWay(String[] str) {
		 Stack<Double> value = new Stack<Double>();
		 Stack<String> op = new Stack<String>();
        
		 for(String s : str) {

			 if (s.equals("-") || s.equals("+") || s.equals("*") || s.equals("/") ) {
				 op.push(s);
			 }
			 
			 else if ( s.equals(")")){
				 String S = op.pop();
				 Double val = value.pop();
        		
				 if (S.equals("*")) val = value.pop() * val;
				 else if (S.equals("-")) val = value.pop() - val;
				 else if (S.equals("+")) val = value.pop() + val;
				 else if (S.equals("/")) val =  value.pop() / val;
        		
				 value.push(val);
			 }
        	
			 else if (s.equals(" ") || s.equals("(")) {
				 continue;
			 }
        	
			 else {
				 value.push(Double.parseDouble(s));
			 }
		 }

		 num = value.pop();
	 }
	 
	 public double getNum() {
		 return num;
	 }
}
