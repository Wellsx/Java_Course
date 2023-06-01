/*
 I would like you to update the student's grades only if they did better on the makeup exam.
 Then print the final grades.
 */
package chapter12_Collections.exercise;

import java.util.Map;

public class FinalResults{

    public static void main(String[] args){

        Map<String, Integer> originalGrades = TestResults.getOriginalGrades();
        Map<String, Integer> makeUpGrades = TestResults.getMakeUpGrades();

        for (var student: makeUpGrades.entrySet()){
            Integer firstTest = originalGrades.get(student.getKey());
            Integer secondTest = makeUpGrades.get(student.getKey());

            if (secondTest > firstTest){
                originalGrades.put(student.getKey(), secondTest);
            }
        }

        System.out.println("Final Grades:");
        originalGrades.forEach(
                (k,v) -> System.out.println("Student: "+ k + ", Grade: "+ v)
        );



    }
}
