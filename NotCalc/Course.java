package NotCalc;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;



    Course(String name, String code, String prefix, Teacher teacher){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;

    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.name)){
            this.teacher = teacher;
        }else{
            System.out.println("Öğretmen ve branş uyuşmazlığı mevcut.");
        }
    }

    void printTeacher(){
        this.teacher.print();
    }


}