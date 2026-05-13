package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes9.dex */
public final class Zm extends AbstractC5152u4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Mn f66325g;

    public Zm(@NonNull String str, @NonNull String str2, @NonNull Mn mn2, @NonNull to toVar, @NonNull K2 k22) {
        super(0, str, str2, toVar, k22);
        this.f66325g = mn2;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5152u4
    public final void a(@NonNull C4819go c4819go) {
        String str = (String) this.f66325g.a((String) this.f67768f);
        c4819go.f66883d.f66996a = str == null ? new byte[0] : str.getBytes();
    }

    @VisibleForTesting
    public final Mn h() {
        return this.f66325g;
    }
}
