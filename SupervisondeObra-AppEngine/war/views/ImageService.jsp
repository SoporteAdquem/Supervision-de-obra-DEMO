<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page
	import="com.google.appengine.api.blobstore.BlobstoreServiceFactory"%>
<%@ page import="com.google.appengine.api.blobstore.BlobstoreService"%>

<%
	BlobstoreService blobstoreService = BlobstoreServiceFactory
			.getBlobstoreService();
%>


<html>
<head>
<title>Upload Test</title>
</head>
<body>
	<%--         <form action="<%= blobstoreService.createUploadUrl("/upload") %>" method="post" enctype="multipart/form-data"> --%>
	<!--             <input type="text" name="foo"> -->
	<!--             <input type="file" name="myFile"> -->
	<!--             <input type="submit" value="Submit"> -->
	<!--         </form> -->
	<form name="frm" action="/excel" method="post"
		enctype="multipart/form-data">
		<input type="file" name="fl_upload"> <input type="submit"
			value="Upload"> <input type="reset" value="cancel">
	</form>
</body>
</html>
