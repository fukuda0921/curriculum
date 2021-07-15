package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bean.EmployeeBean;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');

 // 問① getAttributeに適切な引数をセットして、EmployeeControllerから渡されたBeanを取得する。
 EmployeeBean employeeBean = (EmployeeBean) request.getAttribute("EmployeeBean");

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>検索結果</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" <div align=\"center\">\n");
      out.write(" <!-- 検索が成功した場合の表示 -->\n");
      out.write(" ");

 if (employeeBean != null) {
 
      out.write("\n");
      out.write(" <table border=\"1\">\n");
      out.write(" <tr>\n");
      out.write(" <th>社員名</th>\n");
      out.write(" <td>");
      out.print(employeeBean.getName());
      out.write("</td>\n");
      out.write(" </tr>\n");
      out.write(" <tr>\n");
      out.write(" <th>コメント</th>\n");
      out.write(" <td>");
      out.print(employeeBean.getComment());
      out.write("</td>\n");
      out.write(" </tr>\n");
      out.write(" <tr>\n");
      out.write(" <th>ログインタイム</th>\n");
      out.write(" <td>");
      out.print(employeeBean.getLogin_Time());
      out.write("</td>\n");
      out.write(" </tr>\n");
      out.write(" </table>\n");
      out.write("\n");
      out.write(" <!-- 問② それ以外の表示（エラーの場合）-->\n");
      out.write(" ");
 } else { 
      out.write("\n");
      out.write(" IDもしくはパスワードが間違ってます\n");
      out.write(" ");
 } 
      out.write("\n");
      out.write(" </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
