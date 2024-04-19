package day03.member;

public enum Gender {
    FEMALE("F"), MALE("M");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
