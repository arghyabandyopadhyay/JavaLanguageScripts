class reverseString{
	public static void main(String args[]){
		String rev=ReverseString(args[0]);
		System.out.println(rev);
	}
	public static String ReverseString(String str){
		String a="";
		for(int i=0;i<str.length();i++)a=str.charAt(i)+a;
		return a;
	}
}
