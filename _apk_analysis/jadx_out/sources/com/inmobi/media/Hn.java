package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class Hn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Hn f25624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Hn f25625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Hn f25626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Hn[] f25627d;

    static {
        Hn hn2 = new Hn("UNKNOWN", 0);
        f25624a = hn2;
        Hn hn3 = new Hn("HIDDEN", 1);
        f25625b = hn3;
        Hn hn4 = new Hn("VISIBLE", 2);
        f25626c = hn4;
        Hn[] hnArr = {hn2, hn3, hn4};
        f25627d = hnArr;
        kotlin.enums.a.a(hnArr);
    }

    public Hn(String str, int i10) {
    }

    public static Hn valueOf(String str) {
        return (Hn) Enum.valueOf(Hn.class, str);
    }

    public static Hn[] values() {
        return (Hn[]) f25627d.clone();
    }
}
