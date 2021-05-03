package assign;

public  class Fkd {
	int resultStart;
	int resultLength;
	public String checkPalindrome(String s)
	{
		if(s.length()<=2) {
			return s;
		}
		for(int i=0;i<s.length()-1;i++)
		{
			expandRange(s,i,i);
			expandRange(s,i,i+1);	
		}
		return s.substring(resultStart, resultStart+resultLength);
		
		
	}
	public void expandRange(String str, int begin, int end) {
		
		while(begin >= 0 && end <= str.length()-1 && str.charAt(begin) == str.charAt(end)) {
			begin--;
			end++;
			
		}
		if(resultLength < end-begin -1) {
			resultStart=begin+1;
			resultLength=end-begin-1;
			
		}
		
	}
	public static void main(String[] args) {
		Fkd f=new Fkd();
	System.out.println(f.checkPalindrome("babad"));
	}
}
