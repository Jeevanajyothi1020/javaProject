public class student
{
    int sid;
    String sname;
    char grad;
    void printStudentData() {
        System.out.println(sid + "   " + sname + "  " + grad);
    }
        // method 2
        void setStudentData(int id, String name, char gr) {
            sid = id;
            sname = name;
            grad = gr;
        }
        // constructor
    student(int id, String name, char gr)
    {
        sid = id;
        sname = name;
        grad = gr;
    }

    }

