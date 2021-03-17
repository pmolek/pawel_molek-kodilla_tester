package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTask() {
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("zadanie1", LocalDate.of(2020, 1, 2), LocalDate.of(2021, 12, 13)));
        tasks.add(new Task("zadanie2", LocalDate.of(2019, 12, 12), LocalDate.of(2020,2, 9)));
        tasks.add(new Task("zadanie3", LocalDate.of(2021, 1, 26), LocalDate.of(2021, 6, 26)));
        tasks.add(new Task("zadanie4", LocalDate.of(2017,6,1), LocalDate.of(2019,1,3)));

        return tasks;
    }
}
