package com.google.android.ump;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.consent_sdk.zzcm;
import com.google.android.gms.internal.consent_sdk.zzcu;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* JADX INFO: loaded from: classes8.dex */
public class ConsentDebugSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23034b;

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
    public static class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f23036b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f23038d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f23035a = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23037c = 0;

        public Builder(@RecentlyNonNull Context context) {
            this.f23036b = context.getApplicationContext();
        }

        @RecentlyNonNull
        public Builder addTestDeviceHashedId(@RecentlyNonNull String str) {
            this.f23035a.add(str);
            return this;
        }

        @RecentlyNonNull
        public ConsentDebugSettings build() {
            boolean z10 = true;
            if (!zzcu.zza(true) && !this.f23035a.contains(zzcm.zza(this.f23036b)) && !this.f23038d) {
                z10 = false;
            }
            return new ConsentDebugSettings(z10, this, null);
        }

        @RecentlyNonNull
        public Builder setDebugGeography(int i10) {
            this.f23037c = i10;
            return this;
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setForceTesting(boolean z10) {
            this.f23038d = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface DebugGeography {
        public static final int DEBUG_GEOGRAPHY_DISABLED = 0;
        public static final int DEBUG_GEOGRAPHY_EEA = 1;

        @Deprecated
        public static final int DEBUG_GEOGRAPHY_NOT_EEA = 2;
        public static final int DEBUG_GEOGRAPHY_OTHER = 4;
        public static final int DEBUG_GEOGRAPHY_REGULATED_US_STATE = 3;
    }

    public /* synthetic */ ConsentDebugSettings(boolean z10, Builder builder, zza zzaVar) {
        this.f23033a = z10;
        this.f23034b = builder.f23037c;
    }

    public int getDebugGeography() {
        return this.f23034b;
    }

    public boolean isTestDevice() {
        return this.f23033a;
    }
}
