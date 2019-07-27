<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to Share Interests</title>
</head>
<body>
	<h1>Welcome to Share Interests Platform</h1>
	
	Search NearBy People with Interest <input type="submit" value="Search" onclick="javascript:searchByLocation()"/>
	
	<div id="users"></div>
	
</body>
<script type="text/javascript">

	function searchByLocation() {
		 var xhttp = new XMLHttpRequest();
		  xhttp.open("POST", "http://172.20.33.78:8080/shareInterest/findByLocation", true);
		  xhttp.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
		  var params = 'longitude=10000&latitude=10000';
          console.log("XMLHttpRequest created.");
		  xhttp.send(params);
		  xhttp.onreadystatechange = function() {
			    if (this.readyState == 4 && this.status == 200) {
			      var data = JSON.parse(this.responseText);
			      var resp='';
			      for (var i=0;i<data.length;i++) {
			    	  console.log(data[i]);
			    	  resp += "<h3>" + data[i].userName + "</h3>";
			    	}
			      document.getElementById("users").innerHTML = resp;
			    }
		  };
	}
</script>
</html>