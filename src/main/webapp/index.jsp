<%@page contentType="text/html;UTF-8"  pageEncoding="UTF-8" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="p" uri="/struts-tags" %>
<html>
<body>
<s:iterator value="students">
    <s:property value="id"/>
    <s:property value="name"/>
   <s:date name="bir" format="yyyy-MM-dd"/>
</s:iterator>
</body>
</html>
