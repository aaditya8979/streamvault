package z0;

import android.content.Context;
import android.net.Uri;
import com.danikula.videocache.ProxyCacheException;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: HttpProxyCacheServer.java */
/* JADX INFO: loaded from: classes10.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f98138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f98139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, g> f98140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ServerSocket f98141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f98142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Thread f98143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z0.c f98144g;

    /* JADX INFO: compiled from: HttpProxyCacheServer.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public File f98145a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c1.b f98148d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a1.a f98147c = new a1.g(536870912);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public a1.c f98146b = new a1.f();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public b1.b f98149e = new b1.a();

        public b(Context context) {
            this.f98148d = c1.c.a(context);
            this.f98145a = p.d(context);
        }

        public f a() {
            return new f(b());
        }

        public final z0.c b() {
            return new z0.c(this.f98145a, this.f98146b, this.f98147c, this.f98148d, this.f98149e);
        }

        public b c(long j10) {
            this.f98147c = new a1.g(j10);
            return this;
        }
    }

    /* JADX INFO: compiled from: HttpProxyCacheServer.java */
    public final class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Socket f98150b;

        public c(Socket socket) {
            this.f98150b = socket;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.o(this.f98150b);
        }
    }

    /* JADX INFO: compiled from: HttpProxyCacheServer.java */
    public final class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CountDownLatch f98152b;

        public d(CountDownLatch countDownLatch) {
            this.f98152b = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f98152b.countDown();
            f.this.r();
        }
    }

    public f(z0.c cVar) {
        this.f98138a = new Object();
        this.f98139b = Executors.newFixedThreadPool(8);
        this.f98140c = new ConcurrentHashMap();
        this.f98144g = (z0.c) k.c(cVar);
        try {
            ServerSocket serverSocket = new ServerSocket(0, 8, InetAddress.getByName("127.0.0.1"));
            this.f98141d = serverSocket;
            int localPort = serverSocket.getLocalPort();
            this.f98142e = localPort;
            i.a("127.0.0.1", localPort);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Thread thread = new Thread(new d(countDownLatch));
            this.f98143f = thread;
            thread.start();
            countDownLatch.await();
        } catch (IOException | InterruptedException e10) {
            this.f98139b.shutdown();
            throw new IllegalStateException("Error starting local proxy server", e10);
        }
    }

    public final String c(String str) {
        return String.format(Locale.US, "http://%s:%d/%s", "127.0.0.1", Integer.valueOf(this.f98142e), m.f(str));
    }

    public final void d(Socket socket) {
        try {
            if (socket.isClosed()) {
                return;
            }
            socket.close();
        } catch (IOException e10) {
            n(new ProxyCacheException("Error closing socket", e10));
        }
    }

    public final void e(Socket socket) {
        try {
            if (socket.isInputShutdown()) {
                return;
            }
            socket.shutdownInput();
        } catch (SocketException unused) {
            j.a("Releasing input stream… Socket is closed by client.");
        } catch (IOException e10) {
            n(new ProxyCacheException("Error closing socket input stream", e10));
        }
    }

    public final void f(Socket socket) {
        try {
            if (socket.isOutputShutdown()) {
                return;
            }
            socket.shutdownOutput();
        } catch (IOException unused) {
            j.d("Failed to close socket on proxy side: {}. It seems client have already closed connection.");
        }
    }

    public File g(String str) {
        z0.c cVar = this.f98144g;
        return new File(cVar.f98125a, cVar.f98126b.a(str));
    }

    public File h() {
        return this.f98144g.f98125a;
    }

    public final g i(String str) throws ProxyCacheException {
        g gVar;
        synchronized (this.f98138a) {
            gVar = this.f98140c.get(str);
            if (gVar == null) {
                gVar = new g(str, this.f98144g);
                this.f98140c.put(str, gVar);
            }
        }
        return gVar;
    }

    public final int j() {
        int iB;
        synchronized (this.f98138a) {
            iB = 0;
            Iterator<g> it = this.f98140c.values().iterator();
            while (it.hasNext()) {
                iB += it.next().b();
            }
        }
        return iB;
    }

    public String k(String str) {
        return l(str, true);
    }

    public String l(String str, boolean z10) {
        if (!z10 || !g(str).exists()) {
            return c(str);
        }
        File fileG = g(str);
        q(fileG);
        return Uri.fromFile(fileG).toString();
    }

    public File m(String str) {
        return new File(this.f98144g.f98125a, this.f98144g.f98126b.a(str) + ".download");
    }

    public final void n(Throwable th2) {
        j.b("HttpProxyCacheServer error");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0, types: [z0.f] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.net.Socket] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.net.Socket] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void o(Socket socket) {
        ?? sb2;
        ?? J = "Opened connections: ";
        try {
            try {
                z0.d dVarC = z0.d.c(socket.getInputStream());
                j.a("Request to cache proxy:" + dVarC);
                i(m.e(dVarC.f98132a)).d(dVarC, socket);
                p(socket);
                sb2 = new StringBuilder();
            } catch (ProxyCacheException e10) {
                e = e10;
                n(new ProxyCacheException("Error processing request", e));
                p(socket);
                sb2 = new StringBuilder();
            } catch (SocketException unused) {
                j.a("Closing socket… Socket is closed by client.");
                p(socket);
                sb2 = new StringBuilder();
            } catch (IOException e11) {
                e = e11;
                n(new ProxyCacheException("Error processing request", e));
                p(socket);
                sb2 = new StringBuilder();
            }
            sb2.append("Opened connections: ");
            J = j();
            sb2.append(J);
            socket = sb2.toString();
            j.a(socket);
        } catch (Throwable th2) {
            p(socket);
            ?? sb3 = new StringBuilder();
            sb3.append(J);
            sb3.append(j());
            j.a(sb3.toString());
            throw th2;
        }
    }

    public final void p(Socket socket) {
        e(socket);
        f(socket);
        d(socket);
    }

    public final void q(File file) {
        try {
            this.f98144g.f98127c.a(file);
        } catch (IOException unused) {
            j.b("Error touching file " + file);
        }
    }

    public final void r() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Socket socketAccept = this.f98141d.accept();
                j.a("Accept new socket " + socketAccept);
                this.f98139b.submit(new c(socketAccept));
            } catch (IOException e10) {
                n(new ProxyCacheException("Error during waiting connection", e10));
                return;
            }
        }
    }
}
