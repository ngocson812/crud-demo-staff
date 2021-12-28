package Controller;

import Models.Staff;
import Service.StaffService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/staff")
public class StaffServlet extends HttpServlet {
    StaffService staffService = new StaffService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                RequestDispatcher requestDispatcher = req.getRequestDispatcher("/createstaff.jsp");
                requestDispatcher.forward(req, resp);
                break;
            case "edit":
                int indexedit = Integer.parseInt(req.getParameter("index"));
                req.setAttribute("staff", staffService.staffList.get(indexedit));
                req.getRequestDispatcher("/editstaff.jsp").forward(req, resp);
                break;
            case "delete":
                int index = Integer.parseInt(req.getParameter("index"));
                staffService.delete(index);
                req.setAttribute("staffList", StaffService.staffList);
                req.getRequestDispatcher("/showstaff.jsp").forward(req, resp);
                break;
            default:
                req.setAttribute("staffList", StaffService.staffList);
                req.getRequestDispatcher("/showstaff.jsp").forward(req, resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                int id = Integer.parseInt(req.getParameter("id"));
                String name = req.getParameter("name");
                int age = Integer.parseInt(req.getParameter("age"));
                String img = req.getParameter("img");

               staffService.save(new Staff(id,name,age,img));
                resp.sendRedirect("/staff");
                break;
            case "edit":
                int idedit = Integer.parseInt(req.getParameter("id"));
                String nameedit = req.getParameter("name");
                int ageedit = Integer.parseInt(req.getParameter("age"));
                String imgedit = req.getParameter("img");

                Staff staffedit = new Staff(idedit, nameedit, ageedit, imgedit);

                staffService.update(staffService.findById(idedit), staffedit);

                resp.sendRedirect("/staff");
                break;
            default:
                req.setAttribute("staffList", StaffService.staffList);
                req.getRequestDispatcher("/showstaff.jsp").forward(req, resp);
                break;
        }
    }
    }
