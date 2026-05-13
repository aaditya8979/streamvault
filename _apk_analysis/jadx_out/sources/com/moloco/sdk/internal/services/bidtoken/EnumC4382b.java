package com.moloco.sdk.internal.services.bidtoken;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.moloco.sdk.internal.services.bidtoken.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC4382b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC4382b f47128b = new EnumC4382b("UNKNOWN", 0, -100);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC4382b f47129c = new EnumC4382b("HTTP_REQUEST_TIMEOUT", 1, -101);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC4382b f47130d = new EnumC4382b("UNKNOWN_HOST", 2, -102);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC4382b[] f47131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kn.a f47132f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47133a;

    static {
        EnumC4382b[] enumC4382bArrA = a();
        f47131e = enumC4382bArrA;
        f47132f = kotlin.enums.a.a(enumC4382bArrA);
    }

    public EnumC4382b(String str, int i10, int i11) {
        this.f47133a = i11;
    }

    public static final /* synthetic */ EnumC4382b[] a() {
        return new EnumC4382b[]{f47128b, f47129c, f47130d};
    }

    @NotNull
    public static kn.a<EnumC4382b> b() {
        return f47132f;
    }

    public static EnumC4382b valueOf(String str) {
        return (EnumC4382b) Enum.valueOf(EnumC4382b.class, str);
    }

    public static EnumC4382b[] values() {
        return (EnumC4382b[]) f47131e.clone();
    }

    public final int c() {
        return this.f47133a;
    }
}
