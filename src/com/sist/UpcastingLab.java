package com.sist;

/**
 * Created by sist on 2016-02-17.
 */
public class UpcastingLab {
    public static void main(String[] args){
        Person person;
        Student student=new Student("정도전");
        person=student;     //업캐스팅 발생

        System.out.println(person.name);    //정상 호출
        //person에서 grade, department는 안보임. ==> 호출 불가.
    }
}
