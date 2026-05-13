package com.mbridge.msdk.thrid.okhttp;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: RealCall.java */
/* JADX INFO: loaded from: classes9.dex */
final class x implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f40798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.internal.http.j f40799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.a f40800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o f40801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f40802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f40803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f40804g;

    /* JADX INFO: compiled from: RealCall.java */
    public class a extends com.mbridge.msdk.thrid.okio.a {
        public a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public void j() {
            x.this.cancel();
        }
    }

    /* JADX INFO: compiled from: RealCall.java */
    public final class b extends com.mbridge.msdk.thrid.okhttp.internal.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ boolean f40806d = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f40807b;

        public b(e eVar) {
            super("OkHttp %s", x.this.e());
            this.f40807b = eVar;
        }

        public void a(ExecutorService executorService) {
            if (!f40806d && Thread.holdsLock(x.this.f40798a.j())) {
                throw new AssertionError();
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    x.this.f40801d.callFailed(x.this, interruptedIOException);
                    this.f40807b.a(x.this, interruptedIOException);
                    x.this.f40798a.j().b(this);
                }
            } catch (Throwable th2) {
                x.this.f40798a.j().b(this);
                throw th2;
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            x.this.f40800c.h();
            boolean z10 = false;
            try {
                try {
                    try {
                        this.f40807b.a(x.this, x.this.c());
                    } catch (IOException e10) {
                        e = e10;
                        z10 = true;
                        IOException iOExceptionA = x.this.a(e);
                        if (z10) {
                            com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a(4, "Callback failure for " + x.this.f(), iOExceptionA);
                        } else {
                            x.this.f40801d.callFailed(x.this, iOExceptionA);
                            this.f40807b.a(x.this, iOExceptionA);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = true;
                        x.this.cancel();
                        if (!z10) {
                            this.f40807b.a(x.this, new IOException("canceled due to " + th));
                        }
                        throw th;
                    }
                } finally {
                    x.this.f40798a.j().b(this);
                }
            } catch (IOException e11) {
                e = e11;
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public x c() {
            return x.this;
        }

        public String d() {
            return x.this.f40802e.g().g();
        }
    }

    private x(v vVar, y yVar, boolean z10) {
        this.f40798a = vVar;
        this.f40802e = yVar;
        this.f40803f = z10;
        this.f40799b = new com.mbridge.msdk.thrid.okhttp.internal.http.j(vVar, z10);
        a aVar = new a();
        this.f40800c = aVar;
        aVar.a(vVar.b(), TimeUnit.MILLISECONDS);
    }

    public static x a(v vVar, y yVar, boolean z10) {
        x xVar = new x(vVar, yVar, z10);
        xVar.f40801d = vVar.l().a(xVar);
        return xVar;
    }

    private void a() {
        this.f40799b.a(com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a("response.body().close()"));
    }

    public IOException a(IOException iOException) {
        if (!this.f40800c.i()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public void a(e eVar) {
        synchronized (this) {
            if (this.f40804g) {
                throw new IllegalStateException("Already Executed");
            }
            this.f40804g = true;
        }
        a();
        this.f40801d.callStart(this);
        this.f40798a.j().a(new b(eVar));
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x clone() {
        return a(this.f40798a, this.f40802e, this.f40803f);
    }

    public a0 c() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f40798a.p());
        arrayList.add(this.f40799b);
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.http.a(this.f40798a.i()));
        this.f40798a.q();
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.cache.a(null));
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.connection.a(this.f40798a));
        if (!this.f40803f) {
            arrayList.addAll(this.f40798a.r());
        }
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.http.b(this.f40803f));
        a0 a0VarA = new com.mbridge.msdk.thrid.okhttp.internal.http.g(arrayList, null, null, null, 0, this.f40802e, this, this.f40801d, this.f40798a.e(), this.f40798a.y(), this.f40798a.C()).a(this.f40802e);
        if (!this.f40799b.b()) {
            return a0VarA;
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(a0VarA);
        throw new IOException("Canceled");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public void cancel() {
        this.f40799b.a();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public a0 d() throws IOException {
        synchronized (this) {
            if (this.f40804g) {
                throw new IllegalStateException("Already Executed");
            }
            this.f40804g = true;
        }
        a();
        this.f40800c.h();
        this.f40801d.callStart(this);
        try {
            try {
                this.f40798a.j().a(this);
                a0 a0VarC = c();
                if (a0VarC != null) {
                    return a0VarC;
                }
                throw new IOException("Canceled");
            } catch (IOException e10) {
                IOException iOExceptionA = a(e10);
                this.f40801d.callFailed(this, iOExceptionA);
                throw iOExceptionA;
            }
        } finally {
            this.f40798a.j().b(this);
        }
        this.f40798a.j().b(this);
    }

    public String e() {
        return this.f40802e.g().l();
    }

    public String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h() ? "canceled " : "");
        sb2.append(this.f40803f ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb2.append(" to ");
        sb2.append(e());
        return sb2.toString();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public boolean h() {
        return this.f40799b.b();
    }
}
