package 第二次java作业;

import java.util.Scanner;
public class Player{
	private int score;     //玩家的分数
	private int guess;     //玩家自己猜测的数字
	static Scanner sc = new Scanner(System.in);
	
	Player(){
		score =0;guess =0;
	}
	
	public static void isEqual(Player p, int a, int b) {  //判断玩家猜测的数字与随机生成的数字是否相等
		if(a==b) p.score ++;		
	}
	
	private static void max(int i, int j, int k) {       //对三个玩家进行最终的判定
		
		
	if(i ==j && j==k) {System.out.println("平局"); return;}
	if(i>j) {
		if(i == k) {
			System.out.println("玩家一与玩家三分数相同");
		}else if(i>k){
			System.out.println("玩家一胜出");
		}else if(i<k) {
			System.out.println("玩家三胜出");
		}
	}else if(i<j){
		if(j ==k) {
			System.out.println("玩家二与玩家三分数相同");
		}else if(j>k) {
			System.out.println("玩家二胜出");
		}else if(j<k) {
			System.out.println("玩家三胜出");
		}
	}else if(i==j) {
		if(i>k) {
			System.out.println("玩家一与玩家二分数相同");
		}else {
			System.out.println("玩家三胜出");
		}
		
	}
}
	
	public static void main(String args[]) {
		Player []p = new Player[3];
		p[0] = new Player();
		p[1] = new Player();
		p[2] = new Player();
		
		System.out.print("请输入游戏的次数：");
		int n = sc.nextInt();
		
		for(int j=0; j<n; j++) {
			int num = (int)(Math.random()*10);
//			System.out.println(num);
			
			for(int i=0;i<3;i++) {
				System.out.print("玩家"+(i+1)+":");
				p[i].guess = sc.nextInt();
				isEqual( p[i],num,p[i].guess);  //判断玩家时候猜中随机数，如果猜中分数就加一
			}
			
			System.out.println(p[0].score +" "+p[1].score +" "+p[2].score);
		}
		max(p[0].score,p[1].score,p[2].score);  //判断哪个玩家的分数高
	}
}


