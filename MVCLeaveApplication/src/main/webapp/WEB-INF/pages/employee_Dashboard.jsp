<%@ include file="layout/header.jsp" %>

<div class="form-box">

    <h3>Apply Leave</h3>

    <form action="/applyLeave" method="post">

        <input type="number" name="eid" placeholder="Employee ID" required />

        <input type="date" name="startDate" required />

        <input type="date" name="endDate" required />

        <input type="text" name="reason" placeholder="Reason" required />

        <button type="submit">Apply</button>

    </form>

</div>

<br>

<div class="form-box">
    <h3>Check Leave Status</h3>
    <a href="/viewLeaveStatus">View Status</a>
</div>

<p style="color:green;">${message}</p>

<%@ include file="layout/footer.jsp" %>