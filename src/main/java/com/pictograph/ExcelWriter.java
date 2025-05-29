package com.pictograph;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelWriter {

    public void writeQuestionsToExcel(List<Question> questions, String filePath) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Questions");

        // Header row
        Row header = sheet.createRow(0);
        String[] headers = {
                "Vari. No.", "Question type", "Ans type", "Topic no.", "Question",
                "Correct option 1", "Correct option 2", "Correct option 3", "Correct option 4",
                "Wrong option", "Wrong option 2", "Wrong option 3", "Time", "DoD",
                "Question image", "Contributor's Registered mailId", "Solution", "Solution (Image/ Audio/ Video)"
        };
        for (int i = 0; i < headers.length; i++) {
            Cell cell = header.createCell(i);
            cell.setCellValue(headers[i]);
        }

        // Data rows
        int rowNum = 1;
        for (Question q : questions) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0).setCellValue(q.getVariationNo());
            row.createCell(1).setCellValue(q.getQuestionType());
            row.createCell(2).setCellValue(q.getAnsType());
            row.createCell(3).setCellValue(q.getTopicNo());
            row.createCell(4).setCellValue(q.getQuestion());
            row.createCell(5).setCellValue(q.getCorrectOption1());
            row.createCell(6).setCellValue(q.getCorrectOption2());
            row.createCell(7).setCellValue(q.getCorrectOption3());
            row.createCell(8).setCellValue(q.getCorrectOption4());
            row.createCell(9).setCellValue(q.getWrongOption());
            row.createCell(10).setCellValue(q.getWrongOption2());
            row.createCell(11).setCellValue(q.getWrongOption3());
            row.createCell(12).setCellValue(q.getTime());
            row.createCell(13).setCellValue(q.getDod());
            row.createCell(14).setCellValue(q.getQuestionImage());
            row.createCell(15).setCellValue(q.getContributorMail());
            row.createCell(16).setCellValue(q.getSolution());
            row.createCell(17).setCellValue(q.getSolutionMedia());
        }

        for (int i = 0; i < headers.length; i++) {
            sheet.autoSizeColumn(i);
        }

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            workbook.write(fos);
        }
        workbook.close();
    }
}
