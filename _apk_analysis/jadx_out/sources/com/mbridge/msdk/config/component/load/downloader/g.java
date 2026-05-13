package com.mbridge.msdk.config.component.load.downloader;

import com.mbridge.msdk.config.component.load.downloader.core.i;
import com.mbridge.msdk.config.component.load.downloader.core.l;

/* JADX INFO: compiled from: MBDownloadManager.java */
/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f36204a;

    /* JADX INFO: compiled from: MBDownloadManager.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final g f36205a = new g();
    }

    private g() {
        this.f36204a = false;
    }

    public static g a() {
        return b.f36205a;
    }

    public synchronized com.mbridge.msdk.config.component.load.downloader.core.e a(com.mbridge.msdk.config.component.load.downloader.b<?> bVar) {
        return new com.mbridge.msdk.config.component.load.downloader.core.e(bVar);
    }

    public void a(f fVar) {
        if (this.f36204a) {
            return;
        }
        l.c().a(fVar);
        i.b().a(fVar.e());
        com.mbridge.msdk.config.component.load.downloader.core.f.a().c();
        this.f36204a = true;
    }

    public synchronized void a(String str) {
        com.mbridge.msdk.config.component.load.downloader.core.f.a().a(str);
    }

    public synchronized String b(String str) {
        return com.mbridge.msdk.config.component.load.downloader.resource.a.a().a(str);
    }

    public boolean b() {
        return this.f36204a;
    }
}
