class Utility {
	
	static int findGCD(int n, int m) {		
		while ( n!= m) {
      		if (n > m)   { 
			    n = n - m;
			} else { 
			    m = m - n;
			} 
		}
		return n; 
	}
}

// End