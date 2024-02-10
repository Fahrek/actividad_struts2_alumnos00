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
                <s:form theme="simple" id="itemAdd" name="itemAdd" action="register" method="post" validate="true"
                        cssClass="form">
                    <h1 class="card-title text-center"><s:text name="form.title.message"/></h1>
                    <table class="table">
                        <tr>
                            <td class="evenRow">
                                <s:fielderror fieldName="studentBean.dni"/>
                                <s:text name="form.dni.message"/>
                                <s:textfield id="dni" name="studentBean.dni" cssClass="form-control"/>
                            </td>
                        </tr>
                        <tr>
                            <td class="evenRow">
                                <s:fielderror fieldName="studentBean.firstName"/>
                                <s:text name="form.firstName.message"/>
                                <s:textfield id="firstName" name="studentBean.firstName" cssClass="form-control"/>
                            </td>
                        </tr>
                        <tr>
                            <td class="evenRow">
                                <s:fielderror fieldName="studentBean.lastName"/>
                                <s:text name="form.lastName.message"/>
                                <s:textfield id="lastName" name="studentBean.lastName" cssClass="form-control"/>
                            </td>
                        </tr>
                        <tr>
                            <td class="evenRow">
                                <s:fielderror fieldName="studentBean.email"/>
                                <s:text name="form.email.message"/>
                                <s:textfield id="email" name="studentBean.email" cssClass="form-control"/>
                            </td>
                        </tr>
                        <tr>
                            <td class="evenRow">
                                <s:fielderror fieldName="studentBean.phone"/>
                                <s:text name="form.phone.message"/>
                                <s:textfield id="phone" name="studentBean.phone" cssClass="form-control"/>
                            </td>
                        </tr>
                        <tr>
                            <td class="evenRow">
                                <s:fielderror fieldName="studentBean.address"/>
                                <s:text name="form.address.message"/>
                                <s:textfield id="address" name="studentBean.address" cssClass="form-control"/>
                            </td>
                        </tr>
                        <tr>
                            <td class="evenRow">
                                <s:fielderror fieldName="studentBean.city"/>
                                <s:text name="form.city.message"/>
                                <s:textfield id="city" name="studentBean.city" cssClass="form-control"/>
                            </td>
                        </tr>
                        <tr>
                            <td class="evenRow">
                                <s:fielderror fieldName="studentBean.postalCode"/>
                                <s:text name="form.postalCode.message"/>
                                <s:textfield id="country" name="studentBean.country" cssClass="form-control"/>
                            </td>
                        </tr>
                        <tr>
                            <td class="evenRow">
                                <s:fielderror fieldName="studentBean.course"/>
                                <s:text name="form.course.message"/>
                                <s:textfield id="course" name="studentBean.course" cssClass="form-control"/>
                            </td>
                        </tr>
                        <tr>
                            <td class="evenRow">
                                <s:fielderror fieldName="studentBean.birthDate"/>
                                <s:text name="form.birthDate.message"/>
                                <sx:datetimepicker id="birthDate" name="studentBean.birthDate" cssClass="form-control"/>
                            </td>
                        </tr>
                        <tr>
                            <td class="evenRow">
                                <s:fielderror fieldName="studentBean.startDate"/>
                                <s:text name="form.startDate.message"/>
                                <sx:datetimepicker id="startDate" name="studentBean.startDate" cssClass="form-control"/>
                            </td>
                        </tr>
                        <tr>
                            <td class="evenRow">
                                <s:fielderror fieldName="studentBean.endDate"/>
                                <s:text name="form.endDate.message"/>
                                <sx:datetimepicker id="endDate" name="studentBean.endDate" cssClass="form-control"/>
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
