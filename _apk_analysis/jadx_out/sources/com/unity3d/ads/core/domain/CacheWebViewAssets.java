package com.unity3d.ads.core.domain;

import bn.r;
import com.unity3d.ads.core.data.model.WebViewConfiguration;
import hn.c;
import java.io.File;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CacheWebViewAssets.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface CacheWebViewAssets {
    @NotNull
    Map<String, File> getCached();

    @Nullable
    Object invoke(@NotNull WebViewConfiguration webViewConfiguration, @NotNull c<? super r> cVar);
}
