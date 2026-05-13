package com.applovin.shadow.okio;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-DeprecatedUpgrade, reason: invalid class name */
/* JADX INFO: compiled from: DeprecatedUpgrade.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DeprecatedUpgrade {

    @NotNull
    private static final DeprecatedOkio Okio = DeprecatedOkio.INSTANCE;

    @NotNull
    private static final DeprecatedUtf8 Utf8 = DeprecatedUtf8.INSTANCE;

    @NotNull
    public static final DeprecatedOkio getOkio() {
        return Okio;
    }

    @NotNull
    public static final DeprecatedUtf8 getUtf8() {
        return Utf8;
    }
}
