<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>My Library</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<!-- tabela do wyswietlania ksiazek -->
<table class="table table-sm table-dark">
    <thead>
    <tr class="bg-primary">
        <th scope="col">Title</th>
        <th scope="col">Author</th>
        <th scope="col">ISBN</th>
        <th scope="col">Category</th>
        <th scope="col">Release date</th>
        <th scope="col">Borrower</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>Mark</td>
        <td>Otto</td>
        <td>@mdo</td>
    </tr>
    <tr class="bg-success">
        <th scope="row">2</th>
        <td>Jacob</td>
        <td>Thornton</td>
        <td>@fat</td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td colspan="2">Larry the Bird</td>
        <td>@twitter</td>
    </tr>
    </tbody>
</table>
<!-- Przyciski edycji -->
<div>
    <button type="button" class="btn btn-success btn-lg" name="action" value="ADD">Add</button>
    <button type="button" class="btn btn-warning btn-lg" name="action" value="EDIT">Edit</button>
    <button type="button" class="btn btn-danger btn-lg"name="action" value="DELETE">Delete</button>
    <button type="button" class="btn btn-info btn-lg"name="action" value="SHOW">Show</button>
</div>
</body>
</html>