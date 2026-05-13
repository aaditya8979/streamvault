package javax.servlet;

import java.io.IOException;
import java.io.Serializable;
import java.util.Enumeration;
import java.util.ResourceBundle;
import zm.i;
import zm.j;
import zm.k;
import zm.p;
import zm.t;

/* JADX INFO: loaded from: classes10.dex */
public abstract class GenericServlet implements i, j, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ResourceBundle f72370c = ResourceBundle.getBundle("javax.servlet.LocalStrings");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient j f72371b;

    @Override // zm.i
    public void destroy() {
    }

    @Override // zm.j
    public String getInitParameter(String str) {
        j servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getInitParameter(str);
        }
        throw new IllegalStateException(f72370c.getString("err.servlet_config_not_initialized"));
    }

    @Override // zm.j
    public Enumeration<String> getInitParameterNames() {
        j servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getInitParameterNames();
        }
        throw new IllegalStateException(f72370c.getString("err.servlet_config_not_initialized"));
    }

    public j getServletConfig() {
        return this.f72371b;
    }

    @Override // zm.j
    public k getServletContext() {
        j servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getServletContext();
        }
        throw new IllegalStateException(f72370c.getString("err.servlet_config_not_initialized"));
    }

    public String getServletInfo() {
        return "";
    }

    @Override // zm.j
    public String getServletName() {
        j servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getServletName();
        }
        throw new IllegalStateException(f72370c.getString("err.servlet_config_not_initialized"));
    }

    public void init() throws ServletException {
    }

    @Override // zm.i
    public void init(j jVar) throws ServletException {
        this.f72371b = jVar;
        init();
    }

    public void log(String str) {
        getServletContext().g(getServletName() + ": " + str);
    }

    public void log(String str, Throwable th2) {
        getServletContext().f(getServletName() + ": " + str, th2);
    }

    @Override // zm.i
    public abstract void service(p pVar, t tVar) throws ServletException, IOException;
}
