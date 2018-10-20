<%--
  Created by IntelliJ IDEA.
  User: TomekP
  Date: 2018-10-20
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>Add book.</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <form>
        <!--Podanie tytułu -->
        <div class="row">
            <div class="col-md-8">
                <label for="inputTitle">Title</label>
                <input type="text" class="form-control" id="inputTitle" placeholder="Title">
            </div>
        </div>
        <!-- Podanie imienia i nazwiska autora -->
        <div class="row">
            <div class="form-group col-md-4">
                <label for="inputFirstNameAuthor">Autor name</label>
                <input type="text" class="form-control" id="inputFirstNameAuthor" placeholder="First name">
            </div>
            <div class="from-group col-md-4">
                <label for="inputLastNameAuthor"> Author surname</label>
                <input type="text" class="form-control" id="inputLastNameAuthor" placeholder="Last name">
            </div>
        </div>
        <!-- Podanie numeru ISBN -->
        <div class="row">
            <div class="from-group col-md-4">
            <label for="inputISBN">ISBN</label>
            <input type="text" class="form-control" id="inputISBN" placeholder="xxx-x-xxxx-xxxx-x">
            </div>
        </div>
        <!-- Wybranie jednej z dostepnych categori ksiazki -->
        <div class="form">
            <div class="form-group col-md-4">
                <label for="inputCategory">Category</label>
                <select id="inputCategory" class="form-control">
                    <option selected>Choose...</option>
                    <option>Adventure</option>
                    <option>Romance</option>
                    <option>Fabulary</option>
                </select>
            </div>
        </div>
        <!-- Przyciski -->
        <div>
            <button type="submit" class="btn btn-primary btn-lg">Add</button>
            <button type="submit" class="btn btn-danger btn-lg">Cancel</button>
        </div>
    </form>
</div>

</body>
</html>
