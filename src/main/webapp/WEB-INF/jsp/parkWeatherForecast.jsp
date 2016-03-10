<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>

<html>
<head>
<link rel="stylesheet" type="text/css" href="${cssRoot}/site.css">
<c:url var="cssHref" value="/css/site.css" />
<link type="text/css" rel="stylesheet" href="${cssHref}" />
<title>Park Details</title>
</head>

<body>
	<header>
		<c:url var="logoSrc" value="/img/logo.png" />
		<img id="logo" src="${logoSrc}"
			alt="This is a logo for the website that you are currently not viewing because alt text is for the visually impaired so idk" />
	</header>
	
	<h2><c:out value="${park.name}\n 5 Day Forecast" /> </h2>
	
	<h3>TODAY'S WEATHER</h3>
	<c:url var="parkImgSrc" value="/img/parks/${park.parkCode}.jpg" />
				<img src="${parkImgSrc}" alt="Picture of <c:out value='${park.name}'  />" />
				<p><strong>Hi:</strong><c:out value="${park.highs}" /></p>
				<p><strong>Lo:</strong>16&deg;</p>
	
	
</body>
</html>