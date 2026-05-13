package com.applovin.shadow.okio;

import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-InflaterSourceExtensions, reason: invalid class name */
/* JADX INFO: compiled from: InflaterSource.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class InflaterSourceExtensions {
    @NotNull
    public static final InflaterSource inflate(@NotNull Source source, @NotNull Inflater inflater) {
        p.k(source, "<this>");
        p.k(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }

    public static /* synthetic */ InflaterSource inflate$default(Source source, Inflater inflater, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inflater = new Inflater();
        }
        p.k(source, "<this>");
        p.k(inflater, "inflater");
        return new InflaterSource(source, inflater);
    }
}
