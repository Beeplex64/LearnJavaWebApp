<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test</title>
</head>
<body>
    <h1>動的なWebページ</h1>
    <p>GETでパラメータを送信</p>
    <form action="TestController01" method="get">
        <input type="text" name="inputText" >
        <button type="submit">文字変更(GET)</button>
    </form>
    <p> </p>
    <p>POSTでパラメータを送信</p>
    <form action="TestController01" method="post">
        <input type="text" name="inputText" >
        <button type="submit">文字変更(POST)</button>
    </form>
    <p>
    <%
    if(request.getAttribute("inputText") == null){
        out.println("HelloWorld!");
    }else{
        out.println(request.getAttribute("inputText"));
    }
    %>
    </p>
</body>
</html>