package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.il, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4867il implements to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5273z0 f66992a;

    public C4867il(@NonNull C5273z0 c5273z0) {
        this.f66992a = c5273z0;
    }

    public final ro a() {
        return a((Void) null);
    }

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable Void r32) {
        this.f66992a.getClass();
        return C5273z0.a() ? new ro(this, true, "") : new ro(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }
}
