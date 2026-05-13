package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* JADX INFO: loaded from: classes.dex */
public class R4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65832b;

    public R4(String str, String str2) {
        this.f65831a = str;
        this.f65832b = str2;
    }

    @NonNull
    public final String a() {
        return ApiKeyUtils.createPartialApiKey(this.f65832b);
    }

    @Nullable
    public final String b() {
        return this.f65832b;
    }

    public final String c() {
        return this.f65831a;
    }

    public boolean d() {
        return false;
    }

    public String e() {
        return this.f65831a + "_" + ApiKeyUtils.createPartialApiKey(this.f65832b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        R4 r42 = (R4) obj;
        String str = this.f65831a;
        if (str == null ? r42.f65831a != null : !str.equals(r42.f65831a)) {
            return false;
        }
        String str2 = this.f65832b;
        String str3 = r42.f65832b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public final int hashCode() {
        String str = this.f65831a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f65832b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f65831a + "_" + this.f65832b;
    }
}
