package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Fifth_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>laptops ordered by a particular customer</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<h3 align=\"center\">\r\n");
      out.write("Find all laptops ordered by a particular customer in a particular year.\r\n");
      out.write("</h3>\r\n");
      out.write("<h3 align=\"center\">\r\n");
      out.write("</h3>\r\n");
      out.write("<form action=\"Fifth_action.jsp\">\r\n");
      out.write("<div align=\"center\">\r\n");
      out.write("<p>&nbsp;</p>\r\n");
      out.write("<table cellspacing=\"2\" cellpadding=\"3\" border=\"1\" width=\"369\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"38%\">\r\n");
      out.write("<strong>Customer Name:</strong>\r\n");
      out.write("</td>\r\n");
      out.write("<td width=\"62%\">\r\n");
      out.write("<input type=\"text\" name=\"custname\"/>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("<td width=\"38%\">\r\n");
      out.write("<strong>Year:</strong>\r\n");
      out.write("</td>\r\n");
      out.write("<td width=\"62%\">\r\n");
      out.write("<input type=\"text\" name=\"year\"/>\r\n");
      out.write("</td>\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table cellspacing=\"3\" cellpadding=\"2\" border=\"0\">\r\n");
      out.write("<tr>\r\n");
      out.write("<td>\r\n");
      out.write("<input type=\"submit\" value=\"Enter Details\"/>\r\n");
      out.write("</td>\r\n");
      out.write("</tr></table>\r\n");
      out.write("<p>\r\n");
      out.write("</p>\r\n");
      out.write("</div>\r\n");
      out.write("</form>\r\n");
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
