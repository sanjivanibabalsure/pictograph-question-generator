Here’s the updated `README.md` with Maven commands included under the “How to Run” section:

---

### ✅ `README.md`

```markdown
# Pictograph Question Generator

This project generates pictograph-based bilingual (English-Marathi) questions and stores them in an Excel file.

---

## 📁 Project Structure

```

pictograph-question-generator/
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── pictograph/
│                   ├── App.java
│                   ├── ExcelWriter.java
│                   └── QuestionGenerator.java
├── pom.xml
├── report/
│   └── Pictograph\_Questions.xlsx (Generated Output)
└── README.md

````

---

## 🔧 Prerequisites

- Java 8 or above
- Maven 3.x

---

## 🧱 Build Project

To compile the project, run:

```bash
mvn clean compile
````

---

## 🚀 How to Run

To generate the Excel file in the `report/` directory:

```bash
mvn exec:java -Dexec.mainClass="com.pictograph.App"
```

> This will generate `Pictograph_Questions.xlsx` inside the `report/` directory.

---

## 🧾 Output Format

The Excel file will include fields such as:

* Vari. No.
* Question type
* Topic no.
* Question (with HTML and bilingual content)
* Correct option(s)
* Wrong options
* Solution (HTML with English and Marathi explanations)

---

