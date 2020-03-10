<html>
<head>
    <title>Grade Calculator</title>
    <link rel="stylesheet" href="/assets/bootstrap.css">
    <style>
        #calculator-form {
            width: 340px;
            margin: 50px auto;
        }
    </style>
</head>

<body>
<form action="/calculator/calc" id="calculator-form" method="get">

    <div class="form-group">
        <label for="en">Erfahrungsnote:</label><br>
        <input type="text" id="en" name="en" value="${calcModel.en}">
    </div>

    <div class="form-group">
        <label for="msp">Modulschlussprüfung:</label><br>
        <input type="text" id="msp" name="msp" value="${calcModel.msp}">
    </div>

    <div class="alert alert-info">
        ${calcModel.result}
    </div>

    <input type="submit" class="btn btn-primary" value="Calculate">
</form>
</body>
</html>