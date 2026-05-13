package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes6.dex */
public enum J8 {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65438a;

    J8(int i10) {
        this.f65438a = i10;
    }

    public static J8 a(Integer num) {
        if (num != null) {
            for (J8 j82 : values()) {
                if (j82.f65438a == num.intValue()) {
                    return j82;
                }
            }
        }
        return NONE;
    }
}
