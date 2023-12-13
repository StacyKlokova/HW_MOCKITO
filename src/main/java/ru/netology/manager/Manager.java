package ru.netology.manager;

import ru.netology.films.Film;

public class Manager {
    private Film[] films = new Film[0]; // массив фильмов
    private int limitFilms = 5; //установили лимит фильмов в менеджере

    public Manager() {

    }

    public Manager(int limitFilms) {
        this.limitFilms = limitFilms;
    }

    public void save(Film film) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Film[] findAll() {       //вывод всех фильмов в порядке добавления
        return films;
    }


    public Film[] findLast() {
        int resultLenght;
        if (films.length < limitFilms) {
            resultLenght = films.length;
        } else {
            resultLenght = limitFilms;
        }
        Film[] x = new Film[resultLenght];
        for (int i = 0; i < x.length; i++) {
            x[i] = films[films.length - 1 - i];
        }
        return x;
    }
}
