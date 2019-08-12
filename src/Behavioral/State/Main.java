/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.State;

public class Main {
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		computer.checkAccount();
		computer.enterPasswordClient();
		computer.checkAccount();
	}
}
