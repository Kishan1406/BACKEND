<%@ include file="layout/header.jsp" %>

<div class="form-box">

    <h3>Employee Login</h3>

    <form action="/login" method="post">

        <input type="text" name="username" placeholder="Enter Username" required />

        <input type="password" name="password" placeholder="Enter Password" required />

        <button type="submit">Login</button>

    </form>

    <!-- Message from Controller -->
    <p style="color:red;">
        ${message}
    </p>

    <br>

    <a href="/register">New User? Register</a>
    <br>
    <a href="/reset">Forgot Username / Password?</a>

</div>

<%@ include file="layout/footer.jsp" %>