class AndLongestSubset{
	public static void main(String args[]){
		int arr[]=new int[args.length];
		int i1=0;
		for(String a:args){
			arr[i1]=Integer.parseInt(a);i1++;
		}
		int bitArr[]=new int[64];
		for(int a : arr){
			int bitComparator=1;
			int max=a;
			int j=0;
			while(bitComparator<=max){
				if((a&bitComparator)>=1)bitArr[j]++;	
				bitComparator=bitComparator<<1;		
				j++;
			}
		}
		int maxLength=0;
		for(int a:bitArr){
			if(maxLength<a)maxLength=a;
		}
		System.out.println(maxLength);
	}
}
