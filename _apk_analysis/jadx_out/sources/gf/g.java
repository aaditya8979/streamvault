package gf;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* JADX INFO: compiled from: ScarRewardedAd.java */
/* JADX INFO: loaded from: classes8.dex */
public class g extends a<RewardedAd> implements cf.a {
    public g(Context context, ff.a aVar, cf.c cVar, af.c cVar2, af.h hVar) {
        super(context, cVar, aVar, cVar2);
        this.f62378e = new h(hVar, this);
    }

    @Override // gf.a
    public void b(AdRequest adRequest, cf.b bVar) {
        RewardedAd.load(this.f62375b, this.f62376c.b(), adRequest, ((h) this.f62378e).e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cf.a
    public void show(Activity activity) {
        T t10 = this.f62374a;
        if (t10 != 0) {
            ((RewardedAd) t10).show(activity, ((h) this.f62378e).f());
        } else {
            this.f62379f.handleError(af.b.a(this.f62376c));
        }
    }
}
