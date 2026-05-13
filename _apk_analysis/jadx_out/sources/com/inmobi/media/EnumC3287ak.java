package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.inmobi.media.ak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC3287ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC3287ak f26805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC3287ak f26806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC3287ak[] f26807c;

    static {
        EnumC3287ak enumC3287ak = new EnumC3287ak("SDK", 0);
        f26805a = enumC3287ak;
        EnumC3287ak enumC3287ak2 = new EnumC3287ak("TEMPLATE", 1);
        f26806b = enumC3287ak2;
        EnumC3287ak[] enumC3287akArr = {enumC3287ak, enumC3287ak2};
        f26807c = enumC3287akArr;
        kotlin.enums.a.a(enumC3287akArr);
    }

    public EnumC3287ak(String str, int i10) {
    }

    public static EnumC3287ak valueOf(String str) {
        return (EnumC3287ak) Enum.valueOf(EnumC3287ak.class, str);
    }

    public static EnumC3287ak[] values() {
        return (EnumC3287ak[]) f26807c.clone();
    }
}
