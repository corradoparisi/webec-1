<html>
<head>
    <meta name="layout" content="form">
    <title>Grade Calculator</title>
    <link rel="stylesheet" href="/assets/bootstrap.css">
    <style>
        #calculator-form {
            width: 340px;
            margin: 50px auto;
        }
    </style>
    <script>
        function calculate() {
            const en = parseFloat(document.getElementById('en').value);
            const msp = parseFloat(document.getElementById('msp').value);
            alert((en + msp) / 2);
        }
    </script>
</head>

<body>
<form action="/calculator/calc" id="calculator-form" method="get">
    <tmpl:form_row label="Erfahrungsnote" name="en" />
    <tmpl:form_row label="Modulschlussprüfung" name="msp" />

    <div class="alert alert-info">
    <webec:decorate grade="${calcModel.result}">${calcModel.result}</webec:decorate>
    </div>

    <input type="submit" class="btn btn-primary" value="Calculate" onclick="calculate()">
</form>
</body>
</html>