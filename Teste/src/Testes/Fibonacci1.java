package Testes;

public class Fibonacci1 {
	
	static Integer entrada(int entrada){
		
		return entrada;
	}
	
	
		static long fiboTernario(int n) {
	        return (n < 2) ? n : fiboTernario(n - 1) + fiboTernario(n - 2);
	    }
	
	 static long fibo(int n) {
	        if (n < 2) {
	            return n;
	        } else {
	            return fibo(n - 1) + fibo(n - 2);
	        }
	    }
	  
	    public static void main(String[] args) {   
	          
	    	int x = entrada(1);
	    for (int i = x; i < (x + 5); i++) {
	    	
	    	if(i >= entrada(x)) {
	    		System.out.println(fiboTernario(i));
	    	}
	        }
	  
	    }

}
