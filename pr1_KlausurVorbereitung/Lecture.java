package pr1_KlausurVorbereitung;

public class Lecture {
    private String name;
    StudentElement head;

    public Lecture(String name){this.name = name;}

    public void addStudent(Student s){
        StudentElement se = new StudentElement(s);
        if(head == null){
            head = se;
            return;
        }
        StudentElement i = head;
        while(i.next != null)
            i = i.next;
        i.next = se;
    }

    public int getPersons(){
        StudentElement i = head;
        if(i == null) return 1;// nur der Dozent
        int counter = 2;
        while(i.next != null) {
            counter++;
            i = i.next;
        }
        return counter;
    }
}