/*有一遊戲場地，長寬由執行當時決定，場地中亂數產生陷阱，陷阱數也由當時決定
 * 
 * 玩家初始HP為100，走一步消耗1，撞邊界扣5，踩陷阱扣20
 * 
 * 有個檔案(maze.txt)資訊如下:
 * 6,4
 * 5
 * 6,8,2,4,2,2,6,6,8,4,2,2,6
 */
package gogogame;

import java.util.Scanner;

public class GoGoMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("地圖大小:");
		int speace = scanner.nextInt();
		int[] mapp = new int[speace];
		System.out.println(mapp.length);

	}

}
