package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.hd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4059hd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f31879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EnumC4130ld f31882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f31883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f31884f;

    /* JADX INFO: renamed from: com.ironsource.hd$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f31885a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f31886b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f31887c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private EnumC4130ld f31888d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f31889e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f31890f = 0;

        public a a(boolean z10) {
            this.f31885a = z10;
            return this;
        }

        public a a(boolean z10, int i10) {
            this.f31887c = z10;
            this.f31890f = i10;
            return this;
        }

        public a a(boolean z10, EnumC4130ld enumC4130ld, int i10) {
            this.f31886b = z10;
            if (enumC4130ld == null) {
                enumC4130ld = EnumC4130ld.PER_DAY;
            }
            this.f31888d = enumC4130ld;
            this.f31889e = i10;
            return this;
        }

        public C4059hd a() {
            return new C4059hd(this.f31885a, this.f31886b, this.f31887c, this.f31888d, this.f31889e, this.f31890f);
        }
    }

    private C4059hd(boolean z10, boolean z11, boolean z12, EnumC4130ld enumC4130ld, int i10, int i11) {
        this.f31879a = z10;
        this.f31880b = z11;
        this.f31881c = z12;
        this.f31882d = enumC4130ld;
        this.f31883e = i10;
        this.f31884f = i11;
    }

    public EnumC4130ld a() {
        return this.f31882d;
    }

    public int b() {
        return this.f31883e;
    }

    public int c() {
        return this.f31884f;
    }

    public boolean d() {
        return this.f31880b;
    }

    public boolean e() {
        return this.f31879a;
    }

    public boolean f() {
        return this.f31881c;
    }
}
