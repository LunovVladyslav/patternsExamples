package org.patterns.behavioral.iterator;

import java.util.List;

public class AdultUserIterator implements Iterator<User>{
    private List<User> userList;
    private int index;

    public AdultUserIterator(List<User> userList) {
        this.userList = userList;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        while(index < userList.size()) {
            if (userList.get(index).getAge() > 17) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public User getNext() {
        if (hasNext()) {
            User user = userList.get(index);
            index++;
            return user;
        } else {
            return null;
        }
    }
}
