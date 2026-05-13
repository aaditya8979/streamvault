package io.bidmachine.iab.utils;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public class SystemFeatureAvailability {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f69433a;

    public SystemFeatureAvailability(@NonNull Context context) {
        this.f69433a = context.getApplicationContext();
    }

    public boolean hasTelephony() {
        return this.f69433a.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }
}
