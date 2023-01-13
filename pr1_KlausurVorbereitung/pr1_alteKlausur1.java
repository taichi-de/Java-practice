package pr1_KlausurVorbereitung;
public class pr1_alteKlausur1 {
    // Afgb2 a
    public static long[] doubler(int[] orig){
        long[] result = new long[orig.length * 2];
        int j = 0;
        for(int i = 0; i != orig.length; i++){
            result[j] = orig[i];
            result[j+1] = orig[i] * 2;
            j += 2;
        }
        return result;
    }

    // Afgb2 b
    long[] doubler(int[] orig, long[] result, int indexOrig, int indexResult){
        if(indexOrig == orig.length) return result;
        result[indexResult] = orig[indexOrig];
        result[indexResult+1] = orig[indexOrig]*2;
        return doubler(orig, result, indexOrig+1, indexResult+2);
    }

    //Afgb3 b
    // Es wird eine ArrayIndexOutOfBounds-Exception geworfen, da die do-while-Schleife auf jeden Fall einmal den Array-Zugriff durchführt.
    // - Parameter n am Beginn der Methode zu prüfen und Fall spwziell behandeln

    //Afgb 4
    public class FloatStack {
        private Float[] array;
        int h;

        public FloatStack(int size){
            array = new Float[size];
        }

        public void put(float f){
            if(h == array.length){
                //Stack ist voll -> nichts tun
                return;
            }
            array[h++] = f;
        }

        public float get(){
            if(h == 0) return 0;
            return array[h--];
        }

        public float getBiggest(){
            float f;
            if(h > 0) f = array[0];
            else return 0;
            for(int i = 1; i != h; ++i){
                if(array[i] > f) f = array[i];
            }
            return f;
        }
    }

    public class Student {
        private static int nextStudentNumber = 1;
        private int studentNumber;
        private String name;

        public Student(String name){
            this.name = name;
            this.studentNumber = Student.nextStudentNumber++;
        }

        public int getStudentNumber(){ return studentNumber; }

        public String getName(){ return name; }
    }

    class StudentElement {
        public StudentElement(Student data){this.data = data;}
        Student data;
        StudentElement next;
    }

    public class Lecture {
        private String name;
        StudentElement head;

        public Lecture(String name){ this.name = name; }

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
            if(i == null) return 1; // NUr der Dozent
            int counter = 2;
            while(i.next != null){
                counter++;
                i = i.next;
            }
            return counter;
        }

        public class LectureHall {
            private int capacity;

            public LectureHall(int capacity){
                this.capacity = capacity;
            }

            public boolean canHostLecture(Lecture lecture){
                if(capacity >= lecture.getPersons())
                    return true;
                return false;
            }

            public boolean canHostLecture(int persons){
                if(capacity >= persons) return true;
                return false;
            }
        }

        class LectureRunner {
            public static void main(String[] args){
                Lecture lecture = new Lecture("Prog1");
                lecture.addStudent(new Student("Simon Fahrregi"));
                lecture.addStudent(new Student("Marco Stone"));
                LectureHall hall = new LectureHall(3);
                if(hall.canHostLecture(lecture))
                    System.out.println("Vorlesungraum ist gross genug");
                else
                    System.out.println("zu klein");
            }
        }
    }

    public static void main(String[] args){
        // int result;
        // result = pr1_alteKlausur1.doubler([4,5,6]);

    }
}
