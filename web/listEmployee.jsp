
  Created by IntelliJ IDEA.
  User: andrejaskov
  Date: 26.04.2020
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
    <title>Show All Employees</title>
  </head>
  <body>
  <table border="2">
      <thread>
      <tr>
          <th>id</th>
          <th>name</th>
          <th>age</th>
          <th>email</th>
          <th>birthday</th>
          <th colspan="2">Ячейка 1</th>
      </tr>
      </thread>
      <tbody>
      <c:forEach items="${myDBEmployce}" var="employce">

          <tr>
          <td><c:out value="${employce.id}"  /></td>
          <td><c:out value="${employce.name}" /></td>
          <td><c:out value="${employce.age}"/></td>
          <td><c:out value="${employce.email}"/> </td>
          <td><c:out value="${employce.birthday}" /></td>
          </tr>

      </c:forEach>c>
      </tbody>
      </tbody>
  </table>
  <p><a href="EmploeceController?action=insert">Add Employce</a></p>
  </body>

  </table>
  </body>
</html>
