package mq;

import com.ironsource.C3978d4;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicLong;
import org.eclipse.jetty.io.Buffers;
import org.eclipse.jetty.io.EofException;

/* JADX INFO: compiled from: AbstractConnector.java */
/* JADX INFO: loaded from: classes12.dex */
public abstract class a extends uq.b implements gq.d, f {
    public static final vq.c S = vq.b.a(a.class);
    public boolean A;
    public String B;
    public String G;
    public String H;
    public transient Thread[] M;
    public final gq.e R;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f74847n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p f74848o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ar.d f74849p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f74850q;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f74859z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f74851r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f74852s = "https";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f74853t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f74854u = "https";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f74855v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f74856w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f74857x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f74858y = 0;
    public String C = "X-Forwarded-Host";
    public String D = "X-Forwarded-Server";
    public String E = "X-Forwarded-For";
    public String F = "X-Forwarded-Proto";
    public boolean I = true;
    public int J = C3978d4.b.f31230c;
    public int K = -1;
    public int L = -1;
    public final AtomicLong N = new AtomicLong(-1);
    public final zq.a O = new zq.a();
    public final zq.b P = new zq.b();
    public final zq.b Q = new zq.b();

    /* JADX INFO: renamed from: mq.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractConnector.java */
    public class RunnableC0889a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f74860b;

        public RunnableC0889a(int i10) {
            this.f74860b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread threadCurrentThread = Thread.currentThread();
            synchronized (a.this) {
                if (a.this.M == null) {
                    return;
                }
                a.this.M[this.f74860b] = threadCurrentThread;
                String name = a.this.M[this.f74860b].getName();
                threadCurrentThread.setName(name + " Acceptor" + this.f74860b + Z7.f30794r + a.this);
                int priority = threadCurrentThread.getPriority();
                try {
                    threadCurrentThread.setPriority(priority - a.this.f74858y);
                    while (a.this.isRunning() && a.this.getConnection() != null) {
                        try {
                            try {
                                a.this.x0(this.f74860b);
                            } catch (IOException e10) {
                                a.S.g(e10);
                            } catch (Throwable th2) {
                                a.S.e(th2);
                            }
                        } catch (InterruptedException e11) {
                            a.S.g(e11);
                        } catch (EofException e12) {
                            a.S.g(e12);
                        }
                    }
                    threadCurrentThread.setPriority(priority);
                    threadCurrentThread.setName(name);
                    synchronized (a.this) {
                        if (a.this.M != null) {
                            a.this.M[this.f74860b] = null;
                        }
                    }
                } catch (Throwable th3) {
                    threadCurrentThread.setPriority(priority);
                    threadCurrentThread.setName(name);
                    synchronized (a.this) {
                        if (a.this.M != null) {
                            a.this.M[this.f74860b] = null;
                        }
                        throw th3;
                    }
                }
            }
        }
    }

    public a() {
        gq.e eVar = new gq.e();
        this.R = eVar;
        m0(eVar);
    }

    public void B0(hq.k kVar, n nVar) throws IOException {
        String strX;
        String strX2;
        org.eclipse.jetty.http.a aVarY = nVar.D().y();
        if (H0() != null && (strX2 = aVarY.x(H0())) != null) {
            nVar.a("javax.servlet.request.cipher_suite", strX2);
        }
        if (M0() != null && (strX = aVarY.x(M0())) != null) {
            nVar.a("javax.servlet.request.ssl_session_id", strX);
            nVar.y0("https");
        }
        String strN0 = N0(aVarY, J0());
        String strN02 = N0(aVarY, L0());
        String strN03 = N0(aVarY, I0());
        String strN04 = N0(aVarY, K0());
        String str = this.B;
        InetAddress byName = null;
        if (str != null) {
            aVarY.C(gq.i.f62811e, str);
            nVar.z0(null);
            nVar.A0(-1);
            nVar.s();
        } else if (strN0 != null) {
            aVarY.C(gq.i.f62811e, strN0);
            nVar.z0(null);
            nVar.A0(-1);
            nVar.s();
        } else if (strN02 != null) {
            nVar.z0(strN02);
        }
        if (strN03 != null) {
            nVar.t0(strN03);
            if (this.f74859z) {
                try {
                    byName = InetAddress.getByName(strN03);
                } catch (UnknownHostException e10) {
                    S.g(e10);
                }
            }
            if (byName != null) {
                strN03 = byName.getHostName();
            }
            nVar.u0(strN03);
        }
        if (strN04 != null) {
            nVar.y0(strN04);
        }
    }

    @Override // mq.f
    public boolean C(n nVar) {
        return this.A && nVar.O().equalsIgnoreCase("https");
    }

    public void C0(Socket socket) throws IOException {
        try {
            socket.setTcpNoDelay(true);
            int i10 = this.L;
            if (i10 >= 0) {
                socket.setSoLinger(true, i10 / 1000);
            } else {
                socket.setSoLinger(false, 0);
            }
        } catch (Exception e10) {
            S.g(e10);
        }
    }

    public void D0(hq.j jVar) {
        jVar.onClose();
        if (this.N.get() == -1) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - jVar.d();
        this.P.a(jVar instanceof b ? ((b) jVar).z() : 0);
        this.O.b();
        this.Q.a(jCurrentTimeMillis);
    }

    @Override // mq.f
    public boolean E() {
        ar.d dVar = this.f74849p;
        return dVar != null ? dVar.B() : this.f74848o.J0().B();
    }

    public void E0(hq.j jVar) {
        if (this.N.get() == -1) {
            return;
        }
        this.O.c();
    }

    public int F0() {
        return this.f74856w;
    }

    public int G0() {
        return this.f74857x;
    }

    @Override // mq.f
    public String H() {
        return this.f74850q;
    }

    public String H0() {
        return this.G;
    }

    @Override // mq.f
    public void I(hq.k kVar) throws IOException {
    }

    public String I0() {
        return this.E;
    }

    public String J0() {
        return this.C;
    }

    @Override // mq.f
    public void K(hq.k kVar, n nVar) throws IOException {
        if (S0()) {
            B0(kVar, nVar);
        }
    }

    public String K0() {
        return this.F;
    }

    @Override // gq.d
    public Buffers L() {
        return this.R.L();
    }

    public String L0() {
        return this.D;
    }

    public String M0() {
        return this.H;
    }

    public String N0(org.eclipse.jetty.http.a aVar, String str) {
        String strX;
        if (str == null || (strX = aVar.x(str)) == null) {
            return null;
        }
        int iIndexOf = strX.indexOf(44);
        return iIndexOf == -1 ? strX : strX.substring(0, iIndexOf);
    }

    public int O0() {
        return this.K;
    }

    @Override // mq.f
    @Deprecated
    public final int P() {
        return O0();
    }

    public int P0() {
        return this.f74851r;
    }

    public boolean Q0() {
        return this.I;
    }

    @Override // mq.f
    public int R() {
        return this.f74855v;
    }

    public ar.d R0() {
        return this.f74849p;
    }

    public boolean S0() {
        return this.A;
    }

    public void T0(String str) {
        this.f74850q = str;
    }

    public void U0(int i10) {
        this.f74851r = i10;
    }

    @Override // gq.d
    public Buffers W() {
        return this.R.W();
    }

    @Override // mq.f
    public p b() {
        return this.f74848o;
    }

    @Override // mq.f
    public String b0() {
        return this.f74852s;
    }

    @Override // mq.f
    public int d() {
        return this.J;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // uq.b, uq.a
    public void d0() throws Exception {
        if (this.f74848o == null) {
            throw new IllegalStateException("No server");
        }
        open();
        if (this.f74849p == null) {
            ar.d dVarJ0 = this.f74848o.J0();
            this.f74849p = dVarJ0;
            n0(dVarJ0, false);
        }
        super.d0();
        synchronized (this) {
            this.M = new Thread[G0()];
            for (int i10 = 0; i10 < this.M.length; i10++) {
                if (!this.f74849p.Z(new RunnableC0889a(i10))) {
                    throw new IllegalStateException("!accepting");
                }
            }
            if (this.f74849p.B()) {
                S.f("insufficient threads configured for {}", this);
            }
        }
        S.i("Started {}", this);
    }

    @Override // uq.b, uq.a
    public void e0() throws Exception {
        Thread[] threadArr;
        try {
            close();
        } catch (IOException e10) {
            S.e(e10);
        }
        super.e0();
        synchronized (this) {
            threadArr = this.M;
            this.M = null;
        }
        if (threadArr != null) {
            for (Thread thread : threadArr) {
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
    }

    @Override // mq.f
    public void f(p pVar) {
        this.f74848o = pVar;
    }

    @Override // mq.f
    public boolean g(n nVar) {
        return false;
    }

    @Override // mq.f
    public String getName() {
        if (this.f74847n == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(H() == null ? "0.0.0.0" : H());
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(c() <= 0 ? P0() : c());
            this.f74847n = sb2.toString();
        }
        return this.f74847n;
    }

    @Override // mq.f
    public String i() {
        return this.f74854u;
    }

    @Override // mq.f
    public int j() {
        return this.f74853t;
    }

    @Override // mq.f
    public boolean n() {
        return this.f74859z;
    }

    public String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = getClass().getSimpleName();
        objArr[1] = H() == null ? "0.0.0.0" : H();
        objArr[2] = Integer.valueOf(c() <= 0 ? P0() : c());
        return String.format("%s@%s:%d", objArr);
    }

    public abstract void x0(int i10) throws InterruptedException, IOException;
}
