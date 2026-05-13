package com.safedk.android.analytics.brandsafety;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.AdNetworkConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes8.dex */
public class n extends c {
    public boolean V;
    Set<String> W;
    boolean X;
    boolean Y;
    long Z;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    boolean f52689aa;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public String f52690ab;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    public String f52691ac;

    /* JADX INFO: renamed from: ad, reason: collision with root package name */
    public long f52692ad;

    /* JADX INFO: renamed from: ae, reason: collision with root package name */
    public boolean f52693ae;

    /* JADX INFO: renamed from: af, reason: collision with root package name */
    public long f52694af;

    /* JADX INFO: renamed from: ag, reason: collision with root package name */
    public BrandSafetyUtils.ScreenShotOrientation f52695ag;

    /* JADX INFO: renamed from: ah, reason: collision with root package name */
    public boolean f52696ah;

    /* JADX INFO: renamed from: ai, reason: collision with root package name */
    public h f52697ai;

    /* JADX INFO: renamed from: aj, reason: collision with root package name */
    public boolean f52698aj;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    public ScheduledFuture<?> f52699ak;

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    public boolean f52700al;

    /* JADX INFO: renamed from: am, reason: collision with root package name */
    public Activity f52701am;

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    boolean f52702an;

    /* JADX INFO: renamed from: ao, reason: collision with root package name */
    String f52703ao;

    /* JADX INFO: renamed from: ap, reason: collision with root package name */
    private int f52704ap;

    public n(String str, int i10, Bundle bundle) {
        super(i10, bundle, null, str, null, BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED, BrandSafetyUtils.AdType.INTERSTITIAL);
        this.V = false;
        this.X = true;
        this.Y = true;
        this.f52689aa = false;
        this.f52690ab = null;
        this.f52691ac = null;
        this.f52692ad = 0L;
        this.f52693ae = false;
        this.f52694af = 0L;
        this.f52695ag = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.f52696ah = false;
        this.f52697ai = null;
        this.f52698aj = false;
        this.f52699ak = null;
        this.f52700al = false;
        this.f52702an = false;
        this.f52704ap = 0;
        this.f52703ao = null;
        this.W = new HashSet();
        if (str != null) {
            this.f52698aj = CreativeInfoManager.a(str, AdNetworkConfiguration.SDK_INTERSTITIALS_RUN_ON_APP_ACTIVITY, false);
        }
    }

    public n(String str, String str2, String str3, BrandSafetyUtils.ScreenShotOrientation screenShotOrientation, String str4, String str5) {
        super(str, str2, str3, screenShotOrientation, str4, BrandSafetyUtils.AdType.INTERSTITIAL);
        this.V = false;
        this.X = true;
        this.Y = true;
        this.f52689aa = false;
        this.f52690ab = null;
        this.f52691ac = null;
        this.f52692ad = 0L;
        this.f52693ae = false;
        this.f52694af = 0L;
        this.f52695ag = BrandSafetyUtils.ScreenShotOrientation.NOT_INITIALIZED;
        this.f52696ah = false;
        this.f52697ai = null;
        this.f52698aj = false;
        this.f52699ak = null;
        this.f52700al = false;
        this.f52702an = false;
        this.f52704ap = 0;
        this.f52703ao = null;
        this.f51884q = str5;
    }

    public boolean E() {
        return this.f52702an;
    }

    int F() {
        return this.f52704ap;
    }

    void G() {
        this.f52704ap++;
    }

    void H() {
        this.f52704ap = 0;
    }

    public synchronized void I() {
        this.X = true;
    }

    public boolean J() {
        return (this.f52701am == null && (!this.f52698aj || i() == null || i().f() == null)) ? false : true;
    }

    public View K() {
        if (this.f52701am != null) {
            return this.f52701am.getWindow().getDecorView().findViewById(R.id.content);
        }
        if (!this.f52698aj || i() == null) {
            return null;
        }
        return i().f();
    }

    public void L() {
        e(this.f52703ao);
    }

    public void a(String str, boolean z10) {
        if (str != null) {
            if (this.f52703ao == null) {
                this.f52703ao = str;
            } else {
                if (z10 && this.f52703ao.contains(str)) {
                    return;
                }
                this.f52703ao += ImpressionLog.P + str;
            }
        }
    }

    public void f(boolean z10) {
        this.f52702an = z10;
    }

    @Override // com.safedk.android.analytics.brandsafety.c
    public String toString() {
        j jVarL = l();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("maxSdk: ").append(this.f51889v != null ? this.f51889v : "").append(", hash: ").append((jVarL == null || jVarL.f52619a == null) ? "" : jVarL.f52619a).append(", orientation: ").append((jVarL == null || jVarL.f52624f == null) ? "" : jVarL.f52624f.name()).append(", activity address: ").append(this.B != null ? this.B : "").append(", view address: ").append(this.K != null ? this.K : "").append(", interstitial activity name: ").append(this.f52691ac != null ? this.f52691ac : "").append(", eventId: ").append(this.L != null ? this.L : "").append(", isAdFinished: ").append(this.U).append(", number of CIs: ").append(j().size());
        return sb2.toString();
    }
}
