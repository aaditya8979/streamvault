package com.mbridge.msdk.config.component.load.downloader.core;

import android.text.TextUtils;
import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: DownloadRequest.java */
/* JADX INFO: loaded from: classes8.dex */
public class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f36061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.b<T> f36062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.c f36063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f36064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f36065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Future f36066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap<String, List<String>> f36067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.h f36068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f36069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f36070j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f36072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.e f36073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f36074n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f36076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f36077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f36078r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile int f36071k = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f36075o = 0;

    /* JADX INFO: compiled from: DownloadRequest.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f36079a;

        public a(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f36079a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f36068h != null) {
                    d.this.f36068h.a(this.f36079a);
                }
                d.this.b();
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: DownloadRequest.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f36081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.a f36082b;

        public b(com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
            this.f36081a = bVar;
            this.f36082b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f36071k >= d.this.f36070j) {
                    d.this.a(com.mbridge.msdk.config.component.load.downloader.e.FAILED);
                    if (d.this.f36068h != null) {
                        d.this.f36068h.a(this.f36081a, this.f36082b);
                    }
                    d.this.b();
                    return;
                }
                d.this.a(com.mbridge.msdk.config.component.load.downloader.e.RETRY);
                d.this.f36071k++;
                d.this.a(0L);
                d.this.b(0L);
                com.mbridge.msdk.config.component.load.downloader.core.f.a().b(d.this);
                com.mbridge.msdk.config.component.load.downloader.core.f.a().a(d.this);
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: DownloadRequest.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f36084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ DownloadProgress f36085b;

        public c(com.mbridge.msdk.config.component.load.downloader.b bVar, DownloadProgress downloadProgress) {
            this.f36084a = bVar;
            this.f36085b = downloadProgress;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f36068h != null) {
                    d.this.f36068h.a(this.f36084a, this.f36085b);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.core.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DownloadRequest.java */
    public class RunnableC0426d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f36087a;

        public RunnableC0426d(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f36087a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f36068h != null) {
                    d.this.f36068h.c(this.f36087a);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: DownloadRequest.java */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f36089a;

        public e(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f36089a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f36068h != null) {
                    d.this.f36068h.b(this.f36089a);
                }
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: DownloadRequest.java */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.b f36091a;

        public f(com.mbridge.msdk.config.component.load.downloader.b bVar) {
            this.f36091a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.this.f36065e != null && !d.this.f36065e.isEmpty()) {
                    String str = (String) d.this.f36065e.get("responseHeaders");
                    if (!TextUtils.isEmpty(str)) {
                        this.f36091a.a("responseHeaders", str);
                    }
                }
                if (d.this.f36068h != null) {
                    d.this.f36068h.d(this.f36091a);
                }
                d.this.b();
            } catch (Exception e10) {
                q0.b("DownloadRequest", e10.getMessage());
            }
        }
    }

    public d(com.mbridge.msdk.config.component.load.downloader.core.e<T> eVar) {
        this.f36067g = eVar.f36098f;
        this.f36063c = eVar.f36095c;
        this.f36069i = eVar.f36099g;
        this.f36061a = eVar.f36093a;
        this.f36076p = eVar.f36102j;
        this.f36062b = eVar.f36094b;
        this.f36078r = eVar.f36103k;
        this.f36068h = eVar.f36096d;
        this.f36070j = eVar.f36100h;
        this.f36074n = eVar.f36101i;
        this.f36065e = eVar.f36097e;
    }

    public static d a(com.mbridge.msdk.config.component.load.downloader.core.e eVar) {
        return new d(eVar);
    }

    private void a() {
        this.f36068h = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        a();
        com.mbridge.msdk.config.component.load.downloader.core.f.a().b(this);
    }

    public String a(String str, String str2) {
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(this.f36065e) || !this.f36065e.containsKey(str) || TextUtils.isEmpty(str)) {
            return str2;
        }
        String str3 = this.f36065e.get(str);
        return TextUtils.isEmpty(str3) ? str2 : str3;
    }

    public void a(int i10) {
        this.f36072l = i10;
    }

    public void a(long j10) {
        this.f36064d = j10;
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        this.f36073m = com.mbridge.msdk.config.component.load.downloader.e.CANCELLED;
        Future future = this.f36066f;
        if (future != null) {
            future.cancel(false);
        }
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b<T> bVar, DownloadProgress downloadProgress) {
        if (this.f36073m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            i.b().a().getDownloadResultTasks().execute(new c(bVar, downloadProgress));
        }
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.b<T> bVar, com.mbridge.msdk.config.component.load.downloader.a aVar) {
        if (this.f36073m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            a(com.mbridge.msdk.config.component.load.downloader.e.FAILED);
            i.b().a().getDownloadResultTasks().execute(new b(bVar, aVar));
        }
    }

    public void a(com.mbridge.msdk.config.component.load.downloader.e eVar) {
        this.f36073m = eVar;
    }

    public void a(String str) {
        this.f36077q = str;
    }

    public void a(Future future) {
        this.f36066f = future;
    }

    public void b(long j10) {
        this.f36075o = j10;
    }

    public void b(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        i.b().a().getDownloadResultTasks().execute(new a(bVar));
    }

    public long c() {
        return this.f36061a;
    }

    public void c(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        if (this.f36073m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            i.b().a().getDownloadResultTasks().execute(new e(bVar));
        }
    }

    public com.mbridge.msdk.config.component.load.downloader.b<T> d() {
        return this.f36062b;
    }

    public void d(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        if (this.f36073m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            i.b().a().getDownloadResultTasks().execute(new RunnableC0426d(bVar));
        }
    }

    public com.mbridge.msdk.config.component.load.downloader.c e() {
        return this.f36063c;
    }

    public void e(com.mbridge.msdk.config.component.load.downloader.b<T> bVar) {
        if (this.f36073m != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            a(com.mbridge.msdk.config.component.load.downloader.e.COMPLETED);
            i.b().a().getDownloadResultTasks().execute(new f(bVar));
        }
    }

    public String f() {
        com.mbridge.msdk.config.component.load.downloader.b<T> bVar = this.f36062b;
        if (bVar != null) {
            return bVar.d();
        }
        return null;
    }

    public long g() {
        return this.f36064d;
    }

    public long h() {
        return this.f36069i;
    }

    public int i() {
        return this.f36072l;
    }

    public com.mbridge.msdk.config.component.load.downloader.e j() {
        return this.f36073m;
    }

    public long k() {
        return this.f36074n;
    }

    public long l() {
        return this.f36075o;
    }

    public long m() {
        return this.f36078r;
    }

    public void n() {
        com.mbridge.msdk.config.component.load.downloader.core.f.a().a(this);
    }
}
