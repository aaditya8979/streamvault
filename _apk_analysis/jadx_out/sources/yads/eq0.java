package yads;

import android.os.Handler;
import android.view.View;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final class eq0 implements Runnable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f89349f = {wb.a(eq0.class, "exposureUpdateListenerReference", "getExposureUpdateListenerReference()Lcom/monetization/ads/base/webview/mraid/exposure/OnExposureUpdateListener;", 0), wb.a(eq0.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f89350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cq0 f89351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final lm2 f89352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lm2 f89353e;

    public eq0(Handler handler, View view, cq0 cq0Var, ka2 ka2Var) {
        this.f89350b = handler;
        this.f89351c = cq0Var;
        this.f89352d = mm2.a(ka2Var);
        this.f89353e = mm2.a(view);
    }

    @Override // java.lang.Runnable
    public final void run() {
        lm2 lm2Var = this.f89353e;
        KProperty[] kPropertyArr = f89349f;
        KProperty kProperty = kPropertyArr[1];
        View view = (View) lm2Var.f92035a.get();
        lm2 lm2Var2 = this.f89352d;
        KProperty kProperty2 = kPropertyArr[0];
        ka2 ka2Var = (ka2) lm2Var2.f92035a.get();
        if (view == null || ka2Var == null) {
            return;
        }
        bq0 bq0VarA = this.f89351c.a(view);
        wv1 wv1Var = (wv1) ka2Var;
        if (!tn.p.f(bq0VarA, wv1Var.f96530r)) {
            wv1Var.f96530r = bq0VarA;
            wv1Var.f96514b.a(new dq0(bq0VarA.f88111a, bq0VarA.f88112b));
        }
        this.f89350b.postDelayed(this, 200L);
    }
}
