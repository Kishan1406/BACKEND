<%@ include file="layout/header.jsp" %>

<div class="form-box">

    <h3>Employee Registration</h3>

    <form action="/register" method="post">

        <input type="text" name="ename" placeholder="Enter Name" required />

        <input type="number" name="eage" placeholder="Enter Age" required />

        <input type="text" name="eaddress" placeholder="Enter Address" required />

        <input type="text" name="username" placeholder="Enter Username (min 8 chars)" required />

        <input type="password" name="password" placeholder="Enter Password (min 8 chars)" required />

        <select name="role" required>
            <option value="">Select Role</option>
            <option value="EMPLOYEE">Employee</option>
            <option value="MANAGER">Manager</option>
            <option value="CEO">CEO</option>
        </select>

        <button type="submit">Register</button>

    </form>

    <!-- Message from Controller -->
    <p style="color:red;">
        ${message}
    </p>

    <br>

    <a href="/login">Already Registered? Login</a>

</div>

<%@ include file="layout/footer.jsp" %>