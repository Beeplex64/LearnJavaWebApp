package Learn02Main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Learn02Class
 */
@WebServlet("/Learn02Class")
public class Learn02Class extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Learn02Class() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //文字コードの設定
        response.setContentType("text/html; charset=UTF-8");

        //クライアントに送るHTML
        PrintWriter out = response.getWriter();
        out.println("<html>");

        //ヘッダー
        out.println("<head>");
        out.println("<title>");
        out.println("Test");
        out.println("</title>");
        out.println("</head>");

        //ボディー
        out.println("<body>");

        out.println("<h1>");
        out.println("動的なWebページ");
        out.println("</h1>");

        out.println("<p>");
        out.println("これはTomcatによって実行されたサーブレットが生成したWebコンテンツです。");
        out.println("</p>");

        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    
    
//作成時のコード
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: YAY").append(request.getContextPath());
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
