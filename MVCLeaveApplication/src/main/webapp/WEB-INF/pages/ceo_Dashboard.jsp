<%@ include file="layout/header.jsp" %>

<h2 style="color:white;">CEO DASHBOARD</h2>

<table>
    <tr>
        <th>Employee Name</th>
        <th>Start Date</th>
        <th>End Date</th>
        <th>No. of Days</th>
        <th>Reason</th>
        <th>Status</th>
    </tr>

    <c:forEach var="leave" items="${leaves}">
        <tr>
            <td>${leave.employee.ename}</td>
            <td>${leave.startDate}</td>
            <td>${leave.endDate}</td>
            <td>${leave.numberOfDays}</td>
            <td>${leave.reason}</td>
            <td>${leave.leaveStatus}</td>
        </tr>
    </c:forEach>
</table>

<%@ include file="layout/footer.jsp" %>