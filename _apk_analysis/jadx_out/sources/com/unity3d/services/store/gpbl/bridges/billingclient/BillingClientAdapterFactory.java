package com.unity3d.services.store.gpbl.bridges.billingclient;

import android.content.Context;
import com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.v8.QueryProductDetailsResultsBridge;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Result;
import kotlin.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: BillingClientAdapterFactory.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class BillingClientAdapterFactory {
    private final BillingClientAdapter createV6Adapter(Context context, int i10) {
        Object objM7534constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            BillingClientBuilderBridge billingClientBuilderBridgeNewBuilder = BillingClientBridge.newBuilder(context);
            p.j(billingClientBuilderBridgeNewBuilder, "builder");
            objM7534constructorimpl = Result.m7534constructorimpl(new com.unity3d.services.store.gpbl.bridges.billingclient.v6.BillingClientAdapter(billingClientBuilderBridgeNewBuilder, i10));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
        }
        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
            objM7534constructorimpl = null;
        }
        return (BillingClientAdapter) objM7534constructorimpl;
    }

    public static /* synthetic */ BillingClientAdapter createV6Adapter$default(BillingClientAdapterFactory billingClientAdapterFactory, Context context, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 6;
        }
        return billingClientAdapterFactory.createV6Adapter(context, i10);
    }

    /* JADX INFO: renamed from: createV8Adapter-IoAF18A, reason: not valid java name */
    private final Object m7271createV8AdapterIoAF18A(Context context) {
        try {
            Result.a aVar = Result.Companion;
            com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter billingClientAdapter = new com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientAdapter(com.unity3d.services.store.gpbl.bridges.billingclient.v8.BillingClientBridge.Companion.newBuilder(context));
            if (new QueryProductDetailsResultsBridge(new Object()).exists()) {
                return Result.m7534constructorimpl(billingClientAdapter);
            }
            throw new FallbackException(7);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m7534constructorimpl(c.a(th2));
        }
    }

    @Nullable
    public final BillingClientAdapter createBillingClientAdapter(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        Object objM7271createV8AdapterIoAF18A = m7271createV8AdapterIoAF18A(context);
        Throwable thM7537exceptionOrNullimpl = Result.m7537exceptionOrNullimpl(objM7271createV8AdapterIoAF18A);
        if (thM7537exceptionOrNullimpl != null) {
            objM7271createV8AdapterIoAF18A = thM7537exceptionOrNullimpl instanceof FallbackException ? createV6Adapter(context, ((FallbackException) thM7537exceptionOrNullimpl).getDetectedVersion()) : createV6Adapter$default(this, context, 0, 2, null);
        }
        return (BillingClientAdapter) objM7271createV8AdapterIoAF18A;
    }
}
