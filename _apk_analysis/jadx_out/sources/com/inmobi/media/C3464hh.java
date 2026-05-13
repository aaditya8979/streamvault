package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.inmobi.media.hh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C3464hh extends FunctionReferenceImpl implements sn.l {
    public C3464hh(C3513jh c3513jh) {
        super(1, c3513jh, C3513jh.class, "instantiateBillingClientV7", "instantiateBillingClientV7(Landroid/content/Context;)Lcom/android/billingclient/api/BillingClient;", 0);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        tn.p.k(context, "p0");
        ((C3513jh) this.receiver).getClass();
        return C3513jh.b(context);
    }
}
