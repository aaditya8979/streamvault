package com.liulishuo.filedownloader.download;

import com.liulishuo.filedownloader.download.a;
import com.liulishuo.filedownloader.download.b;
import com.liulishuo.filedownloader.download.c;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadHttpException;
import com.liulishuo.filedownloader.exception.FileDownloadNetworkPolicyException;
import com.liulishuo.filedownloader.exception.FileDownloadOutOfSpaceException;
import com.liulishuo.filedownloader.exception.FileDownloadSecurityException;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import ia.e;
import ia.f;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import y9.z;

/* JADX INFO: loaded from: classes12.dex */
public class DownloadLaunchRunnable implements Runnable, ba.c {
    public static final ThreadPoolExecutor C = ia.b.c("ConnectionBlock");
    public long A;
    public long B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ba.b f34577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FileDownloadModel f34579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FileDownloadHeader f34580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f34581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f34582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final aa.a f34583h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z f34584i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f34585j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f34586k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f34587l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f34588m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList<c> f34589n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f34590o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f34591p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f34592q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f34593r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f34594s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicBoolean f34595t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile boolean f34596u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile boolean f34597v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile Exception f34598w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f34599x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f34600y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f34601z;

    public class DiscardSafely extends Throwable {
        public DiscardSafely() {
        }
    }

    public class RetryDirectly extends Throwable {
        public RetryDirectly() {
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FileDownloadModel f34602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public FileDownloadHeader f34603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public z f34604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f34605d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f34606e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Boolean f34607f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Boolean f34608g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Integer f34609h;

        public DownloadLaunchRunnable a() {
            if (this.f34602a == null || this.f34604c == null || this.f34605d == null || this.f34606e == null || this.f34607f == null || this.f34608g == null || this.f34609h == null) {
                throw new IllegalArgumentException();
            }
            return new DownloadLaunchRunnable(this.f34602a, this.f34603b, this.f34604c, this.f34605d.intValue(), this.f34606e.intValue(), this.f34607f.booleanValue(), this.f34608g.booleanValue(), this.f34609h.intValue());
        }

        public b b(Integer num) {
            this.f34606e = num;
            return this;
        }

        public b c(Boolean bool) {
            this.f34607f = bool;
            return this;
        }

        public b d(FileDownloadHeader fileDownloadHeader) {
            this.f34603b = fileDownloadHeader;
            return this;
        }

        public b e(Integer num) {
            this.f34609h = num;
            return this;
        }

        public b f(Integer num) {
            this.f34605d = num;
            return this;
        }

        public b g(FileDownloadModel fileDownloadModel) {
            this.f34602a = fileDownloadModel;
            return this;
        }

        public b h(z zVar) {
            this.f34604c = zVar;
            return this;
        }

        public b i(Boolean bool) {
            this.f34608g = bool;
            return this;
        }
    }

    public DownloadLaunchRunnable(FileDownloadModel fileDownloadModel, FileDownloadHeader fileDownloadHeader, z zVar, int i10, int i11, boolean z10, boolean z11, int i12) {
        this.f34578c = 5;
        this.f34587l = false;
        this.f34589n = new ArrayList<>(5);
        this.f34600y = 0L;
        this.f34601z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.f34595t = new AtomicBoolean(true);
        this.f34596u = false;
        this.f34585j = false;
        this.f34579d = fileDownloadModel;
        this.f34580e = fileDownloadHeader;
        this.f34581f = z10;
        this.f34582g = z11;
        this.f34583h = ba.a.j().f();
        this.f34588m = ba.a.j().m();
        this.f34584i = zVar;
        this.f34586k = i12;
        this.f34577b = new ba.b(fileDownloadModel, i12, i10, i11);
    }

    @Override // ba.c
    public boolean a(Exception exc) {
        if (exc instanceof FileDownloadHttpException) {
            int code = ((FileDownloadHttpException) exc).getCode();
            if (this.f34591p && code == 416 && !this.f34585j) {
                f.f(this.f34579d.k(), this.f34579d.l());
                this.f34585j = true;
                return true;
            }
        }
        return this.f34586k > 0 && !(exc instanceof FileDownloadGiveUpRetryException);
    }

    @Override // ba.c
    public void b(c cVar, long j10, long j11) {
        if (this.f34596u) {
            if (ia.d.f64033a) {
                ia.d.a(this, "the task[%d] has already been paused, so pass the completed callback", Integer.valueOf(this.f34579d.g()));
                return;
            }
            return;
        }
        int i10 = cVar.f34635i;
        if (ia.d.f64033a) {
            ia.d.a(this, "the connection has been completed(%d): [%d, %d)  %d", Integer.valueOf(i10), Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(this.f34579d.m()));
        }
        if (!this.f34591p) {
            synchronized (this.f34589n) {
                this.f34589n.remove(cVar);
            }
        } else {
            if (j10 == 0 || j11 == this.f34579d.m()) {
                return;
            }
            ia.d.b(this, "the single task not completed corrected(%d, %d != %d) for task(%d)", Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(this.f34579d.m()), Integer.valueOf(this.f34579d.g()));
        }
    }

    @Override // ba.c
    public void c(Exception exc) {
        if (this.f34596u) {
            if (ia.d.f64033a) {
                ia.d.a(this, "the task[%d] has already been paused, so pass the retry callback", Integer.valueOf(this.f34579d.g()));
            }
        } else {
            int i10 = this.f34586k;
            int i11 = i10 - 1;
            this.f34586k = i11;
            if (i10 < 0) {
                ia.d.b(this, "valid retry times is less than 0(%d) for download task(%d)", Integer.valueOf(i11), Integer.valueOf(this.f34579d.g()));
            }
            this.f34577b.t(exc, this.f34586k);
        }
    }

    @Override // ba.c
    public void d(long j10) {
        if (this.f34596u) {
            return;
        }
        this.f34577b.s(j10);
    }

    @Override // ba.c
    public void f() {
        this.f34583h.k(this.f34579d.g(), this.f34579d.i());
    }

    public final int g(long j10) {
        if (r()) {
            return this.f34592q ? this.f34579d.c() : ba.a.j().c(this.f34579d.g(), this.f34579d.n(), this.f34579d.h(), j10);
        }
        return 1;
    }

    public final void h() throws DiscardSafely, RetryDirectly {
        int iG = this.f34579d.g();
        if (this.f34579d.r()) {
            String strK = this.f34579d.k();
            int iR = f.r(this.f34579d.n(), strK);
            if (ia.c.d(iG, strK, this.f34581f, false)) {
                this.f34583h.remove(iG);
                this.f34583h.e(iG);
                throw new DiscardSafely();
            }
            FileDownloadModel fileDownloadModelN = this.f34583h.n(iR);
            if (fileDownloadModelN != null) {
                if (ia.c.e(iG, fileDownloadModelN, this.f34584i, false)) {
                    this.f34583h.remove(iG);
                    this.f34583h.e(iG);
                    throw new DiscardSafely();
                }
                List<fa.a> listM = this.f34583h.m(iR);
                this.f34583h.remove(iR);
                this.f34583h.e(iR);
                f.e(this.f34579d.k());
                if (f.G(iR, fileDownloadModelN)) {
                    this.f34579d.z(fileDownloadModelN.i());
                    this.f34579d.B(fileDownloadModelN.m());
                    this.f34579d.u(fileDownloadModelN.d());
                    this.f34579d.t(fileDownloadModelN.c());
                    this.f34583h.update(this.f34579d);
                    if (listM != null) {
                        for (fa.a aVar : listM) {
                            aVar.i(iG);
                            this.f34583h.a(aVar);
                        }
                    }
                    throw new RetryDirectly();
                }
            }
            if (ia.c.c(iG, this.f34579d.i(), this.f34579d.l(), strK, this.f34584i)) {
                this.f34583h.remove(iG);
                this.f34583h.e(iG);
                throw new DiscardSafely();
            }
        }
    }

    public final void i() throws FileDownloadGiveUpRetryException {
        if (this.f34582g && !f.a("android.permission.ACCESS_NETWORK_STATE")) {
            throw new FileDownloadGiveUpRetryException(f.o("Task[%d] can't start the download runnable, because this task require wifi, but user application nor current process has %s, so we can't check whether the network type connection.", Integer.valueOf(this.f34579d.g()), "android.permission.ACCESS_NETWORK_STATE"));
        }
        if (this.f34582g && f.M()) {
            throw new FileDownloadNetworkPolicyException();
        }
    }

    public final void j(List<fa.a> list, long j10) throws InterruptedException {
        int iG = this.f34579d.g();
        String strD = this.f34579d.d();
        String strN = this.f34599x;
        if (strN == null) {
            strN = this.f34579d.n();
        }
        String strL = this.f34579d.l();
        if (ia.d.f64033a) {
            ia.d.a(this, "fetch data with multiple connection(count: [%d]) for task[%d] totalLength[%d]", Integer.valueOf(list.size()), Integer.valueOf(iG), Long.valueOf(j10));
        }
        boolean z10 = this.f34592q;
        long j11 = 0;
        long jA = 0;
        for (fa.a aVar : list) {
            long jA2 = aVar.b() == -1 ? j10 - aVar.a() : (aVar.b() - aVar.a()) + 1;
            jA += aVar.a() - aVar.e();
            if (jA2 != j11) {
                c cVarA = new c.b().g(iG).c(Integer.valueOf(aVar.d())).b(this).i(strN).e(z10 ? strD : null).f(this.f34580e).j(this.f34582g).d(b.C0411b.b(aVar.e(), aVar.a(), aVar.b(), jA2)).h(strL).a();
                if (ia.d.f64033a) {
                    ia.d.a(this, "enable multiple connection: %s", aVar);
                }
                if (cVarA == null) {
                    throw new IllegalArgumentException("the download runnable must not be null!");
                }
                this.f34589n.add(cVarA);
            } else if (ia.d.f64033a) {
                ia.d.a(this, "pass connection[%d-%d], because it has been completed", Integer.valueOf(aVar.c()), Integer.valueOf(aVar.d()));
            }
            j11 = 0;
        }
        if (jA != this.f34579d.i()) {
            ia.d.i(this, "correct the sofar[%d] from connection table[%d]", Long.valueOf(this.f34579d.i()), Long.valueOf(jA));
            this.f34579d.z(jA);
        }
        ArrayList arrayList = new ArrayList(this.f34589n.size());
        for (c cVar : this.f34589n) {
            if (this.f34596u) {
                cVar.c();
            } else {
                arrayList.add(Executors.callable(cVar));
            }
        }
        if (this.f34596u) {
            this.f34579d.A((byte) -2);
            return;
        }
        List<Future> listInvokeAll = C.invokeAll(arrayList);
        if (ia.d.f64033a) {
            for (Future future : listInvokeAll) {
                ia.d.a(this, "finish sub-task for [%d] %B %B", Integer.valueOf(iG), Boolean.valueOf(future.isDone()), Boolean.valueOf(future.isCancelled()));
            }
        }
    }

    public int k() {
        return this.f34579d.g();
    }

    public String l() {
        return this.f34579d.l();
    }

    public final void m(long j10, String str) throws IllegalAccessException, IOException {
        ha.a aVarC = null;
        if (j10 != -1) {
            try {
                aVarC = f.c(this.f34579d.l());
                long length = new File(str).length();
                long j11 = j10 - length;
                long jX = f.x(str);
                if (jX < j11) {
                    throw new FileDownloadOutOfSpaceException(jX, j11, length);
                }
                if (!e.a().f64039f) {
                    aVarC.setLength(j10);
                }
            } finally {
                if (0 != 0) {
                    aVarC.close();
                }
            }
        }
    }

    public final void n(Map<String, List<String>> map, com.liulishuo.filedownloader.download.a aVar, z9.b bVar) throws FileDownloadSecurityException, IOException, IllegalArgumentException, RetryDirectly {
        boolean z10;
        int iG = this.f34579d.g();
        int responseCode = bVar.getResponseCode();
        this.f34593r = f.E(responseCode, bVar);
        boolean z11 = responseCode == 200 || responseCode == 201 || responseCode == 0;
        long jM = f.m(bVar);
        String strD = this.f34579d.d();
        String strJ = f.j(iG, bVar);
        if (responseCode != 412 && ((strD == null || strD.equals(strJ) || !(z11 || this.f34593r)) && !(responseCode == 201 && aVar.h()))) {
            if (responseCode == 416) {
                if (!this.f34593r || jM < 0) {
                    if (this.f34579d.i() > 0) {
                        ia.d.i(this, "get 416, precondition failed and just retry", new Object[0]);
                    } else if (!this.f34587l) {
                        this.f34587l = true;
                        ia.d.i(this, "get 416, precondition failed and need to retry with discarding range", new Object[0]);
                    }
                    z10 = true;
                } else {
                    ia.d.i(this, "get 416 but the Content-Range is returned, no need to retry", new Object[0]);
                }
            }
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            this.f34599x = aVar.e();
            if (!this.f34593r && !z11) {
                throw new FileDownloadHttpException(responseCode, map, bVar.e());
            }
            String strL = this.f34579d.r() ? f.l(bVar, this.f34579d.n()) : null;
            this.f34594s = jM == -1;
            this.f34577b.n(this.f34592q && this.f34593r, jM, strJ, strL);
            return;
        }
        if (this.f34592q) {
            ia.d.i(this, "there is precondition failed on this request[%d] with old etag[%s]、new etag[%s]、response code is %d", Integer.valueOf(iG), strD, strJ, Integer.valueOf(responseCode));
        }
        this.f34583h.e(this.f34579d.g());
        f.f(this.f34579d.k(), this.f34579d.l());
        this.f34592q = false;
        if (strD != null && strD.equals(strJ)) {
            ia.d.i(this, "the old etag[%s] is the same to the new etag[%s], but the response status code is %d not Partial(206), so wo have to start this task from very beginning for task[%d]!", strD, strJ, Integer.valueOf(responseCode), Integer.valueOf(iG));
            strJ = null;
        }
        this.f34579d.z(0L);
        this.f34579d.B(0L);
        this.f34579d.u(strJ);
        this.f34579d.s();
        this.f34583h.c(iG, this.f34579d.d(), this.f34579d.i(), this.f34579d.m(), this.f34579d.c());
        throw new RetryDirectly();
    }

    @Override // ba.c
    public void onError(Exception exc) {
        this.f34597v = true;
        this.f34598w = exc;
        if (this.f34596u) {
            if (ia.d.f64033a) {
                ia.d.a(this, "the task[%d] has already been paused, so pass the error callback", Integer.valueOf(this.f34579d.g()));
            }
        } else {
            for (c cVar : (ArrayList) this.f34589n.clone()) {
                if (cVar != null) {
                    cVar.a();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(java.util.List<fa.a> r11) {
        /*
            r10 = this;
            com.liulishuo.filedownloader.model.FileDownloadModel r0 = r10.f34579d
            int r0 = r0.c()
            com.liulishuo.filedownloader.model.FileDownloadModel r1 = r10.f34579d
            java.lang.String r1 = r1.l()
            com.liulishuo.filedownloader.model.FileDownloadModel r2 = r10.f34579d
            java.lang.String r2 = r2.k()
            r3 = 0
            r4 = 1
            if (r0 <= r4) goto L18
            r5 = r4
            goto L19
        L18:
            r5 = r3
        L19:
            boolean r6 = r10.f34587l
            r7 = 0
            if (r6 == 0) goto L21
        L1f:
            r5 = r7
            goto L58
        L21:
            if (r5 == 0) goto L28
            boolean r6 = r10.f34588m
            if (r6 != 0) goto L28
            goto L1f
        L28:
            com.liulishuo.filedownloader.model.FileDownloadModel r6 = r10.f34579d
            int r6 = r6.g()
            com.liulishuo.filedownloader.model.FileDownloadModel r9 = r10.f34579d
            boolean r6 = ia.f.G(r6, r9)
            if (r6 == 0) goto L1f
            boolean r6 = r10.f34588m
            if (r6 != 0) goto L44
            java.io.File r11 = new java.io.File
            r11.<init>(r1)
            long r5 = r11.length()
            goto L58
        L44:
            if (r5 == 0) goto L52
            int r5 = r11.size()
            if (r0 == r5) goto L4d
            goto L1f
        L4d:
            long r5 = fa.a.f(r11)
            goto L58
        L52:
            com.liulishuo.filedownloader.model.FileDownloadModel r11 = r10.f34579d
            long r5 = r11.i()
        L58:
            com.liulishuo.filedownloader.model.FileDownloadModel r11 = r10.f34579d
            r11.z(r5)
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 <= 0) goto L62
            r3 = r4
        L62:
            r10.f34592q = r3
            if (r3 != 0) goto L74
            aa.a r11 = r10.f34583h
            com.liulishuo.filedownloader.model.FileDownloadModel r0 = r10.f34579d
            int r0 = r0.g()
            r11.e(r0)
            ia.f.f(r2, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.download.DownloadLaunchRunnable.p(java.util.List):void");
    }

    public boolean q() {
        return this.f34595t.get() || this.f34577b.l();
    }

    public final boolean r() {
        return (!this.f34592q || this.f34579d.c() > 1) && this.f34593r && this.f34588m && !this.f34594s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (ia.d.f64033a == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        ia.d.a(r10, "High concurrent cause, start runnable but already paused %d", java.lang.Integer.valueOf(r10.f34579d.g()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00af, code lost:
    
        r10.f34577b.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b6, code lost:
    
        if (r10.f34596u == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bb, code lost:
    
        if (r10.f34597v == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00be, code lost:
    
        r10.f34577b.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e0, code lost:
    
        if (r10.f34596u == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e2, code lost:
    
        r10.f34579d.A((byte) -2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e7, code lost:
    
        r10.f34577b.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
    
        if (r10.f34596u == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f4, code lost:
    
        if (r10.f34597v == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f8, code lost:
    
        r10.f34577b.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fe, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0100, code lost:
    
        r5 = r10.f34579d.m();
        m(r5, r10.f34579d.l());
        r7 = g(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0113, code lost:
    
        if (r7 <= 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0119, code lost:
    
        if (r5 != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011b, code lost:
    
        r10.f34577b.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0122, code lost:
    
        if (r10.f34596u == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0128, code lost:
    
        if (r10.f34597v == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012c, code lost:
    
        r10.f34577b.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0133, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0138, code lost:
    
        if (r10.f34596u == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013a, code lost:
    
        r10.f34579d.A((byte) -2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013f, code lost:
    
        r10.f34577b.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0146, code lost:
    
        if (r10.f34596u == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014c, code lost:
    
        if (r10.f34597v == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0150, code lost:
    
        r10.f34577b.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0157, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015a, code lost:
    
        if (r7 != 1) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x015c, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015e, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015f, code lost:
    
        r10.f34591p = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0161, code lost:
    
        if (r8 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0163, code lost:
    
        x(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0167, code lost:
    
        r10.f34577b.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x016e, code lost:
    
        if (r10.f34592q == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0170, code lost:
    
        w(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0174, code lost:
    
        v(r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018b, code lost:
    
        throw new java.lang.IllegalAccessException(ia.f.o("invalid connection count %d, the connection count must be larger than 0", java.lang.Integer.valueOf(r7)));
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c0 A[Catch: all -> 0x01f5, TryCatch #11 {all -> 0x01f5, blocks: (B:3:0x0003, B:6:0x0012, B:8:0x001a, B:10:0x001e, B:11:0x0030, B:24:0x008d, B:26:0x0091, B:27:0x0096, B:29:0x009a, B:31:0x009e, B:42:0x00c6, B:44:0x00e2, B:55:0x0100, B:69:0x0136, B:71:0x013a, B:85:0x015f, B:87:0x0163, B:88:0x0167, B:90:0x0170, B:91:0x0174, B:92:0x0178, B:93:0x018b, B:94:0x018c, B:117:0x01ba, B:119:0x01c0, B:120:0x01c5), top: B:156:0x0003, inners: #15, #12, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.download.DownloadLaunchRunnable.run():void");
    }

    public void s() {
        this.f34596u = true;
        c cVar = this.f34590o;
        if (cVar != null) {
            cVar.c();
        }
        for (c cVar2 : (ArrayList) this.f34589n.clone()) {
            if (cVar2 != null) {
                cVar2.c();
            }
        }
    }

    public void u() {
        p(this.f34583h.m(this.f34579d.g()));
        this.f34577b.r();
    }

    public final void v(long j10, int i10) throws InterruptedException {
        long j11 = j10 / ((long) i10);
        int iG = this.f34579d.g();
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        int i11 = 0;
        while (i11 < i10) {
            long j13 = i11 == i10 + (-1) ? -1L : (j12 + j11) - 1;
            fa.a aVar = new fa.a();
            aVar.i(iG);
            aVar.j(i11);
            aVar.k(j12);
            aVar.g(j12);
            aVar.h(j13);
            arrayList.add(aVar);
            this.f34583h.a(aVar);
            j12 += j11;
            i11++;
        }
        this.f34579d.t(i10);
        this.f34583h.o(iG, i10);
        j(arrayList, j10);
    }

    public final void w(int i10, List<fa.a> list) throws InterruptedException {
        if (i10 <= 1 || list.size() != i10) {
            throw new IllegalArgumentException();
        }
        j(list, this.f34579d.m());
    }

    public final void x(long j10) throws IllegalAccessException, IOException {
        com.liulishuo.filedownloader.download.b bVarC;
        if (this.f34593r) {
            bVarC = b.C0411b.c(this.f34579d.i(), this.f34579d.i(), j10 - this.f34579d.i());
        } else {
            this.f34579d.z(0L);
            bVarC = b.C0411b.a(j10);
        }
        this.f34590o = new c.b().g(this.f34579d.g()).c(-1).b(this).i(this.f34579d.n()).e(this.f34579d.d()).f(this.f34580e).j(this.f34582g).d(bVarC).h(this.f34579d.l()).a();
        this.f34579d.t(1);
        this.f34583h.o(this.f34579d.g(), 1);
        if (!this.f34596u) {
            this.f34590o.run();
        } else {
            this.f34579d.A((byte) -2);
            this.f34590o.c();
        }
    }

    public final void y() throws IllegalAccessException, FileDownloadSecurityException, IOException, RetryDirectly {
        z9.b bVarC = null;
        try {
            com.liulishuo.filedownloader.download.a aVarA = new a.b().c(this.f34579d.g()).f(this.f34579d.n()).d(this.f34579d.d()).e(this.f34580e).b(this.f34587l ? b.C0411b.e() : b.C0411b.d()).a();
            bVarC = aVarA.c();
            n(aVarA.g(), aVarA, bVarC);
        } finally {
            if (bVarC != null) {
                bVarC.c();
            }
        }
    }
}
