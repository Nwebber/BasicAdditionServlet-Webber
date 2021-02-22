<!DOCTYPE html>
<html>
    <head>
        <title>Basic Addition Page</title>
    </head>
    <body>
        <h2>Please enter two numbers and click on the submit button.</h2>
        <form method="POST" action="addition" enctype="multipart/form-data">
            <input type="hidden" name="action" value="create" />
            <label for="firstNumber">First Number</label><br>
            <input type="text" name="firstNumber" id="firstNumber" required/><br><br>
            <label for="secondNumber">Second Number</label><br>
            <input type="text" name="secondNumber" id="secondNumber" required/><br><br>
            <input type="submit" value="Submit"/>
        </form>
    </body>
</html>
