package com.mbridge.msdk.config.component.load.downloader.core;

/* JADX INFO: compiled from: ExecutorManager.java */
/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f36120a;

    /* JADX INFO: compiled from: ExecutorManager.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final i f36121a = new i();
    }

    private i() {
    }

    public static i b() {
        return b.f36121a;
    }

    public j a() {
        if (this.f36120a == null) {
            this.f36120a = new com.mbridge.msdk.config.component.load.downloader.core.a(10);
        }
        return this.f36120a;
    }

    public void a(int i10) {
        this.f36120a = new com.mbridge.msdk.config.component.load.downloader.core.a(i10);
    }
}
