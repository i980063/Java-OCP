package com.ocp.test;

public class ForDemo {
    public static void main(String[] args) {
	//System.out.println("直角三角形(右下)");
	for(int x=1;x<=4;x++) {//x=1,x最大等於4，就會出現幾"行",層數的for迴圈
		for(int y=x;y<5;y++) {//指定x給y,y最大不能超過5列，第四行:3列, 第三行:2列，第二行:1列，第一行:0列
			System.out.print(" ");
		}
		for(int z=1;z<=x;z++) {//z=1,z最大等於x,有幾行就出現幾列。第一行:1列，第二行:2列，第三行:3列, 第四行列。
			System.out.print("*");
		}
		System.out.println();//每一行結束即換行
	}
	//System.out.println();
		
	for(int i=1;i<=5;i++) {//i=1,i最大等於5,就會出現幾"行",層數的for迴圈
		for(int j=1;j<i;j++) {//j=1,j不可以比i大。第一行:0列，第二行:1列，第三行:2列
			System.out.print(" ");
		}
		for(int k=i;k<=5;k++) {//指定j給k,k最大等於5。j=1時:3列，j=2時:2列，j=3時:1列
			System.out.print("*");
		}
		System.out.println();//每一行結束即換行
		}
	}
}
	//System.out.println("直角三角形(右上)2");
        //for(int i=1;i<=4;i++)//層數的for迴圈
        //{
            //for(int j=1;j<=i;j++)//根據外層行號，輸出星號左邊空格
                //System.out.print(" ");
            //for(int k=1;k<=4-i+1;k++)//根據外層行號，輸出星號個數
                //System.out.print("*");
            //System.out.println();
        //}

	
	//for(int n =0;n<5;n++){
			//for(int m = (n-1);m>=n;m--){
				//System.out.print("3");
			//}
			//for(int x =0;x<n;x++){
				//System.out.print("2");
			//}
		//System.out.println("0");
		//}


		//for(int n = 4;n>=0;n--){
			//for(int m = 0;m<=n;m++){
				//System.out.print("*");
			//}

			//System.out.println(" ");
		//}
		//for(int x = 0;x<=4;x++){
			//for(int m = 0;m<x;m++){
				//System.out.print("2");
			//}
			//System.out.println("1");
		//}
	//}
