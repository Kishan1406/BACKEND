<%@ include file="layout/header.jsp" %>

<div class="form-box">

    <h3>Reset Username / Password</h3>

    <form action="/reset" method="post">

        <input type="number" name="eid" placeholder="Enter Employee ID" required />

        <input type="text" name="username" placeholder="New Username" required />

        <input type="password" name="password" placeholder="New Password" required />

        <button type="submit">Reset</button>

    </form>

    <p style="color:red;">${message}</p>

    <a href="/login">Back to Login</a>

</div>

<%@ include file="layout/footer.jsp" %>