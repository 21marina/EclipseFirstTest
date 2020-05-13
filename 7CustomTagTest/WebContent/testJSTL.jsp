<%@page import="com.amaker.customTag.Position"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- codeblock  insert list -->
<%
 List list=new ArrayList();
list.add("a");list.add("b");list.add("c");
request.setAttribute("list", list);
%>
<!-- insert object person [list]-->
<% List list1=new ArrayList();
Position po11=new Position();
po11.setName("11name");
po11.setNum("11num");
Position po12=new Position();
po12.setName("12name");
po12.setNum("12num");

list1.add(po11);
list1.add(po12);
request.setAttribute("positionList", list1);
%>

</head>
<body>
<%
   out.print("hello1");
%>  <br> <c:out value="hello1"/> <br> ${"hello1"}

<% request.setAttribute("name", "ming"); %>  
<br><c:set value="ming" var="name" scope="request"/>  <!-- remember scope -->
<c:out value="${name}"/><br>

<!-- set useBean object -->
<jsp:useBean id="position" class="com.amaker.customTag.Position"/>
<c:set target="${position}" property="num" value="12"></c:set>
<c:set target="${position}" property="name" value="mingbean"></c:set>
<c:out value="${position.num}"></c:out> ${position.name}
<br>

<!-- if -->
<c:set var="age" value="17" scope="session"></c:set> <!-- page-request-session-application -->
<c:if test="${age<18}">it's so small</c:if>
<c:if test="${position.name=='mingbean'}">it's my name!</c:if>  <!-- String in is '' -->
${sessionScope.age}
<br>
<!-- chose when otherwise -->
<c:choose>
<c:when test="scope>60">old people!</c:when>
<c:when test="scope>18&&scope<60">young people!</c:when>
<c:otherwise>teenage</c:otherwise>
</c:choose>
<br>
<!-- foreach -->
<c:forEach var="i" begin="1" end="10">
${i}
</c:forEach>
<br>
<c:forEach var="i" begin="1" end="10" step="2">
${i}
</c:forEach>
<br>
<!-- foreach :list -->
${list[0]} ${list[1]}
<c:forEach var="posit" items="${list}">
${posit}
</c:forEach>
<br>
<!-- foreach:object[list] -->
<c:forEach var="posit1" items="${positionList}">
${posit1.num}
${posit1.name}
</c:forEach>
<br>
<!--diedai status  -->
<c:forEach var="posit1" items="${positionList}" varStatus="st">
${posit1.num}
${posit1.name}
<br>
${st.index} ${st.count}${st.first}${st.last}
</c:forEach>
<br>
</body>
</html>