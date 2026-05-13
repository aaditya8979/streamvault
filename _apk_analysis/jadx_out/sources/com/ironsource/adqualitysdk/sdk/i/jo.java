package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes10.dex */
public final class jo {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private jm f2874;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f2872 = false;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Handler f2875 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private jg f2873 = new jh() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.3
        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            jo.m6778(jo.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            jo.m6778(jo.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            jo.m6775(jo.this, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            jo.m6779(jo.this, activity);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            jo.m6778(jo.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            jo.m6778(jo.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jh, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            jo.m6778(jo.this);
        }
    };

    public jo(jm jmVar) {
        this.f2874 = jmVar;
        jj.m6752().m6755(this.f2873);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m6775(jo joVar, final Activity activity) {
        joVar.f2875.postDelayed(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.5
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo4352() {
                jo.m6776(jo.this);
                if (jo.this.f2874 != null) {
                    jo.this.f2874.mo4456(activity);
                }
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m6776(jo joVar) {
        joVar.f2872 = true;
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m6778(jo joVar) {
        joVar.f2875.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m6779(jo joVar, Activity activity) {
        if (joVar.f2872) {
            joVar.f2872 = false;
            jm jmVar = joVar.f2874;
            if (jmVar != null) {
                jmVar.mo4457(activity);
            }
        }
        joVar.f2875.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m6780() {
        this.f2875.removeCallbacksAndMessages(null);
        if (this.f2873 != null) {
            jj.m6752().m6754(this.f2873);
            this.f2873 = null;
        }
    }
}
