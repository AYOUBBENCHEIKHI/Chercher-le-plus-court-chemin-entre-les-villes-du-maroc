<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>chemain optimal</title>
    <style>
        body {
            padding: 0;
            margin: 0;
            font-family: Arial, Helvetica, sans-serif;
            background-color: rgb(48, 46, 46);
            color: white;
            padding-top: 25vh;
        }
        
        .container {
            width: 400px;
            display: flex;
            flex-direction: column;
            margin: auto;
            align-items: center;
            background-color: rgb(22, 21, 21);
            border-radius: 15px;
            padding: 25px 10px;
            box-shadow: 0 0 15px rgb(80, 79, 79);
        }
        
        form {
            display: flex;
            flex-direction: column;
            width: 90%;
        }
        
        input {
            height: 40px;
            border-radius: 10px;
            border: none;
            outline: none;
            margin: 5px;
            text-align: center;
            font-size: 18px;
            color: white;
            background-color: rgb(48, 46, 46);
        }
        
        .btns {
            margin: 15px auto;
        }
        
        button {
            background-color: rgb(0, 0, 0);
            color: white;
            border: none;
            padding: 8px 30px;
            border-radius: 10px;
            font-size: 18px;
            cursor: pointer;
            margin: 5px 25px;
        }
        
        button:hover {
            background-color: tomato;
        }
        
        p {
            color: red;
            text-align: center;
        }
    </style>
</head>
<body >
 	<div class="container">
 		<form action="index.jsp" >
         	<h2>le chemain optimale est : </h2>
				<c:forEach items="${model.villes}" var="ville">  
		        	 <p> ${ville} <p>
				</c:forEach>
			<div class="btns">
                <button type="submit"> Roteur</button>
            </div>
         </form>			
     </div>
     <script>
        // lets do some password validation
        const pass = document.querySelector('#pass')
        const confirm_pass = document.querySelector('#confirm-pass')
        const msg = document.querySelector('p')
        const btn = document.querySelector('button')
        btn.addEventListener('click', (e) => {
            if (pass.value != confirm_pass.value) {
                e.preventDefault();
                msg.style.display = "block"
            }else{
                alert('user registered sucessfully')
            }

        })
    </script>
</body>
</html>