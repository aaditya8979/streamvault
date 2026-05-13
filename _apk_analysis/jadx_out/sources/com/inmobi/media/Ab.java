package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class Ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ab f25151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Ab f25152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Ab f25153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Ab f25154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Ab[] f25155e;

    static {
        Ab ab2 = new Ab("INFO", 0);
        f25151a = ab2;
        Ab ab3 = new Ab("DEBUG", 1);
        f25152b = ab3;
        Ab ab4 = new Ab("ERROR", 2);
        f25153c = ab4;
        Ab ab5 = new Ab("STATE", 3);
        f25154d = ab5;
        Ab[] abArr = {ab2, ab3, ab4, ab5};
        f25155e = abArr;
        kotlin.enums.a.a(abArr);
    }

    public Ab(String str, int i10) {
    }

    public static Ab valueOf(String str) {
        return (Ab) Enum.valueOf(Ab.class, str);
    }

    public static Ab[] values() {
        return (Ab[]) f25155e.clone();
    }
}
