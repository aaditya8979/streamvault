package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
public final class Zd implements to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66300a;

    public Zd(@NonNull String str) {
        this.f66300a = str;
    }

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable Collection<Object> collection) {
        if (!mo.a((Collection) collection)) {
            return new ro(this, true, "");
        }
        return new ro(this, false, this.f66300a + " is null or empty.");
    }
}
