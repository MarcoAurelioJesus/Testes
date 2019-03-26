package testEnum;

public enum Strategy {

	 STRATEGY_A {
	        @Override
	        Integer execute(int a, int b, String ope){
	        	
	        	switch (ope){
	            case "soma":
	               return a + b;
	                
	            case "subtração":
	            	return a - b;

	        }
				return null;
	        }

			@Override
			void execute() {
				// TODO Auto-generated method stub
				
			}

			 public Double execute(double d, double e) {
				// TODO Auto-generated method stub
				return null;
			}
	   },

	    SOMAR {
		   
		   @Override
		    public Double execute(double a, double b){
	    	System.out.println(a + b);
	    	return a + b;
	    }

		@Override
		void execute() {
			// TODO Auto-generated method stub
			
		}
	};
	
	    abstract void execute();

		Integer execute(int a, int b, String ope) {
			// TODO Auto-generated method stub
			return null;
		}

		public abstract Double execute(double d, double e);
}
