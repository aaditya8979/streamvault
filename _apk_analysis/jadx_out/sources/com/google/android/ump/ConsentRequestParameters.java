package com.google.android.ump;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* JADX INFO: loaded from: classes.dex */
public class ConsentRequestParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f23041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ConsentDebugSettings f23042c;

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f23043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f23044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public ConsentDebugSettings f23045c;

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setAdMobAppId(@Nullable String str) {
            this.f23044b = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(@Nullable ConsentDebugSettings consentDebugSettings) {
            this.f23045c = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z10) {
            this.f23043a = z10;
            return this;
        }
    }

    public /* synthetic */ ConsentRequestParameters(Builder builder, zzb zzbVar) {
        this.f23040a = builder.f23043a;
        this.f23041b = builder.f23044b;
        this.f23042c = builder.f23045c;
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.f23042c;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.f23040a;
    }

    @RecentlyNullable
    public final String zza() {
        return this.f23041b;
    }
}
