<%@page import="java.util.Iterator"%>
<%@page import="com.vercer.engine.persist.ObjectDatastore"%>
<%@page import="entity.XMLBlob"%>
<%@page import="com.google.appengine.api.datastore.Blob"%>
<%@page import="com.vercer.engine.persist.annotation.AnnotationObjectDatastore"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<!-- The HTML 4.01 Transitional DOCTYPE declaration -->
<!-- above set at the top of the file will set -->
<!-- the browser's rendering engine into -->
<!-- "Quirks Mode". Replacing this declaration -->
<!-- with a "Standards Mode" doctype is supported, -->
<!-- but may lead to some differences in layout. -->

<html>
	<head>
		<title>GFXML</title>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
		<link rel="SHORTCUT ICON" href="favicon.ico" />
		<link rel="stylesheet" href="css/simple.css" type="text/css" />
	</head>

	<body>
		<div class='container'>
			<a href="/">Back</a>
		</div>
		<div id='in' class='container'>
			<div>
				<h1>Generate and Filter data!</h1>
				<h2>Introduction to filtering data</h2>
			</div>
		</div>
		<div class='container'>
			<h3>Example action URL's:</h3>
			<ul>
				<li><a href="filter?file=testdata.xml&out=html">filter?file=testdata.xml&out=html</a></li>
				<li><a href="filter?file=testdata.xml&out=csv">filter?file=testdata.xml&out=csv</a></li>
				<li><a href="filter?file=testdata.xml&f=1&department=MI&month=7">filter?file=testdata.xml&f=1&department=MI&month=7</a></li>
				<li><a href="filter?file=testdata.xml&f=2&decile=497&out=xml">filter?file=testdata.xml&f=2&decile=497&out=xml</a></li>
				<li><a href="filter?file=testdata.xml&f=3&occupation=Customer%20services%20manager">filter?file=testdata.xml&f=3&occupation=Customer%20services%20manager</a></li>
				<li><a href="filter?file=testdata.xml&f=report">filter?file=testdata.xml&f=report</a></li>
			</ul>
		</div>
		<div class='container'>
			<h3>
				Availible files: [
				<small>
					<strike>add</strike>
				</small>
				]
			</h3>
			<ul>
				
			</ul>
		</div>
	</body>
</html>