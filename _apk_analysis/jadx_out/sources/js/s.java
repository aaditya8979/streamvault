package js;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.logging.Logger;
import org.fourthline.cling.transport.spi.InitializationException;

/* JADX INFO: compiled from: StreamServerImpl.java */
/* JADX INFO: loaded from: classes11.dex */
public class s implements ls.l<r> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Logger f72629d = Logger.getLogger(ls.l.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f72630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HttpServer f72631c;

    /* JADX INFO: compiled from: StreamServerImpl.java */
    public class a implements HttpHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final is.a f72632a;

        public a(is.a aVar) {
            this.f72632a = aVar;
        }
    }

    public s(r rVar) {
        this.f72630b = rVar;
    }

    @Override // ls.l
    public synchronized void F(InetAddress inetAddress, is.a aVar) throws InitializationException {
        try {
            HttpServer httpServerCreate = HttpServer.create(new InetSocketAddress(inetAddress, this.f72630b.a()), this.f72630b.b());
            this.f72631c = httpServerCreate;
            httpServerCreate.createContext("/", new a(aVar));
            f72629d.info("Created server (for receiving TCP streams) on: " + this.f72631c.getAddress());
        } catch (Exception e10) {
            throw new InitializationException("Could not initialize " + getClass().getSimpleName() + ": " + e10.toString(), e10);
        }
    }

    @Override // java.lang.Runnable
    public synchronized void run() {
        f72629d.fine("Starting StreamServer...");
        this.f72631c.start();
    }

    @Override // ls.l
    public synchronized void stop() {
        f72629d.fine("Stopping StreamServer...");
        HttpServer httpServer = this.f72631c;
        if (httpServer != null) {
            httpServer.stop(1);
        }
    }

    @Override // ls.l
    public synchronized int t() {
        return this.f72631c.getAddress().getPort();
    }
}
