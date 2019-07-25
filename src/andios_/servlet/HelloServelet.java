package andios_.servlet;

import andios_.javabean.Andios;
import andios_.javabean.Person;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServelet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Andios andios=new Andios();

        andios.setTeaXv(new Person("黑猫警长",3,2));
        andios.setStu(new Person("白骨精",1,40));

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
