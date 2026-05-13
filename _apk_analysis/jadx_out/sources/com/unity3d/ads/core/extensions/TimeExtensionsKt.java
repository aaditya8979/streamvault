package com.unity3d.ads.core.extensions;

import co.b;
import co.i;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: TimeExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
public final class TimeExtensionsKt {
    public static final double elapsedMillis(@NotNull i iVar) {
        p.k(iVar, "<this>");
        return b.I(iVar.a(), DurationUnit.MILLISECONDS);
    }
}
