package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes4.dex */
public final class Dg implements P7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z4 f65156a;

    public Dg(@NonNull Z4 z42) {
        this.f65156a = z42;
    }

    @NonNull
    @VisibleForTesting
    public final Z4 a() {
        return this.f65156a;
    }

    @Override // io.appmetrica.analytics.impl.P7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Cg a(@NonNull Context context, @NonNull R4 r42, @NonNull C5053q4 c5053q4) {
        return new Cg(context, r42, c5053q4, this.f65156a, new S4(), Il.a());
    }
}
