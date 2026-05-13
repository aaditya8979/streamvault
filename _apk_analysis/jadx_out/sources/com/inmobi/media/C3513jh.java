package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryPurchasesParams;
import com.inmobi.media.AbstractC3387eh;
import com.inmobi.media.C3513jh;
import com.inmobi.media.Wg;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.inmobi.media.jh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C3513jh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sn.l f27411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BillingClient f27412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f27413c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Wg f27414d = new Wg();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f27415e = 2;

    public static final bn.r a(C3513jh c3513jh, Wg wg2) {
        tn.p.k(wg2, "data");
        if (c3513jh.f27413c.incrementAndGet() != c3513jh.f27415e) {
            return bn.r.f5635a;
        }
        int i10 = wg2.f26544a;
        if (i10 == 0 && wg2.f26545b == 0) {
            c3513jh.a(new Yg((short) 2234), (Wg) null);
            return bn.r.f5635a;
        }
        bo.t.l("No of In-App Purchases: " + i10 + "\n                                    | and No of Subscriptions: " + wg2.f26545b + "\n                                ", null, 1, null);
        c3513jh.a(Zg.f26715a, wg2);
        return bn.r.f5635a;
    }

    public static final bn.r a(final C3513jh c3513jh, AbstractC3387eh abstractC3387eh) {
        tn.p.k(abstractC3387eh, "result");
        if (abstractC3387eh instanceof C3336ch) {
            c3513jh.a(new Xg(String.valueOf(((C3336ch) abstractC3387eh).f26933a)), (Wg) null);
            return bn.r.f5635a;
        }
        c3513jh.a(new sn.l() { // from class: n9.t8
            @Override // sn.l
            public final Object invoke(Object obj) {
                return C3513jh.a(this.f75630b, (Wg) obj);
            }
        });
        return bn.r.f5635a;
    }

    public static BillingClient a(Context context) {
        try {
            return BillingClient.newBuilder(context).enablePendingPurchases().setListener(new n9.q8()).build();
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            P9.a(new L2(e10));
            e10.getMessage();
            return null;
        } catch (NoClassDefFoundError e11) {
            bn.g gVar2 = P9.f26117a;
            P9.a(new L2(e11));
            e11.getMessage();
            return null;
        }
    }

    public static final void a(BillingResult billingResult, List list) {
        tn.p.k(billingResult, "<unused var>");
    }

    public static final void a(final C3513jh c3513jh, final sn.l lVar, BillingResult billingResult, List list) {
        tn.p.k(billingResult, "<unused var>");
        tn.p.k(list, "purchasesResult");
        Wg wg2 = c3513jh.f27414d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Purchase purchase = (Purchase) obj;
            if (purchase.getPurchaseState() == 1 && purchase.isAcknowledged()) {
                arrayList.add(obj);
            }
        }
        wg2.f26545b = arrayList.size();
        Runnable runnable = new Runnable() { // from class: n9.p8
            @Override // java.lang.Runnable
            public final void run() {
                C3513jh.a(lVar, c3513jh);
            }
        };
        Context context = Ji.f25747a;
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
    }

    public static final void a(sn.l lVar, C3513jh c3513jh) {
        lVar.invoke(c3513jh.f27414d);
    }

    public static BillingClient b(Context context) {
        try {
            return BillingClient.newBuilder(context).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).setListener(new n9.q8()).build();
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            P9.a(new L2(e10));
            e10.getMessage();
            return null;
        } catch (NoClassDefFoundError e11) {
            bn.g gVar2 = P9.f26117a;
            P9.a(new L2(e11));
            e11.getMessage();
            return null;
        }
    }

    public static final void b(BillingResult billingResult, List list) {
        tn.p.k(billingResult, "<unused var>");
    }

    public static final void b(final C3513jh c3513jh, final sn.l lVar, BillingResult billingResult, List list) {
        tn.p.k(billingResult, "<unused var>");
        tn.p.k(list, "purchasesResult");
        Wg wg2 = c3513jh.f27414d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Purchase purchase = (Purchase) obj;
            if (purchase.getPurchaseState() == 1 && purchase.isAcknowledged()) {
                arrayList.add(obj);
            }
        }
        wg2.f26544a = arrayList.size();
        Runnable runnable = new Runnable() { // from class: n9.o8
            @Override // java.lang.Runnable
            public final void run() {
                C3513jh.b(lVar, c3513jh);
            }
        };
        Context context = Ji.f25747a;
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
    }

    public static final void b(sn.l lVar, C3513jh c3513jh) {
        lVar.invoke(c3513jh.f27414d);
    }

    public final sn.l a(String str) {
        return bo.a0.W(str, "6", false, 2, null) ? new C3439gh(this) : bo.a0.W(str, com.ironsource.Gc.f29437e, false, 2, null) ? new C3464hh(this) : new C3488ih(this);
    }

    public final void a(Context context, sn.l lVar) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(lVar, "onComplete");
        try {
            this.f27411a = lVar;
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            tn.p.j(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            if (string == null) {
                a(new Yg((short) 2236), (Wg) null);
                return;
            }
            BillingClient billingClient = (BillingClient) a(string).invoke(context);
            if (billingClient == null) {
                a(new Yg((short) 2233), (Wg) null);
                return;
            }
            this.f27412b = billingClient;
            sn.l lVar2 = new sn.l() { // from class: n9.r8
                @Override // sn.l
                public final Object invoke(Object obj) {
                    return C3513jh.a(this.f75602b, (AbstractC3387eh) obj);
                }
            };
            tn.p.k(lVar2, "onComplete");
            BillingClient billingClient2 = this.f27412b;
            if (billingClient2 != null) {
                billingClient2.startConnection(new C3413fh(lVar2, this));
            }
        } catch (Exception e10) {
            bn.g gVar = P9.f26117a;
            P9.a(new L2(e10));
            e10.getMessage();
            a(new Yg((short) 2237), (Wg) null);
        }
    }

    public final void a(AbstractC3284ah abstractC3284ah, Wg wg2) {
        AbstractC3310bh.a(abstractC3284ah);
        sn.l lVar = this.f27411a;
        if (lVar != null) {
            lVar.invoke(wg2);
        }
    }

    public final void a(final sn.l lVar) {
        tn.p.k(lVar, "onComplete");
        QueryPurchasesParams.Builder builderNewBuilder = QueryPurchasesParams.newBuilder();
        tn.p.j(builderNewBuilder, "newBuilder(...)");
        builderNewBuilder.setProductType("inapp");
        QueryPurchasesParams.Builder builderNewBuilder2 = QueryPurchasesParams.newBuilder();
        tn.p.j(builderNewBuilder2, "newBuilder(...)");
        builderNewBuilder2.setProductType("subs");
        BillingClient billingClient = this.f27412b;
        if (billingClient != null) {
            billingClient.queryPurchasesAsync(builderNewBuilder.build(), new PurchasesResponseListener() { // from class: n9.s8
            });
        }
        BillingClient billingClient2 = this.f27412b;
        if (billingClient2 != null) {
            billingClient2.queryPurchasesAsync(builderNewBuilder2.build(), new PurchasesResponseListener() { // from class: n9.s8
            });
        }
    }
}
