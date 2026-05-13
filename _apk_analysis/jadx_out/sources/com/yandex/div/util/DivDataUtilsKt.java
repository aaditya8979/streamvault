package com.yandex.div.util;

import com.yandex.div2.DivData;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivDataUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DivDataUtilsKt {
    public static final long getINVALID_STATE_ID(@NotNull DivData.a aVar) {
        return -1L;
    }

    public static final long getInitialStateId(@NotNull DivData divData) {
        return divData.f55082c.isEmpty() ? getINVALID_STATE_ID(DivData.f55077j) : divData.f55082c.get(0).f55092b;
    }
}
