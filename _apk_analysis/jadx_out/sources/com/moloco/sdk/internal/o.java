package com.moloco.sdk.internal;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f46248a = new o("AD_LOAD_LIMIT_REACHED", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f46249b = new o("BID_LOAD_ERROR_CANNOT_PROCESS_BID_RESPONSE", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f46250c = new o("BID_LOAD_ERROR_CANNOT_PARSE_BID_RESPONSE", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f46251d = new o("AD_SHOW_ERROR_NOT_LOADED", 3);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f46252e = new o("AD_SHOW_ERROR_ALREADY_DISPLAYING", 4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ o[] f46253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kn.a f46254g;

    static {
        o[] oVarArrB = b();
        f46253f = oVarArrB;
        f46254g = kotlin.enums.a.a(oVarArrB);
    }

    public o(String str, int i10) {
    }

    public static final /* synthetic */ o[] b() {
        return new o[]{f46248a, f46249b, f46250c, f46251d, f46252e};
    }

    @NotNull
    public static kn.a<o> c() {
        return f46254g;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f46253f.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    @NotNull
    public String a() {
        return name();
    }
}
