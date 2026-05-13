package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: Downloader.java */
/* JADX INFO: loaded from: classes11.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.config.component.load.downloader.c f36116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f36117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile d f36118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f36119d;

    public h(d<?> dVar) {
        this.f36118c = dVar;
        this.f36116a = dVar.e();
        this.f36117b = dVar.i();
    }

    @Override // java.lang.Runnable
    public void run() {
        q0.a(IDownloadTask.TAG, "开始下载任务");
        if (this.f36118c.j() != com.mbridge.msdk.config.component.load.downloader.e.RETRY) {
            this.f36118c.d(this.f36118c.d());
        }
        this.f36118c.a(com.mbridge.msdk.config.component.load.downloader.e.RUNNING);
        this.f36119d = this.f36118c.d();
        q0.a(IDownloadTask.TAG, "filePath ： " + this.f36119d.e());
        com.mbridge.msdk.config.component.load.downloader.d dVarRun = g.a(this.f36118c, this.f36119d, l.c().b()).run();
        if (dVarRun.c()) {
            this.f36118c.e(this.f36119d);
        } else if (dVarRun.a() != null) {
            this.f36118c.a(this.f36119d, dVarRun.a());
        } else if (dVarRun.b()) {
            this.f36118c.b(this.f36119d);
        }
    }
}
