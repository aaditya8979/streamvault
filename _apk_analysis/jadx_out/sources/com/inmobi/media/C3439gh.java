package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.inmobi.media.gh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3439gh extends FunctionReferenceImpl implements sn.l {
    public C3439gh(C3513jh c3513jh) {
        super(1, c3513jh, C3513jh.class, "instantiateBillingClientV6", "instantiateBillingClientV6(Landroid/content/Context;)Lcom/android/billingclient/api/BillingClient;", 0);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        tn.p.k(context, "p0");
        ((C3513jh) this.receiver).getClass();
        return C3513jh.a(context);
    }
}
