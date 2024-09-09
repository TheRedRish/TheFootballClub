public class MemberPlayer implements Comparable<MemberPlayer> {
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

    @Override
    public int compareTo(MemberPlayer o) {
        return 0; //TODO
    }

    public String toString() {
        return "firstName= " + firstName + '\n' +
                "lastName= " + lastName + '\n' +
                "age= " + age + '\n' +
                "teamDivision= " + teamDivision + '\n';
    }
}
