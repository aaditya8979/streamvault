package com.bykv.vk.openvk.preload.a;

/* JADX INFO: compiled from: Pipe.java */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class<? extends d> f11339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f11340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object[] f11341c;

    /* JADX INFO: compiled from: Pipe.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Class<? extends d> f11342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.a.b.a f11343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object[] f11344c;

        private a() {
        }

        public static a a() {
            return new a();
        }

        public final a a(com.bykv.vk.openvk.preload.a.b.a aVar) {
            this.f11343b = aVar;
            return this;
        }

        public final a a(Class<? extends d> cls) {
            if (cls == null) {
                throw new IllegalArgumentException("interceptor class == null");
            }
            this.f11342a = cls;
            return this;
        }

        public final a a(Object... objArr) {
            this.f11344c = objArr;
            return this;
        }

        public final h b() {
            return new h(this, (byte) 0);
        }
    }

    private h(a aVar) {
        this.f11339a = aVar.f11342a;
        this.f11340b = aVar.f11343b;
        this.f11341c = aVar.f11344c;
        if (this.f11339a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }

    public /* synthetic */ h(a aVar, byte b10) {
        this(aVar);
    }

    public final com.bykv.vk.openvk.preload.a.b.a a() {
        return this.f11340b;
    }

    public final Object[] b() {
        return this.f11341c;
    }
}
