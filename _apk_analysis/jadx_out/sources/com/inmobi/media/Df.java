package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class Df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Df f25324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Df f25325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Df f25326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Df f25327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Df[] f25328e;

    static {
        Df df2 = new Df("PORTRAIT", 0);
        f25324a = df2;
        Df df3 = new Df("LANDSCAPE", 1);
        f25325b = df3;
        Df df4 = new Df("REVERSE_PORTRAIT", 2);
        f25326c = df4;
        Df df5 = new Df("REVERSE_LANDSCAPE", 3);
        f25327d = df5;
        Df[] dfArr = {df2, df3, df4, df5};
        f25328e = dfArr;
        kotlin.enums.a.a(dfArr);
    }

    public Df(String str, int i10) {
    }

    public static Df valueOf(String str) {
        return (Df) Enum.valueOf(Df.class, str);
    }

    public static Df[] values() {
        return (Df[]) f25328e.clone();
    }
}
