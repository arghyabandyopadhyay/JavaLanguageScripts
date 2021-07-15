class Palindrome{
	public static void main(String args[]){
		if(checkPalindrome(args[0]))System.out.println(true);
		else System.out.println(false);
	}
	public static boolean checkPalindrome(String val){	
		int len=val.length();
		for(int i=0;i<len/2;i++){
			if(val.charAt(i)!=val.charAt(len-(i+1)))return false;
		}
		return true;
	}
}
