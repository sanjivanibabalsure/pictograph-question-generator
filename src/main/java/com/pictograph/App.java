package com.pictograph;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) {
        try {
            QuestionGenerator qGen = new QuestionGenerator();
            List<Question> questions = qGen.generateQuestions(1);

            ExcelWriter excelWriter = new ExcelWriter();
            excelWriter.writeQuestionsToExcel(questions, "report/Pictograph_Questions.xlsx");

            System.out.println("Excel file generated successfully in 'report' folder.");
        } catch (IOException e) {
            System.err.println("Error writing Excel file: " + e.getMessage());
        }
    }
}
