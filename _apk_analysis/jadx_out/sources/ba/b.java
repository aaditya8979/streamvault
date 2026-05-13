package ba;

import android.database.sqlite.SQLiteFullException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadOutOfSpaceException;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import ia.d;
import ia.e;
import ia.f;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: DownloadStatusCallback.java */
/* JADX INFO: loaded from: classes10.dex */
public class b implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FileDownloadModel f5520b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f5522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f5524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f5527i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HandlerThread f5528j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile Thread f5530l;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f5529k = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile long f5531m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicLong f5532n = new AtomicLong();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f5533o = new AtomicBoolean(false);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicBoolean f5534p = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicBoolean f5535q = new AtomicBoolean(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aa.a f5521c = ba.a.j().f();

    /* JADX INFO: compiled from: DownloadStatusCallback.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Exception f5537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5538c;

        public Exception a() {
            return this.f5537b;
        }

        public int b() {
            return this.f5538c;
        }

        public boolean c() {
            return this.f5536a;
        }

        public void d(Exception exc) {
            this.f5537b = exc;
        }

        public void e(boolean z10) {
            this.f5536a = z10;
        }

        public void f(int i10) {
            this.f5538c = i10;
        }
    }

    public b(FileDownloadModel fileDownloadModel, int i10, int i11, int i12) {
        this.f5520b = fileDownloadModel;
        this.f5524f = i11 < 5 ? 5 : i11;
        this.f5525g = i12;
        this.f5522d = new a();
        this.f5523e = i10;
    }

    public static long a(long j10, long j11) {
        if (j11 <= 0) {
            return -1L;
        }
        if (j10 == -1) {
            return 1L;
        }
        long j12 = j10 / j11;
        if (j12 <= 0) {
            return 1L;
        }
        return j12;
    }

    public void b() {
        Handler handler = this.f5527i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f5528j.quit();
            this.f5530l = Thread.currentThread();
            while (this.f5529k) {
                LockSupport.parkNanos(TimeUnit.MILLISECONDS.toNanos(100L));
            }
            this.f5530l = null;
        }
    }

    public final Exception c(Exception exc) {
        long length;
        String strL = this.f5520b.l();
        if ((!this.f5520b.p() && !e.a().f64039f) || !(exc instanceof IOException) || !new File(strL).exists()) {
            return exc;
        }
        long jX = f.x(strL);
        if (jX > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return exc;
        }
        File file = new File(strL);
        if (file.exists()) {
            length = file.length();
        } else {
            d.c(this, exc, "Exception with: free space isn't enough, and the target file not exist.", new Object[0]);
            length = 0;
        }
        return new FileDownloadOutOfSpaceException(jX, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM, length, exc);
    }

    public final void d() throws Throwable {
        w();
        this.f5520b.A((byte) -3);
        this.f5521c.h(this.f5520b.g(), this.f5520b.m());
        this.f5521c.e(this.f5520b.g());
        v((byte) -3);
        if (e.a().f64040g) {
            ga.f.a(this.f5520b);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e(Exception exc) {
        SQLiteFullException sQLiteFullException;
        Exception excC = c(exc);
        if (excC instanceof SQLiteFullException) {
            i((SQLiteFullException) excC);
            sQLiteFullException = excC;
        } else {
            try {
                this.f5520b.A((byte) -1);
                this.f5520b.v(exc.toString());
                this.f5521c.j(this.f5520b.g(), excC, this.f5520b.i());
                sQLiteFullException = excC;
            } catch (SQLiteFullException e10) {
                SQLiteFullException sQLiteFullException2 = e10;
                i(sQLiteFullException2);
                sQLiteFullException = sQLiteFullException2;
            }
        }
        this.f5522d.d(sQLiteFullException);
        v((byte) -1);
    }

    public final void f() {
        this.f5520b.A((byte) -2);
        this.f5521c.p(this.f5520b.g(), this.f5520b.i());
        v((byte) -2);
    }

    public final void g() {
        if (this.f5520b.i() == this.f5520b.m()) {
            this.f5521c.k(this.f5520b.g(), this.f5520b.i());
            return;
        }
        if (this.f5534p.compareAndSet(true, false)) {
            if (d.f64033a) {
                d.e(this, "handleProgress update model's status with progress", new Object[0]);
            }
            this.f5520b.A((byte) 3);
        }
        if (this.f5533o.compareAndSet(true, false)) {
            if (d.f64033a) {
                d.e(this, "handleProgress notify user progress status", new Object[0]);
            }
            v((byte) 3);
        }
    }

    public final void h(Exception exc, int i10) {
        Exception excC = c(exc);
        this.f5522d.d(excC);
        this.f5522d.f(this.f5523e - i10);
        this.f5520b.A((byte) 5);
        this.f5520b.v(excC.toString());
        this.f5521c.b(this.f5520b.g(), excC);
        v((byte) 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020 A[DONT_GENERATE] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleMessage(android.os.Message r5) {
        /*
            r4 = this;
            r0 = 1
            r4.f5529k = r0
            int r1 = r5.what
            r2 = 3
            r3 = 0
            if (r1 == r2) goto L17
            r2 = 5
            if (r1 == r2) goto Ld
            goto L1a
        Ld:
            java.lang.Object r1 = r5.obj     // Catch: java.lang.Throwable -> L26
            java.lang.Exception r1 = (java.lang.Exception) r1     // Catch: java.lang.Throwable -> L26
            int r5 = r5.arg1     // Catch: java.lang.Throwable -> L26
            r4.h(r1, r5)     // Catch: java.lang.Throwable -> L26
            goto L1a
        L17:
            r4.g()     // Catch: java.lang.Throwable -> L26
        L1a:
            r4.f5529k = r3
            java.lang.Thread r5 = r4.f5530l
            if (r5 == 0) goto L25
            java.lang.Thread r5 = r4.f5530l
            java.util.concurrent.locks.LockSupport.unpark(r5)
        L25:
            return r0
        L26:
            r5 = move-exception
            r4.f5529k = r3
            java.lang.Thread r0 = r4.f5530l
            if (r0 == 0) goto L32
            java.lang.Thread r0 = r4.f5530l
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L32:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.b.handleMessage(android.os.Message):boolean");
    }

    public final void i(SQLiteFullException sQLiteFullException) {
        int iG = this.f5520b.g();
        if (d.f64033a) {
            d.a(this, "the data of the task[%d] is dirty, because the SQLite full exception[%s], so remove it from the database directly.", Integer.valueOf(iG), sQLiteFullException.toString());
        }
        this.f5520b.v(sQLiteFullException.toString());
        this.f5520b.A((byte) -1);
        this.f5521c.remove(iG);
        this.f5521c.e(iG);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(long r10) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.f5535q
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto Lc
        La:
            r0 = r1
            goto L2d
        Lc:
            long r3 = r9.f5531m
            long r3 = r10 - r3
            long r5 = r9.f5526h
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L2c
            java.util.concurrent.atomic.AtomicLong r0 = r9.f5532n
            long r5 = r0.get()
            long r7 = r9.f5526h
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L2c
            int r0 = r9.f5524f
            long r5 = (long) r0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L2c
            goto La
        L2c:
            r0 = r2
        L2d:
            if (r0 == 0) goto L4b
            java.util.concurrent.atomic.AtomicBoolean r0 = r9.f5533o
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 == 0) goto L4b
            boolean r0 = ia.d.f64033a
            if (r0 == 0) goto L42
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "inspectNeedCallbackToUser need callback to user"
            ia.d.e(r9, r1, r0)
        L42:
            r9.f5531m = r10
            java.util.concurrent.atomic.AtomicLong r10 = r9.f5532n
            r0 = 0
            r10.set(r0)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.b.j(long):void");
    }

    public final boolean k() {
        if (this.f5520b.p()) {
            FileDownloadModel fileDownloadModel = this.f5520b;
            fileDownloadModel.B(fileDownloadModel.i());
        } else if (this.f5520b.i() != this.f5520b.m()) {
            o(new FileDownloadGiveUpRetryException(f.o("sofar[%d] not equal total[%d]", Long.valueOf(this.f5520b.i()), Long.valueOf(this.f5520b.m()))));
            return true;
        }
        return false;
    }

    public boolean l() {
        HandlerThread handlerThread = this.f5528j;
        return handlerThread != null && handlerThread.isAlive();
    }

    public void m() throws Throwable {
        if (k()) {
            return;
        }
        d();
    }

    public void n(boolean z10, long j10, String str, String str2) throws IllegalArgumentException {
        String strD = this.f5520b.d();
        if (strD != null && !strD.equals(str)) {
            throw new IllegalArgumentException(f.o("callback onConnected must with precondition succeed, but the etag is changes(%s != %s)", str, strD));
        }
        this.f5522d.e(z10);
        this.f5520b.A((byte) 2);
        this.f5520b.B(j10);
        this.f5520b.u(str);
        this.f5520b.w(str2);
        this.f5521c.l(this.f5520b.g(), j10, str, str2);
        v((byte) 2);
        this.f5526h = a(j10, this.f5525g);
        this.f5534p.compareAndSet(false, true);
    }

    public void o(Exception exc) {
        e(exc);
    }

    public void p() {
        HandlerThread handlerThread = new HandlerThread("source-status-callback");
        this.f5528j = handlerThread;
        handlerThread.start();
        this.f5527i = new Handler(this.f5528j.getLooper(), this);
    }

    public void q() {
        f();
    }

    public void r() {
        this.f5520b.A((byte) 1);
        this.f5521c.f(this.f5520b.g());
        v((byte) 1);
    }

    public void s(long j10) {
        this.f5532n.addAndGet(j10);
        this.f5520b.o(j10);
        j(SystemClock.elapsedRealtime());
        if (this.f5527i == null) {
            g();
        } else if (this.f5533o.get()) {
            x(this.f5527i.obtainMessage(3));
        }
    }

    public void t(Exception exc, int i10) {
        this.f5532n.set(0L);
        Handler handler = this.f5527i;
        if (handler == null) {
            h(exc, i10);
        } else {
            x(handler.obtainMessage(5, i10, 0, exc));
        }
    }

    public void u() {
        this.f5520b.A((byte) 6);
        v((byte) 6);
        this.f5521c.i(this.f5520b.g());
    }

    public final void v(byte b10) {
        if (b10 != -2) {
            ea.c.a().b(com.liulishuo.filedownloader.message.a.d(b10, this.f5520b, this.f5522d));
        } else if (d.f64033a) {
            d.a(this, "High concurrent cause, Already paused and we don't need to call-back to Task in here, %d", Integer.valueOf(this.f5520b.g()));
        }
    }

    public final void w() throws Throwable {
        boolean z10;
        String strL = this.f5520b.l();
        String strK = this.f5520b.k();
        File file = new File(strL);
        try {
            File file2 = new File(strK);
            if (file2.exists()) {
                long length = file2.length();
                if (!file2.delete()) {
                    throw new IOException(f.o("Can't delete the old file([%s], [%d]), so can't replace it with the new downloaded one.", strK, Long.valueOf(length)));
                }
                d.i(this, "The target file([%s], [%d]) will be replaced with the new downloaded file[%d]", strK, Long.valueOf(length), Long.valueOf(file.length()));
            }
            z10 = !file.renameTo(file2);
            if (!z10) {
                if (z10 && file.exists() && !file.delete()) {
                    d.i(this, "delete the temp file(%s) failed, on completed downloading.", strL);
                    return;
                }
                return;
            }
            try {
                throw new IOException(f.o("Can't rename the  temp downloaded file(%s) to the target file(%s)", strL, strK));
            } catch (Throwable th2) {
                th = th2;
                if (z10 && file.exists() && !file.delete()) {
                    d.i(this, "delete the temp file(%s) failed, on completed downloading.", strL);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            z10 = true;
        }
    }

    public final synchronized void x(Message message) {
        if (!this.f5528j.isAlive()) {
            if (d.f64033a) {
                d.a(this, "require callback %d but the host thread of the flow has already dead, what is occurred because of there are several reason can final this flow on different thread.", Integer.valueOf(message.what));
            }
            return;
        }
        try {
            this.f5527i.sendMessage(message);
        } catch (IllegalStateException e10) {
            if (this.f5528j.isAlive()) {
                throw e10;
            }
            if (d.f64033a) {
                d.a(this, "require callback %d but the host thread of the flow has already dead, what is occurred because of there are several reason can final this flow on different thread.", Integer.valueOf(message.what));
            }
        }
    }
}
