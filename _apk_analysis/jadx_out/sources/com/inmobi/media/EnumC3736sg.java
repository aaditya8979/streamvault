package com.inmobi.media;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.inmobi.media.sg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC3736sg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC3736sg f28122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC3736sg f28123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumC3736sg f28124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumC3736sg f28125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumC3736sg f28126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC3736sg f28127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC3736sg f28128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumC3736sg f28129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumC3736sg[] f28130i;

    static {
        EnumC3736sg enumC3736sg = new EnumC3736sg("STATE_INITIALIZED", 0);
        f28122a = enumC3736sg;
        EnumC3736sg enumC3736sg2 = new EnumC3736sg("STATE_PREPARING", 1);
        f28123b = enumC3736sg2;
        EnumC3736sg enumC3736sg3 = new EnumC3736sg("STATE_PREPARED", 2);
        f28124c = enumC3736sg3;
        EnumC3736sg enumC3736sg4 = new EnumC3736sg("STATE_PLAYING", 3);
        f28125d = enumC3736sg4;
        EnumC3736sg enumC3736sg5 = new EnumC3736sg("STATE_PAUSED", 4);
        f28126e = enumC3736sg5;
        EnumC3736sg enumC3736sg6 = new EnumC3736sg("STATE_PLAYBACK_COMPLETED", 5);
        f28127f = enumC3736sg6;
        EnumC3736sg enumC3736sg7 = new EnumC3736sg("STATE_ERROR", 6);
        f28128g = enumC3736sg7;
        EnumC3736sg enumC3736sg8 = new EnumC3736sg("STATE_DESTROYED", 7);
        f28129h = enumC3736sg8;
        EnumC3736sg[] enumC3736sgArr = {enumC3736sg, enumC3736sg2, enumC3736sg3, enumC3736sg4, enumC3736sg5, enumC3736sg6, enumC3736sg7, enumC3736sg8};
        f28130i = enumC3736sgArr;
        kotlin.enums.a.a(enumC3736sgArr);
    }

    public EnumC3736sg(String str, int i10) {
    }

    public static EnumC3736sg valueOf(String str) {
        return (EnumC3736sg) Enum.valueOf(EnumC3736sg.class, str);
    }

    public static EnumC3736sg[] values() {
        return (EnumC3736sg[]) f28130i.clone();
    }
}
