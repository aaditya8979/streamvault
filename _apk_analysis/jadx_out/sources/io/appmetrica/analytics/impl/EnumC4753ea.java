package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ea, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public enum EnumC4753ea {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66681a;

    EnumC4753ea(int i10) {
        this.f66681a = i10;
    }

    public static EnumC4753ea a(Integer num) {
        if (num != null) {
            for (EnumC4753ea enumC4753ea : values()) {
                if (enumC4753ea.f66681a == num.intValue()) {
                    return enumC4753ea;
                }
            }
        }
        return UNKNOWN;
    }
}
