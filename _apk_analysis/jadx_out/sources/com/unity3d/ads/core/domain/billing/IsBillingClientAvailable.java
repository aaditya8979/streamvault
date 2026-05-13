package com.unity3d.ads.core.domain.billing;

import kotlin.Result;
import kotlin.c;

/* JADX INFO: compiled from: IsBillingClientAvailable.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class IsBillingClientAvailable {
    public final boolean invoke() {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(Class.forName("com.android.billingclient.api.BillingClient"));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        return Result.m7540isSuccessimpl(objM7534constructorimpl);
    }
}
