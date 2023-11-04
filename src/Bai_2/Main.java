package Bai_2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static int Tgian(String s){
        int o1EndHour =Integer.parseInt(s.substring(0 , s.indexOf(":"))) * 60;
        int o1EndMinute  = Integer.parseInt(s.substring(s.indexOf(":") + 1, s.length())) ;
        return o1EndMinute + o1EndHour ;
    }
    public static void main(String[] args){
        Scanner Ip = new Scanner(System.in) ;
        ArrayList<Subject> subjects = new ArrayList<Subject>() ;
        Subject sb = new Subject()  ;
        sb.fakeDT0();
        Subject sb2 = new Subject() ;
        sb2.fakeDT1();
        subjects.add(sb2) ;
        subjects.add(sb) ;

        do {
            System.out.printf("NHAP VAO LUA CHON: ");
            int choose  = Ip.nextInt() ;
            if(choose == 1){
                Ip.nextLine() ;
                System.out.printf("Nhap vao id: ");
                String id = Ip.nextLine() ;
                System.out.printf("Nhap vao ten: ");
                String subjectName = Ip.nextLine() ;
                System.out.printf("Nhap vao so luong: ");
                int studentCount = Ip.nextInt() ;
                Ip.nextLine() ;
                System.out.printf("Nhap vao thoi gian bat dau(xx:yy): ");
                String start = Ip.nextLine() ;
                System.out.printf("Nhap vao thoi gian ket thuc(xx:yy): ");
                String end = Ip.nextLine() ;
                Subject one = new Subject(id , subjectName , studentCount , start , end);
                subjects.add(one) ;
            }
            if(choose == 2){
                for(int i = 0 ; i < subjects.size() ; i++){
                    subjects.get(i).display();
                }
            }
            if(choose == 3){
                Collections.sort(subjects, new Comparator<Subject>() {
                    @Override
                    public int compare(Subject o1, Subject o2) {
                        int o1EndHour =Integer.parseInt(o1.getTimeEnd().substring(0 , o1.getTimeEnd().indexOf(":"))) * 60 ;
                        int o2EndHour = Integer.parseInt(o2.getTimeEnd().substring(0 , o2.getTimeEnd().indexOf(":")))* 60 ;
                        int o1EndMinute  = Integer.parseInt(o1.getTimeEnd().substring(o1.getTimeEnd().indexOf(":") + 1, o1.getTimeEnd().length() ))  ;
                        int o2EndMinute  = Integer.parseInt(o2.getTimeEnd().substring(o2.getTimeEnd().indexOf(":") + 1, o2.getTimeEnd().length() )) ;
//                        System.out.println(o1EndMinute + " " + o2EndMinute);
                        return (o1EndHour + o1EndMinute)  - (o2EndHour + o2EndMinute) ;
                    }
                });
            }
            if(choose == 4){
                Ip.nextLine() ;
                System.out.printf("Nhap vao thoi gian bat dau: ");
                String start = Ip.nextLine() ;
                System.out.printf("Nhap vao thoi gian ket thuc: ");
                String end = Ip.nextLine() ;
                ArrayList<time> times = new ArrayList<time>() ;
                time one = new time(" " , " ") ;
                times.add(one) ;
                int cnt = 0 ;
                for(int i = 0 ; i < subjects.size() ;i++){
                        if((Tgian(start) >= Tgian(subjects.get(i).getTimeStart()) && Tgian(end) <= Tgian(subjects.get(i).getTimeEnd()))){
                            for(int j = 0 ; j < times.size() ;j++){
                                if(!times.get(j).getStart().equals(subjects.get(i).getTimeStart()) ||!times.get(j).getEnd().equals(subjects.get(i).getTimeEnd()) ){
                                    cnt++;
                                    time timeTG = new time();
                                    timeTG.setStart(subjects.get(j).getTimeStart());
                                    timeTG.setEnd(subjects.get(j).getTimeEnd());
                                    subjects.get(i).display();
                                }
                            }

                        }
                }
            }
            if(choose == 5) return ; 
        }while(true) ;
    }
}
