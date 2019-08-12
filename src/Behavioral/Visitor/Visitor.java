/**
 * 
 * @author Steve L�vesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Visitor;

interface Visitor {
	void visitProgrammer(Programmer programmer);
	void visitSecretary(Secretary secretary);
}
