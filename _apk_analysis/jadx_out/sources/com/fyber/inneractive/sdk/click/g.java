package com.fyber.inneractive.sdk.click;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.activities.InternalStoreWebpageActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.h1;
import com.fyber.inneractive.sdk.util.d0;
import com.fyber.inneractive.sdk.util.g0;
import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.v0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v0 f15921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f15923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f15924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.util.g f15925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15926f = false;

    public g(f fVar, g1 g1Var, com.fyber.inneractive.sdk.util.g gVar) {
        this.f15923c = fVar;
        this.f15924d = g1Var;
        this.f15925e = gVar;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final b a(Context context, Uri uri, List list) {
        d0 d0Var;
        v0 v0Var = this.f15921a;
        if (v0Var == null) {
            return r.a(uri.toString(), "IgniteGooglePlay", "mInternalStoreWebpageController is null");
        }
        boolean z10 = this.f15922b;
        if (v0Var.C) {
            g0 g0Var = g0.FAILED;
            IllegalStateException illegalStateException = new IllegalStateException("Store controller is already open");
            context.getClass();
            d0Var = new d0(g0Var, illegalStateException);
        } else {
            v0Var.C = true;
            try {
                context.getClass();
            } catch (Throwable unused) {
            }
            v0Var.D = true;
            if (v0Var.f19719j.equals("invalid_task_id") && !v0Var.f19735z) {
                v0Var.f19713d = z10 ? com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP;
            }
            v0Var.B = z10;
            if (v0Var.A) {
                v0Var.d("onInstallationSuccess();");
            } else if (!v0Var.f19735z) {
                String str = v0Var.f19712c;
                PackageInfo packageInfo = !TextUtils.isEmpty(str) ? com.fyber.inneractive.sdk.util.o.f19548a.getPackageManager().getPackageInfo(str, 0) : null;
                if (packageInfo != null) {
                    v0Var.d("onInstallationSuccess();");
                } else if (z10) {
                    v0Var.f19711b.a(v0Var.f19712c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f19715f, v0Var.f19713d, v0Var.f19717h.f16648a));
                    v0Var.d("onShowInstallStarted();");
                }
            }
            try {
                InternalStoreWebpageActivity.startActivity(context, v0Var.f19714e);
                d0Var = new d0(g0.OPENED_INTERNAL_STORE, null);
            } catch (ActivityNotFoundException e10) {
                d0Var = new d0(g0.FAILED, e10);
            }
        }
        Throwable th2 = d0Var.f19522b;
        if (th2 == null) {
            IAConfigManager.O.f15973s.a(new h1(new e(this, list, uri), uri.toString()));
            return new b(uri.toString(), q.OPEN_INTERNAL_STORE, "IgniteGooglePlay", null);
        }
        if (list != null) {
            list.add(new j(this.f15921a.f19720k, false, q.OPEN_INTERNAL_STORE, th2.toString()));
        }
        return r.a(uri.toString(), "IgniteGooglePlay", "mInternalStoreWebpageController.show has failed");
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final boolean a(Uri uri, r rVar) {
        com.fyber.inneractive.sdk.ignite.m mVar;
        v0 v0Var;
        com.fyber.inneractive.sdk.ignite.m mVar2 = com.fyber.inneractive.sdk.ignite.m.NONE;
        if (rVar != null) {
            mVar = rVar.f15953l;
            this.f15922b = rVar.f15952k;
            this.f15921a = rVar.f15951j;
        } else {
            mVar = mVar2;
        }
        return mVar != mVar2 && IAConfigManager.O.E.n() && (v0Var = this.f15921a) != null && v0Var.f19721l;
    }

    @Override // com.fyber.inneractive.sdk.click.a
    public final void cancel() {
        this.f15926f = true;
        this.f15923c = null;
    }
}
