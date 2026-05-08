<%@ include file="layout/header.jsp" %>

<div class="container">

    <h2 style="color:white;">My Leave Status</h2>

    <table>
        <tr>
            <th>Start Date</th>
            <th>End Date</th>
            <th>Days</th>
            <th>Reason</th>
            <th>Status</th>
        </tr>

        <c:forEach var="leave" items="${leaveList}">
            <tr>
                <td>${leave.startDate}</td>
                <td>${leave.endDate}</td>
                <td>${leave.numberOfDays}</td>
                <td>${leave.reason}</td>
                <td>${leave.leaveStatus}</td>
            </tr>
        </c:forEach>

    </table>

</div>

<%@ include file="layout/footer.jsp" %>