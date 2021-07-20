package com.vanzay;

public class Task1Human {
    private String surname;
    private String name;
    private String patronymic;

    public Task1Human(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public Task1Human(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getFullName() {
        if (patronymic == null) {
            return surname + " " + name;
        } else {
            return surname + " " + name + " " + patronymic;
        }
    }

    public String getShortName() {

        if (patronymic == null) {
            return surname + " " + name.charAt(0) + ".";
        } else {
            return surname + " " + name.charAt(0) + ". " + patronymic.charAt(0) + ".";
        }
    }

}
