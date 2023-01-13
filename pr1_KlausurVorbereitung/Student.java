package pr1_KlausurVorbereitung;

public class Student {
    private String name;
    private int matrinum;
    private static int nextStudNum = 1;

    public Student(String name){
        this.name = name;
        this.matrinum = Student.nextStudNum++;
    }

    public String getName(){return name;}
    public int getStudNum(){return matrinum;}
}