/*#INSERT INTO employce (id, name, age, email, birthday) VALUE (1, 'Vova', 31, 'avto@ukr.net', '1989.12.10');
#SELECT * FROM employce WHERE  name = 'Vova';
#UPDATE employce SET name = 'Steve', age = 55; WHERE  id = 1;
#DELETE from employce WHERE id = 4;
*/

<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://java.sun.com/xml/ns/javaee" xmlns:web="http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd" id="WebApp_ID" version="2.5">
    <display-name>SimpleJspServletDB</display-name>
    <welcome-file-list>
        <welcome-file>index.jsp</welcome-file>
    </welcome-file-list>
    <servlet>
        <description></description>
        <display-name>EmployceController</display-name>
        <servlet-name>EmployceController</servlet-name>
        <servlet-class>controller.EmployceController</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>EmployceController</servlet-name>
        <url-pattern>/EmployceController</url-pattern>
    </servlet-mapping>
</web-app>