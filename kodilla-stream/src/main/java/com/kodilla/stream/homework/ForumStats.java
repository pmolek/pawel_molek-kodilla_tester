package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {

        double avgOver40 = UsersRepository.getUsersList()
                .stream()
                .filter(t -> t.getAge() >= 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("srednia liczba postow dla wieku rownego i powyzej 40 lat " + avgOver40);

        double avgUnder40 = UsersRepository.getUsersList()
                .stream()
                .filter(t -> t.getAge() < 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("srednia liczba postow dla wieku ponizej 40 lat " + avgUnder40);


    }
}
