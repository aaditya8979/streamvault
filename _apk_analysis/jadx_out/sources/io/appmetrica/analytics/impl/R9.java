package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class R9 {
    public final S9 a(@NonNull FeatureInfo featureInfo) {
        int i10;
        if (featureInfo.name == null && (i10 = featureInfo.reqGlEsVersion) != 0) {
            return new S9("openGlFeature", i10, (featureInfo.flags & 1) != 0);
        }
        return b(featureInfo);
    }

    public abstract S9 b(FeatureInfo featureInfo);
}
