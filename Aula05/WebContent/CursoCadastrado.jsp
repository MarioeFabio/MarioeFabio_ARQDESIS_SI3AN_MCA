<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="toCurso.CursosTO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
CursosTO to = (CursosTO)request.getAttribute("curso_to");
%>
Código:<%= to.getCod()%><br>
Nome:<%= to.getNome()%><br>
Data inicial:<%= to.getDataIni()%><br>
Data final:<%= to.getDataTer()%><br>
Horário:<%= to.getHorario()%><br>
Vagas:<%= to.getVagas()%><br>
Valor:<%= to.getValor()%><br>
Laboratório:<%= to.getNumLab()%><br>
Registro de Software:<%= to.getRegSoft()%><br>
Material:<%= to.getMaterial()%><br>
Livro:<%= to.getLivro()%><br>
</body>
</html>