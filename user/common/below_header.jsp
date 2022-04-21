
<div class="header-middle">
	<!--header-middle-->
	<div class="container">
		<div class="row">
			<div class="col-sm-3">
				<div class="logo pull-left">
					<a href="index.jsp"><img src="images/home/logo.png" alt="" /></a>
				</div>

			</div>
			<div class="col-sm-9">
				<div class="shop-menu pull-right">
					<ul class="nav navbar-nav">
					
					    <li><a href="team.jsp"><i class="glyphicon glyphicon-user"></i> Team</a></li>
						
						<li><a href="cart.jsp"><i class="fa fa-shopping-cart"></i>
								Cart</a></li>
											
						<%String email=(String)session.getAttribute("email");  %>
                       <%if(email != null )
                          {%>
                    	   <li><a style="cursor: pointer;" onclick="submitFormLogout()" ><span onclick="submitFormLogout()" class="glyphicon glyphicon-log-out"></span> Log Out</a></li>
                    	   <% out.print("<li><a href='#'>Hello: "+email+"</a></li>");
                          }
                          else {%>
                          <li><a href="signup.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
						  <li><a href="login.jsp" ><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                          <% } %> 
								
						
					
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>

