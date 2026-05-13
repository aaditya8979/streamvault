package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.NotificationCompat;
import com.ironsource.C3978d4;
import com.ironsource.G8;
import com.ironsource.Ub;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.utils.Logger;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Tb implements Ub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f30492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.ironsource.sdk.controller.e f30493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final X8 f30494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC3939b1 f30495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f30496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Ub.a f30497f;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f30498a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final String f30499b = "nativeAd.load";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final String f30500c = "nativeAd.loadReport";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final String f30501d = "nativeAd.register";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final String f30502e = "nativeAd.click";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final String f30503f = "nativeAd.privacyClick";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final String f30504g = "nativeAd.visibilityChanged";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NotNull
        public static final String f30505h = "nativeAd.destroy";

        private a() {
        }
    }

    public Tb(@NotNull String str, @NotNull com.ironsource.sdk.controller.e eVar, @NotNull X8 x82, @NotNull InterfaceC3939b1 interfaceC3939b1) {
        tn.p.k(str, "id");
        tn.p.k(eVar, "controllerManager");
        tn.p.k(x82, "imageLoader");
        tn.p.k(interfaceC3939b1, "adViewManagement");
        this.f30492a = str;
        this.f30493b = eVar;
        this.f30494c = x82;
        this.f30495d = interfaceC3939b1;
        this.f30496e = Tb.class.getSimpleName();
        eVar.a(str, d());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Tb(String str, com.ironsource.sdk.controller.e eVar, X8 x82, InterfaceC3939b1 interfaceC3939b1, int i10, tn.i iVar) {
        x82 = (i10 & 4) != 0 ? new W8(null, 1, null) : x82;
        if ((i10 & 8) != 0) {
            interfaceC3939b1 = C4216q8.a();
            tn.p.j(interfaceC3939b1, "getInstance()");
        }
        this(str, eVar, x82, interfaceC3939b1);
    }

    private final void a(Activity activity, f.a aVar) {
        if (aVar.d() == null) {
            Ub.a aVarB = b();
            if (aVarB != null) {
                aVarB.a("failed to load native ad: missing params");
                return;
            }
            return;
        }
        if (aVar.d().optBoolean("success", false)) {
            G8.b bVarA = new G8.a(this.f30494c, this.f30495d).a(activity, aVar.d());
            a(bVarA, bVarA.a().h());
            return;
        }
        String strOptString = aVar.d().optString("reason", "failed to load native ad: unexpected error");
        Ub.a aVarB2 = b();
        if (aVarB2 != null) {
            tn.p.j(strOptString, "reason");
            aVarB2.a(strOptString);
        }
    }

    private final void a(G8.b bVar, final G8 g82) {
        this.f30493b.a(new f.c(this.f30492a, "nativeAd.loadReport." + this.f30492a, bVar.b()), new l.a() { // from class: com.ironsource.kj
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Tb.a(this.f32178a, g82, aVar);
            }
        });
    }

    private final void a(G8 g82, f.a aVar) {
        if (aVar.d() == null) {
            Ub.a aVarB = b();
            if (aVarB != null) {
                aVarB.a("failed to load native ad: missing report params");
                return;
            }
            return;
        }
        if (aVar.d().optBoolean("success", false)) {
            Ub.a aVarB2 = b();
            if (aVarB2 != null) {
                aVarB2.a(g82);
                return;
            }
            return;
        }
        String strOptString = aVar.d().optString("reason", "failed to load native ad: unexpected error");
        Ub.a aVarB3 = b();
        if (aVarB3 != null) {
            tn.p.j(strOptString, "reason");
            aVarB3.a(strOptString);
        }
    }

    private final void a(Nb nb2) {
        if (nb2.f() == null) {
            Logger.i(this.f30496e, "failed to handle click on native ad: missing params");
            return;
        }
        if (nb2.f().optBoolean("success", false)) {
            Ub.a aVarB = b();
            if (aVarB != null) {
                aVarB.e();
                return;
            }
            return;
        }
        String strOptString = nb2.f().optString("reason", "unexpected error");
        Logger.i(this.f30496e, "failed to handle click on native ad: " + strOptString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Tb tb2, Activity activity, f.a aVar) {
        tn.p.k(tb2, "this$0");
        tn.p.k(activity, "$activity");
        tn.p.k(aVar, "it");
        tb2.a(activity, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Tb tb2, G8 g82, f.a aVar) {
        tn.p.k(tb2, "this$0");
        tn.p.k(g82, "$adData");
        tn.p.k(aVar, "it");
        tb2.a(g82, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Tb tb2, Nb nb2) {
        tn.p.k(tb2, "this$0");
        tn.p.k(nb2, NotificationCompat.CATEGORY_MESSAGE);
        if (tn.p.f(nb2.e(), a.f30502e)) {
            tb2.a(nb2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Tb tb2, f.a aVar) {
        tn.p.k(tb2, "this$0");
        tn.p.k(aVar, "it");
        tb2.a(aVar);
    }

    private final void a(f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.f30496e, "failed to handle click on native ad: missing params");
            return;
        }
        if (aVar.d().optBoolean("success", false)) {
            Ub.a aVarB = b();
            if (aVarB != null) {
                aVarB.e();
                return;
            }
            return;
        }
        String strOptString = aVar.d().optString("reason", "unexpected error");
        Logger.i(this.f30496e, "failed to handle click on native ad: " + strOptString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Tb tb2, f.a aVar) {
        tn.p.k(tb2, "this$0");
        tn.p.k(aVar, "it");
        tb2.b(aVar);
    }

    private final void b(f.a aVar) {
        if (aVar.d() == null) {
            Logger.i(this.f30496e, "failed to handle show on native ad: missing params");
            return;
        }
        if (aVar.d().optBoolean("success", false)) {
            Ub.a aVarB = b();
            if (aVarB != null) {
                aVarB.a();
                return;
            }
            return;
        }
        String strOptString = aVar.d().optString("reason", "unexpected error");
        Logger.i(this.f30496e, "failed to handle show on native ad: " + strOptString);
    }

    private final l.b d() {
        return new l.b() { // from class: com.ironsource.lj
            @Override // com.ironsource.sdk.controller.l.b
            public final void a(Nb nb2) {
                Tb.a(this.f32238a, nb2);
            }
        };
    }

    private final JSONObject e() throws JSONException {
        JSONObject jSONObjectPut = IronSourceVideoBridge.jsonObjectInit().put(f.b.f33720g, a.f30502e).put("sdkCallback", C3978d4.h.U);
        tn.p.j(jSONObjectPut, "JSONObject()\n        .pu…hods.ON_RECEIVED_MESSAGE)");
        return jSONObjectPut;
    }

    @Override // com.ironsource.Ub
    public void a() {
        this.f30493b.a(new f.c(this.f30492a, a.f30505h, IronSourceVideoBridge.jsonObjectInit()), (l.a) null);
    }

    @Override // com.ironsource.Ub
    public void a(@NotNull final Activity activity, @NotNull JSONObject jSONObject) {
        tn.p.k(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        tn.p.k(jSONObject, "loadParams");
        this.f30493b.a(activity);
        this.f30493b.a(new f.c(this.f30492a, a.f30499b, jSONObject), new l.a() { // from class: com.ironsource.oj
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Tb.a(this.f33170a, activity, aVar);
            }
        });
    }

    @Override // com.ironsource.Ub
    public void a(@NotNull J8 j82) throws JSONException {
        tn.p.k(j82, "viewHolder");
        JSONObject jSONObjectPut = IronSourceVideoBridge.jsonObjectInit().put("assetViews", j82.t()).put("adViewClickCommand", e());
        String str = this.f30492a;
        tn.p.j(jSONObjectPut, "params");
        this.f30493b.a(new f.c(str, a.f30501d, jSONObjectPut), (l.a) null);
    }

    @Override // com.ironsource.Ub
    public void a(@Nullable Ub.a aVar) {
        this.f30497f = aVar;
    }

    @Override // com.ironsource.Ub
    public void a(@NotNull pg pgVar) {
        tn.p.k(pgVar, "viewVisibilityParams");
        this.f30493b.a(new f.c(this.f30492a, a.f30504g, pgVar.g()), new l.a() { // from class: com.ironsource.nj
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Tb.b(this.f33118a, aVar);
            }
        });
    }

    @Override // com.ironsource.Ub
    public void a(@NotNull JSONObject jSONObject) {
        tn.p.k(jSONObject, "clickParams");
        this.f30493b.a(new f.c(this.f30492a, a.f30502e, jSONObject), new l.a() { // from class: com.ironsource.mj
            @Override // com.ironsource.sdk.controller.l.a
            public final void a(f.a aVar) {
                Tb.a(this.f32989a, aVar);
            }
        });
    }

    @Override // com.ironsource.Ub
    @Nullable
    public Ub.a b() {
        return this.f30497f;
    }

    @Override // com.ironsource.Ub
    public void c() {
        this.f30493b.a(new f.c(this.f30492a, a.f30503f, IronSourceVideoBridge.jsonObjectInit()), (l.a) null);
    }
}
