package lf;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import df.d;
import df.e;
import df.f;

/* JADX INFO: compiled from: SignalsCollector.java */
/* JADX INFO: loaded from: classes11.dex */
public class b extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jf.a f73826a;

    /* JADX INFO: compiled from: SignalsCollector.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73827a;

        static {
            int[] iArr = new int[UnityAdFormat.values().length];
            f73827a = iArr;
            try {
                iArr[UnityAdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73827a[UnityAdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(jf.a aVar) {
        this.f73826a = aVar;
    }

    @Override // df.c
    public void d(Context context, UnityAdFormat unityAdFormat, af.a aVar, f fVar) {
        e(context, f(unityAdFormat), unityAdFormat, aVar, fVar);
    }

    @Override // df.c
    public void e(Context context, String str, UnityAdFormat unityAdFormat, af.a aVar, f fVar) {
        QueryInfo.generate(context, g(unityAdFormat), this.f73826a.a(), new lf.a(str, new d(aVar, fVar)));
    }

    public AdFormat g(UnityAdFormat unityAdFormat) {
        int i10 = a.f73827a[unityAdFormat.ordinal()];
        return i10 != 1 ? i10 != 2 ? AdFormat.INTERSTITIAL : AdFormat.REWARDED : AdFormat.BANNER;
    }
}
