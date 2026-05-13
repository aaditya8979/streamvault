package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ValidationException;

/* JADX INFO: loaded from: classes7.dex */
public class Fn implements to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final to f65260a;

    public Fn(@NonNull to toVar) {
        this.f65260a = toVar;
    }

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable Object obj) {
        ro roVarA = this.f65260a.a(obj);
        if (roVarA.f67631a) {
            return roVarA;
        }
        throw new ValidationException(roVarA.f67632b);
    }

    @NonNull
    @VisibleForTesting
    public final to a() {
        return this.f65260a;
    }
}
