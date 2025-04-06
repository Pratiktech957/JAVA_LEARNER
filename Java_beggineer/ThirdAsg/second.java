
import java.util.*;

class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class second {

    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();

        userList.add(new User("Pratik", 20));
        userList.add(new User("Riya", 18));
        userList.add(new User("Amit", 22));
        userList.add(new User("Sneha", 19));

        System.out.println("Users before sorting:");
        for (User user : userList) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }

        Collections.sort(userList, new Comparator<User>() {
            public int compare(User u1, User u2) {
                return Integer.compare(u1.getAge(), u2.getAge());
            }
        });

        System.out.println("\nUsers after sorting by age:");
        for (User user : userList) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }

}
