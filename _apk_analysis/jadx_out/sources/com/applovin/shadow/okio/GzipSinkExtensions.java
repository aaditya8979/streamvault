package com.applovin.shadow.okio;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-GzipSinkExtensions, reason: invalid class name */
/* JADX INFO: compiled from: GzipSink.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class GzipSinkExtensions {
    @NotNull
    public static final GzipSink gzip(@NotNull Sink sink) {
        p.k(sink, "<this>");
        return new GzipSink(sink);
    }
}
