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
  response.sendRedirect("/multi-vendor/logistic/login.jsp");
   }
%>
	<header id="header">
		<!--header-->
		
		<!--/header_top-->

		<%@include file="common/below_header.jsp"%><!--/header-middle-->

		<%@include file="common/drop_down_header.jsp"%><!--/header-bottom-->
	</header>
	<!--/header-->

	<div id="contact-page" class="container">
		<div class="bg">
			<div class="row">
				<div class="col-sm-12">
					<h2 class="title text-center">
						Contact <strong>Us</strong>
					</h2>
					<div id="gmap" class="contact-map"></div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-4">
					<div class="contact-form">
						<h2 class="title text-center">Get In Touch</h2>
						<div class="status alert alert-success" style="display: none"></div>
						<form id="main-contact-form" class="contact-form row"
							name="contact-form" method="post">
							<div class="form-group col-md-6">
								<input type="text" name="name" class="form-control"
									required="required" placeholder="Name">
							</div>
							<div class="form-group col-md-6">
								<input type="email" name="email" class="form-control"
									required="required" placeholder="Email">
							</div>
							<div class="form-group col-md-12">
								<input type="text" name="subject" class="form-control"
									required="required" placeholder="Subject">
							</div>
							<div class="form-group col-md-12">
								<textarea name="message" id="message" required="required"
									class="form-control" rows="8" placeholder="Your Message Here"></textarea>
							</div>
							<div class="form-group col-md-12">
								<input type="submit" name="submit"
									class="btn btn-primary pull-right" value="Submit">
							</div>
						</form>
					</div>
				</div>
				<div class="col-sm-8">
					<div class="contact-info">
						<h2 class="title text-center">Contact Info</h2>
						<address>
							<p>RAINBOW E-Shopper Inc.</p>
							<p>India</p>
							<p>Mobile: +91 7275 70 7577, +91 9509 69 7319, +91 8824 47 8072</p>
							
							<p>Email: aruvishalpatel39@gmail.com</p>
							<p>Email: abhisheksaini16092001@gmail.com</p>
							<p>Email: chiragkhatik333@gmail.com</p>
						</address>
						<div class="social-networks">
							<h2 class="title text-center">Social Networking</h2>
							<ul>
								<li><a target="_blank" href="https://www.facebook.com/aruvishal.patel"><i class="fa fa-facebook"></i></a></li>
								<li><a target="_blank" href="https://www.instagram.com/abhishek_009__saini/"><i class="fa fa-instagram"></i></a></li>
								<li><a target="_blank" href="https://www.instagram.com/ck_chaksa/"><i class="fa fa-instagram"></i></a></li>
								
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--/#contact-page-->
	<footer id="footer">
		<%@include file="common/footer.jsp"%>
	</footer>
	<%@include file="common/footer1.jsp"%>
</body>
</html>