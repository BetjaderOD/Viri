<%--
  Created by IntelliJ IDEA.
  User: betja
  Date: 06/11/2022
  Time: 08:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Registrar persona</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>
<body>
<div class="container mt-3">

    <h1 class="text-center">Modificar usuario</h1>

    <div class="row justify-content-center">
        <div class="col-4">

            <form action="update-person" method="post">
                <input type="hidden" name="id" value="${personX.id}">

                <div class="mb-3">
                    <label for="controlName" class="form-label">Nombre: </label>
                    <input type="text" class="form-control" id="controlName" name="name" value="${personX.name}">
                </div>
                <div class="mb-3">
                    <label for="controllastname" class="form-label">apellido: </label>
                    <input type="text" class="form-control" id="controllastname" name="lastname" value="${personX.lastName}">
                </div>

                <div class="mb-3">
                    <label for="controlEmail" class="form-label">Email: </label>
                    <input type="text" class="form-control" id="controlEmail" name="email" value="${personX.email}">
                </div>
                <div class="mb-3">
                    <label for="controlTel" class="form-label">Telefono: </label>
                    <input type="number" class="form-control" id="controlTel" name="phone" value="${personX.phone}">
                </div>
                <div class="mb-3">
                    <label for="controlAddress" class="form-label">Direccion: </label>
                    <input type="text" class="form-control" id="controlAddress" name="address" value="${personX.address}">
                </div>
                <div class="mb-3">
                    <label for="controlCurp" class="form-label">Curp: </label>
                    <input type="text" class="form-control" id="controlCurp" name="curp" value="${personX.curp}">
                </div>
                <div class="mb-3">
                    <label for="controlNss" class="form-label">Nss: </label>
                    <input type="number" class="form-control" id="controlNss" name="nss" value="${personX.nss}">
                </div>

                <button type="submit" class="btn btn-primary">Guardar</button>
                <button type="reset" class="btn btn-danger">Cancelar</button>



            </form>


        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
</body>
</html>
