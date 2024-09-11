public class MemberPlayer {
    public String firstName;
    public String lastName;
    public int age;
    public int teamDivision;

    public MemberPlayer(String firstName, String lastName, int age, int teamDivision) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.teamDivision = teamDivision;
    }

    public String toString() {
        return "firstName= " + firstName + '\n' +
                "lastName= " + lastName + '\n' +
                "age= " + age + '\n' +
                "teamDivision= " + teamDivision + '\n';
    }

    public String toPrintString() {
        return firstName + ":" + lastName + ":" + age + ":" + teamDivision;
    }
}
