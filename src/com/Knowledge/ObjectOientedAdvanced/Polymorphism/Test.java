package com.Knowledge.ObjectOientedAdvanced.Polymorphism;

public class Test {
    public static void main(String[] args) {
        /*
        多态性 - 同一种对象具有多种形态
            把不同的数据类型进行统一
            让程序有超强的可拓展性

            把子类的对象赋给父类的变量 - 向上转型
            把父类的对象转回子类的变量 - 向下转型

        */

        //如果没用多态,调用动物eat方法
        Cat c = new Cat();
        c.eat();
        Dog d = new Dog();
        d.eat();
        //很麻烦

        System.out.println("--------------------------");

        //原理:
        Animal a = new Cat();
        a.eat();
        //因为这里a能调用Cat里的eat方法
        //所以只要在person类里
        /*
        public void feed(Animal animal){
            animal.eat();
        }
        */
        //就会根据传递的参数来决定调用谁



        //用了多态之后 - 向上转型
        Animal animal = new Cat();
        Animal animal2 = new Dog();
        /*
        可以把猫狗等动物类,都看成动物来看
        把子类的对象赋值给父类(向上转型)
        */

        Person p = new Person();
        p.feed(animal);
        p.feed(animal2);
        //传过来的是谁就用谁调



        //向下转型可能有风险,java要求必须要写强制类型转换
        //(转换之后的数据类型) 变量

        //把动物还原成猫 - 向下转型
        Animal aaa = new Cat();
        Cat cc = (Cat) aaa;//向下转型(强制转换成cat)
        


        //如果把一只猫当成一个动物来看的话
        //动物是不会抓老鼠的
        Animal aaa2 = new Cat();
        //aaa2.catchMouse();//这里就会报错
        //所以向上转型时,不能访问子类所特有的方法
        //所以需要转回来
        Cat cc2 = (Cat)aaa2;
        cc2.catchMouse();// 这样就可以调用了



        
        

        


    }

}
