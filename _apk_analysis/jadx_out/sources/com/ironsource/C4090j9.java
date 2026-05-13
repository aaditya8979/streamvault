package com.ironsource;

import com.ironsource.Ne;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.ironsourceads.IronSourceAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4090j9 {

    /* JADX INFO: renamed from: com.ironsource.j9$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32069a;

        static {
            int[] iArr = new int[IronSourceAds.AdFormat.values().length];
            try {
                iArr[IronSourceAds.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSourceAds.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSourceAds.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32069a = iArr;
        }
    }

    @NotNull
    public final IronSourceError a(@NotNull C4169ne c4169ne) {
        tn.p.k(c4169ne, "error");
        return (c4169ne.c() == 2070 || c4169ne.c() == 2110) ? C4365z5.f34494a.b() : (c4169ne.c() == 2080 || c4169ne.c() == 2100) ? C4365z5.f34494a.c() : c4169ne.c() == 2090 ? C4365z5.f34494a.a() : new IronSourceError(510, c4169ne.d());
    }

    public final void a(long j10, @NotNull Ne.a aVar) {
        tn.p.k(aVar, "responseOrigin");
        JSONObject jSONObjectB = IronSourceUtils.b(true);
        try {
            jSONObjectB.put("isMultipleAdObjects", 1);
            jSONObjectB.put("duration", j10);
            jSONObjectB.put(IronSourceConstants.EVENTS_EXT1, aVar.b());
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Lb.f29764s.d().q().a(new C5(D5.SDK_INIT_SUCCESS, jSONObjectB));
    }

    public final void a(@NotNull C4169ne c4169ne, long j10) {
        tn.p.k(c4169ne, "error");
        JSONObject jSONObjectB = IronSourceUtils.b(true);
        try {
            jSONObjectB.put(IronSourceConstants.EVENTS_ERROR_CODE, c4169ne.c());
            jSONObjectB.put("reason", c4169ne.d());
            jSONObjectB.put("duration", j10);
            jSONObjectB.put("isMultipleAdObjects", 1);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        Lb.f29764s.d().q().a(new C5(D5.SDK_INIT_FAILED, jSONObjectB));
    }

    public final void a(@NotNull Runnable runnable) {
        tn.p.k(runnable, "runnable");
        V7.a(V7.f30593a, runnable, 0L, 2, (Object) null);
    }

    @NotNull
    public final IronSource.a[] a(@NotNull List<? extends IronSourceAds.AdFormat> list) {
        tn.p.k(list, "adFormats");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends IronSourceAds.AdFormat> it = list.iterator();
        while (it.hasNext()) {
            int i10 = a.f32069a[it.next().ordinal()];
            if (i10 == 1) {
                arrayList.add(IronSource.a.BANNER);
            } else if (i10 == 2) {
                arrayList.add(IronSource.a.INTERSTITIAL);
            } else if (i10 == 3) {
                arrayList.add(IronSource.a.REWARDED_VIDEO);
            }
        }
        return (IronSource.a[]) arrayList.toArray(new IronSource.a[0]);
    }

    @NotNull
    public final C4169ne b(@NotNull C4169ne c4169ne) {
        tn.p.k(c4169ne, "error");
        return c4169ne.c() == 2080 ? new C4169ne(c4169ne.c(), "serverResponseIsNotValid") : c4169ne;
    }

    public final void b(@NotNull Runnable runnable) {
        tn.p.k(runnable, "callback");
        V7.f30593a.a(runnable);
    }
}
