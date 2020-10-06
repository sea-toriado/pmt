<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <style>
        table {
            border-collapse: collapse;
            width: 80%;
            margin-left: 10%;
        }
        table, th, td {
            border: 1px solid black;
            padding: 10px 10px;
        }
        #chartContainer {
            height: 400px;
            width: 80%;
            margin-left: 10%;
        }
        h2 {
            margin-left: 10%;
        }
    </style>
    <script>
        window.onload = function() {
            var chart = new CanvasJS.Chart("chartContainer", {
                title: {
                    text: "${commitForecast.title}"
                },
                subtitles: [{
                    fontSize: 16,
                    text: "${commitForecast.subtitle}"
                }],
                axisY: {
                    title: "${commitForecast.axisYLabel}"
                },
                data: [{
                    type: "column",
                    yValueFormatString: "###",
                    indexLabel: "{y}",
                    dataPoints: ${commitForecast.dataList}
                }]
            });

            function updateChart() {
                var performance, deltaY, yVal;
                var dps = chart.options.data[0].dataPoints;
                for (var i = 0; i < dps.length; i++) {
                    deltaY = Math.round(2 + Math.random() * (-2 - 2));
                    yVal = deltaY + dps[i].y > 0 ? dps[i].y + deltaY : 0;
                    dps[i].y = yVal;
                }
                chart.options.subtitles[0].text = "${commitForecast.subtitle}";
                chart.render();
            };

            updateChart();
        }
    </script>
    <title>Project ${projectName}</title>
</head>
<body>
    <br>
    <h2>Contributors</h2>
    <table>
        <thead>
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Commit Count</th>
            <th>Commit Impact</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="committer" items="${committers}">
            <tr>
                <td><c:out value="${committer.name}"/></td>
                <td><c:out value="${committer.email}"/></td>
                <td><c:out value="${committer.commitCount}"/></td>
                <td><c:out value="${committer.commitImpact * 100}%"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <br>
    <div id="chartContainer" name="chartContainer"></div>
    <script src="https://canvasjs.com/assets/script/canvasjs.min.js"></script>
</body>
</html>
