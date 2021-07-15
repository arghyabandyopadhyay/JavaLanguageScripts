class MaxChar{
	public static void main(String args[]){
		int[] val=getCharFrequencies(args[0].toCharArray());
		int index=-1;
		int max=-1;
		for(int i=0;i<val.length;i++){
			if(val!=null&&val[i]>max){
				max=val[i];
				index=i;
			}
		}
		System.out.println((char)index);
	}
	public static int[] getCharFrequencies(char[] str){
		int[] result=new int[256];
		for(char ch : str)result[ch]++;
		return result;
	}
}
