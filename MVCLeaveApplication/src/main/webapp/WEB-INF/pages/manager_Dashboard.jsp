<%@ include file="layout/header.jsp" %>

<div class="container">

    <h2 style="color:white;">MANAGER DASHBOARD</h2>

    <c:if test="${not empty message}">
        <p style="color:yellow;">${message}</p>
    </c:if>

    <table>
        <tr>
            <th>Employee</th>
            <th>Start Date</th>
            <th>End Date</th>
            <th>Days</th>
            <th>Status</th>
            <th>Action</th>
        </tr>

        <c:forEach var="leave" items="${pendingLeaves}">
            <tr>
                <td>${leave.employee.ename}</td>
                <td>${leave.startDate}</td>
                <td>${leave.endDate}</td>
                <td>${leave.numberOfDays}</td>
                <td>${leave.leaveStatus}</td>
                <td>
                    <form action="/approve" method="post" style="display:inline;">
                        <input type="hidden" name="leaveId" value="${leave.leaveId}"/>
                        <button type="submit">Approve</button>
                    </form>

                    <form action="/reject" method="post" style="display:inline;">
                        <input type="hidden" name="leaveId" value="${leave.leaveId}"/>
                        <button type="submit">Reject</button>
                    </form>
                </td>
            </tr>
        </c:forEach>

    </table>

</div>
<%@ include file="layout/footer.jsp" %>