package algorithm;

public class Bubblesort {
	/**
	 * 
	 原理：比较两个相邻的元素，将值大的元素交换至右端。

	思路：依次比较相邻的两个数，将小数放在前面，大数放在后面。即在第一趟：首先比较第1个和第2个数，将小数放前，大数放后。然后比较第2个数和第3个数，将小数放前，大数放后，如此继续，直至比较最后两个数，将小数放前，大数放后。重复第一趟步骤，直至全部排序完成。
	
	第一趟比较完成后，最后一个数一定是数组中最大的一个数，所以第二趟比较的时候最后一个数不参与比较；
	
	第二趟比较完成后，倒数第二个数也一定是数组中第二大的数，所以第三趟比较的时候最后两个数不参与比较；
	
	依次类推，每一趟比较次数-1；
	
	由此可见：N个数字要排序完成，总共进行N-1趟排序，每i趟的排序次数为(N-i)次，所以可以用双重循环语句，外层控制循环多少趟，内层控制每一趟的循环次数
	 
	 */
	
	public static void main(String[] args){
		int[] arr = {6,3,8,2,9,1};
		System.out.println("排序之前数组为：");
		for(int num:arr){
			System.out.println(num+" ");
		}
		//外层循环控制排序趟数
		for(int i=0; i<arr.length -1;i++){
			System.out.println("====loop "+i+" ====");
			//内层循环控制每一趟排序多少次
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				for(int num:arr){
					System.out.print(num+" ");
				}
				System.out.println();
			}
		}
		
		System.out.println();
		System.out.println("排序后数组为：");
		for(int num:arr){
			System.out.println(num+" ");
		}
		
	}

}
//https://www.cnblogs.com/shen-hua/p/5422676.html
