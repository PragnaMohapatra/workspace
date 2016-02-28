
public class Atoi {

	public static void main(String[] args) {
		System.out.println(convertIntoNumber("   +0 123"));

	}
	public static int convertIntoNumber(String num){
		if(num==null||num.equals("")){
			return 0;
		}
		
	    num = num.trim();
	    char symbol = num.charAt(0);
	    if(num.length()>2){
	    char secondSymbol = num.charAt(1);
	    if(secondSymbol=='-' || secondSymbol=='+' ){
		    return 0;
		    }
	    }
	    if(symbol=='+'||symbol=='-'){
	    	num=num.substring(1);
	    }
	    for(int i=0;i<num.length();i++){
	    	char test= num.charAt(i);
	    	if(test>57 || test<48){
	    		num=num.substring(0,i);
	    	}
	    }
	    
		double length = num.length();
		double sum =0;
		for(int i=0;i<length;i++){
			if(num.charAt(i)<='9' && num.charAt(i)>='0'){
			sum=sum+Double.parseDouble(String.valueOf(num.charAt(i)))*Math.pow(10, length-1-i);
			}
		}
		
		 if(symbol=='+'){
		    	sum = sum;
		    }
		 if(symbol=='-'){
			 sum=-sum;
		 }
		 int result = (int) sum;
		 
		 if(Integer.MIN_VALUE>=sum){
			 return Integer.MIN_VALUE;
		 } else  if(sum>=Integer.MAX_VALUE){
			 return Integer.MAX_VALUE;
		 }
		return result;
		
	}

}
