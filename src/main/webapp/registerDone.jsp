<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<!DOCTYPE html>
<html lang="es">
<head>
    <title><s:text name="hello.message"/></title>
    <s:head/>
    <sx:head/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>

<body>
<div class="container d-flex justify-content-center mt-5">
    <div class="col-6">
        <div class="card">
            <div class="card-body">
                <s:form theme="simple" id="itemAdd" name="itemAdd" action="invoice" method="post" validate="true"
                        cssClass="form">
                    <h1 class="card-title text-center"><s:text name="form.title.message"/></h1>
                    <table class="table">
                        <tr>
                            <td class="evenRow">
                                <s:fielderror fieldName="invoiceBean.subject"/>
                                <s:text name="form.subject.message"/>
                                <s:textfield id="subject" name="invoiceBean.subject" cssClass="form-control"/>
                            </td>
                        </tr>
                        <tr>
                            <td class="evenRow">
                                <s:fielderror fieldName="invoiceBean.dateFrom"/>
                                <s:text name="form.fromDate.message"/>
                                <sx:datetimepicker id="dateFrom" name="invoiceBean.dateFrom" cssClass="form-control"/>
                            </td>
                        </tr>
                        <tr>
                            <td class="evenRow">
                                <s:fielderror fieldName="invoiceBean.dateTo"/>
                                <s:text name="form.toDate.message"/>
                                <sx:datetimepicker id="dateTo" name="invoiceBean.dateTo" cssClass="form-control"/>
                            </td>
                        </tr>
                        <tr>
                            <td class="evenRow">
                                <s:fielderror fieldName="invoiceBean.grossAmount"/>
                                <s:text name="form.grossAmount.message"/>
                                <s:textfield id="grossAmount" name="invoiceBean.grossAmount" cssClass="form-control"/>
                            </td>
                        </tr>
                        <tr>
                            <td class="evenRow">
                                <s:submit value="Enviar" cssClass="btn btn-primary btn-block"/>
                            </td>
                        </tr>
                    </table>
                </s:form>
            </div>
        </div>
    </div>
</div>
</body>
</html>

