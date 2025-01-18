package org.interview.designpattern.structural.Bridge;

/*
 * 创建具体实现类 ConcreteImplementorA 和 ConcreteImplementorB
 * 后创建具体抽象类 ConcreteAbstractionA 和 ConcreteAbstractionB
 * 将相应的实现部分对象传递抽象部分的构造函数
 * 最后，调用抽象部分的 operation() 方法来实现对实现部分的操作。
 */
public class Main {
    public static void main(String[] args) {
        Implementor implementorA = new ConcreteImplementorA();
        Abstraction abstractionA = new ConcreteAbstractionA(implementorA);
        abstractionA.operation();

        Implementor implementorB = new ConcreteImplementorB();
        Abstraction abstractionB = new ConcreteAbstractionB(implementorB);
        abstractionB.operation();
    }
}
