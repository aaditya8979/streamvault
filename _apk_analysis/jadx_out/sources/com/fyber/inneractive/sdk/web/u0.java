package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.activities.InternalStoreWebpageActivity;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f19708a;

    public u0(v0 v0Var) {
        this.f19708a = v0Var;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context context, Intent intent) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (intent == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(intent, com.safedk.android.utils.g.f53142p);
        context.startActivity(intent);
    }

    @JavascriptInterface
    public void onBackButtonPressed() {
        WeakReference weakReference = this.f19708a.f19726q;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((InternalStoreWebpageActivity) this.f19708a.f19726q.get()).finish();
    }

    @JavascriptInterface
    public void onCancelButtonPressed() {
        com.fyber.inneractive.sdk.ignite.m mVar;
        com.fyber.inneractive.sdk.ignite.m mVar2;
        v0 v0Var = this.f19708a;
        v0Var.f19713d = v0Var.B ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
        String str = v0Var.f19719j;
        if (str != null) {
            v0Var.f19731v.set(true);
            v0Var.f19730u.set(false);
            com.fyber.inneractive.sdk.ignite.h hVar = v0Var.f19711b;
            r0 r0Var = new r0(v0Var);
            if (!hVar.n() || hVar.o()) {
                for (com.fyber.inneractive.sdk.ignite.r rVar : hVar.f16736h) {
                    if (rVar != null) {
                        rVar.c((hVar.o() ? com.fyber.inneractive.sdk.ignite.j.SESSION_EXPIRED : com.fyber.inneractive.sdk.ignite.j.NOT_CONNECTED).a());
                    }
                }
            } else {
                try {
                    IIgniteServiceAPI iIgniteServiceAPI = hVar.f16730b;
                    Bundle bundle = hVar.f16731c;
                    hVar.f16732d.getClass();
                    iIgniteServiceAPI.cancel(str, bundle, new com.fyber.inneractive.sdk.ignite.a(r0Var));
                } catch (Exception unused) {
                    IAlog.a("Failed to cancel task", new Object[0]);
                    r0Var.a(false);
                }
            }
            com.fyber.inneractive.sdk.util.r.f19556b.postDelayed(new s0(v0Var), 2500L);
            com.fyber.inneractive.sdk.flow.v vVar = v0Var.f19717h;
            if (vVar != null && !v0Var.f19727r && (mVar2 = v0Var.f19713d) != null) {
                v0Var.f19727r = true;
                vVar.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_CANCEL_INSTALL_CLICKED, mVar2);
            }
        }
        v0 v0Var2 = this.f19708a;
        com.fyber.inneractive.sdk.flow.v vVar2 = v0Var2.f19717h;
        if (vVar2 == null || v0Var2.f19727r || (mVar = v0Var2.f19713d) == null) {
            return;
        }
        v0Var2.f19727r = true;
        vVar2.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_CANCEL_INSTALL_CLICKED, mVar);
    }

    @JavascriptInterface
    public void onInstallButtonPressed() {
        com.fyber.inneractive.sdk.ignite.m mVar;
        v0 v0Var = this.f19708a;
        com.fyber.inneractive.sdk.ignite.m mVar2 = v0Var.B ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
        v0Var.f19713d = mVar2;
        v0Var.f19711b.a(v0Var.f19712c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f19715f, mVar2, v0Var.f19717h.f16648a));
        v0 v0Var2 = this.f19708a;
        com.fyber.inneractive.sdk.flow.v vVar = v0Var2.f19717h;
        if (vVar == null || v0Var2.f19728s || (mVar = v0Var2.f19713d) == null) {
            return;
        }
        v0Var2.f19728s = true;
        vVar.a(com.fyber.inneractive.sdk.network.u.IGNITE_FLOW_INSTALL_CLICKED, mVar);
    }

    @JavascriptInterface
    public void onNavigatedInsideStorePage() {
        this.f19708a.f19732w = true;
    }

    @JavascriptInterface
    public void onNavigatedToMainPage() {
        this.f19708a.f19732w = false;
    }

    @JavascriptInterface
    public void onOpenButtonPressed() {
        Intent launchIntentForPackage;
        if (TextUtils.isEmpty(this.f19708a.f19712c)) {
            v0 v0Var = this.f19708a;
            v0Var.getClass();
            IAlog.f("%smPackageName is null", IAlog.a(v0Var));
            return;
        }
        if (TextUtils.isEmpty(this.f19708a.f19716g)) {
            launchIntentForPackage = com.fyber.inneractive.sdk.util.o.f19548a.getPackageManager().getLaunchIntentForPackage(this.f19708a.f19712c);
        } else {
            launchIntentForPackage = new Intent("android.intent.action.MAIN");
            v0 v0Var2 = this.f19708a;
            launchIntentForPackage.setClassName(v0Var2.f19712c, v0Var2.f19716g);
        }
        if (launchIntentForPackage == null) {
            v0 v0Var3 = this.f19708a;
            v0Var3.getClass();
            IAlog.f("%sPackage %s not found", IAlog.a(v0Var3), this.f19708a.f19712c);
            return;
        }
        launchIntentForPackage.setFlags(268435456);
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(com.fyber.inneractive.sdk.util.o.f19548a, launchIntentForPackage);
        } catch (Throwable th2) {
            com.fyber.inneractive.sdk.flow.v vVar = this.f19708a.f19717h;
            if (vVar != null) {
                String simpleName = th2.getClass().getSimpleName();
                String message = th2.getMessage();
                com.fyber.inneractive.sdk.flow.w wVar = vVar.f16648a;
                com.fyber.inneractive.sdk.network.z.a(simpleName, message, wVar.f16695a, wVar.f16696b);
            }
        }
    }

    @JavascriptInterface
    public void onTransitionEnded() {
        this.f19708a.f19733x = false;
    }

    @JavascriptInterface
    public void onTransitionStarting() {
        this.f19708a.f19733x = true;
    }
}
