package Testes;

public class TesteFibonacci {
	
	static Long teste(int entrada){
		int count = 0;
		 int vetor[] = new int[10]; 
	        vetor[0] = 0; 
	        vetor[1] = 1; 
	        for ( int i = 2; i < 10; ++i ){ 
	            vetor[i] = vetor[i-1] + vetor[i-2];  
	        }  
	        for (int x = entrada; x < 10; x++){  
	        	if(count < 5){
	        		System.out.println(vetor[x]); 
	        		count += 1;
	        	}
	        }  
		return null;
	 }
	
	public static void main(String[] args) {
		
		teste(5);
	}

}
