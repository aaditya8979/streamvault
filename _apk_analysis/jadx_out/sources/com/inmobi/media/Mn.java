package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class Mn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Mn f25977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Mn f25978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Mn[] f25979c;

    static {
        Mn mn2 = new Mn("HIDDEN", 0);
        f25977a = mn2;
        Mn mn3 = new Mn("VISIBLE", 1);
        f25978b = mn3;
        Mn[] mnArr = {mn2, mn3};
        f25979c = mnArr;
        kotlin.enums.a.a(mnArr);
    }

    public Mn(String str, int i10) {
    }

    public static Mn valueOf(String str) {
        return (Mn) Enum.valueOf(Mn.class, str);
    }

    public static Mn[] values() {
        return (Mn[]) f25979c.clone();
    }
}
