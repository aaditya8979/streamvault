package com.inmobi.media;

import android.content.Context;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.inmobi.media.C3413fh;
import java.util.Objects;

/* JADX INFO: renamed from: com.inmobi.media.fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3413fh implements BillingClientStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3513jh f27174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sn.l f27175b;

    public C3413fh(sn.l lVar, C3513jh c3513jh) {
        this.f27174a = c3513jh;
        this.f27175b = lVar;
    }

    public static final void a(sn.l lVar, AbstractC3387eh abstractC3387eh) {
        lVar.invoke(abstractC3387eh);
    }

    public static final void a(sn.l lVar, C3513jh c3513jh) {
        c3513jh.getClass();
        lVar.invoke(new C3336ch("Billing Service Disconnected", -1));
    }

    public final void onBillingServiceDisconnected() {
        this.f27174a.getClass();
        final sn.l lVar = this.f27175b;
        final C3513jh c3513jh = this.f27174a;
        Runnable runnable = new Runnable() { // from class: n9.w6
            @Override // java.lang.Runnable
            public final void run() {
                C3413fh.a(lVar, c3513jh);
            }
        };
        Context context = Ji.f25747a;
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
    }

    public final void onBillingSetupFinished(BillingResult billingResult) {
        final AbstractC3387eh c3336ch;
        tn.p.k(billingResult, "billingResult");
        this.f27174a.getClass();
        Objects.toString(billingResult);
        if (billingResult.getResponseCode() == 0) {
            c3336ch = C3362dh.f27041a;
        } else {
            int responseCode = billingResult.getResponseCode();
            String debugMessage = billingResult.getDebugMessage();
            tn.p.j(debugMessage, "getDebugMessage(...)");
            c3336ch = new C3336ch(debugMessage, responseCode);
        }
        final sn.l lVar = this.f27175b;
        Runnable runnable = new Runnable() { // from class: n9.x6
            @Override // java.lang.Runnable
            public final void run() {
                C3413fh.a(lVar, c3336ch);
            }
        };
        Context context = Ji.f25747a;
        tn.p.k(runnable, "runnable");
        Ji.f25753g.submit(runnable);
    }
}
