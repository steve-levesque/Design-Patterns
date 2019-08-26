/**
 * 
 * @author Steve Lévesque
 * @GitHub steve-levesque
 * 
 */

package Behavioral.Visitor;

interface Visitor {
	void visit(Programmer programmer);
	void visit(Secretary secretary);
}
