package algorithm;

public class Bubblesort {
	/**
	 * 
	 * 原理：比较两个相邻的元素，将值大的元素交换至右端。
	 * 
	 * 思路：依次比较相邻的两个数，将小数放在前面，大数放在后面。即在第一趟：首先比较第1个和第2个数，将小数放前，大数放后。然后比较第2个数和第3个数，
	 * 将小数放前，大数放后，如此继续，直至比较最后两个数，将小数放前，大数放后。重复第一趟步骤，直至全部排序完成。
	 * 
	 * 第一趟比较完成后，最后一个数一定是数组中最大的一个数，所以第二趟比较的时候最后一个数不参与比较；
	 * 第二趟比较完成后，倒数第二个数也一定是数组中第二大的数，所以第三趟比较的时候最后两个数不参与比较；
	 * 依次类推，每一趟比较次数-1；
	 * 
	 * 由此可见：N个数字要排序完成，总共进行N-1趟排序，每i趟的排序次数为(N-i)次，所以可以用双重循环语句，外层控制循环多少趟，
	 * 内层控制每一趟的循环次数
	 * 
	 */

	//基础冒泡排序
	public static void sortBase(int[] arr) {
		// 外层循环控制排序趟数
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.println("====loop " + i + " ====");
			// 内层循环控制每一趟排序多少次
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				for (int num : arr) {
					System.out.print(num + " ");
				}
				System.out.println();
			}
		}
	}
	
	/**
	 * 冒泡排序法存在的不足及改进方法：
                    第一，在排序过程中，执行完最后的排序后，虽然数据已全部排序完备，但程序无法判断是否完成排序，
                    为了解决这一不足，可设置一个标志位flag，将其初始值设置为非0，表示被排序的表是一个无序的表，
                    每一次排序开始前设置flag值为0，在进行数据交换时，修改flag为非0。
                    在新一轮排序开始时，检查此标志，若此标志为0，表示上一次没有做过交换数据，则结束排序；否则进行排序；
	 */
	
	//改进版冒泡排序
	public static void sortAdvance(int[] arr){
		boolean flag = true;
		
		for(int i=0 ;i<arr.length -1 ;i++){
			flag = false;
			System.out.println("====loop " + i + " ====");
			for(int j=0; j<arr.length-i-1;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
				for (int num : arr) {
					System.out.print(num + " ");
				}
				System.out.println();
			}
			if(!flag){
				break;
			}
		}

		
	}
	

	public static void main(String[] args) {
//		int[] arr = { 6, 3, 8, 2, 9, 1 };
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println("排序之前数组为：");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
//        sortBase(arr);
        sortAdvance(arr);
		System.out.println();
		System.out.println("排序后数组为：");
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}
// https://www.cnblogs.com/shen-hua/p/5422676.html
