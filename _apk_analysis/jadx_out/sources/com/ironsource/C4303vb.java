package com.ironsource;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4303vb;
import com.ironsource.E0;
import com.ironsource.F9;
import com.ironsource.L8;
import com.ironsource.Lb;
import com.ironsource.N7;
import com.ironsource.Td;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayConfiguration;
import com.unity3d.mediation.LevelPlayInitError;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4303vb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C4303vb f34255a = new C4303vb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C4320wb f34256b = new C4320wb();

    /* JADX INFO: renamed from: com.ironsource.vb$a */
    public static final class a implements InterfaceC4238re {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LevelPlayInitRequest f34257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f34258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C4122l5 f34259c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LevelPlayInitListener f34260d;

        public a(LevelPlayInitRequest levelPlayInitRequest, Context context, C4122l5 c4122l5, LevelPlayInitListener levelPlayInitListener) {
            this.f34257a = levelPlayInitRequest;
            this.f34258b = context;
            this.f34259c = c4122l5;
            this.f34260d = levelPlayInitListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitListener levelPlayInitListener, C4122l5 c4122l5, C4169ne c4169ne) {
            tn.p.k(c4122l5, "$initDuration");
            tn.p.k(c4169ne, "$error");
            C4303vb.f34255a.a(levelPlayInitListener, c4122l5, c4169ne);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(LevelPlayInitRequest levelPlayInitRequest, C4131le c4131le, Context context, C4122l5 c4122l5, LevelPlayInitListener levelPlayInitListener) {
            tn.p.k(levelPlayInitRequest, "$initRequest");
            tn.p.k(c4131le, "$sdkConfig");
            tn.p.k(context, "$context");
            tn.p.k(c4122l5, "$initDuration");
            C4303vb.f34255a.a(levelPlayInitRequest, c4131le, context, c4122l5, levelPlayInitListener);
        }

        @Override // com.ironsource.InterfaceC4238re
        public void a(@NotNull final C4131le c4131le) {
            tn.p.k(c4131le, "sdkConfig");
            C4320wb c4320wb = C4303vb.f34256b;
            final LevelPlayInitRequest levelPlayInitRequest = this.f34257a;
            final Context context = this.f34258b;
            final C4122l5 c4122l5 = this.f34259c;
            final LevelPlayInitListener levelPlayInitListener = this.f34260d;
            c4320wb.a(new Runnable() { // from class: com.ironsource.em
                @Override // java.lang.Runnable
                public final void run() {
                    C4303vb.a.a(levelPlayInitRequest, c4131le, context, c4122l5, levelPlayInitListener);
                }
            });
        }

        @Override // com.ironsource.InterfaceC4238re
        public void a(@NotNull final C4169ne c4169ne) {
            tn.p.k(c4169ne, "error");
            C4320wb c4320wb = C4303vb.f34256b;
            final LevelPlayInitListener levelPlayInitListener = this.f34260d;
            final C4122l5 c4122l5 = this.f34259c;
            c4320wb.a(new Runnable() { // from class: com.ironsource.fm
                @Override // java.lang.Runnable
                public final void run() {
                    C4303vb.a.a(levelPlayInitListener, c4122l5, c4169ne);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.ironsource.vb$b */
    public static final class b extends Lambda implements sn.a<bn.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3931ab f34261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C4122l5 f34262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f34263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ LevelPlayInitListener f34264d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3931ab c3931ab, C4122l5 c4122l5, long j10, LevelPlayInitListener levelPlayInitListener) {
            super(0);
            this.f34261a = c3931ab;
            this.f34262b = c4122l5;
            this.f34263c = j10;
            this.f34264d = levelPlayInitListener;
        }

        public final void a() {
            C4303vb.f34255a.a(this.f34261a, this.f34262b, this.f34263c, this.f34264d);
        }

        @Override // sn.a
        public /* bridge */ /* synthetic */ bn.r invoke() {
            a();
            return bn.r.f5635a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.vb$c */
    public static final class c extends Lambda implements sn.a<bn.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f34265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List<String> f34266b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, List<String> list) {
            super(0);
            this.f34265a = str;
            this.f34266b = list;
        }

        public final void a() {
            com.ironsource.mediationsdk.r.m().a(this.f34265a, this.f34266b);
        }

        @Override // sn.a
        public /* bridge */ /* synthetic */ bn.r invoke() {
            a();
            return bn.r.f5635a;
        }
    }

    private C4303vb() {
    }

    private final C4002ea a(LevelPlaySegment levelPlaySegment) {
        C4002ea c4002ea = new C4002ea();
        c4002ea.a(levelPlaySegment.getLevel());
        c4002ea.a(levelPlaySegment.getIapTotal());
        c4002ea.a(levelPlaySegment.isPaying());
        c4002ea.a(levelPlaySegment.getUserCreationDate());
        c4002ea.a(levelPlaySegment.getSegmentName());
        Iterator<T> it = levelPlaySegment.getCustoms$mediationsdk_release().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            c4002ea.a((String) pair.getFirst(), (String) pair.getSecond());
        }
        return c4002ea;
    }

    private final void a(long j10, sn.a<bn.r> aVar) {
        if (Lb.f29764s.d().e().c() || j10 <= 0) {
            aVar.invoke();
        } else {
            f34256b.a(aVar, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final C3931ab c3931ab, C4122l5 c4122l5, long j10, final LevelPlayInitListener levelPlayInitListener) {
        Lb.f29764s.a().D().d();
        long jA = C4122l5.a(c4122l5);
        C4320wb c4320wb = f34256b;
        C4320wb.a(c4320wb, jA, c3931ab.f(), j10, null, 8, null);
        c4320wb.e(new Runnable() { // from class: com.ironsource.cm
            @Override // java.lang.Runnable
            public final void run() {
                C4303vb.a(levelPlayInitListener, c3931ab);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4169ne c4169ne, LevelPlayInitListener levelPlayInitListener, C4169ne c4169ne2) {
        tn.p.k(c4169ne, "$error");
        tn.p.k(c4169ne2, "$eventError");
        IronLog.CALLBACK.info("LevelPlayInitListener.LevelPlayInitError() error: " + c4169ne);
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitFailed(new LevelPlayInitError(f34256b.a(c4169ne2)));
        }
    }

    public static /* synthetic */ void a(C4303vb c4303vb, Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            levelPlayInitListener = null;
        }
        c4303vb.a(context, levelPlayInitRequest, levelPlayInitListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(LevelPlayInitListener levelPlayInitListener, C3931ab c3931ab) {
        tn.p.k(c3931ab, "$levelPlayConfig");
        IronLog.CALLBACK.info("LevelPlayInitListener.onInitSuccess()");
        if (levelPlayInitListener != null) {
            levelPlayInitListener.onInitSuccess(new LevelPlayConfiguration(c3931ab.k(), c3931ab.h()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final LevelPlayInitListener levelPlayInitListener, C4122l5 c4122l5, final C4169ne c4169ne) {
        long jA = C4122l5.a(c4122l5);
        C4320wb c4320wb = f34256b;
        final C4169ne c4169neB = c4320wb.b(c4169ne);
        C4320wb.a(c4320wb, c4169neB, jA, null, 4, null);
        c4320wb.e(new Runnable() { // from class: com.ironsource.bm
            @Override // java.lang.Runnable
            public final void run() {
                C4303vb.a(c4169ne, levelPlayInitListener, c4169neB);
            }
        });
    }

    private final void a(LevelPlayInitRequest levelPlayInitRequest, C3931ab c3931ab) {
        LevelPlay.AdFormat adFormat = LevelPlay.AdFormat.REWARDED;
        if (a(levelPlayInitRequest, adFormat) && c3931ab.d().c().f() != null) {
            Td.a aVar = Td.f30507z;
            IronSource.a aVar2 = IronSource.a.REWARDED_VIDEO;
            Td tdA = aVar.a(new C4028g0(aVar2, C4367z7.f34502a.a(), "", null, null, null, 56, null), c3931ab, true);
            List<C4355yc> listC = c3931ab.c(adFormat);
            E0.b bVar = E0.b.MEDIATION;
            new C4288ud(new W0(new C4173o0(aVar2, bVar), tdA, bVar), adFormat, listC, tdA).a();
        }
        LevelPlay.AdFormat adFormat2 = LevelPlay.AdFormat.INTERSTITIAL;
        if (a(levelPlayInitRequest, adFormat2) && c3931ab.d().c().d() != null) {
            F9.a aVar3 = F9.f29308z;
            IronSource.a aVar4 = IronSource.a.INTERSTITIAL;
            F9 f9A = aVar3.a(new C4028g0(aVar4, C4367z7.f34502a.a(), "", null, null, null, 56, null), c3931ab, true);
            List<C4355yc> listC2 = c3931ab.c(adFormat2);
            E0.b bVar2 = E0.b.MEDIATION;
            new C4288ud(new W0(new C4173o0(aVar4, bVar2), f9A, bVar2), adFormat2, listC2, f9A).a();
        }
        LevelPlay.AdFormat adFormat3 = LevelPlay.AdFormat.BANNER;
        if (!a(levelPlayInitRequest, adFormat3) || c3931ab.d().c().c() == null) {
            return;
        }
        M2 m2A = M2.f29823z.a(new J2(), c3931ab, true);
        List<C4355yc> listC3 = c3931ab.c(adFormat3);
        IronSource.a aVar5 = IronSource.a.BANNER;
        E0.b bVar3 = E0.b.MEDIATION;
        new C4288ud(new W0(new C4173o0(aVar5, bVar3), m2A, bVar3), adFormat3, listC3, m2A).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LevelPlayInitRequest levelPlayInitRequest, C4131le c4131le, Context context, C4122l5 c4122l5, LevelPlayInitListener levelPlayInitListener) {
        Lb.b bVar = Lb.f29764s;
        L8.a aVarD = bVar.a().D();
        C3931ab c3931ab = new C3931ab(c4131le);
        if (c3931ab.l()) {
            f34256b.a(context);
        }
        N7.a aVarA = bVar.a().a();
        C4320wb c4320wb = f34256b;
        c3931ab.b(c4320wb).a(aVarA);
        c3931ab.a(c4320wb).a(bVar.a().l());
        c3931ab.c(c4320wb).a(bVar.a().v());
        C4303vb c4303vb = f34255a;
        c4303vb.a(levelPlayInitRequest, c3931ab);
        long jD = bVar.d().g().d();
        c4303vb.a(jD, new b(c3931ab, c4122l5, jD, levelPlayInitListener));
        aVarD.a(c3931ab);
        if (c4131le.a().e()) {
            new Fd(null, null, null, IronSourceThreadManager.INSTANCE.getThreadPoolExecutor(), 7, null).c(context);
        }
    }

    private final boolean a(LevelPlayInitRequest levelPlayInitRequest, LevelPlay.AdFormat adFormat) {
        return !levelPlayInitRequest.getLegacyAdFormats().contains(adFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        tn.p.k(context, "$context");
        tn.p.k(levelPlayInitRequest, "$initRequest");
        f34255a.c(context, levelPlayInitRequest, levelPlayInitListener);
    }

    private final void c(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        IronLog.API.info("LevelPlay.init() appkey: " + levelPlayInitRequest.getAppKey() + ", userId: " + levelPlayInitRequest.getUserId() + ", legacyAdFormats: " + levelPlayInitRequest.getLegacyAdFormats() + ", context: " + context.getClass().getSimpleName());
        C4122l5 c4122l5 = new C4122l5();
        C4320wb c4320wb = f34256b;
        LevelPlay.AdFormat[] adFormatArr = (LevelPlay.AdFormat[]) levelPlayInitRequest.getLegacyAdFormats().toArray(new LevelPlay.AdFormat[0]);
        Ae.f28740a.a(context, new C4272te(levelPlayInitRequest.getAppKey(), levelPlayInitRequest.getUserId(), cn.r.I0(c4320wb.a((LevelPlay.AdFormat[]) Arrays.copyOf(adFormatArr, adFormatArr.length)))), new a(levelPlayInitRequest, context, c4122l5, levelPlayInitListener));
    }

    public final void a(@NotNull final Context context, @NotNull final LevelPlayInitRequest levelPlayInitRequest, @Nullable final LevelPlayInitListener levelPlayInitListener) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        tn.p.k(levelPlayInitRequest, "initRequest");
        f34256b.d(new Runnable() { // from class: com.ironsource.dm
            @Override // java.lang.Runnable
            public final void run() {
                C4303vb.b(context, levelPlayInitRequest, levelPlayInitListener);
            }
        });
    }

    public final void a(@NotNull LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        tn.p.k(levelPlayImpressionDataListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.ironsource.mediationsdk.r.m().b(new C4003eb(levelPlayImpressionDataListener));
    }

    public final void a(@NotNull String str, @NotNull String str2) {
        tn.p.k(str, "key");
        tn.p.k(str2, "value");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        a(str, arrayList);
    }

    public final void a(@NotNull String str, @NotNull List<String> list) {
        tn.p.k(str, "key");
        tn.p.k(list, "values");
        a(new c(str, list));
    }

    public final void a(@NotNull sn.a<bn.r> aVar) {
        tn.p.k(aVar, "task");
        if (Lb.f29764s.c().g().j()) {
            IronSourceThreadManager.postMediationBackgroundTask$default(IronSourceThreadManager.INSTANCE, AbstractRunnableC4078ie.f31961a.a(aVar), 0L, 2, null);
        } else {
            aVar.invoke();
        }
    }

    public final void b(@NotNull LevelPlayImpressionDataListener levelPlayImpressionDataListener) {
        tn.p.k(levelPlayImpressionDataListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        com.ironsource.mediationsdk.r.m().a(new C4003eb(levelPlayImpressionDataListener));
    }

    public final void b(@NotNull LevelPlaySegment levelPlaySegment) {
        tn.p.k(levelPlaySegment, "segment");
        com.ironsource.mediationsdk.r.m().a(a(levelPlaySegment));
    }
}
