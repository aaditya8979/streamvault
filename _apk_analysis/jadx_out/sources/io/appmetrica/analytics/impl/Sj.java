package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: loaded from: classes6.dex */
public final class Sj extends AbstractC4838hh {
    public Sj(@NonNull F6 f62) {
        super(f62);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4838hh, io.appmetrica.analytics.impl.InterfaceC4863ih
    public final boolean a(@Nullable Boolean bool) {
        return !this.f66921a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
