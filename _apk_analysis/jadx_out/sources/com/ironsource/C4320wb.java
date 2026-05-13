package com.ironsource;

import android.content.Context;
import android.os.Handler;
import android.view.Choreographer;
import com.ironsource.C4217q9;
import com.ironsource.Ne;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.mediation.LevelPlay;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C4320wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final C4250s9 f34332a = new C4250s9(null, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: com.ironsource.wb$a */
    public static final class a extends AbstractRunnableC4078ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f34333b;

        public a(Runnable runnable) {
            this.f34333b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            this.f34333b.run();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.wb$b */
    public static final class b extends AbstractRunnableC4078ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ sn.a<bn.r> f34334b;

        public b(sn.a<bn.r> aVar) {
            this.f34334b = aVar;
        }

        @Override // com.ironsource.AbstractRunnableC4078ie
        public void a() {
            this.f34334b.invoke();
        }
    }

    private final String a(String str, long j10) {
        return "responseOrigin=" + str + ";delayTimeAfterInitProcess=" + j10;
    }

    public static /* synthetic */ void a(C4320wb c4320wb, long j10, Ne.a aVar, long j11, JSONObject jSONObject, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitSuccessEvent");
        }
        if ((i10 & 8) != 0) {
            jSONObject = IronSourceVideoBridge.jsonObjectInit();
        }
        c4320wb.a(j10, aVar, j11, jSONObject);
    }

    public static /* synthetic */ void a(C4320wb c4320wb, AbstractRunnableC4078ie abstractRunnableC4078ie, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c4320wb.a(abstractRunnableC4078ie, j10);
    }

    public static /* synthetic */ void a(C4320wb c4320wb, C4169ne c4169ne, long j10, JSONObject jSONObject, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendInitFailedEvent");
        }
        if ((i10 & 4) != 0) {
            jSONObject = IronSourceVideoBridge.jsonObjectInit();
        }
        c4320wb.a(c4169ne, j10, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4320wb c4320wb, Runnable runnable) {
        tn.p.k(c4320wb, "this$0");
        tn.p.k(runnable, "$runnable");
        c4320wb.f34332a.b(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4320wb c4320wb, Runnable runnable, long j10) {
        tn.p.k(c4320wb, "this$0");
        tn.p.k(runnable, "$runnable");
        c4320wb.b(runnable);
    }

    public static /* synthetic */ void a(C4320wb c4320wb, Runnable runnable, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postOnUIThread");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c4320wb.a(runnable, j10);
    }

    public static /* synthetic */ void a(C4320wb c4320wb, sn.a aVar, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postTask");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c4320wb.a((sn.a<bn.r>) aVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final C4320wb c4320wb, final Runnable runnable) {
        tn.p.k(c4320wb, "this$0");
        tn.p.k(runnable, "$runnable");
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.ironsource.lm
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                C4320wb.a(this.f32243b, runnable, j10);
            }
        });
    }

    @NotNull
    public final Handler a() {
        return this.f34332a.a();
    }

    @NotNull
    public final IronSource.a a(@NotNull LevelPlay.AdFormat adFormat) {
        tn.p.k(adFormat, "adFormat");
        return com.unity3d.mediation.a.a(adFormat);
    }

    @NotNull
    public final C4169ne a(@NotNull C4169ne c4169ne) {
        C4169ne c4169ne2;
        tn.p.k(c4169ne, "error");
        int iC = c4169ne.c();
        if (iC == 2070) {
            c4169ne2 = new C4169ne(c4169ne.c(), "noServerResponse");
        } else {
            if (iC != 2110) {
                return c4169ne;
            }
            c4169ne2 = new C4169ne(c4169ne.c(), IronSourceConstants.FALSE_AVAILABILITY_REASON_BAD_REQUEST);
        }
        return c4169ne2;
    }

    public final void a(long j10, @NotNull Ne.a aVar, long j11, @NotNull JSONObject jSONObject) {
        tn.p.k(aVar, "responseOrigin");
        tn.p.k(jSONObject, "data");
        try {
            jSONObject.put("isMultipleAdUnits", 1);
            jSONObject.put("duration", j10);
            String strB = aVar.b();
            tn.p.j(strB, "responseOrigin.value");
            jSONObject.put(IronSourceConstants.EVENTS_EXT1, a(strB, j11));
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        C4324wf.a(D5.SDK_INIT_SUCCESS, jSONObject);
    }

    public final void a(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        C4217q9.a aVar = C4217q9.f33347a;
        Context applicationContext = context.getApplicationContext();
        tn.p.j(applicationContext, "context.applicationContext");
        aVar.a(applicationContext);
    }

    public final void a(@NotNull AbstractRunnableC4078ie abstractRunnableC4078ie) {
        tn.p.k(abstractRunnableC4078ie, "safeRunnable");
        a(this, abstractRunnableC4078ie, 0L, 2, (Object) null);
    }

    public final void a(@NotNull AbstractRunnableC4078ie abstractRunnableC4078ie, long j10) {
        tn.p.k(abstractRunnableC4078ie, "safeRunnable");
        this.f34332a.a(abstractRunnableC4078ie, j10);
    }

    public final void a(@NotNull C4169ne c4169ne, long j10, @NotNull JSONObject jSONObject) {
        tn.p.k(c4169ne, "error");
        tn.p.k(jSONObject, "data");
        try {
            jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, c4169ne.c());
            jSONObject.put("reason", c4169ne.d());
            jSONObject.put("isMultipleAdUnits", 1);
            jSONObject.put("duration", j10);
        } catch (Exception e10) {
            C4228r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        C4324wf.a(D5.SDK_INIT_FAILED, jSONObject);
    }

    public final void a(@NotNull Runnable runnable) {
        tn.p.k(runnable, "callback");
        this.f34332a.a(runnable);
    }

    public final void a(@NotNull Runnable runnable, long j10) {
        tn.p.k(runnable, "runnable");
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(runnable), j10);
    }

    public final void a(@NotNull String str, int i10, @Nullable String str2) throws JSONException {
        tn.p.k(str, "adUnitId");
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
        jSONObjectJsonObjectInit.putOpt("reason", str2);
        jSONObjectJsonObjectInit.put("mediationAdUnitId", str);
        jSONObjectJsonObjectInit.put("isMultipleAdUnits", 1);
        C4324wf.a(D5.TROUBLESHOOTING_AD_UNIT_CAPPING_PARSE_ERROR, jSONObjectJsonObjectInit);
    }

    public final void a(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat, int i10, @Nullable String str2) throws JSONException {
        tn.p.k(str, "placementName");
        tn.p.k(adFormat, "adFormat");
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
        jSONObjectJsonObjectInit.putOpt("reason", str2);
        jSONObjectJsonObjectInit.put("placement", str);
        jSONObjectJsonObjectInit.put(C3949bb.f31031f, adFormat.getValue());
        jSONObjectJsonObjectInit.put("adf", C4324wf.c(com.unity3d.mediation.a.a(adFormat)));
        jSONObjectJsonObjectInit.put("isMultipleAdUnits", 1);
        C4324wf.a(D5.TROUBLESHOOTING_PLACEMENT_CAPPING_PARSE_ERROR, jSONObjectJsonObjectInit);
    }

    public final void a(@NotNull sn.a<bn.r> aVar, long j10) {
        tn.p.k(aVar, "action");
        a((AbstractRunnableC4078ie) new b(aVar), j10);
    }

    public final boolean a(@NotNull AdapterBaseInterface adapterBaseInterface, @NotNull IronSource.a aVar, @NotNull String str) {
        tn.p.k(adapterBaseInterface, "networkAdapter");
        tn.p.k(aVar, "adFormat");
        tn.p.k(str, "providerName");
        return C4324wf.a(adapterBaseInterface, aVar, str);
    }

    @NotNull
    public final IronSource.a[] a(@NotNull LevelPlay.AdFormat... adFormatArr) {
        tn.p.k(adFormatArr, "adFormats");
        ArrayList arrayList = new ArrayList();
        for (LevelPlay.AdFormat adFormat : adFormatArr) {
            arrayList.add(a(adFormat));
        }
        return (IronSource.a[]) arrayList.toArray(new IronSource.a[0]);
    }

    @NotNull
    public final C4169ne b(@NotNull C4169ne c4169ne) {
        tn.p.k(c4169ne, "error");
        return c4169ne.c() == 2080 ? new C4169ne(c4169ne.c(), "serverResponseIsNotValid") : c4169ne;
    }

    public final void b(@NotNull AbstractRunnableC4078ie abstractRunnableC4078ie) {
        tn.p.k(abstractRunnableC4078ie, "safeRunnable");
        this.f34332a.a(abstractRunnableC4078ie);
    }

    public final void b(@NotNull final Runnable runnable) {
        tn.p.k(runnable, "runnable");
        a(this, new Runnable() { // from class: com.ironsource.nm
            @Override // java.lang.Runnable
            public final void run() {
                C4320wb.a(this.f33122b, runnable);
            }
        }, 0L, 2, (Object) null);
    }

    public final void b(@NotNull String str, int i10, @Nullable String str2) throws JSONException {
        tn.p.k(str, "adUnitId");
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
        jSONObjectJsonObjectInit.putOpt("reason", str2);
        jSONObjectJsonObjectInit.put("mediationAdUnitId", str);
        jSONObjectJsonObjectInit.put("isMultipleAdUnits", 1);
        C4324wf.a(D5.TROUBLESHOOTING_AD_UNIT_REWARD_PARSE_ERROR, jSONObjectJsonObjectInit);
    }

    public final void c(@NotNull final Runnable runnable) {
        tn.p.k(runnable, "runnable");
        a(this, new Runnable() { // from class: com.ironsource.mm
            @Override // java.lang.Runnable
            public final void run() {
                C4320wb.b(this.f32995b, runnable);
            }
        }, 0L, 2, (Object) null);
    }

    public final void d(@NotNull Runnable runnable) {
        tn.p.k(runnable, "runnable");
        this.f34332a.b(runnable);
    }

    public final void e(@NotNull Runnable runnable) {
        tn.p.k(runnable, "callback");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }
}
