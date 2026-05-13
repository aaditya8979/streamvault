package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.b0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: OkHTTPFileDownloadTask.java */
/* JADX INFO: loaded from: classes11.dex */
class n implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.c f36133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f36134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f36135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.database.b f36136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.d f36137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InputStream f36138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.resource.stream.a f36139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b0 f36140h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f36141i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f36142j;

    private n(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        this.f36134b = dVar;
        this.f36136d = bVar;
        this.f36133a = cVar;
        this.f36135c = bVar2;
    }

    public static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.database.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar, com.mbridge.msdk.config.component.load.downloader.b bVar2) {
        return new n(dVar, bVar, cVar, bVar2);
    }

    private com.mbridge.msdk.config.component.load.downloader.d a(String str, String str2) throws IllegalAccessException, IOException {
        com.mbridge.msdk.config.component.load.downloader.d dVar;
        com.mbridge.msdk.config.component.load.downloader.d dVar2 = new com.mbridge.msdk.config.component.load.downloader.d();
        this.f36142j = System.currentTimeMillis();
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(this.f36136d)) {
            com.mbridge.msdk.config.component.load.downloader.database.b bVarA = com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f36135c.d(), str, this.f36142j, 0L, System.currentTimeMillis(), this.f36134b.l(), this.f36141i, 0, "");
            this.f36136d = bVarA;
            this.f36133a.a(bVarA);
        } else {
            com.mbridge.msdk.config.component.load.downloader.database.b bVarA2 = com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f36136d.c(), this.f36136d.e(), this.f36136d.b(), this.f36136d.i(), this.f36136d.h(), this.f36136d.g(), this.f36141i, 0, this.f36136d.d());
            this.f36136d = bVarA2;
            this.f36133a.a(bVarA2, str);
        }
        com.mbridge.msdk.config.component.load.downloader.resource.stream.a aVarB = com.mbridge.msdk.config.component.load.downloader.resource.a.a().b(new File(str));
        this.f36139g = aVarB;
        aVarB.seek(this.f36134b.g());
        byte[] bArr = new byte[l.c().a()];
        while (true) {
            int i10 = this.f36138f.read(bArr);
            if (i10 == -1) {
                dVar = dVar2;
                break;
            }
            this.f36139g.write(bArr, 0, i10);
            d dVar3 = this.f36134b;
            dVar3.a(dVar3.g() + ((long) i10));
            this.f36139g.flushAndSync();
            int iA = com.mbridge.msdk.config.component.load.downloader.utils.b.a(this.f36134b.l(), this.f36134b.g());
            dVar = dVar2;
            a(this.f36134b, this.f36135c, this.f36134b.g(), this.f36134b.l(), iA);
            if (this.f36135c.c() != 100 && iA >= this.f36135c.c()) {
                break;
            }
            if (this.f36134b.j() == com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
                dVar.a(true);
                break;
            }
            dVar2 = dVar;
        }
        l.c().b().a(str2, str, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f36135c.d(), this.f36135c.e(), this.f36142j, System.currentTimeMillis(), 0L, this.f36134b.l(), this.f36141i, 0, ""));
        try {
            if (this.f36134b.j() != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED && this.f36134b.l() == this.f36134b.g()) {
                String strC = com.mbridge.msdk.config.component.common.file.a.c(this.f36135c.e());
                this.f36135c.a(strC);
                this.f36133a.a(com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f36135c.d(), this.f36135c.e(), this.f36142j, System.currentTimeMillis(), System.currentTimeMillis(), this.f36134b.l(), this.f36141i, 1, strC), this.f36135c.e());
            }
        } catch (Throwable th2) {
            q0.b(IDownloadTask.TAG, th2.getMessage(), th2);
        }
        if (!dVar.b()) {
            dVar.b(true);
        }
        return dVar;
    }

    private com.mbridge.msdk.config.component.load.downloader.d a(String str, String str2, a0 a0Var, int i10) throws IllegalAccessException, IOException {
        com.mbridge.msdk.config.component.load.downloader.d dVar = new com.mbridge.msdk.config.component.load.downloader.d();
        boolean z10 = !a(i10, this.f36136d);
        boolean z11 = (a0Var == null || this.f36134b == null || i10 != 206 || a0Var.d() == null || this.f36134b.l() <= 0 || a0Var.d().k() == this.f36134b.l() - this.f36134b.g()) ? false : true;
        if (z10 && z11) {
            this.f36134b.a(0L);
            this.f36134b.b(0L);
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f36133a)) {
                this.f36133a.remove(str2, str);
            }
            this.f36136d = null;
            com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(new File(this.f36135c.e()));
        }
        b0 b0VarD = a0Var.d();
        this.f36140h = b0VarD;
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(b0VarD)) {
            dVar.a(new IOException("response body is null"));
            this.f36134b.b(0L);
            this.f36134b.a(0L);
            return dVar;
        }
        long jK = this.f36140h.k();
        String strA = a0Var.a("Content-Type", "");
        this.f36141i = strA;
        this.f36134b.a(strA);
        if (jK <= 0) {
            dVar.a(new IOException("response content length is null"));
            return dVar;
        }
        if (this.f36134b.l() == 0) {
            this.f36134b.b(jK);
        }
        InputStream inputStreamD = this.f36140h.d();
        this.f36138f = inputStreamD;
        if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(inputStreamD)) {
            dVar.a(new IOException("response inputStream is null"));
            return dVar;
        }
        this.f36135c.a(this.f36134b.l());
        this.f36134b.c(this.f36135c);
        return a(str, str2);
    }

    private void a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, long j10, long j11, int i10) {
        if (dVar.j() != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            if (bVar != null) {
                bVar.a(i10);
                bVar.a(j11);
            }
            dVar.a(bVar, new DownloadProgress(j10, j11, i10));
        }
    }

    private void a(String str, String str2, Exception exc) {
        try {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f36133a) && com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f36134b)) {
                if (!s0.a().a("r_f_s_d_e", true)) {
                    this.f36133a.remove(str2, str);
                    com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(new File(str));
                }
                this.f36134b.a(0L);
                this.f36134b.b(0L);
            }
        } catch (Exception e10) {
            q0.b(IDownloadTask.TAG, e10.getMessage(), e10);
        }
        this.f36137e.a(exc);
    }

    private boolean a(int i10, com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        return i10 == 206;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01b1  */
    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.mbridge.msdk.config.component.load.downloader.d run() {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.load.downloader.core.n.run():com.mbridge.msdk.config.component.load.downloader.d");
    }
}
