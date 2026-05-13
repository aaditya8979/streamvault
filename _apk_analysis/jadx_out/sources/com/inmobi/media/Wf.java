package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class Wf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Wf f26541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Wf f26542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Wf[] f26543c;

    static {
        Wf wf2 = new Wf("STOPPED", 0);
        f26541a = wf2;
        Wf wf3 = new Wf("STARTED", 1);
        f26542b = wf3;
        Wf[] wfArr = {wf2, wf3};
        f26543c = wfArr;
        kotlin.enums.a.a(wfArr);
    }

    public Wf(String str, int i10) {
    }

    public static Wf valueOf(String str) {
        return (Wf) Enum.valueOf(Wf.class, str);
    }

    public static Wf[] values() {
        return (Wf[]) f26543c.clone();
    }
}
