package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5290zh extends AbstractC4838hh {
    public C5290zh(F6 f62) {
        super(f62);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4838hh, io.appmetrica.analytics.impl.InterfaceC4863ih
    public final boolean a(@Nullable Boolean bool) {
        return !this.f66921a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
