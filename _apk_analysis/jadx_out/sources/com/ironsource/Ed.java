package com.ironsource;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public enum Ed {
    CAN_RECOVER("Can recover"),
    NO_LOADED_ADS("No loaded ad"),
    MAX_ATTEMPTS_REACHED("Fail to show"),
    FEATURE_DISABLED("Recovery feature is disabled");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f29269a;

    Ed(String str) {
        this.f29269a = str;
    }

    @NotNull
    public final String b() {
        return this.f29269a;
    }
}
