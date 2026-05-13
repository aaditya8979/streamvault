package a;

import com.yk.e.callBack.MainPreloadAdCallback;
import com.yk.e.callBack.MainRefreshCallback;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements MainRefreshCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainPreloadAdCallback f3417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f3420d;

    public b(d dVar, MainPreloadAdCallback mainPreloadAdCallback, int i10, String str) {
        this.f3420d = dVar;
        this.f3417a = mainPreloadAdCallback;
        this.f3418b = i10;
        this.f3419c = str;
    }

    @Override // com.yk.e.callBack.MainRefreshCallback
    public final void onFinish() {
        if (this.f3417a == null) {
            return;
        }
        d dVar = this.f3420d;
        int i10 = this.f3418b;
        String str = this.f3419c;
        dVar.getClass();
        a aVarB = d.b(i10);
        if (aVarB == null) {
            AdLog.i("AdCacheRefreshUtils", "preloadIsSuc, adCache is null");
        } else if (i10 == 14 ? d.a(aVarB, str) >= 1 : aVarB.g(str) >= 1) {
            this.f3417a.onSucceeded();
            d dVar2 = this.f3420d;
            String str2 = "preloadAd succ, adType = " + ((String) this.f3420d.f3423a.get(Integer.valueOf(this.f3418b)));
            dVar2.getClass();
            AdLog.i("AdCacheRefreshUtils", str2);
            return;
        }
        this.f3417a.onFailed();
        d dVar3 = this.f3420d;
        String str3 = "preloadAd fail, adType = " + ((String) this.f3420d.f3423a.get(Integer.valueOf(this.f3418b)));
        dVar3.getClass();
        AdLog.i("AdCacheRefreshUtils", str3);
    }
}
