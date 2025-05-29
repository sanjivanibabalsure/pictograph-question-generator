package com.pictograph;

import java.util.ArrayList;
import java.util.List;

public class QuestionGenerator {

    public List<Question> generateQuestions(int count) {
        List<Question> questions = new ArrayList<>();

        // The full HTML table string you provided, exactly as asked
        String questionTypeHtml =
                "From a group of people, information was collected regarding their professions. This information is presented in the form of the following chart using pictures.<br><br>"
                        + "<div style=\"display: inline-block; margin: 0 auto; font-family: Arial, sans-serif;\">"
                        + "<table style=\"border-collapse: collapse; border: 2px solid black; font-size: 4.5mm;\">"
                        + "<tr>"
                        + "<th style=\"padding: 2mm; border: 2px solid black; text-align: left;\">Profession</th>"
                        + "<th style=\"padding: 2mm; border: 2px solid black; text-align: left;\">Count</th>"
                        + "<th style=\"padding: 2mm; border: 2px solid black; text-align: left;\">Representation</th>"
                        + "</tr>"
                        + "<tr>"
                        + "<td style=\"padding: 2mm; border: 2px solid black; white-space: nowrap;\">Farmers</td>"
                        + "<td style=\"padding: 2mm; border: 2px solid black; white-space: nowrap;\">54</td>"
                        + "<td style=\"padding: 2mm; border: 2px solid black; white-space: nowrap;\">"
                        + "<span style=\"letter-spacing:12px; font-size: 8mm;\">👩‍🌾</span>"
                        + "<span style=\"letter-spacing:12px; font-size: 8mm;\">👩‍🌾</span>"
                        + "<span style=\"letter-spacing:12px; font-size: 8mm;\">👩‍🌾</span>"
                        + "<span style=\"letter-spacing:12px; font-size: 8mm;\">👩‍🌾</span>"
                        + "<span style=\"letter-spacing:12px; font-size: 8mm;\">👩‍🌾</span>"
                        + "<span style=\"letter-spacing:12px; font-size: 8mm;\">👩‍🌾</span>"
                        + "</td>"
                        + "</tr>"
                        + "<tr>"
                        + "<td style=\"padding: 2mm; border: 2px solid black; white-space: nowrap;\">Govt Job</td>"
                        + "<td style=\"padding: 2mm; border: 2px solid black; white-space: nowrap;\">27</td>"
                        + "<td style=\"padding: 2mm; border: 2px solid black; white-space: nowrap;\">"
                        + "<span style=\"letter-spacing:12px; font-size: 8mm;\">👩‍💼</span>"
                        + "<span style=\"letter-spacing:12px; font-size: 8mm;\">👩‍💼</span>"
                        + "<span style=\"letter-spacing:12px; font-size: 8mm;\">👩‍💼</span>"
                        + "</td>"
                        + "</tr>"
                        + "<tr>"
                        + "<td style=\"padding: 2mm; border: 2px solid black; white-space: nowrap;\">Private Job</td>"
                        + "<td style=\"padding: 2mm; border: 2px solid black; white-space: nowrap;\">9</td>"
                        + "<td style=\"padding: 2mm; border: 2px solid black; white-space: nowrap;\">"
                        + "<span style=\"letter-spacing:12px; font-size: 8mm;\">👨‍💻</span>"
                        + "</td>"
                        + "</tr>"
                        + "<tr>"
                        + "<td style=\"padding: 2mm; border: 2px solid black; white-space: nowrap;\">Retired</td>"
                        + "<td style=\"padding: 2mm; border: 2px solid black; white-space: nowrap;\">9</td>"
                        + "<td style=\"padding: 2mm; border: 2px solid black; white-space: nowrap;\">"
                        + "<span style=\"letter-spacing:12px; font-size: 8mm;\">👴</span>"
                        + "</td>"
                        + "</tr>"
                        + "<tr>"
                        + "<td style=\"padding: 2mm; border: 2px solid black; white-space: nowrap;\">Business</td>"
                        + "<td style=\"padding: 2mm; border: 2px solid black; white-space: nowrap;\">18</td>"
                        + "<td style=\"padding: 2mm; border: 2px solid black; white-space: nowrap;\">"
                        + "<span style=\"letter-spacing:12px; font-size: 8mm;\">💼</span>"
                        + "<span style=\"letter-spacing:12px; font-size: 8mm;\">💼</span>"
                        + "</td>"
                        + "</tr>"
                        + "</table>"
                        + "</div>"
                        + "<br><b>Note:</b> Each emoji represents 9 people.<br><br>";

        // Create question object
        Question q = new Question();

        q.setVariationNo("105");
        q.setQuestionType(questionTypeHtml);  // Set your full HTML here as Question Type column content
        q.setAnsType("1");
        q.setTopicNo("090201");

        String questionText = "Information collected from Tamsawadi village about their profession and was presented in form of a pictograph given below.<br> "
                + "Answer following questions from this.<br>"
                + "$1.$ How many villagers provided the information?<br>"
                + "$2.$ In which profession, highest number of villagers work?<br>"
                + "$3.$ How many villagers are retired?<br>#"
                + "तामस वाडी गावातील रहिवाशांकडून ते करीत असलेल्या व्यवसायाची माहिती एकत्र करून ती  सोबत दिलेल्या चित्रालेखात मांडली आहे.<br>"
                + " त्याच्या साहाय्याने खालील प्रश्नांची उत्तरे सांगा.<br>"
                + "$1.$ एकूण किती रहिवाशांनी माहित पुरवली?<br>"
                + "$2.$ कोणत्या व्यवसायात सगळ्यात जास्त रहिवासी काम करतात?<br>"
                + "$3.$ निवृत्त रहिवासी किती आहेत?<br>";

        q.setQuestion(questionText);

        // Correct options
        q.setCorrectOption1("$1 : 117$");
        q.setCorrectOption2("$2 : 54$");
        q.setCorrectOption3("$3 : 9$");
        q.setCorrectOption4("");

        // Wrong options empty for now
        q.setWrongOption("");
        q.setWrongOption2("");
        q.setWrongOption3("");

        q.setTime("120");
        q.setDod("2");

        q.setQuestionImage("");  // No external image, emojis used in table
        q.setContributorMail("contributor@example.com");

        String solution = "Ans : $1 : 117$, <br>$2 : 54$ and<br> $3 : 9$.<br>"
                + "We are given the scale used for the pictograph in the graph itself.<br>"
                + "The scale is 1 face image = 9 persons.<br>"
                + "The different professions listed are Farmers, government job, private jobs, retired, business.<br>"
                + "To find the total persons, who have provided the information, we need to add all of them.<br>"
                + "Farmers : 6 face images hence 6 × 9 = 54 farmers<br>"
                + "Government job : 3 face images, hence 3 × 9 = 27 government job<br>"
                + "Private job : 1 face image, hence 1 × 9 = 9 private job<br>"
                + "Retired : 1 face image, hence 1 × 9 = 9 retired persons<br>"
                + "Business : 2 face images, hence 2 × 9 = 18 businessman<br>"
                + "By adding these all, we get 54 + 27 + 9 + 9 + 18 = 117.<br>"
                + "Hence, total villagers who provided the information are 117.<br>"
                + "The highest number is 54 and it belongs to Farmers.<br>"
                + "Retired villagers are 9.<br>"
                + "Thus, the answers are:<br>"
                + "1 : 117, 2 : 54 and 3 : 9.<br>"
                + "<br>"
                + "मराठी उत्तर :<br>"
                + "उत्तर : १ : ११७, २ : ५४, ३ : ९.<br>"
                + "तस्वीरातील प्रमाण दिलेल्या माणसाच्या प्रतिमेतून समजते.<br>"
                + "एक प्रतिमा = ९ लोक.<br>"
                + "व्यवसाय आहेत शेती, सरकारी नोकरी, खाजगी नोकरी, निवृत्त, व्यवसाय.<br>"
                + "एकूण लोकांची संख्या = ५४ + २७ + ९ + ९ + १८ = ११७.<br>"
                + "शेती करणाऱ्यांची संख्या जास्त आहे, ५४.<br>"
                + "निवृत्त लोकांची संख्या ९ आहे.<br>"
                + "म्हणून उत्तरे आहेत १ : ११७, २ : ५४, ३ : ९.<br>";

        q.setSolution(solution);

        questions.add(q);

        // Return the list with one question for now
        return questions;
    }
}