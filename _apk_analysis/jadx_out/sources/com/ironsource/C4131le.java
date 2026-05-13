package com.ironsource;

import com.ironsource.Ne;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.le, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C4131le {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4289ue f32204a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4131le(@NotNull C4131le c4131le) {
        this(c4131le.f32204a);
        tn.p.k(c4131le, "sdkConfig");
    }

    public C4131le(@NotNull C4289ue c4289ue) {
        tn.p.k(c4289ue, "sdkInitResponse");
        this.f32204a = c4289ue;
    }

    @NotNull
    public final K1 a() {
        return this.f32204a.a().b().d();
    }

    @NotNull
    public final D1 b() {
        return this.f32204a.a().b().b();
    }

    @NotNull
    public final Q5 c() {
        return this.f32204a.b();
    }

    @NotNull
    public final Ne d() {
        return this.f32204a.c();
    }

    @NotNull
    public final Hb e() {
        return this.f32204a.a().b().f();
    }

    @NotNull
    public final Ne.a f() {
        Ne.a aVarI = this.f32204a.c().i();
        tn.p.j(aVarI, "sdkInitResponse.fullResponse.origin");
        return aVarI;
    }

    @NotNull
    public final C4289ue g() {
        return this.f32204a;
    }
}
