package oq;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import javax.servlet.ServletException;
import mq.i;
import mq.n;
import mq.p;
import org.eclipse.jetty.util.LazyList;
import org.eclipse.jetty.util.MultiException;

/* JADX INFO: compiled from: HandlerCollection.java */
/* JADX INFO: loaded from: classes5.dex */
public class f extends b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f76537p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile i[] f76538q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f76539r;

    /* JADX INFO: compiled from: HandlerCollection.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ClassLoader f76540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f76541c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MultiException f76542d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f76543e;

        public a(ClassLoader classLoader, int i10, MultiException multiException, CountDownLatch countDownLatch) {
            this.f76540b = classLoader;
            this.f76541c = i10;
            this.f76542d = multiException;
            this.f76543e = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            try {
                Thread.currentThread().setContextClassLoader(this.f76540b);
                f.this.f76538q[this.f76541c].start();
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public f() {
        this.f76539r = false;
        this.f76537p = false;
    }

    public f(boolean z10) {
        this.f76539r = false;
        this.f76537p = z10;
    }

    public void B0(i iVar) {
        C0((i[]) LazyList.addToArray(N(), iVar, i.class));
    }

    public void C0(i[] iVarArr) {
        if (!this.f76537p && isStarted()) {
            throw new IllegalStateException("STARTED");
        }
        i[] iVarArr2 = this.f76538q == null ? null : (i[]) this.f76538q.clone();
        this.f76538q = iVarArr;
        p pVarB = b();
        MultiException multiException = new MultiException();
        for (int i10 = 0; iVarArr != null && i10 < iVarArr.length; i10++) {
            if (iVarArr[i10].b() != pVarB) {
                iVarArr[i10].f(pVarB);
            }
        }
        if (b() != null) {
            b().E0().update((Object) this, (Object[]) iVarArr2, (Object[]) iVarArr, "handler");
        }
        for (int i11 = 0; iVarArr2 != null && i11 < iVarArr2.length; i11++) {
            i iVar = iVarArr2[i11];
            if (iVar != null) {
                try {
                    if (iVar.isStarted()) {
                        iVarArr2[i11].stop();
                    }
                } catch (Throwable th2) {
                    multiException.add(th2);
                }
            }
        }
        multiException.ifExceptionThrowRuntime();
    }

    @Override // mq.j
    public i[] N() {
        return this.f76538q;
    }

    public void a0(String str, n nVar, an.a aVar, an.c cVar) throws ServletException, IOException {
        if (this.f76538q == null || !isStarted()) {
            return;
        }
        MultiException multiException = null;
        for (int i10 = 0; i10 < this.f76538q.length; i10++) {
            try {
                this.f76538q[i10].a0(str, nVar, aVar, cVar);
            } catch (IOException e10) {
                throw e10;
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception e12) {
                if (multiException == null) {
                    multiException = new MultiException();
                }
                multiException.add(e12);
            }
        }
        if (multiException != null) {
            if (multiException.size() != 1) {
                throw new ServletException(multiException);
            }
            throw new ServletException(multiException.getThrowable(0));
        }
    }

    @Override // oq.a, uq.b, uq.a
    public void d0() throws Exception {
        MultiException multiException = new MultiException();
        if (this.f76538q != null) {
            if (this.f76539r) {
                CountDownLatch countDownLatch = new CountDownLatch(this.f76538q.length);
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                for (int i10 = 0; i10 < this.f76538q.length; i10++) {
                    b().J0().Z(new a(contextClassLoader, i10, multiException, countDownLatch));
                }
                countDownLatch.await();
            } else {
                for (int i11 = 0; i11 < this.f76538q.length; i11++) {
                    try {
                        this.f76538q[i11].start();
                    } catch (Throwable th2) {
                        multiException.add(th2);
                    }
                }
            }
        }
        super.d0();
        multiException.ifExceptionThrow();
    }

    @Override // oq.a, uq.b, uq.d
    public void destroy() {
        if (!isStopped()) {
            throw new IllegalStateException("!STOPPED");
        }
        i[] iVarArrP = p();
        C0(null);
        for (i iVar : iVarArrP) {
            iVar.destroy();
        }
        super.destroy();
    }

    @Override // oq.a, uq.b, uq.a
    public void e0() throws Exception {
        MultiException multiException = new MultiException();
        try {
            super.e0();
        } catch (Throwable th2) {
            multiException.add(th2);
        }
        if (this.f76538q != null) {
            int length = this.f76538q.length;
            while (true) {
                int i10 = length - 1;
                if (length <= 0) {
                    break;
                }
                try {
                    this.f76538q[i10].stop();
                } catch (Throwable th3) {
                    multiException.add(th3);
                }
                length = i10;
            }
        }
        multiException.ifExceptionThrow();
    }

    @Override // oq.a, mq.i
    public void f(p pVar) {
        if (isStarted()) {
            throw new IllegalStateException("STARTED");
        }
        p pVarB = b();
        super.f(pVar);
        i[] iVarArrN = N();
        for (int i10 = 0; iVarArrN != null && i10 < iVarArrN.length; i10++) {
            iVarArrN[i10].f(pVar);
        }
        if (pVar == null || pVar == pVarB) {
            return;
        }
        pVar.E0().update((Object) this, (Object[]) null, (Object[]) this.f76538q, "handler");
    }

    @Override // oq.b
    public Object x0(Object obj, Class cls) {
        i[] iVarArrN = N();
        for (int i10 = 0; iVarArrN != null && i10 < iVarArrN.length; i10++) {
            obj = y0(iVarArrN[i10], obj, cls);
        }
        return obj;
    }
}
