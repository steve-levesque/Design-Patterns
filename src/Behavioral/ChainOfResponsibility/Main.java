/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.ChainOfResponsibility;

public class Main {
	public static void main(String[] args) {
		int[] types = {100, 20, 10, 5, 1};
		int withdraw = 5432;
		
		Handler bank = new Handler(types[0]);
		bank.add(new Handler(types[1]));
		bank.add(new Handler(types[2]));
		bank.add(new Handler(types[3]));
		bank.add(new Handler(types[4]));
		
		bank.dispense(withdraw);
	}
}
