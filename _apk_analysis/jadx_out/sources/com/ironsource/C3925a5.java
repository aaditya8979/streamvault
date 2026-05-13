package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3925a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C3925a5 f30911a = new C3925a5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f30912b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f30913c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f30914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f30915e;

    private C3925a5() {
    }

    public final void a(int i10) {
        f30915e = i10;
    }

    public final void a(boolean z10) {
        f30914d = z10;
    }

    public final boolean a() {
        return f30914d;
    }

    public final void b(boolean z10) {
        f30913c = z10;
    }

    public final boolean b() {
        return f30913c;
    }

    public final void c(boolean z10) {
        f30912b = z10;
    }

    public final boolean c() {
        return f30912b;
    }

    public final int d() {
        return f30915e;
    }
}
