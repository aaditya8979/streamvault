package gf;

import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

/* JADX INFO: compiled from: ScarBannerAd.java */
/* JADX INFO: loaded from: classes8.dex */
public class c extends a<AdView> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RelativeLayout f62381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f62382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f62383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AdView f62384j;

    public c(Context context, RelativeLayout relativeLayout, ff.a aVar, cf.c cVar, int i10, int i11, af.c cVar2, af.f fVar) {
        super(context, cVar, aVar, cVar2);
        this.f62381g = relativeLayout;
        this.f62382h = i10;
        this.f62383i = i11;
        this.f62384j = new AdView(this.f62375b);
        this.f62378e = new d(fVar, this);
    }

    @Override // gf.a
    public void b(AdRequest adRequest, cf.b bVar) {
        AdView adView;
        RelativeLayout relativeLayout = this.f62381g;
        if (relativeLayout == null || (adView = this.f62384j) == null) {
            return;
        }
        relativeLayout.addView(adView);
        this.f62384j.setAdSize(new AdSize(this.f62382h, this.f62383i));
        this.f62384j.setAdUnitId(this.f62376c.b());
        this.f62384j.setAdListener(((d) this.f62378e).d());
        this.f62384j.loadAd(adRequest);
    }

    public void d() {
        AdView adView;
        RelativeLayout relativeLayout = this.f62381g;
        if (relativeLayout == null || (adView = this.f62384j) == null) {
            return;
        }
        relativeLayout.removeView(adView);
    }
}
