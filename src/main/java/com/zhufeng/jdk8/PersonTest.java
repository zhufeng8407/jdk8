package com.zhufeng.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class PersonTest {

    public static void main(String[] args) {
        Person person1 = new Person("zhangsan", 20);
        Person person2 = new Person("lisi", 30);
        Person person3 = new Person("wangwu", 40);

        List<Person> persons = Arrays.asList(person1,person2,person3);

        PersonTest test = new PersonTest();

        System.out.println(test.getPersonByName("wangwu", persons));

        System.out.println(test.getPersonByAge(20, persons));

        System.out.println("====================");

        System.out.println(test.getPersonByAge2(30, persons, (age, personList) ->
                personList.stream().filter(p -> p.getAge() < age).collect(Collectors.toList())));

    }


    private List<Person> getPersonByName(String userName, List<Person> persons) {
        return persons.stream().filter(p -> p.getUserName().equals(userName)).collect(Collectors.toList());
    }

    private List<Person> getPersonByAge(int age, List<Person> personList) {
        BiFunction<Integer, List<Person>, List<Person>> biFunction = (personAge, persons) -> personList.stream()
                .filter(p -> p.getAge() > age).collect(Collectors.toList());

        return biFunction.apply(age, personList);
    }

    private List<Person> getPersonByAge2(int age, List<Person> personList, BiFunction<Integer, List<Person>,
            List<Person>> biFunction) {
        return biFunction.apply(age, personList);
    }
}
