package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import androidx.annotation.VisibleForTesting;
import androidx.work.Data;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class n {
    @VisibleForTesting(otherwise = 2)
    @Nullable
    public static final Data a(@NotNull String str) throws Throwable {
        tn.p.k(str, "<this>");
        try {
            Pair[] pairArr = {bn.h.a("url", str)};
            Data.Builder builder = new Data.Builder();
            Pair pair = pairArr[0];
            builder.put((String) pair.getFirst(), pair.getSecond());
            Data dataBuild = builder.build();
            tn.p.j(dataBuild, "dataBuilder.build()");
            return dataBuild;
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "PersistentHttpRequest", e10.getMessage() + ". Url: " + str, null, false, 12, null);
            return null;
        }
    }
}
