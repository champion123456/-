package first;

import java.util.Scanner;

public class InsertSort {
	public static void getInsertSort(int[] a) {//����һ������
		
		 if(a==null||a.length==0) {
			System.out.println("����Ϊ�գ�");
			return;
		}
		 /*for(int i=1;i<a.length;i++) {
			 for(int j=i-1;j>=0&&a[j]>a[j+1];j--) {
				 swap(a, j, j+1);
			 }
		 }
	}
	public static void swap(int[] a,int i,int j) {
		int temp=a[i];
		a[j]=a[i];
		a[j]=temp;
	}*/
	int n=a.length;
	int temp;
	int j;
	for(int i=1;i<n;i++) {
		temp=a[i];
		j=i-1;
	for(;j>=0&&a[j]>temp;--j) {
		a[j+1]=a[j];	
     	}
		a[j+1]=temp;
	}
	}
		
	
	public static void main(String[] args) {
		System.out.println("������һ������");
		Scanner in=new Scanner(System.in);
		int [] a=new int[10];
		for(int j=0;j<a.length;j++) {
			a[j]=in.nextInt();
		}
		getInsertSort(a);
		System.out.println("ֱ�Ӳ�������");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
	}
	}

}
