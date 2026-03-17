<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Grade Calculator</title>
</head>
<body>
    <h1>Grade Calculator</h1>
    <label for="score">Enter your score (0-100): </label>
    <input type="number" id="score" min="0" max="100" />
    <button onclick="calculateGrade()">Calculate Grade</button>

    <h2>Your Grade: <span id="grade">-</span></h2>

    <script>
        function calculateGrade() {
            let score = document.getElementById("score").value;
            let grade = '';

            if (score >= 90 && score <= 100) {
                grade = 'A';
            } else if (score >= 80 && score < 90) {
                grade = 'B';
            } else if (score >= 70 && score < 80) {
                grade = 'C';
            } else if (score >= 60 && score < 70) {
                grade = 'D';
            } else if (score >= 0 && score < 60) {
                grade = 'F';
            } else {
                grade = 'Invalid score. Please enter a score between 0 and 100.';
            }

            document.getElementById("grade").textContent = grade;
        }
    </script>
</body>
</html>