<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="welcome">
	Bienvenue sur l'application XYZ 
	<% Object user = session.getAttribute("user");  %>
   <div class="right">	
	 <c:if test="${not empty user}">
	   ${user.prenom}
	   	<a href="<c:url value="/app/login/logout" />">
		 deconnexion
	    </a>
	 </c:if> 	
	</div>
</div>
<div id="branding" class="spring">
	<img src="<c:url value="/images/header2.jpg"/>" />
</div>
