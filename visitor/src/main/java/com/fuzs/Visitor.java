package com.fuzs;

public interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}
