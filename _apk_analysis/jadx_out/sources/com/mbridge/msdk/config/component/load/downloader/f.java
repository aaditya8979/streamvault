package com.mbridge.msdk.config.component.load.downloader;

/* JADX INFO: compiled from: MBDownloadConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f36190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f36191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f36192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f36193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36196g;

    /* JADX INFO: compiled from: MBDownloadConfig.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f36197a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f36198b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f36199c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f36200d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f36201e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f36202f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f36203g;

        public b() {
            this(null);
        }

        public b(f fVar) {
            this.f36197a = 20000L;
            this.f36198b = 10L;
            this.f36199c = 20000L;
            this.f36200d = 20000L;
            this.f36201e = 64;
            this.f36202f = 20;
            this.f36203g = 10;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(fVar)) {
                this.f36199c = fVar.c();
                this.f36197a = fVar.a();
                this.f36201e = fVar.f();
                this.f36200d = fVar.d();
                this.f36202f = fVar.g();
                this.f36198b = fVar.b();
                this.f36203g = fVar.e();
            }
        }

        public b a(int i10) {
            this.f36203g = i10;
            return this;
        }

        public f a() {
            return new f(this);
        }
    }

    private f(b bVar) {
        this.f36190a = bVar.f36197a;
        this.f36192c = bVar.f36199c;
        this.f36193d = bVar.f36200d;
        this.f36194e = bVar.f36201e;
        this.f36195f = bVar.f36202f;
        this.f36191b = bVar.f36198b;
        this.f36196g = bVar.f36203g;
    }

    public long a() {
        return this.f36190a;
    }

    public long b() {
        return this.f36191b;
    }

    public long c() {
        return this.f36192c;
    }

    public long d() {
        return this.f36193d;
    }

    public int e() {
        return this.f36196g;
    }

    public int f() {
        return this.f36194e;
    }

    public int g() {
        return this.f36195f;
    }
}
