/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.ChainOfResponsibility;
// The chain of responsibility or chain of command suggests that your application's 
// execution steps should be separated into different parts (handlers) and then aligned
// in the needed order creating a chain.

// Pros :
// - Modular code.
// - Easy handler additional implementation and dynamic order.
// Cons : 
// - May add code complexity and be time consuming for cases with very few steps and low needs of new implementations.

class Main {
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
