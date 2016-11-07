package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Home Page</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<H2>\r\n");
      out.write("Menu: <br>\r\n");
      out.write("<a href =One.jsp>1. Insert a microchip manufacturer.</a> <br>\r\n");
      out.write("<a href =Two.jsp>2. Insert a laptop built by a particular microchip manufacturer.</a><br>\r\n");
      out.write("<a href =Three.jsp>3. Insert a customer who ordered a particular computer.</a><br>\r\n");
      out.write("<a href =Four.jsp>4. Give technical support to a computer ordered by a particular customer.</a><br>\r\n");
      out.write("<a href =Fifth.jsp>5. Find all laptops ordered by a particular customer in a particular year.</a><br>\r\n");
      out.write("<a href =Six.jsp>6. List all the information of the customer(s) who have technical support for a computer using the microchip manufactured by a particular manufacturer.</a><br>\r\n");
      out.write("<a href =Seven.jsp>7. List the names of all customers who ordered a laptop running a particular operating system.</a><br>\r\n");
      out.write("<a href =Eight.jsp>8. Find the names of all customers who have bought a desktop that costs more than a particular price.</a><br>\r\n");
      out.write("<a href =Nine.jsp>9. Display all the software a particular laptop has.</a><br>\r\n");
      out.write("<a href =Ten.jsp>10. Delete all customers who have not made any order since a particular year.</a><br>\r\n");
      out.write("</H2>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
