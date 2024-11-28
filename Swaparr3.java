package com.bridgelabzz;

public class Swaparr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


int arr1[]={4,6,55,23,88};
int arr2[]={67,37,98,66};
int size=arr1.length;
int arr3[]=new int[size*2];

int k=0;
for(int i=0;i<=arr1.length-1;i++)
{

if(i%2==0)
{
arr3[k]=arr1[i];
k++;
}
}


for(int j=0;j<=arr2.length-1;j++)
{
 if(j%2 != 0)
{
arr3[k]=arr2[j];
k++;
}
}

for(int a=0;a<=arr3.length-1;a++)
{
System.out.println(arr3[a]);
}

}
}

