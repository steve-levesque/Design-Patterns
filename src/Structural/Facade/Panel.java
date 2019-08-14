/**
 * 
 * @author Steve L�vesque
 * @GitHub steve-levesque
 * 
 */

package Structural.Facade;

interface Panel {
	Employee findEmployeeByName(String name);
	Computer findComputerBySerialNumber(int number);
}
