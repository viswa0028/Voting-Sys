
import java.util.Random;

public class Voter {
    protected   int ID;
    private String name;
    private String dateOfBirth;
    private int age;
    private String gender;
    private String nationality;

    protected String username;
    protected String password;

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    protected static int numberVoter;
    public Voter() {

    }
    public Voter(String name, String dateOfBirth, String gender, String nationality, String username, String password) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
        this.username = username;
        this.password = password;
    }
    public Voter(String name, String dateOfBirth, int age, String gender, String nationality) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
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
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


}
