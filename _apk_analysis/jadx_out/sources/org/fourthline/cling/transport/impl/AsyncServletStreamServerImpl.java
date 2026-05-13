package org.fourthline.cling.transport.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import ls.l;
import org.fourthline.cling.transport.spi.InitializationException;
import zm.c;
import zm.i;

/* JADX INFO: loaded from: classes6.dex */
public class AsyncServletStreamServerImpl implements l<js.a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f76898f = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final js.a f76899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f76900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f76901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f76902e = 0;

    public class a implements lr.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public an.a f76907a;

        public a(an.a aVar) {
            this.f76907a = aVar;
        }

        @Override // lr.a
        public InetAddress a() {
            try {
                return InetAddress.getByName(b().f());
            } catch (UnknownHostException e10) {
                throw new RuntimeException(e10);
            }
        }

        public an.a b() {
            return this.f76907a;
        }
    }

    public AsyncServletStreamServerImpl(js.a aVar) {
        this.f76899b = aVar;
    }

    public static /* synthetic */ int a(AsyncServletStreamServerImpl asyncServletStreamServerImpl) {
        int i10 = asyncServletStreamServerImpl.f76902e;
        asyncServletStreamServerImpl.f76902e = i10 + 1;
        return i10;
    }

    @Override // ls.l
    public synchronized void F(InetAddress inetAddress, is.a aVar) throws InitializationException {
        try {
            Logger logger = f76898f;
            Level level = Level.FINE;
            if (logger.isLoggable(level)) {
                logger.fine("Setting executor service on servlet container adapter");
            }
            d().c().a(aVar.getConfiguration().u());
            if (logger.isLoggable(level)) {
                logger.fine("Adding connector: " + inetAddress + StringUtils.PROCESS_POSTFIX_DELIMITER + d().b());
            }
            this.f76901d = inetAddress.getHostAddress();
            this.f76900c = d().c().b(this.f76901d, d().b());
            d().c().e(aVar.getConfiguration().getNamespace().b().getPath(), c(aVar));
        } catch (Exception e10) {
            throw new InitializationException("Could not initialize " + getClass().getSimpleName() + ": " + e10.toString(), e10);
        }
    }

    public i c(final is.a aVar) {
        return new HttpServlet() { // from class: org.fourthline.cling.transport.impl.AsyncServletStreamServerImpl.1

            /* JADX INFO: renamed from: org.fourthline.cling.transport.impl.AsyncServletStreamServerImpl$1$a */
            public class a implements c {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f76903b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f76904c;

                public a(long j10, int i10) {
                    this.f76903b = j10;
                    this.f76904c = i10;
                }

                @Override // zm.c
                public void f(zm.b bVar) throws IOException {
                    if (AsyncServletStreamServerImpl.f76898f.isLoggable(Level.FINE)) {
                        AsyncServletStreamServerImpl.f76898f.fine(String.format("AsyncListener.onStartAsync(): id: %3d, request: %s", Integer.valueOf(this.f76904c), bVar.a()));
                    }
                }

                @Override // zm.c
                public void i(zm.b bVar) throws IOException {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f76903b;
                    if (AsyncServletStreamServerImpl.f76898f.isLoggable(Level.FINE)) {
                        AsyncServletStreamServerImpl.f76898f.fine(String.format("AsyncListener.onComplete(): id: %3d, duration: %,4d, response: %s", Integer.valueOf(this.f76904c), Long.valueOf(jCurrentTimeMillis), bVar.b()));
                    }
                }

                @Override // zm.c
                public void p(zm.b bVar) throws IOException {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f76903b;
                    if (AsyncServletStreamServerImpl.f76898f.isLoggable(Level.FINE)) {
                        AsyncServletStreamServerImpl.f76898f.fine(String.format("AsyncListener.onTimeout(): id: %3d, duration: %,4d, request: %s", Integer.valueOf(this.f76904c), Long.valueOf(jCurrentTimeMillis), bVar.a()));
                    }
                }

                @Override // zm.c
                public void y(zm.b bVar) throws IOException {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f76903b;
                    if (AsyncServletStreamServerImpl.f76898f.isLoggable(Level.FINE)) {
                        AsyncServletStreamServerImpl.f76898f.fine(String.format("AsyncListener.onError(): id: %3d, duration: %,4d, response: %s", Integer.valueOf(this.f76904c), Long.valueOf(jCurrentTimeMillis), bVar.b()));
                    }
                }
            }

            /* JADX INFO: renamed from: org.fourthline.cling.transport.impl.AsyncServletStreamServerImpl$1$b */
            public class b extends js.b {
                public b(vr.a aVar, zm.a aVar2, an.a aVar3) {
                    super(aVar, aVar2, aVar3);
                }

                @Override // js.b
                public lr.a K() {
                    return AsyncServletStreamServerImpl.this.new a(L());
                }
            }

            @Override // javax.servlet.http.HttpServlet
            public void service(an.a aVar2, an.c cVar) throws ServletException, IOException {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int iA = AsyncServletStreamServerImpl.a(AsyncServletStreamServerImpl.this);
                if (AsyncServletStreamServerImpl.f76898f.isLoggable(Level.FINE)) {
                    AsyncServletStreamServerImpl.f76898f.fine(String.format("HttpServlet.service(): id: %3d, request URI: %s", Integer.valueOf(iA), aVar2.v()));
                }
                zm.a aVarQ = aVar2.q();
                aVarQ.a(AsyncServletStreamServerImpl.this.d().a() * 1000);
                aVarQ.b(new a(jCurrentTimeMillis, iA));
                aVar.i(new b(aVar.a(), aVarQ, aVar2));
            }
        };
    }

    public js.a d() {
        return this.f76899b;
    }

    @Override // java.lang.Runnable
    public void run() {
        d().c().d();
    }

    @Override // ls.l
    public synchronized void stop() {
        d().c().c(this.f76901d, this.f76900c);
    }

    @Override // ls.l
    public synchronized int t() {
        return this.f76900c;
    }
}
