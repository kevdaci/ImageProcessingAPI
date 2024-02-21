import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.*;
import servlets.ImageServlet.ImageServlet;

@Grab(group='org.mortbay.jetty', module='jetty-embedded', version='6.1.14')
class Main {

    public static void main(String[] args) {

       def jettyServer = new Server(9090);
       def context = new Context(jettyServer, '/', Context.SESSIONS);
       context.resourceBase = '.';
       context.addServlet(ImageServlet, '/image')
       jettyServer.start();
       

    }

}