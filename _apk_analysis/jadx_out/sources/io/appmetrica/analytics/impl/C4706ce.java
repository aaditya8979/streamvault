package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ce, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4706ce implements to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66529a;

    public C4706ce(@NonNull String str) {
        this.f66529a = str;
    }

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable Object obj) {
        if (obj != null) {
            return new ro(this, true, "");
        }
        return new ro(this, false, this.f66529a + " is null.");
    }

    @NonNull
    public final String a() {
        return this.f66529a;
    }
}
