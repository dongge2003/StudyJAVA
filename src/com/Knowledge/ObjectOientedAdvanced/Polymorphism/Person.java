package com.Knowledge.ObjectOientedAdvanced.Polymorphism;

public class Person {
    //没用多态性,只要创建一个新的动物这里就要增加,很麻烦
    // public void feedCat(Cat c){
    //     c.eat();
    // }
    // public void feedDog(Dog d){
    //     d.eat();
    // }

    //用了多态性
    //把Animal对象传递过来,
    public void feed(Animal animal){
        animal.eat();
    }


}
