class ReverseString{
	public static void main(String args[]){
		String rev=reverseString(args[0]);
		System.out.println(rev);
	}
	public static String reverseString(String str){
		String a="";
		for(int i=0;i<str.length();i++)a=str.charAt(i)+a;
		return a;
	}
}
