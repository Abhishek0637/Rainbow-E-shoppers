<!DOCTYPE html>
<html lang="en">
<head>

<%@include file="common/header.jsp"%>

</head>

<body>
	<header id="header">
		<!--header-->
		
		<!--/header_top-->

		<%@include file="common/below_header.jsp"%>
		<!--/header-middle-->

		<%@include file="common/drop_down_header.jsp"%>
		<!--/header-bottom-->
	</header>
	<!--/header-->
	<section id="slider">
		<!--slider-->
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<div id="slider-carousel" class="carousel slide"
						data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#slider-carousel" data-slide-to="0"
								class="active"></li>
							<li data-target="#slider-carousel" data-slide-to="1"></li>
							<li data-target="#slider-carousel" data-slide-to="2"></li>
						</ol>

						<div class="carousel-inner">
							<div class="item active">
								<div class="col-sm-6">
									<h1>
										<span>Rainbow E</span>-SHOPPER
									</h1>
									<h2>BUY 1 GET 1 FREE</h2>
									<p>Rainbow is the best platform to buy on best price with good Quality.</p>
									<button type="button" class="btn btn-default get">Get
										it now</button>
								</div>
								<div class="col-sm-6">
									<img src="images/home/girl1.jpg" class="girl img-responsive"
										alt="" /> <img src="images/home/pricing.png" class="pricing"
										alt="" />
								</div>
							</div>
							<div class="item">
								<div class="col-sm-6">
									<h1>
										<span>Rainbow E</span>-SHOPPER
									</h1>
									<h2>100% Responsive Design</h2>
									<p>Rainbow is the best platform to buy on best price with good Quality.</p>
									<button type="button" class="btn btn-default get">Get
										it now</button>
								</div>
								<div class="col-sm-6">
									<img src="images/home/girl2.jpg" class="girl img-responsive"
										alt="" /> <img src="images/home/pricing.png" class="pricing"
										alt="" />
								</div>
							</div>

							<div class="item">
								<div class="col-sm-6">
									<h1>
										<span>Rainbow E</span>-SHOPPER
									</h1>
									<h2>Impressive Design</h2>
									<p>Rainbow is the best platform to buy on best price with good Quality.</p>
									<button type="button" class="btn btn-default get">Get
										it now</button>
								</div>
								<div class="col-sm-6">
									<img src="images/home/girl3.jpg" class="girl img-responsive"
										alt="" /> <img src="images/home/pricing.png" class="pricing"
										alt="" />
								</div>
							</div>

						</div>

						<a href="#slider-carousel" class="left control-carousel hidden-xs"
							data-slide="prev"> <i class="fa fa-angle-left"></i>
						</a> <a href="#slider-carousel"
							class="right control-carousel hidden-xs" data-slide="next"> <i
							class="fa fa-angle-right"></i>
						</a>
					</div>

				</div>
			</div>
		</div>
	</section>
	<!--/slider-->

	

	<footer id="footer">

		<%@include file="common/footer.jsp"%>

	</footer>
	<%@include file="common/footer1.jsp"%>
</body>
</html>