package behavioural.visitor;

public interface Visitor {
	void visit(Mazda mazda);
    void visit(Volkswagen vw);
    void visit(Honda honda);
}
