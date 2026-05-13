package sg.bigo.ads.ad.interstitial.j;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.banner.g;
import sg.bigo.ads.ad.interstitial.n;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.core.h;

/* JADX INFO: loaded from: classes11.dex */
public class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f81087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterstitialAd f81088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f81089c;

    public a(InterstitialAd interstitialAd, Context context, @NonNull n nVar) {
        this.f81089c = nVar;
        this.f81087a = context;
        this.f81088b = interstitialAd;
    }

    @Override // sg.bigo.ads.ad.banner.g
    public void a(View view, View view2, h.b bVar) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
    }
}
