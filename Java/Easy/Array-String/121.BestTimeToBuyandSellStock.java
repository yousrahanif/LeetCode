class Solution {
    public int maxProfit(int[] prices) {
       int min=0;
	    	int max=0;
	    	
	    	for (int i = 0; i < prices.length-1; i++) {
	    		
	    			
	    		
	    			
	    			 if(prices[i]<prices[min]  ) {
	    			
	    					
	    				 
	    				
	                     
	    					min=i;
	    				                      
	    					    		
	    					    	

	    				              
	    					    		
	    			 }
	    							}
	    				          if(min!=prices.length) {
	    					    		max=min;
	    					    		for (int j = min+1; j < prices.length; j++) {
	    					    		
	    					    		
	    					        		
	    					        		if(prices[j]>prices[max]) {
	    					        			
	    					        			
	    					        			max=j;
	    					        		
	    					        			
	    					        		}
	    					        	
	    					        	
	    					        	

	    					        		
	    					    		}
	    					    		
	    					    		return prices[max]-prices[min];
	    					    		
	    			
	    		
	        return 0;
	    		
	    		

    }
}