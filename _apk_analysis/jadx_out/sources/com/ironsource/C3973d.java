package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3973d implements InterfaceC3944b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3969cd f31172a;

    public C3973d(@NotNull C3969cd c3969cd) {
        tn.p.k(c3969cd, "folderRootUrl");
        this.f31172a = c3969cd;
    }

    @Override // com.ironsource.InterfaceC3944b6
    @NotNull
    public String value() {
        return this.f31172a.a() + "/abTestMap.json";
    }
}
