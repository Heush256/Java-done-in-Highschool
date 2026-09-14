public class _12CharRepTime {
	
	public static void main(String[] args) {
		
		String ans = encodeByFirst("Aabccdadaa");
		
		System.out.println(ans);
		
	}
	
	public static String encodeByFirst(String re) {
		
		if(re.length() == 0) {
			
			return "";
			
		}
		
		char count = re.charAt(0);
		
		int counter = 0;
		
		for(int i = 0; i < re.length(); i ++) {
			
			if(re.charAt(i) == count) {
				
				counter++;
				
			}
			
		}
		
		String ret = counter + re;
		
		return ret;
		
	}
	
}