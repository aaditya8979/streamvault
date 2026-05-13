package com.liulishuo.filedownloader.download;

import android.os.SystemClock;
import ia.f;
import java.io.IOException;

/* JADX INFO: compiled from: FetchDataTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ba.c f34641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f34643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f34644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z9.b f34645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f34646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f34647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f34648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f34649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f34650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f34651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ha.a f34652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f34653m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final aa.a f34654n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile long f34655o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile long f34656p;

    /* JADX INFO: compiled from: FetchDataTask.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f34657a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public z9.b f34658b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public com.liulishuo.filedownloader.download.b f34659c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ba.c f34660d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f34661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Boolean f34662f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f34663g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Integer f34664h;

        public d a() throws IllegalArgumentException {
            z9.b bVar;
            com.liulishuo.filedownloader.download.b bVar2;
            Integer num;
            if (this.f34662f == null || (bVar = this.f34658b) == null || (bVar2 = this.f34659c) == null || this.f34660d == null || this.f34661e == null || (num = this.f34664h) == null || this.f34663g == null) {
                throw new IllegalArgumentException();
            }
            return new d(bVar, bVar2, this.f34657a, num.intValue(), this.f34663g.intValue(), this.f34662f.booleanValue(), this.f34660d, this.f34661e);
        }

        public b b(ba.c cVar) {
            this.f34660d = cVar;
            return this;
        }

        public b c(z9.b bVar) {
            this.f34658b = bVar;
            return this;
        }

        public b d(int i10) {
            this.f34663g = Integer.valueOf(i10);
            return this;
        }

        public b e(com.liulishuo.filedownloader.download.b bVar) {
            this.f34659c = bVar;
            return this;
        }

        public b f(int i10) {
            this.f34664h = Integer.valueOf(i10);
            return this;
        }

        public b g(c cVar) {
            this.f34657a = cVar;
            return this;
        }

        public b h(String str) {
            this.f34661e = str;
            return this;
        }

        public b i(boolean z10) {
            this.f34662f = Boolean.valueOf(z10);
            return this;
        }
    }

    public d(z9.b bVar, com.liulishuo.filedownloader.download.b bVar2, c cVar, int i10, int i11, boolean z10, ba.c cVar2, String str) {
        this.f34655o = 0L;
        this.f34656p = 0L;
        this.f34641a = cVar2;
        this.f34650j = str;
        this.f34645e = bVar;
        this.f34646f = z10;
        this.f34644d = cVar;
        this.f34643c = i11;
        this.f34642b = i10;
        this.f34654n = ba.a.j().f();
        this.f34647g = bVar2.f34622a;
        this.f34648h = bVar2.f34624c;
        this.f34651k = bVar2.f34623b;
        this.f34649i = bVar2.f34625d;
    }

    public final void a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (f.L(this.f34651k - this.f34655o, jElapsedRealtime - this.f34656p)) {
            d();
            this.f34655o = this.f34651k;
            this.f34656p = jElapsedRealtime;
        }
    }

    public void b() {
        this.f34653m = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e6, code lost:
    
        throw new com.liulishuo.filedownloader.exception.FileDownloadNetworkPolicyException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.download.d.c():void");
    }

    public final void d() {
        boolean z10;
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            this.f34652l.flushAndSync();
            z10 = true;
        } catch (IOException e10) {
            if (ia.d.f64033a) {
                ia.d.a(this, "Because of the system cannot guarantee that all the buffers have been synchronized with physical media, or write to filefailed, we just not flushAndSync process to database too %s", e10);
            }
            z10 = false;
        }
        if (z10) {
            int i10 = this.f34643c;
            if (i10 >= 0) {
                this.f34654n.d(this.f34642b, i10, this.f34651k);
            } else {
                this.f34641a.f();
            }
            if (ia.d.f64033a) {
                ia.d.a(this, "require flushAndSync id[%d] index[%d] offset[%d], consume[%d]", Integer.valueOf(this.f34642b), Integer.valueOf(this.f34643c), Long.valueOf(this.f34651k), Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
            }
        }
    }
}
