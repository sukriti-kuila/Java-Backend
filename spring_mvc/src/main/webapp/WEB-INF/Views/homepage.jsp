<html>
<body>
<h2>Hello World!</h2>
	<%
		String name = (String)request.getAttribute("name");
	%>
	<h1>Name is <%=name %></h1>
	<!-- To fetch this data we are using @RequestParam in Controller -->
	<form action="add" method="POST">
		<input type="number" name="num1">
		<input type="number" name="num2">
		<button type="submit">Submit</button>
	</form>
	<!-- To fetch this data we are using @ModelAttribute in Controller -->
	<form action="processForm" method="POST">
		<input type="number" name="id">
		<input type="text" name="name">
		<button type="submit">Submit</button>
	</form>
</body>
</html>
