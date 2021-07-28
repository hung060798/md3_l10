<%@ page import="CustomerServlet.Customer" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28/7/2021
  Time: 11:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th>Tên</th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
            <th>Ảnh</th>
        </tr>
        </thead>
        <tbody>

<%--        <c:forEach items "${listKh}" var = "ks"--%>


            <%
    ArrayList<Customer> list = (ArrayList<Customer>) request.getAttribute("listKh");
    String str ="";
    for (Customer p:list) {
        str +="<tr> <td>" + p.getName() + "</td><td>" + p.getDate() + "</td><td>" + p.getDiaChi()+ "</td><td><img src=\"" + p.getImg() + "\" </td></tr>";
    }
    out.println(str);
%>
</body>
</html>
