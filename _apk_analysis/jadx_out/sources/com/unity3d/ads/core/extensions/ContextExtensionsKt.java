package com.unity3d.ads.core.extensions;

import android.content.Context;
import com.ironsource.Y5;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ContextExtensions.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ContextExtensionsKt {
    @NotNull
    public static final File unityAdsDataStoreFile(@NotNull Context context, @NotNull String str) {
        p.k(context, "<this>");
        p.k(str, Y5.c.f30724b);
        return new File(context.getApplicationContext().getFilesDir(), UnityAdsConstants.Cache.DATASTORE_PATH + str);
    }
}
