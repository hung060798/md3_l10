import CustomerServlet.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/show")
public class ShowCustomer  extends HttpServlet{
    ArrayList<Customer> list  = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        list.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội","anh1.jpg"));
        list.add(new Customer("Nguyễn Văn Nam","1983-08-21","Bắc Giang","anh2.jpg"));
        list.add(new Customer("Nguyễn Thái Hòa","1983-08-22","Nam Định","anh3.jpg"));
        list.add(new Customer("Trần Đăng Khoa","1983-08-17","Hà Tây","anh1.jpg"));
        list.add(new Customer("Nguyễn Đình Thi","1983-08-19","Hà Nội","anh2.jpg"));


        req.setAttribute("listKh", list);
        RequestDispatcher dispatcher;
        dispatcher = req.getRequestDispatcher("show.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String date = req.getParameter("date");
        String diaChi = req.getParameter("diaChi");
        String img = req.getParameter("diaChi");

        req.setAttribute("listKh", list);
        RequestDispatcher dispatcher;
        dispatcher = req.getRequestDispatcher("show.jsp");
        dispatcher.forward(req,resp);
    }
}
