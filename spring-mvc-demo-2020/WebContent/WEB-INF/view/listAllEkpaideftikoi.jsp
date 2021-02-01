<table>
	<tr>
		<th>username</th>
		<th>first name</th>
		<th>last name</th>
		<th>email</th>
		<th>stathmos id</th>
		<th>password</th>
	</tr>
	<!-- loop over and print our customers -->
	<c:forEach var="tempEkpaideftikos" items="${ekpaideftikoi}">

		<tr>
			<td>${tempEkpaideftikos.username}</td>
			<td>${tempEkpaideftikos.first_name}</td>
			<td>${tempEkpaideftikos.last_name}</td>
			<td>${tempEkpaideftikos.email}</td>
			<td>${tempEkpaideftikos.stathmos_id}</td>
			<td>${tempEkpaideftikos.password}</td>
		</tr>
	</c:forEach>
</table>