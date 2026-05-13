package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3896z1 extends Q9 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f28616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f28617h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3896z1(String str, int i10, String str2) {
        super("AppExitReasonReporting", "AppExitReasonEvent", AbstractC3492il.a("reason - " + i10 + " description - " + (str == null ? "ApplicationExit" : str), str2));
        tn.p.k(str2, "trace");
        this.f28616g = i10;
        this.f28617h = str2;
    }
}
