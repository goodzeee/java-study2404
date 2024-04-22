package day08.enum_;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza();

        pizza.orderPizza();
        pizza.readyPizza();

        System.out.println("현재 상태 " + pizza.getStatus().getDescription());
        System.out.println("소요 시간 " + pizza.getStatus().getTimeToSetup());

        TeamMember alice = new TeamMember("Alice", TeamRole.DEVELOPER);
        TeamMember bob = new TeamMember("Bob", TeamRole.DESIGNER);
        TeamMember charlie = new TeamMember("Charlie", TeamRole.LEADER);
        TeamMember david = new TeamMember("David", TeamRole.TESTER);

        alice.assignTask(); // Alice is assigned to Develops the software.
        bob.assignTask();   // Bob is assigned Designs the user interface.
        charlie.assignTask(); // Charlie is assigned Manages the team and coordinates.
        david.assignTask();  // David is assigned Tests the software for bugs.
    }
}
