package com.liulishuo.filedownloader.download;

import android.os.Process;
import com.liulishuo.filedownloader.download.a;
import com.liulishuo.filedownloader.download.d;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import ia.f;
import java.io.IOException;
import java.net.SocketException;

/* JADX INFO: compiled from: DownloadRunnable.java */
/* JADX INFO: loaded from: classes2.dex */
public class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.liulishuo.filedownloader.download.a f34628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ba.c f34629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f34630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f34631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f34632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f34633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f34634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f34635i;

    /* JADX INFO: compiled from: DownloadRunnable.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.b f34636a = new a.b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ba.c f34637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f34638c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f34639d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f34640e;

        public c a() {
            if (this.f34637b == null || this.f34638c == null || this.f34639d == null || this.f34640e == null) {
                throw new IllegalArgumentException(f.o("%s %s %B", this.f34637b, this.f34638c, this.f34639d));
            }
            com.liulishuo.filedownloader.download.a aVarA = this.f34636a.a();
            return new c(aVarA.f34610a, this.f34640e.intValue(), aVarA, this.f34637b, this.f34639d.booleanValue(), this.f34638c);
        }

        public b b(ba.c cVar) {
            this.f34637b = cVar;
            return this;
        }

        public b c(Integer num) {
            this.f34640e = num;
            return this;
        }

        public b d(com.liulishuo.filedownloader.download.b bVar) {
            this.f34636a.b(bVar);
            return this;
        }

        public b e(String str) {
            this.f34636a.d(str);
            return this;
        }

        public b f(FileDownloadHeader fileDownloadHeader) {
            this.f34636a.e(fileDownloadHeader);
            return this;
        }

        public b g(int i10) {
            this.f34636a.c(i10);
            return this;
        }

        public b h(String str) {
            this.f34638c = str;
            return this;
        }

        public b i(String str) {
            this.f34636a.f(str);
            return this;
        }

        public b j(boolean z10) {
            this.f34639d = Boolean.valueOf(z10);
            return this;
        }
    }

    public c(int i10, int i11, com.liulishuo.filedownloader.download.a aVar, ba.c cVar, boolean z10, String str) {
        this.f34634h = i10;
        this.f34635i = i11;
        this.f34633g = false;
        this.f34629c = cVar;
        this.f34630d = str;
        this.f34628b = aVar;
        this.f34631e = z10;
    }

    public void a() {
        c();
    }

    public final long b() {
        aa.a aVarF = ba.a.j().f();
        if (this.f34635i < 0) {
            FileDownloadModel fileDownloadModelN = aVarF.n(this.f34634h);
            if (fileDownloadModelN != null) {
                return fileDownloadModelN.i();
            }
            return 0L;
        }
        for (fa.a aVar : aVarF.m(this.f34634h)) {
            if (aVar.d() == this.f34635i) {
                return aVar.a();
            }
        }
        return 0L;
    }

    public void c() {
        this.f34633g = true;
        d dVar = this.f34632f;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z10;
        Exception e10;
        Process.setThreadPriority(10);
        long j10 = this.f34628b.f().f34623b;
        z9.b bVarC = null;
        boolean z11 = false;
        while (!this.f34633g) {
            try {
                try {
                    bVarC = this.f34628b.c();
                    int responseCode = bVarC.getResponseCode();
                    if (ia.d.f64033a) {
                        ia.d.a(this, "the connection[%d] for %d, is connected %s with code[%d]", Integer.valueOf(this.f34635i), Integer.valueOf(this.f34634h), this.f34628b.f(), Integer.valueOf(responseCode));
                    }
                    if (responseCode != 206 && responseCode != 200) {
                        throw new SocketException(f.o("Connection failed with request[%s] response[%s] http-state[%d] on task[%d-%d], which is changed after verify connection, so please try again.", this.f34628b.g(), bVarC.e(), Integer.valueOf(responseCode), Integer.valueOf(this.f34634h), Integer.valueOf(this.f34635i)));
                    }
                    try {
                        d.b bVar = new d.b();
                        if (this.f34633g) {
                            bVarC.c();
                            return;
                        }
                        d dVarA = bVar.f(this.f34634h).d(this.f34635i).b(this.f34629c).g(this).i(this.f34631e).c(bVarC).e(this.f34628b.f()).h(this.f34630d).a();
                        this.f34632f = dVarA;
                        dVarA.c();
                        if (this.f34633g) {
                            this.f34632f.b();
                        }
                    } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e11) {
                        e10 = e11;
                        z10 = true;
                        try {
                            if (!this.f34629c.a(e10)) {
                                this.f34629c.onError(e10);
                                if (bVarC == null) {
                                    return;
                                }
                            } else if (z10 && this.f34632f == null) {
                                ia.d.i(this, "it is valid to retry and connection is valid but create fetch-data-task failed, so give up directly with %s", e10);
                                this.f34629c.onError(e10);
                                if (bVarC == null) {
                                    return;
                                }
                            } else {
                                if (this.f34632f != null) {
                                    long jB = b();
                                    if (jB > 0) {
                                        this.f34628b.i(jB);
                                    }
                                }
                                this.f34629c.c(e10);
                                if (bVarC != null) {
                                    bVarC.c();
                                }
                                z11 = z10;
                            }
                        } finally {
                            if (bVarC != null) {
                                bVarC.c();
                            }
                        }
                    }
                } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e12) {
                    e10 = e12;
                    z10 = false;
                }
            } catch (FileDownloadGiveUpRetryException | IOException | IllegalAccessException | IllegalArgumentException e13) {
                z10 = z11;
                e10 = e13;
            }
            return;
        }
        if (bVarC != null) {
            bVarC.c();
        }
    }
}
