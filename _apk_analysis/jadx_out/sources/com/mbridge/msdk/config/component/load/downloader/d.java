package com.mbridge.msdk.config.component.load.downloader;

/* JADX INFO: compiled from: DownloadResponse.java */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f36146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36148c;

    public a a() {
        return this.f36146a;
    }

    public void a(a aVar) {
        this.f36146a = aVar;
        b(false);
    }

    public void a(Exception exc) {
        a(new a(exc));
    }

    public void a(boolean z10) {
        this.f36147b = z10;
    }

    public void b(boolean z10) {
        this.f36148c = z10;
    }

    public boolean b() {
        return this.f36147b;
    }

    public boolean c() {
        return this.f36148c;
    }
}
