package df;

import android.content.Context;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: SignalsCollectorBase.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class e implements c {

    /* JADX INFO: compiled from: SignalsCollectorBase.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59769a;

        static {
            int[] iArr = new int[UnityAdFormat.values().length];
            f59769a = iArr;
            try {
                iArr[UnityAdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59769a[UnityAdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59769a[UnityAdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: SignalsCollectorBase.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public df.b f59770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f f59771c;

        public b(df.b bVar, f fVar) {
            this.f59770b = bVar;
            this.f59771c = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, String> mapC = this.f59771c.c();
            if (mapC.size() > 0) {
                this.f59770b.onSignalsCollected(new JSONObject(mapC).toString());
            } else if (this.f59771c.b() == null) {
                this.f59770b.onSignalsCollected("");
            } else {
                this.f59770b.onSignalsCollectionFailed(this.f59771c.b());
            }
        }
    }

    @Override // df.c
    public void a(Context context, String str, UnityAdFormat unityAdFormat, df.b bVar) {
        af.a aVar = new af.a();
        f fVar = new f();
        aVar.a();
        e(context, str, unityAdFormat, aVar, fVar);
        aVar.c(new b(bVar, fVar));
    }

    @Override // df.c
    public void b(Context context, boolean z10, df.b bVar) {
        af.a aVar = new af.a();
        f fVar = new f();
        aVar.a();
        d(context, UnityAdFormat.INTERSTITIAL, aVar, fVar);
        aVar.a();
        d(context, UnityAdFormat.REWARDED, aVar, fVar);
        if (z10) {
            aVar.a();
            d(context, UnityAdFormat.BANNER, aVar, fVar);
        }
        aVar.c(new b(bVar, fVar));
    }

    @Override // df.c
    public void c(Context context, List<UnityAdFormat> list, df.b bVar) {
        af.a aVar = new af.a();
        f fVar = new f();
        for (UnityAdFormat unityAdFormat : list) {
            aVar.a();
            d(context, unityAdFormat, aVar, fVar);
        }
        aVar.c(new b(bVar, fVar));
    }

    public String f(UnityAdFormat unityAdFormat) {
        int i10 = a.f59769a[unityAdFormat.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "" : "gmaScarBiddingRewardedSignal" : "gmaScarBiddingInterstitialSignal" : "gmaScarBiddingBannerSignal";
    }
}
