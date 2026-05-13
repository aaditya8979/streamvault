package com.applovin.shadow.okio;

import java.util.zip.Deflater;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-DeflaterSinkExtensions, reason: invalid class name */
/* JADX INFO: compiled from: DeflaterSink.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DeflaterSinkExtensions {
    @NotNull
    public static final DeflaterSink deflate(@NotNull Sink sink, @NotNull Deflater deflater) {
        p.k(sink, "<this>");
        p.k(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }

    public static /* synthetic */ DeflaterSink deflate$default(Sink sink, Deflater deflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            deflater = new Deflater();
        }
        p.k(sink, "<this>");
        p.k(deflater, "deflater");
        return new DeflaterSink(sink, deflater);
    }
}
