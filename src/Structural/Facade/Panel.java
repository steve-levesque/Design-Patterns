/**
 * 
 * @author Steve L�vesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Facade;
// Forces the user to use the friendly methods.

interface Panel {
	Employee findEmployeeByName(String name);
	Computer findComputerBySerialNumber(int number);
}
