package com.company;

public class Main {

    public static void main(String[] args) {
        Human mother= new Human("Lily" ,"Potter",1995);
        Human father = new Human("James","Potter", 1990);
        Pet pet = new Pet (Species.OWL, "Hedwig", 2, 7,
                new String[] {"eating","flying"} );

        Family potterFamily = new Family(mother,father);

        Human child1 = new Human("Harry", "Potter", 2000,
                100, new String[][]{{DayOfWeeks.MONDAY.name(),"do magic"}},potterFamily);
        Human child2 = new Human("Madelyn","Potter",2003,
                100,new String[][]{{DayOfWeeks.MONDAY.name(),"do something"}},potterFamily);

        potterFamily.setPet(pet);

        potterFamily.addChild(child1);
        potterFamily.addChild(child2);
        System.out.println(potterFamily+" -- "+potterFamily.countFamily());

        potterFamily.deleteChild(5);

        humanGCSimulator();
    }


    public static void humanGCSimulator() {
        for (int i = 0; i < 2000000; i++) {
            Human human = new Human();
        }
    }
}