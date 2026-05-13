package com.ironsource;

import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.OutcomeReceiver;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.mediation.LevelPlay;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class Fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final F7 f29329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final sn.a<Long> f29330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final L7 f29331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Executor f29332d;

    public /* synthetic */ class a extends FunctionReferenceImpl implements sn.a<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29333a = new a();

        public a() {
            super(0, System.class, "currentTimeMillis", "currentTimeMillis()J", 0);
        }

        @Override // sn.a
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public static final class b implements OutcomeReceiver {
        public b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(@NotNull Exception exc) {
            tn.p.k(exc, "error");
            Fd.this.a(exc.getMessage());
        }

        public void onResult(@Nullable Object obj) {
            Fd.this.c();
        }
    }

    public Fd() {
        this(null, null, null, null, 15, null);
    }

    public Fd(@NotNull F7 f72, @NotNull sn.a<Long> aVar, @NotNull L7 l72, @NotNull Executor executor) {
        tn.p.k(f72, "eventManager");
        tn.p.k(aVar, "getTimeFunction");
        tn.p.k(l72, "serviceProvider");
        tn.p.k(executor, "executor");
        this.f29329a = f72;
        this.f29330b = aVar;
        this.f29331c = l72;
        this.f29332d = executor;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Fd(F7 f72, sn.a aVar, L7 l72, Executor executor, int i10, tn.i iVar) {
        f72 = (i10 & 1) != 0 ? Lb.f29764s.d().q() : f72;
        aVar = (i10 & 2) != 0 ? a.f29333a : aVar;
        l72 = (i10 & 4) != 0 ? Lb.f29764s.d() : l72;
        if ((i10 & 8) != 0) {
            executor = Executors.newSingleThreadExecutor();
            tn.p.j(executor, "newSingleThreadExecutor()");
        }
        this(f72, aVar, l72, executor);
    }

    private final Uri a(Context context) {
        B7 b7I = this.f29331c.i();
        String strA = IronSourceUtils.a(context);
        Uri uriBuild = new Uri.Builder().scheme("https").authority("android-att.ironsrc.mobi").path("register_trigger").appendQueryParameter("osVersion", Build.VERSION.RELEASE).appendQueryParameter("apiLevel", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("deviceModel", Build.MODEL).appendQueryParameter("sdkVersion", LevelPlay.getSdkVersion()).appendQueryParameter("bundleID", context.getPackageName()).appendQueryParameter(Q6.V0, b7I.I(context)).appendQueryParameter(Q6.L0, b7I.y(context)).appendQueryParameter("auid", b7I.d(context)).appendQueryParameter("isFirstSession", String.valueOf(b(context))).appendQueryParameter("coppa", b()).appendQueryParameter(Q6.f30236j0, String.valueOf(C4099k0.a())).appendQueryParameter("origin", "1").appendQueryParameter("timestamp", String.valueOf(this.f29330b.invoke().longValue())).appendQueryParameter("deviceLanguage", b7I.c(context)).appendQueryParameter("deviceCarrier", b7I.u(context)).appendQueryParameter("connectionType", strA).appendQueryParameter("wifi", String.valueOf(bo.a0.J(strA, "wifi", true))).build();
        tn.p.j(uriBuild, "Builder()\n        .schem…arameter\n        .build()");
        return uriBuild;
    }

    @SuppressLint({"NewApi"})
    private final OutcomeReceiver a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.f29329a.a(new C5(D5.REGISTER_TRIGGER_FAIL, IronSourceVideoBridge.jsonObjectInit().put("reason", str)));
    }

    private final String b() {
        ConcurrentHashMap<String, List<String>> concurrentHashMapC = C4201pa.b().c();
        List<String> list = concurrentHashMapC != null ? concurrentHashMapC.get(com.ironsource.mediationsdk.metadata.a.f32677b) : null;
        String str = list != null ? (String) cn.f0.t0(list) : null;
        return str == null ? "" : str;
    }

    private final boolean b(Context context) {
        return IronSourceUtils.c(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        this.f29329a.a(new C5(D5.REGISTER_TRIGGER_SUCCESS, (JSONObject) null));
    }

    private final void d() {
        this.f29329a.a(new C5(D5.REGISTER_TRIGGER, (JSONObject) null));
    }

    @SuppressLint({"NewApi"})
    public final void c(@NotNull Context context) {
        tn.p.k(context, GAMConfig.KEY_CONTEXT);
        d();
        try {
            MeasurementManager measurementManagerA = C4099k0.a(context);
            if (measurementManagerA == null) {
                a("could not obtain measurement manager");
            } else {
                measurementManagerA.registerTrigger(a(context), this.f29332d, a());
            }
        } catch (Exception e10) {
            a(e10.getMessage());
            C4228r4.d().a(e10);
        }
    }
}
