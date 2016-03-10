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
	
				<c:url var="parkImgSrc" value="/img/parks/${park.parkCode}.jpg" />
				<img src="${parkImgSrc}" alt="Picture of <c:out value='${park.name}'  />" />
				
				
				<h3>
					<c:out value="${park.name}" />
				</h3>
				<p><strong>Location:</strong><c:out value="${park.location}" /></p>
				<p><strong>Acreage:</strong><c:out value="${park.acreage}" /></p>
				<p><strong>Elevation in feet:</strong><c:out value="${park.elevation}" /></p>
				<p><strong>Miles of trail:</strong><c:out value="${park.milesOfTrail}" /></p>
				<p><strong>Number of Campsites:</strong><c:out value="${park.campsites}" /></p>
				<p><strong>Climate of park:</strong><c:out value="${park.climate}" /></p>
				<p><strong>Year Founded:</strong><c:out value="${park.yearFounded}" /></p>
				<p><strong>Visitor Count:</strong><c:out value="${park.visitorCount}" /></p>
				<p><strong>Quote about park:</strong><c:out value="${park.quote}" /></p>
				<p><strong>Author of Quote:</strong><c:out value="${park.quoteSource}" /></p>
				<p><strong>Park Entry Fee:</strong><c:out value="${park.entryFee}" /></p>
				<p><strong>Number of Animals that WILL eat you in the park:</strong><c:out value="${park.numberOfAnimalSpecies}" /></p>
				
		<h3>
					<c:url var="parkWeatherHref" value="/parkWeatherForecast">
						<!--   <c:param name="parkCode" value="${park.parkCode}" /> -->
					</c:url>
					<a href="${parkWeatherHref}"><c:out value="Weather Forecast for: ${park.name}" /></a>
				</h3>
				
								
</body>
</html>