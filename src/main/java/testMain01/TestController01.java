package testMain01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestController01")
public class TestController01 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public TestController01() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //文字コード設定
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        //JSPで使用するパラメータの設定
        if(request.getParameter("inputText") != null) {
            request.setAttribute("inputText", request.getParameter("inputText"));
        }

        //ページ移動
        ServletContext context = this.getServletContext();
        RequestDispatcher dispatcher = context.getRequestDispatcher("/TestView.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //文字コード設定
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        //JSPで使用するパラメータの設定
        if(request.getParameter("inputText") != null) {
            request.setAttribute("inputText", request.getParameter("inputText"));
        }

        //ページ移動
        ServletContext context = this.getServletContext();
        RequestDispatcher dispatcher = context.getRequestDispatcher("/TestView.jsp");
        dispatcher.forward(request, response);
    }

}
