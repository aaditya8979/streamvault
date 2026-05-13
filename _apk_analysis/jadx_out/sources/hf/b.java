package hf;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import df.d;
import df.e;
import df.f;

/* JADX INFO: compiled from: SignalsCollector.java */
/* JADX INFO: loaded from: classes9.dex */
public class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ff.a f63499a;

    /* JADX INFO: compiled from: SignalsCollector.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63500a;

        static {
            int[] iArr = new int[UnityAdFormat.values().length];
            f63500a = iArr;
            try {
                iArr[UnityAdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63500a[UnityAdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63500a[UnityAdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b(ff.a aVar) {
        this.f63499a = aVar;
    }

    @Override // df.c
    public void d(Context context, UnityAdFormat unityAdFormat, af.a aVar, f fVar) {
        e(context, f(unityAdFormat), unityAdFormat, aVar, fVar);
    }

    @Override // df.c
    public void e(Context context, String str, UnityAdFormat unityAdFormat, af.a aVar, f fVar) {
        QueryInfo.generate(context, g(unityAdFormat), this.f63499a.a(), new hf.a(str, new d(aVar, fVar)));
    }

    public AdFormat g(UnityAdFormat unityAdFormat) {
        int i10 = a.f63500a[unityAdFormat.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? AdFormat.UNKNOWN : AdFormat.REWARDED : AdFormat.INTERSTITIAL : AdFormat.BANNER;
    }
}
