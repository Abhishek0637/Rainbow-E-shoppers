<!DOCTYPE html>
<html lang="en">
<head>
<%@include file="common/header.jsp"%>
</head>
<!--/head-->

<body>
<%String emails=(String)session.getAttribute("email");  %>
<%if(emails == null )
   {
  response.sendRedirect("/multi-vendor/user/login.jsp");
   }
%>
	<header id="header">
		<!--header-->
		
		<!--/header_top-->

		<%@include file="common/below_header.jsp"%><!--/header-middle-->

		<%@include file="common/drop_down_header.jsp"%><!--/header-bottom-->
	</header>
	<!--/header-->

	<section id="cart_items">
		<div class="container">
			<div class="breadcrumbs">
				<ol class="breadcrumb">
					<li><a href="#">Home</a></li>
					<li class="active">Shopping Cart</li>
				</ol>
			</div>
			<div class="table-responsive cart_info">
				<table class="table table-condensed">
					<thead>
						<tr class="cart_menu">
							<td class="image">Item</td>
							<td class="description"></td>
							<td class="price">Price</td>
							<td class="quantity">Quantity</td>
							<td class="total">Total</td>
							<td></td>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="cart_product"><a href=""><img
									src="images/cart/one.png" alt=""></a></td>
							<td class="cart_description">
								<h4>
									<a href="">Gowns</a>
								</h4>
								<p>Web ID: 1089772</p>
							</td>
							<td class="cart_price">
								<p>$99</p>
							</td>
							<td class="cart_quantity">
								<div class="cart_quantity_button">
									<a class="cart_quantity_up" href=""> + </a> <input
										class="cart_quantity_input" type="text" name="quantity"
										value="1" autocomplete="off" size="2"> <a
										class="cart_quantity_down" href=""> - </a>
								</div>
							</td>
							<td class="cart_total">
								<p class="cart_total_price">$99</p>
							</td>
							<td class="cart_delete"><a class="cart_quantity_delete"
								href=""><i class="fa fa-times"></i></a></td>
						</tr>

						<tr>
							<td class="cart_product"><a href=""><img
									src="images/cart/two.png" alt=""></a></td>
							<td class="cart_description">
								<h4>
									<a href="">Gowns</a>
								</h4>
								<p>Web ID: 1089772</p>
							</td>
							<td class="cart_price">
								<p>$99</p>
							</td>
							<td class="cart_quantity">
								<div class="cart_quantity_button">
									<a class="cart_quantity_up" href=""> + </a> <input
										class="cart_quantity_input" type="text" name="quantity"
										value="1" autocomplete="off" size="2"> <a
										class="cart_quantity_down" href=""> - </a>
								</div>
							</td>
							<td class="cart_total">
								<p class="cart_total_price">$99</p>
							</td>
							<td class="cart_delete"><a class="cart_quantity_delete"
								href=""><i class="fa fa-times"></i></a></td>
						</tr>
						<tr>
							<td class="cart_product"><a href=""><img
									src="images/cart/three.png" alt=""></a></td>
							<td class="cart_description">
								<h4>
									<a href="">Gowns</a>
								</h4>
								<p>Web ID: 1089772</p>
							</td>
							<td class="cart_price">
								<p>$99</p>
							</td>
							<td class="cart_quantity">
								<div class="cart_quantity_button">
									<a class="cart_quantity_up" href=""> + </a> <input
										class="cart_quantity_input" type="text" name="quantity"
										value="1" autocomplete="off" size="2"> <a
										class="cart_quantity_down" href=""> - </a>
								</div>
							</td>
							<td class="cart_total">
								<p class="cart_total_price">$99</p>
							</td>
							<td class="cart_delete"><a class="cart_quantity_delete"
								href=""><i class="fa fa-times"></i></a></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</section>
	<footer id="footer">
		<%@include file="common/footer.jsp"%>
	</footer>
	<%@include file="common/footer1.jsp"%>
</body>
</html>