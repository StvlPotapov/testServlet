package project;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import project.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import project.repositories.UserRepository;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configurable
@ComponentScan("project")
public class MainServlet extends HttpServlet {

    @Autowired
    UserRepository repository;  //тестовая строка

    //  UserService userService;


  /*  @Resource
    @PersistenceContext
    private EntityManager entityManager;
*/
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        // SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
                config.getServletContext());

    }

    @Override

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("---TEST---");
        System.out.println(req.getPathInfo());
        System.out.println(req.getMethod());
        System.out.println(req.getQueryString());
        System.out.println(req.getQueryString());
        System.out.println(req.getContextPath());
        System.out.println(req.getRequestURI());

        User user = new User("12", "34", new Date(), "234567");
        repository.save(user);
        System.out.println(repository.count());
        //System.out.println(entityManager);



       /* userService.findAll();
        System.out.println(userService.toString());*/

    }

  /*  @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);

        *//*PrintWriter out = resp.getWriter();
        out.print("<h1>hello world </h1>");
        out.print(rep.findUserByLastName("sdfghj"));  //еще одна тестовая строка *//*
     *//* System.out.println(req.getPathInfo());
        System.out.println(req.getMethod());
        System.out.println(req.getQueryString());
        System.out.println(req.getQueryString());
        System.out.println(entityManager);
*//*
      //  repository.findAll();

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);

    }*/
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
