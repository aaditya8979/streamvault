package kf;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* JADX INFO: compiled from: ScarInterstitialAd.java */
/* JADX INFO: loaded from: classes4.dex */
public class e extends a<InterstitialAd> implements cf.a {
    public e(Context context, jf.a aVar, cf.c cVar, af.c cVar2, af.g gVar) {
        super(context, cVar, aVar, cVar2);
        this.f73084e = new f(gVar, this);
    }

    @Override // kf.a
    public void b(AdRequest adRequest, cf.b bVar) {
        InterstitialAd.load(this.f73081b, this.f73082c.b(), adRequest, ((f) this.f73084e).e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cf.a
    public void show(Activity activity) {
        T t10 = this.f73080a;
        if (t10 != 0) {
            ((InterstitialAd) t10).show(activity);
        } else {
            this.f73085f.handleError(af.b.a(this.f73082c));
        }
    }
}
