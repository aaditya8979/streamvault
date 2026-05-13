package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.cd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3969cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f31160a;

    public C3969cd(@NotNull String str) {
        tn.p.k(str, "baseControllerUrl");
        this.f31160a = str;
    }

    @NotNull
    public final String a() {
        String str = this.f31160a;
        String strSubstring = str.substring(0, bo.d0.y0(str, "/", 0, false, 6, null));
        tn.p.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
