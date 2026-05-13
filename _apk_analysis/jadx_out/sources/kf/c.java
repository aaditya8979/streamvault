package kf;

import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/* JADX INFO: compiled from: ScarBannerAd.java */
/* JADX INFO: loaded from: classes4.dex */
public class c extends a<AdView> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RelativeLayout f73087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f73088h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f73089i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AdView f73090j;

    public c(Context context, RelativeLayout relativeLayout, jf.a aVar, cf.c cVar, int i10, int i11, af.c cVar2, af.f fVar) {
        super(context, cVar, aVar, cVar2);
        this.f73087g = relativeLayout;
        this.f73088h = i10;
        this.f73089i = i11;
        this.f73090j = new AdView(this.f73081b);
        this.f73084e = new d(fVar, this);
    }

    @Override // kf.a
    public void b(AdRequest adRequest, cf.b bVar) {
        AdView adView;
        RelativeLayout relativeLayout = this.f73087g;
        if (relativeLayout == null || (adView = this.f73090j) == null) {
            return;
        }
        relativeLayout.addView(adView);
        this.f73090j.setAdSize(new AdSize(this.f73088h, this.f73089i));
        this.f73090j.setAdUnitId(this.f73082c.b());
        this.f73090j.setAdListener(((d) this.f73084e).d());
        this.f73090j.loadAd(adRequest);
    }

    public void d() {
        AdView adView;
        RelativeLayout relativeLayout = this.f73087g;
        if (relativeLayout == null || (adView = this.f73090j) == null) {
            return;
        }
        relativeLayout.removeView(adView);
    }
}
