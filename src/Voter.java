public class Voter {
    protected   int ID;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String nationality;

    protected static int numberVoter;
    public Voter() {

    }
    public Voter(String name, String dateOfBirth, String gender, String nationality) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.nationality = nationality;
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}