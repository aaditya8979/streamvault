package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.lg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4133lg implements InterfaceC3944b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3969cd f32207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f32208b;

    public C4133lg(@NotNull C3969cd c3969cd, @NotNull String str) {
        tn.p.k(c3969cd, "folderRootUrl");
        tn.p.k(str, "version");
        this.f32207a = c3969cd;
        this.f32208b = str;
    }

    @NotNull
    public final String a() {
        return this.f32208b;
    }

    @Override // com.ironsource.InterfaceC3944b6
    @NotNull
    public String value() {
        return this.f32207a.a() + "/versions/" + this.f32208b + "/mobileController.html";
    }
}
