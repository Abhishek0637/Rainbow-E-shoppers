
<div class="header-middle">
	<!--header-middle-->
	<div class="container" style="margin-bottom: 50px;">
		<div class="row">
			<div class="col-sm-4">
				<div class="logo pull-left">
					<a href="index.jsp"><img src="images/home/logo.png" alt="" /></a>
				</div>

			</div>
			<div class="col-sm-8">
				<div class="shop-menu pull-right">
					<ul class="nav navbar-nav">
					    <li><a href="/multi-vendor/home/home.jsp"><i class="glyphicon glyphicon-home"></i>Home</a></li>
					    <li><a href="user.jsp"><i class="glyphicon glyphicon-user"></i> User</a></li>
					    <li><a href="logistic.jsp"><i class="glyphicon glyphicon-plane"></i> Logistic</a></li>
					    <li><a href="seller.jsp"><i class="glyphicon glyphicon-user"></i> Seller</a></li>
					    
					    
						<li><a href="team.jsp"><i class="fa fa-group"></i> Team</a></li>
						
						<%String email=(String)session.getAttribute("email");  %>
                       <%if(email != null )
                          {%>
                    	   <li><a style="cursor: pointer;" onclick="submitFormLogout()" ><span onclick="submitFormLogout()" class="glyphicon glyphicon-log-out"></span> Log Out</a></li>
                    	   <% out.print("<li><a href='#'>Hello: "+email+"</a></li>");
                          }
                          else {%>
						  <li><a href="login.jsp" ><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                          <% } %> 
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>

