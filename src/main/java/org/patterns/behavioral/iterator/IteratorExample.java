package org.patterns.behavioral.iterator;

import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        User[] users = {
                new User("John", 16),
                new User("Jane", 17),
                new User("Adam", 18),
                new User("Alice", 19)
        };

        Iterator<User> iterator = new AdultUserIterator(List.of(users));

        while (iterator.hasNext()) {
            User user = iterator.getNext();
            System.out.println(user.getName());
        }
    }
}
