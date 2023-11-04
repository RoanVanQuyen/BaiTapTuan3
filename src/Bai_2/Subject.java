package Bai_2;

public class Subject {
    private String id ;
    private String subjectName ;
    private int studentCount ;
    private String timeStart ;
    private String timeEnd ;
    private static int ID = 1  ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }
    public Subject(){}

    public Subject(String id, String subjectName, int studentCount, String timeStart, String timeEnd) {
        this.id = id;
        this.subjectName = subjectName;
        this.studentCount = studentCount;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public void fakeDT0(){
        id = ID + "" ;
        ID++;
        subjectName = "CSDL" ;
        studentCount = 32  ;
        timeStart = "7:00" ;
        timeEnd = "9:40" ;
    }
    public void fakeDT1(){
        id = ID + "" ;
        ID++;
        subjectName = "OOP" ;
        studentCount = 30  ;
        timeStart = "8:40" ;
        timeEnd = "11:30" ;
    }
    public void display(){
        System.out.printf("%-12s %-24s %12d %30s" , id , subjectName , studentCount , timeStart);
        System.out.println("-" + timeEnd);
    }

}
