package cis233.a1;

public class A1233JBlaIterator<AnyType extends Comparable<? super AnyType>>
{
    A1233JBlaNode<AnyType> current;

    A1233JBlaIterator(A1233JBlaNode<AnyType> theNode) {
        this.current = theNode;
    }

    public boolean isValid() {
        return this.current != null;
    }

    public AnyType retrieve() {
        return this.isValid() ? this.current.element : null;
    }

    public void advance() {
        if (this.isValid()) {
            this.current = this.current.next;
        }

    }
}