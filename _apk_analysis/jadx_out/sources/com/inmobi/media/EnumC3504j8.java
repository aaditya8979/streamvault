package com.inmobi.media;

import com.ironsource.C3978d4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.inmobi.media.j8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC3504j8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC3504j8[] f27392a;

    static {
        EnumC3504j8[] enumC3504j8Arr = {new EnumC3504j8("LOADING", 0, "loading"), new EnumC3504j8("PLAYING", 1, "playing"), new EnumC3504j8("PAUSED", 2, "paused"), new EnumC3504j8("STOPPED", 3, C3978d4.i.f31340h0), new EnumC3504j8("FAILED", 4, C3978d4.i.f31363t), new EnumC3504j8("READY", 5, C3978d4.i.f31361s)};
        f27392a = enumC3504j8Arr;
        kotlin.enums.a.a(enumC3504j8Arr);
    }

    public EnumC3504j8(String str, int i10, String str2) {
    }

    public static EnumC3504j8 valueOf(String str) {
        return (EnumC3504j8) Enum.valueOf(EnumC3504j8.class, str);
    }

    public static EnumC3504j8[] values() {
        return (EnumC3504j8[]) f27392a.clone();
    }
}
