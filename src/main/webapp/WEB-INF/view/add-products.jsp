<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>See products</title>

	<link type="text/css"
    		  rel="stylesheet"
    		  href="${pageContext.request.contextPath}/resources/css/add-page.css"/>

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

        <h1 class="h1-head">Register product</h1>

        <div class="desc-holder">
            <form:form action="saveProduct" modelAttribute="products" method="POST">
                <form:hidden path="id"/>

                <div class="product-form">
                    <div>
                        <label>Product name:</label>
                        <form:input class="form" path="productName"/>
                    </div>
                    <div>
                        <label>Product category:</label>
                        <form:input class="form" path="productCategory"/>
                    </div>
                    <div>
                        <label>Product description:</label>
                        <form:input class="form" path="productDescription"/>
                    </div>
                    <input class="button" type="submit" value="Save">
                </div>
            </form:form>
        </div>
	</main>
</body>
</html>