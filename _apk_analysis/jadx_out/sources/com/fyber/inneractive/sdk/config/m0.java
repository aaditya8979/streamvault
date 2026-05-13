package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f16084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f16085b;

    public m0(Context context, w wVar) {
        this.f16084a = context;
        this.f16085b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (InneractiveAdManager.isCurrentUserAChild()) {
            return;
        }
        try {
            n0.a(this.f16084a, this.f16085b);
            v vVar = u.f16160a.f16168b;
            if (TextUtils.isEmpty(vVar != null ? vVar.f16164a : null)) {
                n.a(this.f16084a, this.f16085b);
            }
        } catch (Throwable th2) {
            IAlog.b("SDK internal error: Make sure that Google Play Services for Mobile Ads is added to the compile dependencies of your project" + th2.toString(), new Object[0]);
        }
    }
}
