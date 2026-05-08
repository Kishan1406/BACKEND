<%@ include file="layout/header.jsp" %>

<div class="container">

    <div class="form-box">
        <h3>Apply Leave</h3>

        <form action="/applyLeave" method="post">

            <input type="date" name="startDate" required/>
            <input type="date" name="endDate" required/>

            <input type="text" name="reason" placeholder="Reason" required/>

            <!-- Hidden Employee ID (for now manual or session later) -->
            <input type="number" name="eid" placeholder="Employee ID" required/>

            <button type="submit">Apply</button>
        </form>

    </div>

</div>

<%@ include file="layout/footer.jsp" %>