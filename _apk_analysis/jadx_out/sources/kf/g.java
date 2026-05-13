package kf;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.rewarded.RewardedAd;

/* JADX INFO: compiled from: ScarRewardedAd.java */
/* JADX INFO: loaded from: classes4.dex */
public class g extends a<RewardedAd> implements cf.a {
    public g(Context context, jf.a aVar, cf.c cVar, af.c cVar2, af.h hVar) {
        super(context, cVar, aVar, cVar2);
        this.f73084e = new h(hVar, this);
    }

    @Override // kf.a
    public void b(AdRequest adRequest, cf.b bVar) {
        RewardedAd.load(this.f73081b, this.f73082c.b(), adRequest, ((h) this.f73084e).e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cf.a
    public void show(Activity activity) {
        T t10 = this.f73080a;
        if (t10 != 0) {
            ((RewardedAd) t10).show(activity, ((h) this.f73084e).f());
        } else {
            this.f73085f.handleError(af.b.a(this.f73082c));
        }
    }
}
