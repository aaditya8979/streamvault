package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.jc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4093jc {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f32072e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private static volatile C4093jc f32073f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Cd f32074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f32075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private String f32076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private T3 f32077d;

    /* JADX INFO: renamed from: com.ironsource.jc$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final InterfaceC3993e1 a(@NotNull IronSource.a aVar) {
            tn.p.k(aVar, "adFormat");
            C4093jc c4093jc = C4093jc.f32073f;
            T3 t3B = c4093jc != null ? c4093jc.b() : null;
            C4093jc c4093jc2 = C4093jc.f32073f;
            Cd cdE = c4093jc2 != null ? c4093jc2.e() : null;
            return (t3B == null || cdE == null) ? new C4160n5() : new C4227r3(t3B, cdE, aVar);
        }

        @NotNull
        public final C4093jc a() {
            C4093jc c4093jc = C4093jc.f32073f;
            if (c4093jc == null) {
                synchronized (this) {
                    c4093jc = C4093jc.f32073f;
                    if (c4093jc == null) {
                        c4093jc = new C4093jc(null);
                        C4093jc.f32073f = c4093jc;
                    }
                }
            }
            return c4093jc;
        }
    }

    private C4093jc() {
        this.f32075b = new AtomicBoolean(false);
        this.f32076c = "";
    }

    public /* synthetic */ C4093jc(tn.i iVar) {
        this();
    }

    @NotNull
    public static final C4093jc d() {
        return f32072e.a();
    }

    public final void a(@Nullable Cd cd2) {
        this.f32074a = cd2;
    }

    public final void a(@Nullable T3 t32) {
        this.f32077d = t32;
    }

    public final void a(@NotNull String str) {
        tn.p.k(str, "<set-?>");
        this.f32076c = str;
    }

    @Nullable
    public final T3 b() {
        return this.f32077d;
    }

    @NotNull
    public final AtomicBoolean c() {
        return this.f32075b;
    }

    @Nullable
    public final Cd e() {
        return this.f32074a;
    }

    @NotNull
    public final String f() {
        return this.f32076c;
    }

    public final void g() {
        this.f32075b.set(true);
    }
}
