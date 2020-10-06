<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Projects</title>
    <style>
        table {
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
            padding: 10px 10px;
        }
        tbody tr td {
            cursor: pointer;
        }
    </style>
    <script>
        function selectProject(owner, repo) {
            window.location.href = '/pmt/stat?owner='+owner+'&repo='+repo;
        }
    </script>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>Name</th>
                <th>Details</th>
                <th>Language</th>
                <th>Owner</th>
                <th>URL</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="project" items="${projects}">
                <tr onclick="selectProject('${project.creator.login}', '${project.name}')">
                    <td><c:out value="${project.name}"/></td>
                    <td><c:out value="${project.description}"/></td>
                    <td><c:out value="${project.language}"/></td>
                    <td><c:out value="${project.creator.login}"/></td>
                    <td><c:out value="${project.url}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
