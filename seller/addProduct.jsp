<!DOCTYPE html>
<html lang="en">
<head>

<%@include file="common/header.jsp"%>

</head>

<body>
<%String emails=(String)session.getAttribute("email");  %>
<%if(emails == null )
   {
  response.sendRedirect("/multi-vendor/seller/login.jsp");
   }
%>
	<form>
		<header id="header">
			<!--header-->

			<!--/header_top-->

			<%@include file="common/below_header.jsp"%>
			<!--/header-middle-->

			<%@include file="common/drop_down_header.jsp"%>
			<!--/header-bottom-->
		</header>
		<!--/header-->
	</form>
	<form>
       <div class="container">
		<div class="row">
		<div class=" col-sm-2">
		</div>
			<div class="col-sm-8 offset-sm-2">
			
				<div class="border-bottom mb-4 mt-4 pb-2">
					<div class="alert alert-info" role="alert">
						
						<ul>
							<li><a href="#" class="alert-link">Fill Up form Carefully</a>.</li>
						</ul>
					</div>
				</div>

				<div class="card">
					
					<div class="card-body">
						<form id="signupForm" method="post" class="form-horizontal" action="">
							<div class="form-group row">
								<label class="col-sm-4 col-form-label" for="productname">Product Name</label>
								<div class="col-sm-6">
									<input type="text" class="form-control" id="productname" name="prductname" placeholder="Product Name" />
								</div>
							</div>

							<div class="form-group row">
								<label class="col-sm-4 col-form-label" for="productcat">Product Category</label>
								<div class="col-sm-6">									
									<select  type="text" class="form-control" name="productcat" id="productcat">
									    <option value="Apparel">Apparel</option>
									    <option value="Baby Products">Baby Products</option>
									    <option value="Beauty">Beauty</option>
									    <option value="Books">Books</option>
									    <option value="Cameras">Cameras</option>
									    <option value="Car & Motorbike">Car & Motorbike</option>
									    <option value="Garments">Garments</option>
									    <option value="Handbags">Handbags</option>
									    <option value="Health">Health</option>
									    <option value="Home & Kitchen">Home & Kitchen</option>
									    <option value="Jewellery">Jewellery</option>
									    <option value="Laptops">Laptops</option>
									    <option value="Mobiles">Mobiles</option>
									    <option value="Movies & TV Shows">Movies & TV Shows</option>
									    <option value="Music">Music</option>
									    <option value="Pet Supplies">Pet Supplies</option>
									    <option value="Shoes">Shoes</option>
									    <option value="Sports">Sports</option>
									    <option value="Television">Television</option>
									    <option value="Video Games">Video Games</option>
									    <option value="Watches">Watches</option>
									</select>
								</div>
 
							</div>

							<div class="form-group row">
								<label class="col-sm-4 col-form-label" for="quantity">Quantity</label>
								<div class="col-sm-6">
									<input type="number" class="form-control" id="quantity" name="quantity" placeholder="Quantity" />
								</div>
							</div>

							<div class="form-group row">
								<label class="col-sm-4 col-form-label" for="warrenty">Warrenty</label>
								<div class="col-sm-6">
									<input type="number" class="form-control" id="warrenty" name="warrenty" placeholder="Warrenty in month" />
								</div>
							</div>

							<div class="form-group row">
								<label class="col-sm-4 col-form-label" for="prize">Prize</label>
								<div class="col-sm-6">
									<input type="number" class="form-control" id="prize" name="prize" placeholder="Prize in  Rs." />
								</div>
							</div>

						
							<div class="form-group control-label col-lg-10" >
								
								<label class="" for="comment">Description:</label>
								<textarea class="form-control" id="disctiption" name="disctiption" rows="3"></textarea>
								
							</div>
				 
							
						

							<div class="form-group row">
								<div class="col-sm-6 offset-sm-4">
									<div class="form-check">
										<input type="checkbox" id="agree" name="agree" value="agree" class="form-check-input"/>
										<label class="form-check-label">Please agree to our policy</label>
									</div>
								</div>
							</div>

							<div class="form-group row">
								<div class="col-sm-9 offset-sm-4">
									<button onclick="submitForm2()" id="productsubmit" type="submit" class="btn btn-primary" name="submit">submit</button>
									
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		
			<div class="col-sm-2">
			</div>
		</div>
	</div>
	<script type="text/javascript">
		$.validator.setDefaults( {
			submitHandler: function () {
				alert( "submitted!" );
			}
		} );

		$( document ).ready( function () {
			$( "#signupForm" ).validate( {
				rules: {
					firstname: "required",
					lastname: "required",
					username: {
						required: true,
						minlength: 2
					},
					password: {
						required: true,
						minlength: 5
					},
					confirm_password: {
						required: true,
						minlength: 5,
						equalTo: "#password"
					},
					email: {
						required: true,
						email: true
					},
					agree: "required"
				},
				messages: {
					firstname: "Please enter your firstname",
					lastname: "Please enter your lastname",
					username: {
						required: "Please enter a username",
						minlength: "Your username must consist of at least 2 characters"
					},
					password: {
						required: "Please provide a password",
						minlength: "Your password must be at least 5 characters long"
					},
					confirm_password: {
						required: "Please provide a password",
						minlength: "Your password must be at least 5 characters long",
						equalTo: "Please enter the same password as above"
					},
					email: "Please enter a valid email address",
					agree: "Please accept our policy"
				},
				errorElement: "em",
				errorPlacement: function ( error, element ) {
					// Add the `invalid-feedback` class to the error element
					error.addClass( "invalid-feedback" );

					if ( element.prop( "type" ) === "checkbox" ) {
						error.insertAfter( element.next( "label" ) );
					} else {
						error.insertAfter( element );
					}
				},
				highlight: function ( element, errorClass, validClass ) {
					$( element ).addClass( "is-invalid" ).removeClass( "is-valid" );
				},
				unhighlight: function (element, errorClass, validClass) {
					$( element ).addClass( "is-valid" ).removeClass( "is-invalid" );
				}
			} );

		} );
	</script>
    </form>
	
		
	<form>
		<footer id="footer">
			<%@include file="common/footer.jsp"%>

		</footer>
	</form>
	<%@include file="common/footer1.jsp"%>
</body>
</html>
