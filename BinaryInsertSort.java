package first;


public class BinaryInsertSort {
	public static int count=0;
	public static void main(String[] args) {
		int [] data=new int[] {8,5,2,14,89,0,7};
		binaryInsertSort(data);
		print(data);
	}

	
	public static void binaryInsertSort(int[] data) {
		for(int i=1;i<data.length;i++) {
			if(data[i]<data[i-1]) {
				int temp=data[i];
				int low=0;
				int high=i-1;
				while(low<=high) {
					int mid=(low+high)/2;
					
					if(data[mid]<temp) {
						low=mid+1;
					}else {
						high=mid-1;
					}
				}
				for(int j=i;j>low;j--) {
					data[j]=data[j-1];
				}
				data[low]=temp;
				print(data);
			}
		}
	}
	public static void print(int []data) {
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+"\t");
		}
		System.out.println();
	}
}
