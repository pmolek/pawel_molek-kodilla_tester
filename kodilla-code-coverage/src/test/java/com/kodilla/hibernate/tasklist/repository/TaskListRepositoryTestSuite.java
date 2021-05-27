package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Tests: Hibernate";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("one", "two");
        taskListRepository.save(taskList);
        String name = taskList.getListName();

        //When
        List<TaskList> readTasks = taskListRepository.findByListName(name);

        //Then
        Assert.assertEquals(1, readTasks.size());

        //CleanUp
        int id = readTasks.get(0).getId();
        taskListRepository.deleteById(id);
    }
}