package com.bykv.vk.openvk.preload.geckox.a.a;

/* JADX INFO: compiled from: CacheConfig.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f11381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f11382c;

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.a.a.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CacheConfig.java */
    public static final class C0172a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f11383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f11384b = b.f11386a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private c f11385c;

        public final C0172a a() {
            this.f11383a = 20;
            return this;
        }

        public final C0172a a(b bVar) {
            if (bVar == null) {
                bVar = b.f11386a;
            }
            this.f11384b = bVar;
            return this;
        }

        public final a b() {
            return new a(this, (byte) 0);
        }
    }

    private a(C0172a c0172a) {
        this.f11380a = c0172a.f11383a;
        this.f11382c = c0172a.f11384b;
        this.f11381b = c0172a.f11385c;
    }

    public /* synthetic */ a(C0172a c0172a, byte b10) {
        this(c0172a);
    }

    public final b a() {
        return this.f11382c;
    }
}
