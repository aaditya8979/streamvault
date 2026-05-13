package com.google.ads.mediation.vungle;

import android.content.Context;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.InitializationListener;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VungleSdkWrapper.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface a {
    void a(@NotNull Context context, @NotNull String str, @NotNull InitializationListener initializationListener);

    void b(@NotNull Context context, @NotNull BidTokenCallback bidTokenCallback);

    @NotNull
    String getSdkVersion();

    boolean isInitialized();
}
