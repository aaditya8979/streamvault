package com.ironsource;

import com.ironsource.C3923a3;
import com.ironsource.O0;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3923a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final O0 f30875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final I0 f30876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final F2 f30877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final bn.g f30878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final bn.g f30879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f30880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f30881g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f30882h;

    /* JADX INFO: renamed from: com.ironsource.a3$a */
    public static final class a extends Lambda implements sn.a<C4337xb> {
        public a() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C3923a3 c3923a3) {
            tn.p.k(c3923a3, "this$0");
            c3923a3.f30877c.c();
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4337xb invoke() {
            final C3923a3 c3923a3 = C3923a3.this;
            return new C4337xb(new Runnable() { // from class: com.ironsource.xj
                @Override // java.lang.Runnable
                public final void run() {
                    C3923a3.a.a(c3923a3);
                }
            }, com.ironsource.lifecycle.b.d(), new Vf());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.a3$b */
    public static final class b extends Lambda implements sn.a<C4337xb> {
        public b() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(C3923a3 c3923a3) {
            tn.p.k(c3923a3, "this$0");
            c3923a3.f30877c.d();
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4337xb invoke() {
            final C3923a3 c3923a3 = C3923a3.this;
            return new C4337xb(new Runnable() { // from class: com.ironsource.yj
                @Override // java.lang.Runnable
                public final void run() {
                    C3923a3.b.a(c3923a3);
                }
            }, com.ironsource.lifecycle.b.d(), new Vf());
        }
    }

    public C3923a3(@NotNull O0 o02, @NotNull I0 i02, @NotNull F2 f22) {
        tn.p.k(o02, "loadingData");
        tn.p.k(i02, "interactionData");
        tn.p.k(f22, "mListener");
        this.f30875a = o02;
        this.f30876b = i02;
        this.f30877c = f22;
        this.f30878d = kotlin.b.b(new a());
        this.f30879e = kotlin.b.b(new b());
        this.f30880f = o02.b() > 0;
        this.f30881g = i02.b() > 0;
        this.f30882h = o02.a() == O0.a.MANUAL_WITH_LOAD_ON_SHOW;
    }

    private final void a(long j10) {
        if (this.f30882h && this.f30880f) {
            c().a(j10);
        }
    }

    private final void b(long j10) {
        if (this.f30882h && this.f30881g) {
            d().a(j10);
        }
    }

    private final C4337xb c() {
        return (C4337xb) this.f30878d.getValue();
    }

    private final C4337xb d() {
        return (C4337xb) this.f30879e.getValue();
    }

    private final void f() {
        if (this.f30882h) {
            c().b();
        }
    }

    private final void g() {
        if (this.f30882h) {
            d().b();
        }
    }

    public final void a() {
        IronLog.INTERNAL.verbose();
        f();
    }

    public final void b() {
        IronLog.INTERNAL.verbose();
        g();
    }

    public final void e() {
        IronLog.INTERNAL.verbose();
        b(this.f30876b.b());
    }

    public final void h() {
        if (!this.f30880f) {
            IronLog.INTERNAL.verbose("banner reload interval is disabled");
        } else {
            IronLog.INTERNAL.verbose();
            a(this.f30875a.b());
        }
    }
}
