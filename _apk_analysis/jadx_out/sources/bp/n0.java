package bp;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.yk.e.AbstractC4634il;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f5820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i.e f5823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f5828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w0 f5829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d.d f5830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View.OnClickListener f5831l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u f5834o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MaxNativeAdLoader f5835p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MaxAd f5837r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f5842w;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f5832m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f5833n = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5836q = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5838s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5839t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5840u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5841v = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l0 f5843x = new l0(this);

    public n0(Activity activity, String str, String str2, String str3, i.e eVar, long j10, u uVar) {
        this.f5821b = "";
        this.f5822c = "";
        this.f5842w = "";
        this.f5820a = activity;
        this.f5822c = str;
        this.f5821b = str2;
        this.f5842w = str3;
        this.f5823d = eVar;
        this.f5828i = j10;
        this.f5834o = uVar;
    }

    public static d.d a(n0 n0Var) {
        int i10;
        int i11;
        i.e eVar;
        i.e eVar2;
        boolean z10 = n0Var.f5833n;
        if (z10 || (eVar2 = n0Var.f5823d) == null || (i10 = eVar2.f63662d) == 0) {
            i10 = n0Var.f5824e;
        }
        int i12 = i10;
        if (z10 || (eVar = n0Var.f5823d) == null || (i11 = eVar.f63663e) == 0) {
            i11 = n0Var.f5825f;
        }
        Activity activity = n0Var.f5820a;
        d.d dVar = new d.d(activity, i12, i11, n0Var.f5826g, n0Var.f5827h);
        n0Var.f5830k = dVar;
        View.OnClickListener onClickListener = n0Var.f5831l;
        if (onClickListener != null) {
            MaxNativeAdView maxNativeAdView = dVar.f59490b;
            if (maxNativeAdView == null) {
                AdLog.e("ApplovinNativeView", "setCloseImageViewClickListener maxNativeAdView is null");
            } else {
                ImageView imageView = (ImageView) maxNativeAdView.findViewById(IDUtil.getViewID(activity, "main_al_native_im_close"));
                if (imageView != null) {
                    imageView.setOnClickListener(onClickListener);
                }
            }
        }
        if (n0Var.f5832m) {
            d.d dVar2 = n0Var.f5830k;
            MaxNativeAdView maxNativeAdView2 = dVar2.f59490b;
            if (maxNativeAdView2 == null) {
                AdLog.e("ApplovinNativeView", "showCloseImageView maxNativeAdView is null");
            } else {
                ImageView imageView2 = (ImageView) maxNativeAdView2.findViewById(IDUtil.getViewID(dVar2.f59489a, "main_al_native_im_close"));
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
            }
        }
        return n0Var.f5830k;
    }

    public static void c(n0 n0Var, String str) {
        n0Var.getClass();
        n0Var.d("onThirdAdLoadFailed4Render, msg = " + str);
        if (n0Var.f5839t || n0Var.f5840u) {
            return;
        }
        n0Var.f5839t = true;
        w0 w0Var = n0Var.f5829j;
        if (w0Var != null) {
            w0Var.a(str);
        }
    }

    public final void b(Activity activity) {
        d("unitID " + this.f5842w);
        AbstractC4634il.ILil(activity.getApplicationContext(), new j(this, activity));
        if (this.f5841v) {
            d("refreshAdCache, do not turn on the countdown");
        } else {
            new Handler().postDelayed(new n1(this), this.f5828i);
        }
        Constant.addFragmentListener(activity, new p0(this));
    }

    public final void d(String str) {
        AdLog.i("OktMaxNative", "adType = " + this.f5822c + ", adPlcID = " + this.f5821b + ", msg = " + str);
    }
}
