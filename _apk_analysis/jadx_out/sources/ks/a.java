package ks;

import com.ironsource.Z7;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.logging.Logger;
import ls.i;
import mq.p;
import org.eclipse.jetty.servlet.ServletHolder;

/* JADX INFO: compiled from: JettyServletContainer.java */
/* JADX INFO: loaded from: classes12.dex */
public class a implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f73568b = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f73569c = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f73570a;

    /* JADX INFO: renamed from: ks.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JettyServletContainer.java */
    public class C0867a extends ar.a {
        public C0867a(ExecutorService executorService) {
            super(executorService);
        }

        @Override // ar.a, uq.a
        public void e0() throws Exception {
        }
    }

    public a() {
        f();
    }

    @Override // ls.i
    public synchronized void a(ExecutorService executorService) {
        a aVar = f73569c;
        if (aVar.f73570a.J0() == null) {
            aVar.f73570a.U0(new C0867a(executorService));
        }
    }

    @Override // ls.i
    public synchronized int b(String str, int i10) throws IOException {
        nq.a aVar;
        aVar = new nq.a();
        aVar.T0(str);
        aVar.U0(i10);
        aVar.open();
        this.f73570a.C0(aVar);
        if (this.f73570a.isStarted()) {
            try {
                aVar.start();
            } catch (Exception e10) {
                f73568b.severe("Couldn't start connector: " + aVar + Z7.f30794r + e10);
                throw new RuntimeException(e10);
            }
        }
        return aVar.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        if (r3.isStarted() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if (r3.D() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r3.stop();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        r5.f73570a.Q0(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r0.length != 1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        ks.a.f73568b.info("No more connectors, stopping Jetty server");
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        ks.a.f73568b.severe("Couldn't stop connector: " + r3 + com.ironsource.Z7.f30794r + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        throw new java.lang.RuntimeException(r6);
     */
    @Override // ls.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void c(java.lang.String r6, int r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            mq.p r0 = r5.f73570a     // Catch: java.lang.Throwable -> L6a
            mq.f[] r0 = r0.D0()     // Catch: java.lang.Throwable -> L6a
            int r1 = r0.length     // Catch: java.lang.Throwable -> L6a
            r2 = 0
        L9:
            if (r2 >= r1) goto L68
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L6a
            java.lang.String r4 = r3.H()     // Catch: java.lang.Throwable -> L6a
            boolean r4 = r4.equals(r6)     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L65
            int r4 = r3.c()     // Catch: java.lang.Throwable -> L6a
            if (r4 != r7) goto L65
            boolean r6 = r3.isStarted()     // Catch: java.lang.Throwable -> L6a
            if (r6 != 0) goto L29
            boolean r6 = r3.D()     // Catch: java.lang.Throwable -> L6a
            if (r6 == 0) goto L2c
        L29:
            r3.stop()     // Catch: java.lang.Exception -> L40 java.lang.Throwable -> L6a
        L2c:
            mq.p r6 = r5.f73570a     // Catch: java.lang.Throwable -> L6a
            r6.Q0(r3)     // Catch: java.lang.Throwable -> L6a
            int r6 = r0.length     // Catch: java.lang.Throwable -> L6a
            r7 = 1
            if (r6 != r7) goto L68
            java.util.logging.Logger r6 = ks.a.f73568b     // Catch: java.lang.Throwable -> L6a
            java.lang.String r7 = "No more connectors, stopping Jetty server"
            r6.info(r7)     // Catch: java.lang.Throwable -> L6a
            r5.g()     // Catch: java.lang.Throwable -> L6a
            goto L68
        L40:
            r6 = move-exception
            java.util.logging.Logger r7 = ks.a.f73568b     // Catch: java.lang.Throwable -> L6a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r0.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = "Couldn't stop connector: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L6a
            r0.append(r3)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = " "
            r0.append(r1)     // Catch: java.lang.Throwable -> L6a
            r0.append(r6)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6a
            r7.severe(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L6a
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L6a
            throw r7     // Catch: java.lang.Throwable -> L6a
        L65:
            int r2 = r2 + 1
            goto L9
        L68:
            monitor-exit(r5)
            return
        L6a:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ks.a.c(java.lang.String, int):void");
    }

    @Override // ls.i
    public synchronized void d() {
        if (!this.f73570a.isStarted() && !this.f73570a.D()) {
            f73568b.info("Starting Jetty server... ");
            try {
                this.f73570a.start();
            } catch (Exception e10) {
                f73568b.severe("Couldn't start Jetty server: " + e10);
                throw new RuntimeException(e10);
            }
        }
    }

    @Override // ls.i
    public synchronized void e(String str, zm.i iVar) {
        if (this.f73570a.A0() != null) {
            return;
        }
        f73568b.info("Registering UPnP servlet under context path: " + str);
        org.eclipse.jetty.servlet.b bVar = new org.eclipse.jetty.servlet.b(0);
        if (str != null && str.length() > 0) {
            bVar.h1(str);
        }
        bVar.m1(new ServletHolder(iVar), "/*");
        this.f73570a.B0(bVar);
    }

    public void f() {
        p pVar = new p();
        this.f73570a = pVar;
        pVar.S0(1000);
    }

    public synchronized void g() {
        if (!this.f73570a.isStopped() && !this.f73570a.q()) {
            f73568b.info("Stopping Jetty server...");
            try {
                try {
                    this.f73570a.stop();
                } catch (Exception e10) {
                    f73568b.severe("Couldn't stop Jetty server: " + e10);
                    throw new RuntimeException(e10);
                }
            } finally {
                f();
            }
        }
    }
}
