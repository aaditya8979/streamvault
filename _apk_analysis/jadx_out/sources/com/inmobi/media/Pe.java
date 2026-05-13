package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class Pe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pe f26130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pe f26131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pe f26132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pe f26133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Pe[] f26134e;

    static {
        Pe pe2 = new Pe("UNAVAILABLE", 0);
        f26130a = pe2;
        Pe pe3 = new Pe("SLOW", 1);
        f26131b = pe3;
        Pe pe4 = new Pe("MEDIUM", 2);
        f26132c = pe4;
        Pe pe5 = new Pe("FAST", 3);
        f26133d = pe5;
        Pe[] peArr = {pe2, pe3, pe4, pe5};
        f26134e = peArr;
        kotlin.enums.a.a(peArr);
    }

    public Pe(String str, int i10) {
    }

    public static Pe valueOf(String str) {
        return (Pe) Enum.valueOf(Pe.class, str);
    }

    public static Pe[] values() {
        return (Pe[]) f26134e.clone();
    }
}
