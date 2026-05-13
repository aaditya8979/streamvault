package com.ironsource;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.InterfaceC4128lb;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4110kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4146mb f32153a;

    /* JADX INFO: renamed from: com.ironsource.kb$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private C4110kb f32154a = new C4110kb(null);

        @NotNull
        public final a a(@NotNull InterfaceC4184ob interfaceC4184ob) {
            tn.p.k(interfaceC4184ob, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.f32154a.a(interfaceC4184ob);
            return this;
        }

        @NotNull
        public final a a(@NotNull String str) {
            tn.p.k(str, "adUnitId");
            this.f32154a.a(str);
            return this;
        }

        @NotNull
        public final C4110kb a() {
            return this.f32154a;
        }

        @NotNull
        public final a b(@NotNull String str) {
            tn.p.k(str, "placementName");
            this.f32154a.b(str);
            return this;
        }
    }

    private C4110kb() {
        this.f32153a = new C4146mb(C4367z7.f34502a.a(), this);
    }

    public /* synthetic */ C4110kb(tn.i iVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.f32153a.a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(String str) {
        this.f32153a.b(str);
    }

    public final void a() {
        this.f32153a.f();
    }

    public final void a(@Nullable InterfaceC4184ob interfaceC4184ob) {
        this.f32153a.a(interfaceC4184ob);
    }

    @Nullable
    public final String b() {
        return this.f32153a.h();
    }

    @Nullable
    public final String c() {
        return this.f32153a.i();
    }

    @Nullable
    public final String d() {
        return this.f32153a.j();
    }

    @Nullable
    public final InterfaceC4128lb.a e() {
        return this.f32153a.k();
    }

    @Nullable
    public final AdapterNativeAdViewBinder f() {
        return this.f32153a.l();
    }

    @Nullable
    public final String g() {
        return this.f32153a.m();
    }

    public final void h() {
        this.f32153a.n();
    }
}
