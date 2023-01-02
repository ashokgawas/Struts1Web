<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insert definition="baseLayout" >
	<tiles:put name="title" value="Success" />
	<tiles:put name="body" value="/success/success.jsp" />
</tiles:insert>