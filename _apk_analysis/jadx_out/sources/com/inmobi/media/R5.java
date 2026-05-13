package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class R5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R5 f26227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ R5[] f26228b;

    static {
        R5 r52 = new R5("URL", 0);
        f26227a = r52;
        R5[] r5Arr = {r52, new R5("HTML", 1)};
        f26228b = r5Arr;
        kotlin.enums.a.a(r5Arr);
    }

    public R5(String str, int i10) {
    }

    public static R5 valueOf(String str) {
        return (R5) Enum.valueOf(R5.class, str);
    }

    public static R5[] values() {
        return (R5[]) f26228b.clone();
    }
}
