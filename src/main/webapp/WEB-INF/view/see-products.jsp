<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>See products</title>

	<link type="text/css"
    		  rel="stylesheet"
    		  href="${pageContext.request.contextPath}/resources/css/see-page.css"/>

</head>
<body>
	<header class="desc-holder">
		<nav class="nav-bar">
			<a class="link" href="${pageContext.request.contextPath}/products/addproduct">Add product</a>
			<a class="link" href="${pageContext.request.contextPath}">Home</a>
			<a class="link" href="${pageContext.request.contextPath}/products/getall">See product</a>
		</nav>
	</header>
	<main>

        <h1 class="h1-head">Products</h1>

		<table class="main-body">
            <div class="desc-holder">

                <c:forEach var="get_product" items="${products}">

                    <c:url var="deleteLink" value="/products/delete">
                        <c:param name="id" value="${get_product.id}"/>
                    </c:url>

                    <c:url var="updateLink" value="/products/update">
                        <c:param name="id" value="${get_product.id}"/>
                    </c:url>

                    <div class="prod-interface">
                        <div class="prod-desc">
                            <h2>${get_product.productName}</h2>
                            <h3>${get_product.productCategory}</h3>
                            <p class="prod-desc">${get_product.productDescription}</p>
                        </div>
                        <div class="delete-update-link">
                            <a class="link" href="${deleteLink}">Delete</a>
                            <a class="link" href="${updateLink}">Update</a>
                        </div>
                    </div>
                </c:forEach>
			<div>
		</table>
	</main>
</body>
</html>