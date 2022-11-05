<%--
  Created by IntelliJ IDEA.
  User: betja
  Date: 04/11/2022
  Time: 11:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
<div class="row justify-content-center mb-2">
    <div class="col-10">
        <div class="row justify-content-end">
            <div class="col-10">

                <c:if test="${param['result-save']}">

                <c:if test="${param['result-save']=='ok'}">
              bien
            </div>
            </c:if>
            <c:if test="${param['result-save']=='error'}">
            mal
        </div>
        </c:if>
        </c:if>
    </div>
    <div class="col-2 text-end">
        <a href="create-person" class="btn btn-primary">Registrar Persona</a>
    </div>
    <div class="row justify-content-center">
    <div class="col-10">
        <table class="table table-hover table-bordered table-striped">
            <thead>
            <tr>
                <th>id</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Email</th>
                <th>Telefono</th>
                <th>Direccion</th>
                <th>Curp</th>
                <th>NSS</th>
                <th>Acciones</th>

            </tr>
            </thead>
            <tbody>
            <c:forEach items="${list}" var="person">
                <tr>
                    <td> <c:out value="${person.id}" /></td>
                    <td> <c:out value="${person.name}" /></td>
                    <td> <c:out value="${person.lastname}" /></td>
                    <td> <c:out value="${person.email}" /></td>
                    <td> <c:out value="${person.phone}" /></td>
                    <td> <c:out value="${person.address}" /></td>
                    <td> <c:out value="${person.curp}" /></td>
                    <td> <c:out value="${person.nss}" /></td>
                    <td>

                        <div class="row justify-content-center">
                            <div class="col-6">
                                <a href="get-person?id=${person.id}"  class="btn btn-info">
                                    <i class="fa-solid fa-magnifying-glass"></i> Cosultar
                                </a>
                            </div>

                            <div class="col-6">
                                <form action="delete-person" method="post" class="d-inline">

                                    <input type="hidden" name="id" value="${person.id}">

                                    <button type="submit" class="btn btn-danger mt-2">
                                        <i class="fa-solid fa-trash"></i> Eliminar
                                    </button>
                                </form>
                            </div>

                        </div>

                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
