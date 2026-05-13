package com.mbridge.msdk.config.component.load.downloader.core;

import com.mbridge.msdk.config.component.load.downloader.DownloadProgress;
import com.mbridge.msdk.config.component.load.downloader.database.c;
import com.mbridge.msdk.foundation.download.core.IDownloadTask;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: DownloadTask.java */
/* JADX INFO: loaded from: classes11.dex */
public class g implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.load.downloader.database.c f36109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.b f36110c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile d f36113f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f36108a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.component.load.downloader.database.b f36111d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f36112e = true;

    /* JADX INFO: compiled from: DownloadTask.java */
    public class a implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f36114a;

        public a(CountDownLatch countDownLatch) {
            this.f36114a = countDownLatch;
        }

        @Override // com.mbridge.msdk.config.component.load.downloader.database.c.a
        public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
            synchronized (g.this.f36108a) {
                if (g.this.f36112e) {
                    g.this.f36111d = bVar;
                }
            }
            this.f36114a.countDown();
        }
    }

    private g(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar) {
        this.f36113f = dVar;
        this.f36110c = bVar;
        this.f36109b = cVar;
    }

    public static m a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar, com.mbridge.msdk.config.component.load.downloader.database.c cVar) {
        return new g(dVar, bVar, cVar);
    }

    private void a(d dVar, com.mbridge.msdk.config.component.load.downloader.b bVar) {
        if (dVar.j() != com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            long jG = this.f36113f.g();
            long jL = this.f36113f.l();
            dVar.a(bVar, new DownloadProgress(jG, jL, com.mbridge.msdk.config.component.load.downloader.utils.b.a(jL, jG)));
        }
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.core.m
    public com.mbridge.msdk.config.component.load.downloader.d run() {
        String strF = this.f36113f.f();
        if (this.f36113f.j() == com.mbridge.msdk.config.component.load.downloader.e.CANCELLED) {
            com.mbridge.msdk.config.component.load.downloader.d dVar = new com.mbridge.msdk.config.component.load.downloader.d();
            dVar.a(true);
            return dVar;
        }
        if (this.f36110c.c() == 0) {
            com.mbridge.msdk.config.component.load.downloader.d dVar2 = new com.mbridge.msdk.config.component.load.downloader.d();
            dVar2.b(true);
            return dVar2;
        }
        String strE = this.f36110c.e();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f36109b.a(strF, strE, new a(countDownLatch));
        try {
            try {
                countDownLatch.await(10L, TimeUnit.SECONDS);
                synchronized (this.f36108a) {
                    this.f36112e = false;
                }
            } catch (InterruptedException e10) {
                q0.a(IDownloadTask.TAG, e10.getMessage(), e10);
                countDownLatch.countDown();
                synchronized (this.f36108a) {
                    this.f36112e = false;
                }
            }
            com.mbridge.msdk.config.component.load.downloader.d dVarRun = k.a(this.f36113f, this.f36111d, this.f36109b, strF, this.f36110c).run();
            if (!com.mbridge.msdk.config.component.load.downloader.utils.a.a(dVarRun) || !dVarRun.c()) {
                if (this.f36110c != null) {
                    this.f36110c.a(false);
                }
                return n.a(this.f36113f, this.f36111d, this.f36109b, this.f36110c).run();
            }
            if (this.f36110c != null) {
                this.f36110c.a(true);
                this.f36110c.a(this.f36113f.l());
                this.f36110c.a(this.f36111d.d());
                this.f36110c.a(((this.f36113f.g() * 1.0f) / this.f36113f.l()) * 100.0f);
            }
            a(this.f36113f, this.f36110c);
            this.f36111d = com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f36111d.c(), this.f36111d.e(), this.f36111d.b(), this.f36111d.i(), System.currentTimeMillis(), this.f36113f.l(), this.f36111d.a(), this.f36111d.f(), this.f36111d.d());
            this.f36109b.a(this.f36111d, this.f36110c.e());
            return dVarRun;
        } catch (Throwable th2) {
            synchronized (this.f36108a) {
                this.f36112e = false;
                throw th2;
            }
        }
    }
}
