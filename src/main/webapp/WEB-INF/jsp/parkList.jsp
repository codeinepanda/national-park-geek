<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url var="cssRoot" value="/css" />

<c:url var="imgRoot" value="/img" />
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${cssRoot}/site.css">

<title>National Park Geek</title>
</head>

<body>
	<header>
		<img id="logo" src="${imgRoot}/logo.png" alt="This is a logo for the website that you are currently not viewing because alt text is for the visually impaired so idk"/>
	</header>
	<ul>
		<li class="park">
			<img src="${imgRoot}/parks/gnp.jpg" alt="Picture of Glacier National Park" />
			<h3>Glacier National Park</h3>
			<p><strong>Location:</strong>Montana</p>
			<p id="thingy">These tacos are lit. Side of rice and beans, please. You see, the refried beans are really just the adhesive necessary to apply the soft tortilla to the hard taco shell. Black or pinto beans? Fish tacos with cabbage slaw and a side of chips and guac. CARNE ASADA!! Carne asada on corn tortillas. Tacos, tacos, tacos. Tacos Al pastor De Adobada are made of thin pork steaks seasoned with adobo seasoning, then skewered and overlapped on one another on a vertical rotisserie cooked and flame-broiled as it spins.</p>
		</li>
		<li>
		<img src="${imgRoot}/parks/ynp.jpg" alt="Picture of Yellowstone National Park" />
			<h3>Yellowstone National Park</h3>
			<p><strong>Location:</strong>Wyoming</p>
			<p id="thingy">These tacos are lit. Side of rice and beans, please. You see, the refried beans are really just the adhesive necessary to apply the soft tortilla to the hard taco shell. Black or pinto beans? Fish tacos with cabbage slaw and a side of chips and guac. CARNE ASADA!! Carne asada on corn tortillas. Tacos, tacos, tacos. Tacos Al pastor De Adobada are made of thin pork steaks seasoned with adobo seasoning, then skewered and overlapped on one another on a vertical rotisserie cooked and flame-broiled as it spins.</p>
		</li>
	</ul>


</body>
</html>