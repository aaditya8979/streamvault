package com.yandex.div.logging;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Severity.kt */
/* JADX INFO: loaded from: classes12.dex */
public enum Severity {
    ERROR,
    WARNING,
    INFO,
    DEBUG,
    VERBOSE;

    public final boolean isAtLeast(@NotNull Severity severity) {
        return ordinal() >= severity.ordinal();
    }
}
