<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
    <meta charset="utf-8" />
    <script src="/SpringDemo/js/jquery.js"></script>
</head>
<body>

<h2>Student Information</h2>
<form:form method="POST" action="addStudent">
    <table>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td><form:label path="age">Age</form:label></td>
            <td><form:input path="age" /></td>
        </tr>
        <tr>
            <td><form:label path="id">id</form:label></td>
            <td><form:input path="id" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>


<button type="button" onclick="loadXMLDoc()">点击触发ajax</button>
<script type="text/javascript">
    function loadXMLDoc()
    {
        $.ajax({
            type: "GET",
            url: "addByAjax",
            data: {
                name : 'ccy'
            },
            success: function(data){
                alert(data)
            }
        });
    }
</script>

</body>
</html>