package day08.enum_;

public enum TeamRole {
    LEADER("Manages the team and coordinates."),
    DEVELOPER("Develops the software."),
    DESIGNER("Designs the user interface."),
    TESTER("Tests the software for bugs.");

    private final String role;

    TeamRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

}
