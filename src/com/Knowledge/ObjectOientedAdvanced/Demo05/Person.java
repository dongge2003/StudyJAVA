package com.Knowledge.ObjectOientedAdvanced.Demo05;

public class Person {
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    public void keepPet(Dog dog , String someThind){
//        System.out.println("年龄为:" + age + "的" + name + "(饲养员)养了一条" + dog.getAge() + "岁的" + dog.getColor() + "狗");
//        dog.eat(someThind);
//    }
//    public void keepPet(Cat cat , String someThind){
//        System.out.println("年龄为:" + age + "的" + name + "(饲养员)养了一条" + cat.getAge() + "岁的" + cat.getColor() + "猫");
//        cat.eat(someThind);
//    }


//    public void keepPet(Animal a , String someThind){
//        System.out.println("年龄为:" + age + "的" + name + "(饲养员)养了一条" + a.getAge() + "岁的" + a.getColor() + "狗");
//        a.eat(someThind);
//    }


    public void keepPet(Animal a , String someThind){
       if(a instanceof Dog){
           System.out.println("年龄为:" + age + "的" + name + "(饲养员)养了一条" + a.getAge() + "岁的" + a.getColor() + "狗");
           a.eat(someThind);
       }else if(a instanceof Cat){
           System.out.println("年龄为:" + age + "的" + name + "(饲养员)养了一条" + a.getAge() + "岁的" + a.getColor() + "猫");
           a.eat(someThind);
       }else {
           System.out.println("没有这种动物");
       }

    }
}
