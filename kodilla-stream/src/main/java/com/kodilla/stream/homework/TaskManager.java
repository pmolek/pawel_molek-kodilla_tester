package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {

    public static void main(String[] args) {
        List<String> tasks = TaskRepository.getTask()
                .stream()
                .filter(d -> d.getDeadline().isAfter(getMyDate()))
                .map(TaskManager::getTask)
                .collect(Collectors.toList());
                 System.out.println("zadania przed deadlinem: " + tasks);


    }

    public static LocalDate getMyDate() {
        return LocalDate.now();
    }

    public static String getTask(Task task) {
        return task.getName();
    }

}
