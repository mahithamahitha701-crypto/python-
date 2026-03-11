<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Grade Calculator</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        h2 {
            color: #333;
        }
        .container {
            width: 300px;
            margin: 0 auto;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
        }
        .form-group input {
            width: 100%;
            padding: 8px;
            font-size: 16px;
        }
        button {
            padding: 10px 15px;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
            font-size: 16px;
        }
        button:hover {
            background-color: #45a049;
        }
        .result {
            margin-top: 20px;
            font-weight: bold;
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>Grade Calculator</h2>

        <div class="form-group">
            <label for="subject1">Subject 1:</label>
            <input type="number" id="subject1" placeholder="Enter marks for Subject 1" />
        </div>

        <div class="form-group">
            <label for="subject2">Subject 2:</label>
            <input type="number" id="subject2" placeholder="Enter marks for Subject 2" />
        </div>

        <div class="form-group">
            <label for="subject3">Subject 3:</label>
            <input type="number" id="subject3" placeholder="Enter marks for Subject 3" />
        </div>

        <div class="form-group">
            <label for="subject4">Subject 4:</label>
            <input type="number" id="subject4" placeholder="Enter marks for Subject 4" />
        </div>

        <div class="form-group">
            <label for="subject5">Subject 5:</label>
            <input type="number" id="subject5" placeholder="Enter marks for Subject 5" />
        </div>

        <button onclick="calculateGrade()">Calculate Grade</button>

        <div class="result" id="result"></div>
    </div>

    <script>
        function calculateGrade() {
            // Get the marks from the input fields
            var subject1 = parseFloat(document.getElementById('subject1').value);
            var subject2 = parseFloat(document.getElementById('subject2').value);
            var subject3 = parseFloat(document.getElementById('subject3').value);
            var subject4 = parseFloat(document.getElementById('subject4').value);
            var subject5 = parseFloat(document.getElementById('subject5').value);

            // Check if all inputs are valid numbers
            if (isNaN(subject1) || isNaN(subject2) || isNaN(subject3) || isNaN(subject4) || isNaN(subject5)) {
                document.getElementById('result').innerHTML = "Please enter valid marks for all subjects.";
                return;
            }

            // Calculate total and average
            var totalMarks = subject1 + subject2 + subject3 + subject4 + subject5;
            var average = totalMarks / 5;

            // Determine grade based on average
            var grade = '';
            if (average >= 90) {
                grade = 'A';
            } else if (average >= 80) {
                grade = 'B';
            } else if (average >= 70) {
                grade = 'C';
            } else if (average >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Display the result
            document.getElementById('result').innerHTML = `Total Marks: ${totalMarks} <br> Average: ${average.toFixed(2)} <br> Grade: ${grade}`;
        }
    </script>

</body>
</html>