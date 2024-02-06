<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<!DOCTYPE html>
<html lang="es">
    <head>
        <title>Gestión de alumnos</title>
        <s:head/>
        <sx:head/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    </head>
    <body>
        <h1>Gestión de alumnos</h1>
        <p>Introduce el DNI de un alumno para ver su información:</p>
        <s:form action="buscar">
            <s:textfield name="dni" label="DNI" required="true"/>
            <s:submit value="Buscar"/>
        </s:form>
        <p>O haz clic en el siguiente enlace para registrar un nuevo alumno:</p>
        <s:a href="registrar">Registrar alumno</s:a>
    </body>
</html>
