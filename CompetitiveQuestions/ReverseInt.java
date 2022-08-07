import java.util.Scanner;  
class ReverseInt{
	public static void main(String args[]){
		try (Scanner sc = new Scanner(System.in)) {
			int val=sc.nextInt();

			if(val<0){
				String rev=ReverseString.reverseString(Integer.toString(val).substring(1));
				System.out.println(Integer.parseInt("-"+rev));
			}
			else{
				String rev=ReverseString.reverseString(Integer.toString(val));
				System.out.println(Integer.parseInt(rev));	
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
