package com.unity3d.ads.core.configuration;

import android.content.Context;
import android.os.Bundle;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AndroidManifestIntPropertyReader.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AndroidManifestIntPropertyReader {

    @NotNull
    private final Context context;

    public AndroidManifestIntPropertyReader(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        this.context = context;
    }

    @Nullable
    public final Integer getPropertyByName(@NotNull String str) {
        p.k(str, "propertyName");
        try {
            Bundle bundle = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData;
            Integer numValueOf = Integer.valueOf(bundle.getInt(str));
            numValueOf.intValue();
            if (bundle.containsKey(str)) {
                return numValueOf;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
