/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-04-24 15:14:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dao.doctorDao;
import com.entity.doctor;
import com.entity.appointment;
import java.util.List;
import com.entity.User;
import com.Database.DBConnect;
import com.dao.appointmentDao;

public final class view_005fappointment_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/component/allcss.jsp", Long.valueOf(1680856714827L));
    _jspx_dependants.put("/../component/footer.jsp", Long.valueOf(1681487303470L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1680783039081L));
    _jspx_dependants.put("jar:file:/C:/Users/Gaurav/Desktop/Hospital%20Management%20System%20Project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Hospital_Management_System/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/component/navbar.jsp", Long.valueOf(1682347346358L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.dao.doctorDao");
    _jspx_imports_classes.add("com.entity.doctor");
    _jspx_imports_classes.add("com.entity.appointment");
    _jspx_imports_classes.add("com.Database.DBConnect");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.entity.User");
    _jspx_imports_classes.add("com.dao.appointmentDao");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>View Appointment</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\"\r\n");
      out.write("	integrity=\"sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==\"\r\n");
      out.write("	crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\r\n");
      out.write("	integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js\"\r\n");
      out.write("	integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js\"\r\n");
      out.write("	integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("/* adding shadow to containers */\r\n");
      out.write(".paint-card {\r\n");
      out.write("	box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);\r\n");
      out.write("	-webkit-box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);\r\n");
      out.write("	-moz-box-shadow: 10px 10px 5px 0px rgba(0, 0, 0, 0.75);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* styling the background image  */\r\n");
      out.write(".back-img {\r\n");
      out.write("	background-image: url(\"img/h14.jpg\");\r\n");
      out.write("	background-repeat: no-repeat;\r\n");
      out.write("	height: 95vh;\r\n");
      out.write("	width: 100v;\r\n");
      out.write("	background-size: cover;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- NAVBAR -->\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- background image  -->\r\n");
      out.write("	<div class=\"container-fluid back-img\"></div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("			<!--inside a row making a div of col-md-10  -->\r\n");
      out.write("			<div class=\"col-md-10 offset-md-1\">\r\n");
      out.write("\r\n");
      out.write("				<!-- card inside the container  -->\r\n");
      out.write("				<div class=\"card paint-card mt-5 mb-5\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<!--card body  -->\r\n");
      out.write("					<div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<p class=\"text-center fs-3\">Appointment Details</p>\r\n");
      out.write("\r\n");
      out.write("						<!--  adding a table inside the card body-->\r\n");
      out.write("						<table class=\"table table-dark\">\r\n");
      out.write("							<thead>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th scope=\"col\">Name</th>\r\n");
      out.write("									<th scope=\"col\">Gender</th>\r\n");
      out.write("									<th scope=\"col\">Age</th>\r\n");
      out.write("									<th scope=\"col\">Date(App.)</th>\r\n");
      out.write("									<th scope=\"col\">email</th>\r\n");
      out.write("									<th scope=\"col\">cell No.</th>\r\n");
      out.write("									<th scope=\"col\">Disease</th>\r\n");
      out.write("									<th scope=\"col\">Address</th>\r\n");
      out.write("									<th scope=\"col\">Doctor's Name</th>\r\n");
      out.write("									<th scope=\"col\">Status</th>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</thead>\r\n");
      out.write("							<tbody>\r\n");
      out.write("\r\n");
      out.write("								<!-- using the scriptlet tag to make appointmentDao object so that we can call the getAppointment Detail method \r\n");
      out.write("							so that we can show the appointment details inside the table body  -->\r\n");
      out.write("								");

									User u = (User)session.getAttribute("userObj");

								appointmentDao aDaoo = new appointmentDao(DBConnect.getConnection());
								doctorDao dDao = new doctorDao(DBConnect.getConnection());
								List<appointment> li = aDaoo.getAppointmentDetailsByUserId(u.getId());
								for (appointment a : li) {
									doctor d = dDao.fetchDoctorDetailsbyId(a.getDoctorId());
								
      out.write("\r\n");
      out.write("								<tr>\r\n");
      out.write("\r\n");
      out.write("									<td>");
      out.print(a.getFullName() );
      out.write("</td>\r\n");
      out.write("									<td>");
      out.print(a.getGender() );
      out.write("</td>\r\n");
      out.write("									<td>");
      out.print(a.getAge() );
      out.write("</td>\r\n");
      out.write("									<td>");
      out.print(a.getAppointmentDate() );
      out.write("</td>\r\n");
      out.write("									<td>");
      out.print(a.getEmail() );
      out.write("</td>\r\n");
      out.write("									<td>");
      out.print(a.getNumber() );
      out.write("</td>\r\n");
      out.write("									<td>");
      out.print(a.getDisease() );
      out.write("</td>\r\n");
      out.write("									<td>");
      out.print(a.getFullAddres() );
      out.write("</td>\r\n");
      out.write("									<td>");
      out.print(d.getFullName() );
      out.write("</td>\r\n");
      out.write("								\r\n");
      out.write("									<td>\r\n");
      out.write("										");

								if("pending".equals(a.getStatus())){
									
      out.write(" <a href=\"#\" class=\"btn btn-sm btn-warning\">Pending</a> \r\n");
      out.write("									");
}
								else{
      out.write("\r\n");
      out.write("								");
      out.print(a.getStatus() );
      out.write("\r\n");
      out.write("							");
} 
      out.write("\r\n");
      out.write("									</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("									\r\n");
      out.write("								");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("						<!-- table ends here -->\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- including  the footer file -->\r\n");
      out.write("	");
      out.write("<!-- Remove the container if you want to extend the Footer to full width. -->\r\n");
      out.write("\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("<footer class=\"text-center text-lg-start text-dark mt-1\"\r\n");
      out.write("	style=\"background-color: #ECEFF1\">\r\n");
      out.write("	<!-- Section: Social media -->\r\n");
      out.write("	<section class=\"d-flex justify-content-between p-3 text-white\"\r\n");
      out.write("		style=\"background-color: #52b788\">\r\n");
      out.write("		<!-- Left -->\r\n");
      out.write("		<div class=\"me-5\">\r\n");
      out.write("			<div>Get connected with us on social networks:</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- Left -->\r\n");
      out.write("\r\n");
      out.write("		<!-- Right -->\r\n");
      out.write("		<div>\r\n");
      out.write("\r\n");
      out.write("			<a href=\"https://twitter.com/Sharma1809157\" class=\"text-white me-4\">\r\n");
      out.write("				<i class=\"fab fa-twitter\"></i>\r\n");
      out.write("			</a> <a href=\"https://www.linkedin.com/in/gaurav4044/\"\r\n");
      out.write("				class=\"text-white me-4\"> <i class=\"fab fa-linkedin\"></i></a> <a\r\n");
      out.write("				href=\"https://github.com/Gaurav560\" class=\"text-white me-4\"> <i\r\n");
      out.write("				class=\"fab fa-github\"></i></a>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- Right -->\r\n");
      out.write("	</section>\r\n");
      out.write("	<!-- Section: Social media -->\r\n");
      out.write("\r\n");
      out.write("	<!-- Section: Links  -->\r\n");
      out.write("	<section class=\"\">\r\n");
      out.write("		<div class=\"container text-center text-md-start mt-2\">\r\n");
      out.write("			<!-- Grid row -->\r\n");
      out.write("			<div class=\"row mt-1\">\r\n");
      out.write("				<!-- Grid column -->\r\n");
      out.write("				<div class=\"col-md-3 col-lg-4 col-xl-3 mx-auto mb-2\">\r\n");
      out.write("					<!-- Content -->\r\n");
      out.write("					<h6 class=\"text-uppercase fw-bold\">Swastik-Medi Care</h6>\r\n");
      out.write("					<hr class=\"mb-2 mt-0 d-inline-block mx-auto\"\r\n");
      out.write("						style=\"width: 170px; background-color: #7c4dff; height: 2px\" />\r\n");
      out.write("					<p>Only place where u can get all the advanced surgeries done\r\n");
      out.write("						under a single roof with higly Skilled and Experienced Doctors</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- Grid column -->\r\n");
      out.write("\r\n");
      out.write("				<!-- Grid column -->\r\n");
      out.write("				<div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto mb-1\">\r\n");
      out.write("					<!-- Links -->\r\n");
      out.write("					<h6 class=\"text-uppercase fw-bold\">Medical Procedures</h6>\r\n");
      out.write("					<hr class=\"mb-2 mt-0 d-inline-block mx-auto\"\r\n");
      out.write("						style=\"width: 90px; background-color: #d80032; height: 2px\" />\r\n");
      out.write("					<p>\r\n");
      out.write("						<a href=\"#!\" class=\"text-dark\"> Bone Marrow Transplant</a>\r\n");
      out.write("					</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<a href=\"#!\" class=\"text-dark\">Hip Arthroscopy</a>\r\n");
      out.write("					</p>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- Grid column -->\r\n");
      out.write("\r\n");
      out.write("				<!-- Grid column -->\r\n");
      out.write("				<div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto mb-1\">\r\n");
      out.write("					<!-- Links -->\r\n");
      out.write("					<h6 class=\"text-uppercase fw-bold\">Medical Procedures</h6>\r\n");
      out.write("					<hr class=\"mb-2 mt-0 d-inline-block mx-auto\"\r\n");
      out.write("						style=\"width: 90px; background-color: #7c4dff; height: 2px\" />\r\n");
      out.write("					<p>\r\n");
      out.write("						<a href=\"#!\" class=\"text-dark\">Cochlear Implant Surgery</a>\r\n");
      out.write("					</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<a href=\"#!\" class=\"text-dark\">Hand MicroSurgery</a>\r\n");
      out.write("					</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- Grid column -->\r\n");
      out.write("\r\n");
      out.write("				<!-- Grid column -->\r\n");
      out.write("				<div class=\"col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-1\">\r\n");
      out.write("					<!-- Links -->\r\n");
      out.write("					<h6 class=\"text-uppercase fw-bold\">Contact</h6>\r\n");
      out.write("					<hr class=\"mb-2 mt-0 d-inline-block mx-auto\"\r\n");
      out.write("						style=\"width: 90px; background-color: #7c4dff; height: 2px\" />\r\n");
      out.write("					<p>\r\n");
      out.write("						<i class=\"fas fa-home mr-3\"></i> Police Line Road,Gewal bigha\r\n");
      out.write("						,Gaya,Bihar\r\n");
      out.write("					</p>\r\n");
      out.write("					<p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<i class=\"fas fa-envelope mr-3\"></i>1809157@sbsstc.ac.in\r\n");
      out.write("					</p>\r\n");
      out.write("					<p>\r\n");
      out.write("						<i class=\"fas fa-phone mr-3\"></i> +91 9523849635\r\n");
      out.write("					</p>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- Grid column -->\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- Grid row -->\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	<!-- Section: Links  -->\r\n");
      out.write("\r\n");
      out.write("	<!-- Copyright -->\r\n");
      out.write("	<div class=\"text-center p-2\" style=\"background-color: #60b6f1\">\r\n");
      out.write("		Contact:© 2023 <a class=\"text-dark\" href=\"https://mdbootstrap.com/\">180957@sbsstc.ac.in</a>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- Copyright -->\r\n");
      out.write("</footer>\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("\r\n");
      out.write("<!-- End of .container -->");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /view_appointment.jsp(39,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty userObj }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("		");
          if (_jspx_meth_c_005fredirect_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return true;
          out.write('\r');
          out.write('\n');
          out.write('	');
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fredirect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:redirect
    org.apache.taglibs.standard.tag.rt.core.RedirectTag _jspx_th_c_005fredirect_005f0 = (org.apache.taglibs.standard.tag.rt.core.RedirectTag) _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl.get(org.apache.taglibs.standard.tag.rt.core.RedirectTag.class);
    boolean _jspx_th_c_005fredirect_005f0_reused = false;
    try {
      _jspx_th_c_005fredirect_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fredirect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
      // /view_appointment.jsp(40,2) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fredirect_005f0.setUrl("user_login.jsp");
      int _jspx_eval_c_005fredirect_005f0 = _jspx_th_c_005fredirect_005f0.doStartTag();
      if (_jspx_eval_c_005fredirect_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_c_005fredirect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = org.apache.jasper.runtime.JspRuntimeLibrary.startBufferedBody(_jspx_page_context, _jspx_th_c_005fredirect_005f0);
        }
        do {
          out.write("\r\n");
          out.write("\r\n");
          int evalDoAfterBody = _jspx_th_c_005fredirect_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_c_005fredirect_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_c_005fredirect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fredirect_0026_005furl.reuse(_jspx_th_c_005fredirect_005f0);
      _jspx_th_c_005fredirect_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fredirect_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fredirect_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /component/navbar.jsp(6,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty userObj}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	<nav class=\"navbar navbar-expand-lg\" style=\"background: #b1a7a6\">\r\n");
          out.write("		<div class=\"container-fluid p-2\">\r\n");
          out.write("			<a class=\"navbar-brand fw-bold\" href=\"index.jsp\"> <img\r\n");
          out.write("				src=\"img/swastik.png\" style=\"height: 25px; width: 25px; margin: 4px\">\r\n");
          out.write("				SWASTIK SANATORIUM\r\n");
          out.write("			</a>\r\n");
          out.write("			<button class=\"navbar-toggler\" type=\"button\"\r\n");
          out.write("				data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\"\r\n");
          out.write("				aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
          out.write("				aria-label=\"Toggle navigation\">\r\n");
          out.write("				<span class=\"navbar-toggler-icon\"></span>\r\n");
          out.write("			</button>\r\n");
          out.write("			<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
          out.write("				<ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
          out.write("					<li class=\"nav-item\"><a class=\"nav-link active fw-bold\"\r\n");
          out.write("						aria-current=\"page\" href=\"admin_login.jsp\"><i\r\n");
          out.write("							class=\"fa-solid fa-right-to-bracket\"></i> ADMIN</a></li>\r\n");
          out.write("\r\n");
          out.write("					<li class=\"nav-item\"><a class=\"nav-link active fw-bold\"\r\n");
          out.write("						aria-current=\"page\" href=\"doctor_login.jsp\">DOCTOR</a></li>\r\n");
          out.write("\r\n");
          out.write("					<li class=\"nav-item\"><a class=\"nav-link active fw-bold\"\r\n");
          out.write("						aria-current=\"page\" href=\"user_appointment.jsp\">APPOINTMENT</a></li>\r\n");
          out.write("\r\n");
          out.write("					<li class=\"nav-item\"><a class=\"nav-link active fw-bold\"\r\n");
          out.write("						aria-current=\"page\" href=\"user_login.jsp\">USER</a></li>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("				</ul>\r\n");
          out.write("\r\n");
          out.write("			</div>\r\n");
          out.write("		</div>\r\n");
          out.write("	</nav>\r\n");
          out.write("\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /component/navbar.jsp(45,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty userObj}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	<nav class=\"navbar navbar-expand-lg\" style=\"background: #b1a7a6\">\r\n");
          out.write("		<div class=\"container-fluid p-2\">\r\n");
          out.write("			<a class=\"navbar-brand fw-bold\" href=\"\"> <img\r\n");
          out.write("				src=\"img/swastik.png\" style=\"height: 25px; width: 25px; margin: 4px\">\r\n");
          out.write("				SWASTIK SANATORIUM\r\n");
          out.write("			</a>\r\n");
          out.write("			<button class=\"navbar-toggler\" type=\"button\"\r\n");
          out.write("				data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\"\r\n");
          out.write("				aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
          out.write("				aria-label=\"Toggle navigation\">\r\n");
          out.write("				<span class=\"navbar-toggler-icon\"></span>\r\n");
          out.write("			</button>\r\n");
          out.write("			<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
          out.write("				<ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
          out.write("\r\n");
          out.write("					<li class=\"nav-item\"><a class=\"nav-link active fw-bold\"\r\n");
          out.write("						aria-current=\"page\" href=\"user_appointment.jsp\">APPOINTMENT</a></li>\r\n");
          out.write("\r\n");
          out.write("					<li class=\"nav-item\"><a class=\"nav-link active fw-bold\"\r\n");
          out.write("						aria-current=\"page\" href=\"view_appointment.jsp\">VIEW\r\n");
          out.write("							APPOINTMENT</a></li>\r\n");
          out.write("</ul>\r\n");
          out.write("\r\n");
          out.write("					<div class=\"btn-group\">\r\n");
          out.write("						<button type=\"button\" class=\"btn btn-warning dropdown-toggle\"\r\n");
          out.write("							data-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
          out.write("							<i class=\"fa-solid fa-user\"></i> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userObj.fullName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("						</button>\r\n");
          out.write("						<ul class=\"dropdown-menu\">\r\n");
          out.write("							<li><a class=\"dropdown-item\" href=\"changePassword.jsp\">Change\r\n");
          out.write("									Password</a></li>\r\n");
          out.write("							<li><a class=\"dropdown-item\" href=\"userLogout\">Logout</a></li>\r\n");
          out.write("\r\n");
          out.write("						</ul>\r\n");
          out.write("					</div>\r\n");
          out.write("			</div>\r\n");
          out.write("			</div>\r\n");
          out.write("	</nav>\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }
}
