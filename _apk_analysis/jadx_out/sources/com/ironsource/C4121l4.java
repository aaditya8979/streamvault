package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4121l4 implements InterfaceC4350y7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f32192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f32193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f32194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3969cd f32195d;

    public C4121l4() {
        this(null, null, false, null, 15, null);
    }

    public C4121l4(@NotNull String str, @NotNull String str2, boolean z10, @NotNull C3969cd c3969cd) {
        tn.p.k(str, "controllerUrl");
        tn.p.k(str2, "cacheFolder");
        tn.p.k(c3969cd, "rootFolder");
        this.f32192a = str;
        this.f32193b = str2;
        this.f32194c = z10;
        this.f32195d = c3969cd;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C4121l4(String str, String str2, boolean z10, C3969cd c3969cd, int i10, tn.i iVar) {
        str = (i10 & 1) != 0 ? "" : str;
        this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? new C3969cd(str) : c3969cd);
    }

    @Override // com.ironsource.InterfaceC4350y7
    @NotNull
    public String a() {
        return this.f32192a;
    }

    @Override // com.ironsource.InterfaceC4350y7
    public boolean b() {
        return this.f32194c;
    }

    @Override // com.ironsource.InterfaceC4350y7
    @NotNull
    public C3969cd c() {
        return this.f32195d;
    }

    @Override // com.ironsource.InterfaceC4350y7
    @NotNull
    public String d() {
        return this.f32193b;
    }
}
