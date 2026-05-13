package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.C3978d4;
import com.ironsource.C4024fe;
import com.ironsource.C4266t8;
import com.ironsource.I8;
import com.ironsource.J8;
import com.ironsource.Ub;
import com.ironsource.sdk.IronSourceNetwork;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class E8 implements I8 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f29245j = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f29246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Ub f29247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4317w8 f29248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private G8 f29249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f29250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f29251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Long f29252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private I8.a f29253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private J8 f29254i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final E8 a() {
            String string = UUID.randomUUID().toString();
            tn.p.j(string, "randomUUID().toString()");
            com.ironsource.sdk.controller.e controllerManager = IronSourceNetwork.getControllerManager();
            tn.p.j(controllerManager, "controllerManager");
            return new E8(string, new Tb(string, controllerManager, null, null, 12, null), new C4334x8());
        }
    }

    public static final class b implements Ub.a {
        public b() {
        }

        @Override // com.ironsource.Ub.a
        public void a() {
            I8.a aVarB = E8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdShown();
            }
        }

        @Override // com.ironsource.Ub.a
        public void a(@NotNull G8 g82) {
            tn.p.k(g82, "adData");
            E8.this.f29249d = g82;
            InterfaceC4317w8 interfaceC4317w8 = E8.this.f29248c;
            C4024fe.a aVar = C4024fe.f31717l;
            tn.p.j(aVar, com.safedk.android.analytics.brandsafety.creatives.discoveries.f.J);
            HashMap<String, Object> mapA = E8.this.d().a();
            tn.p.j(mapA, "baseEventParams().data");
            interfaceC4317w8.a(aVar, mapA);
            I8.a aVarB = E8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdLoadSuccess(g82);
            }
        }

        @Override // com.ironsource.Ub.a
        public void a(@NotNull String str) {
            tn.p.k(str, "reason");
            C4300v8 c4300v8A = E8.this.d().a(G5.A, str);
            InterfaceC4317w8 interfaceC4317w8 = E8.this.f29248c;
            C4024fe.a aVar = C4024fe.f31712g;
            tn.p.j(aVar, "loadAdFailed");
            HashMap<String, Object> mapA = c4300v8A.a();
            tn.p.j(mapA, "eventParams.data");
            interfaceC4317w8.a(aVar, mapA);
            I8.a aVarB = E8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdLoadFailed(str);
            }
        }

        @Override // com.ironsource.Ub.a
        public void e() {
            I8.a aVarB = E8.this.b();
            if (aVarB != null) {
                aVarB.onNativeAdClicked();
            }
        }
    }

    public static final class c implements J8.a {

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f29257a;

            static {
                int[] iArr = new int[J8.b.values().length];
                try {
                    iArr[J8.b.PrivacyIcon.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f29257a = iArr;
            }
        }

        public c() {
        }

        @Override // com.ironsource.J8.a
        public void a(@NotNull J8.b bVar) throws JSONException {
            tn.p.k(bVar, "viewName");
            if (a.f29257a[bVar.ordinal()] == 1) {
                E8.this.f29247b.c();
                return;
            }
            JSONObject jSONObjectPut = IronSourceVideoBridge.jsonObjectInit().put("viewName", bVar.b());
            Ub ub2 = E8.this.f29247b;
            tn.p.j(jSONObjectPut, "clickParams");
            ub2.a(jSONObjectPut);
        }

        @Override // com.ironsource.J8.a
        public void a(@NotNull pg pgVar) {
            tn.p.k(pgVar, "viewVisibilityParams");
            E8.this.f29247b.a(pgVar);
        }
    }

    public E8(@NotNull String str, @NotNull Ub ub2, @NotNull InterfaceC4317w8 interfaceC4317w8) {
        tn.p.k(str, "id");
        tn.p.k(ub2, "controller");
        tn.p.k(interfaceC4317w8, "eventTracker");
        this.f29246a = str;
        this.f29247b = ub2;
        this.f29248c = interfaceC4317w8;
        ub2.a(f());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ E8(String str, Ub ub2, InterfaceC4317w8 interfaceC4317w8, int i10, tn.i iVar) {
        if ((i10 & 1) != 0) {
            str = UUID.randomUUID().toString();
            tn.p.j(str, "randomUUID().toString()");
        }
        this(str, ub2, interfaceC4317w8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4300v8 d() {
        C4300v8 c4300v8A = new C4300v8().a(G5.f29409x, this.f29251f).a(G5.f29407v, this.f29250e).a("producttype", C4266t8.e.NativeAd.toString()).a(G5.I, Long.valueOf(j()));
        tn.p.j(c4300v8A, "ISNEventParams()\n       …CUSTOM_C, loadDuration())");
        return c4300v8A;
    }

    @NotNull
    public static final E8 e() {
        return f29245j.a();
    }

    private final b f() {
        return new b();
    }

    private final c g() {
        return new c();
    }

    private final long j() {
        Long l10 = this.f29252g;
        if (l10 == null) {
            return -1L;
        }
        return Calendar.getInstance().getTimeInMillis() - l10.longValue();
    }

    @Override // com.ironsource.I8
    public void a() {
        J8 j82 = this.f29254i;
        if (j82 != null) {
            j82.a((J8.a) null);
        }
        this.f29247b.a();
    }

    @Override // com.ironsource.I8
    public void a(@NotNull Activity activity, @NotNull JSONObject jSONObject) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        tn.p.k(jSONObject, "loadParams");
        this.f29252g = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        this.f29250e = jSONObject.optString("demandSourceName");
        this.f29251f = jSONObject.optString("inAppBidding");
        InterfaceC4317w8 interfaceC4317w8 = this.f29248c;
        C4024fe.a aVar = C4024fe.f31711f;
        tn.p.j(aVar, com.safedk.android.analytics.brandsafety.creatives.discoveries.f.H);
        HashMap<String, Object> mapA = d().a();
        tn.p.j(mapA, "baseEventParams().data");
        interfaceC4317w8.a(aVar, mapA);
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(jSONObject.toString());
        jSONObjectJsonObjectInit.put(C3978d4.i.f31374y0, String.valueOf(this.f29252g));
        this.f29247b.a(activity, jSONObjectJsonObjectInit);
    }

    @Override // com.ironsource.I8
    public void a(@Nullable I8.a aVar) {
        this.f29253h = aVar;
    }

    @Override // com.ironsource.I8
    public void a(@NotNull J8 j82) {
        tn.p.k(j82, "viewHolder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Object> mapA = d().a();
        tn.p.j(mapA, "baseEventParams().data");
        linkedHashMap.putAll(mapA);
        String string = j82.t().toString();
        tn.p.j(string, "viewHolder.viewsStatus().toString()");
        linkedHashMap.put(G5.f29410y, string);
        InterfaceC4317w8 interfaceC4317w8 = this.f29248c;
        C4024fe.a aVar = C4024fe.f31719n;
        tn.p.j(aVar, "registerAd");
        interfaceC4317w8.a(aVar, linkedHashMap);
        this.f29254i = j82;
        j82.a(g());
        this.f29247b.a(j82);
    }

    @Override // com.ironsource.I8
    @Nullable
    public I8.a b() {
        return this.f29253h;
    }

    @Override // com.ironsource.I8
    @Nullable
    public G8 c() {
        return this.f29249d;
    }

    @Nullable
    public final String h() {
        return this.f29250e;
    }

    @Nullable
    public final String i() {
        return this.f29251f;
    }
}
