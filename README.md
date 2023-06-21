<!DOCTYPE html>
<html>
<head>
  <title>Login Form</title>
  <script>
    function displayInput() {
      var username = document.getElementById('username').value;
      var password = document.getElementById('password').value;
      alert("Username: " + username + "\nPassword: " + password);
    }
  </script>
</head>
<body>
  <h2>Login Form</h2>
  <form>
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required><br><br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required><br><br>
    <input type="button" value="Login" onclick="displayInput()">
  </form>
</body>
</html>

