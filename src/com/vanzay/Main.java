package com.vanzay;

public class Main {

    public static void main(String[] args) {
	Task1Human human = new Task1Human("Zaets","Ivan", "Igorevich");
	Task1Human human1 = new Task1Human("Zaetsss","Ivannn");

        System.out.println(human.getFullName());
        System.out.println(human1.getFullName());

        System.out.println(human.getShortName());
        System.out.println(human1.getShortName());
    }
}
