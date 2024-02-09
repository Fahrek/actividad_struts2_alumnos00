<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<!DOCTYPE html>
<html>
<head>
    <title><s:text name="hello.message"/></title>
    <s:head/>
    <sx:head/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>

<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-10">
            <div class="card mt-5">
                <div class="card-body">
                    <h1 class="card-title">Resumen de factura</h1><br>
                    <table class="table">
                        <tbody>
                        <tr>
                            <th scope="row"><s:text name="form.subject.message"/></th>
                            <td><s:property value="invoiceBean.subject"/></td>
                        </tr>
                        <tr>
                            <th scope="row"><s:text name="form.fromDate.message"/></th>
                            <td><s:property value="invoiceBean.dateFrom"/></td>
                        </tr>
                        <tr>
                            <th scope="row"><s:text name="form.toDate.message"/></th>
                            <td><s:property value="invoiceBean.dateTo"/></td>
                        </tr>
                        <tr>
                            <th scope="row"><s:text name="form.grossAmount.message"/></th>
                            <td><s:property value="invoiceBean.grossAmount"/> €</td>
                        </tr>
                        <tr>
                            <th scope="row"><s:text name="form.netAmount.message"/></th>
                            <td><s:property value="getNetAmount()"/> €</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>