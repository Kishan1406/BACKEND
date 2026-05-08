<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <title>KKK Company</title>

    <style>
        body {
            margin: 0;
            font-family: Arial;
            background-color: blue;
        }

        .header {
            background-color: darkblue;
            color: white;
            text-align: center;
            padding: 20px;
            font-size: 30px;
            font-weight: bold;
            position: fixed;
            top: 0;
            width: 100%;
        }

        .footer {
            background-color: darkblue;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }

        .container {
            display: flex;              
        		justify-content: center;    
   		 	align-items: center;
    			gap: 40px;                  
    			margin-top: 120px;
    			margin-bottom: 60px;
    			flex-wrap: wrap; 
        }

        .form-box {
                background-color: yellow;
    				padding: 30px;
    				border-radius: 10px;
    				box-shadow: 2px 2px 10px gray;
    				width: 300px;

        }

        input, select {
            width: 90%;
            padding: 8px;
            margin: 10px;
        }

        button {
            background-color: darkblue;
            color: white;
            padding: 10px;
            border: none;
            width: 100%;
            cursor: pointer;
        }

        button:hover {
            background-color: navy;
        }

        a {
            text-decoration: none;
            color: white;
            background-color: darkblue;
            padding: 8px 15px;
            display: inline-block;
            margin-top: 10px;
        }

        a:hover {
            background-color: navy;
        }

        table {
            background-color: white;
            margin: auto;
            border-collapse: collapse;
            width: 80%;
        }

        th {
            background-color: darkblue;
            color: white;
        }

        th, td {
            padding: 10px;
            border: 1px solid black;
        }
    </style>
</head>

<body>

<div class="header">
    KKK COMPANY
</div>

<div class="container">