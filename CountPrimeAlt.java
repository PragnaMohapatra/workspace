
public class CountPrimeAlt {

	public static void main(String[] args) {
		System.out.println(isPrime(1500));

	}
	
	public static int isPrime(int n){
		if(n<=2){
			return 0;
		}
		
		int count = 0;
		boolean[] collection = new boolean[n];
		
		for(int i=0;i<n;i++){
			collection[i]=true;
		}
		
		for(int i=2; i<n;i++){
			if(collection[i]){
				for(int j=i+i;j<n;j=j+i){
					if(j<n)
					collection[j]=false;
				}
			}
		}
		for(int i=2;i<n;i++){
			if(collection[i]){
				count++;
			}
		}
		return count;
	}
}
