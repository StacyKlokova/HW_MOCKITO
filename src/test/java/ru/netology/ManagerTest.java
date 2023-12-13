package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.films.Film;
import ru.netology.manager.Manager;

public class ManagerTest {
    //проверяем пустой менеджер фильмов
    @Test
    public void checkEmptyManager() {
        Manager manager = new Manager();
        Film[] expected = {};
        Film[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }



    //создаем фильмы
    Film one = new Film("one", "one", "one");
    Film two = new Film("two", "two", "two");
    Film three = new Film("three", "three", "three");
    Film four = new Film("four", "four", "four");
    Film five = new Film("five", "five", "five");
    Film six = new Film("six", "six", "six");
    Film seven = new Film("seven", "seven", "seven");

    //добавление одного фильма
    @Test
    public void checkAddOneFilm() {
        Manager manager = new Manager();
        manager.save(one);
        Film[] expected = {one};
        Film[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    //добавление всех фильмов
    @Test
    public void checkAddAllFilm() {
        Manager manager = new Manager();
        manager.save(one);
        manager.save(two);
        manager.save(three);
        manager.save(four);
        manager.save(five);
        manager.save(six);
        manager.save(seven);
        Film[] expected = {one, two, three, four, five, six, seven};
        Film[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    //вывод последних 5ти фильмов
    @Test
    public void checkFindLastFiveFilm() {
        Manager manager = new Manager(5);
        manager.save(one);
        manager.save(two);
        manager.save(three);
        manager.save(four);
        manager.save(five);
        manager.save(six);
        manager.save(seven);
        Film[] expected = {seven, six, five, four, three};
        Film[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    //вывод последних 5 фильмов при добавленных последних 3-ех фильмов
    @Test
    public void checkFindLastFilmWithLimit() {
        Manager manager = new Manager(5);
        manager.save(one);
        manager.save(two);
        manager.save(three);
        Film[] expected = {three, two, one};
        Film[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    //вывод последних 5 фильмов при добавленных последних 7ми фильмов
    @Test
    public void checkFindLastFilmWithLimit2() {
        Manager manager = new Manager(5);
        manager.save(one);
        manager.save(two);
        manager.save(three);
        manager.save(four);
        manager.save(five);
        manager.save(six);
        manager.save(seven);
        Film[] expected = {seven, six, five, four, three};
        Film[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}