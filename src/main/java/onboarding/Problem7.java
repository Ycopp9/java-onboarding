package onboarding;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Problem7 {
    static class Person {
        String name;
        int visit;
        Set<Person> friends;
        Person(String name) {
            this.name = name;
            this.visit = 0;
            this.friends = new HashSet<>();
        }

        int getVisit() {
            return visit;
        }

        void count() {
            visit++;
        }
    }

    static class Persons {
        Map<String, Person> personMap;

        Persons() {
            personMap = new HashMap<>();
        }
        Person getPerson(String name) {
            if(exists(name)) {
                return personMap.get(name);
            }
            return new Person(name);
        }
        boolean exists(String name) {
            return personMap.containsKey(name);
        }
    }
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        List<String> answer = Collections.emptyList();
        return answer;
    }
}
