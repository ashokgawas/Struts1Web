<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insert definition="baseLayout" >
	<tiles:put name="title" value="Login" />
	<tiles:put name="body" value="/login/login.jsp" />
</tiles:insert>