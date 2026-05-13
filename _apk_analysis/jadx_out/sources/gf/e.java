package gf;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.interstitial.InterstitialAd;

/* JADX INFO: compiled from: ScarInterstitialAd.java */
/* JADX INFO: loaded from: classes8.dex */
public class e extends a<InterstitialAd> implements cf.a {
    public e(Context context, ff.a aVar, cf.c cVar, af.c cVar2, af.g gVar) {
        super(context, cVar, aVar, cVar2);
        this.f62378e = new f(gVar, this);
    }

    @Override // gf.a
    public void b(AdRequest adRequest, cf.b bVar) {
        InterstitialAd.load(this.f62375b, this.f62376c.b(), adRequest, ((f) this.f62378e).e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cf.a
    public void show(Activity activity) {
        T t10 = this.f62374a;
        if (t10 != 0) {
            ((InterstitialAd) t10).show(activity);
        } else {
            this.f62379f.handleError(af.b.a(this.f62376c));
        }
    }
}
