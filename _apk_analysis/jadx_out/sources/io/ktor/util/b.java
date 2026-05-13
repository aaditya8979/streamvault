package io.ktor.util;

import io.ktor.util.Platform;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: PlatformUtilsJvm.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    @NotNull
    public static final Platform a(@NotNull a aVar) {
        p.k(aVar, "<this>");
        return Platform.b.f71210a;
    }

    public static final boolean b(@NotNull a aVar) {
        p.k(aVar, "<this>");
        String property = System.getProperty("io.ktor.development");
        return property != null && Boolean.parseBoolean(property);
    }
}
