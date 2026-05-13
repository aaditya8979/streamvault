package com.monetization.ads.mediation.base.initialize;

import android.content.Context;
import hn.c;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public interface MediatedAdapterInitializer {
    @Nullable
    Object initialize(@NotNull Context context, @NotNull Map<String, String> map, @NotNull c<? super MediatedAdapterInitializationResult> cVar);
}
