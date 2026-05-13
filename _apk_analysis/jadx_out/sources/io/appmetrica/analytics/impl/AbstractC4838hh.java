package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC4838hh implements InterfaceC4863ih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final DataSendingRestrictionController f66921a;

    public AbstractC4838hh(@NonNull DataSendingRestrictionController dataSendingRestrictionController) {
        this.f66921a = dataSendingRestrictionController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4863ih
    public boolean a(@Nullable Boolean bool) {
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
