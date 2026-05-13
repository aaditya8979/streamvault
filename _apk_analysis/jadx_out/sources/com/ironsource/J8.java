package com.ironsource;

import android.view.View;
import com.ironsource.C3978d4;
import com.ironsource.F8;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class J8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private F8 f29656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private View f29657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private View f29658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private View f29659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private View f29660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private View f29661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private View f29662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private View f29663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private a f29664i;

    public interface a {
        void a(@NotNull b bVar);

        void a(@NotNull pg pgVar);
    }

    public enum b {
        Title("title"),
        Advertiser(C3978d4.i.F0),
        Body("body"),
        Cta("cta"),
        Icon("icon"),
        Container("container"),
        PrivacyIcon(C3978d4.i.J0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f29673a;

        b(String str) {
            this.f29673a = str;
        }

        @NotNull
        public final String b() {
            return this.f29673a;
        }
    }

    public static final class c implements F8.a {
        public c() {
        }

        @Override // com.ironsource.F8.a
        public void a(@NotNull pg pgVar) {
            tn.p.k(pgVar, "viewVisibilityParams");
            a aVarN = J8.this.n();
            if (aVarN != null) {
                aVarN.a(pgVar);
            }
        }
    }

    public J8(@NotNull F8 f82, @Nullable View view, @Nullable View view2, @Nullable View view3, @Nullable View view4, @Nullable View view5, @Nullable View view6, @NotNull View view7) {
        tn.p.k(f82, "containerView");
        tn.p.k(view7, "privacyIconView");
        this.f29656a = f82;
        this.f29657b = view;
        this.f29658c = view2;
        this.f29659d = view3;
        this.f29660e = view4;
        this.f29661f = view5;
        this.f29662g = view6;
        this.f29663h = view7;
        r();
        s();
    }

    public /* synthetic */ J8(F8 f82, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i10, tn.i iVar) {
        this(f82, (i10 & 2) != 0 ? null : view, (i10 & 4) != 0 ? null : view2, (i10 & 8) != 0 ? null : view3, (i10 & 16) != 0 ? null : view4, (i10 & 32) != 0 ? null : view5, (i10 & 64) != 0 ? null : view6, view7);
    }

    private static final void a(final J8 j82, View view, final b bVar) {
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.ironsource.ii
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    J8.a(this.f31965b, bVar, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(J8 j82, b bVar, View view) {
        tn.p.k(j82, "this$0");
        tn.p.k(bVar, "$viewName");
        a aVar = j82.f29664i;
        if (aVar != null) {
            aVar.a(bVar);
        }
    }

    private final void r() {
        a(this, this.f29657b, b.Title);
        a(this, this.f29658c, b.Advertiser);
        a(this, this.f29660e, b.Body);
        a(this, this.f29662g, b.Cta);
        a(this, this.f29659d, b.Icon);
        a(this, this.f29656a, b.Container);
        a(this, this.f29663h, b.PrivacyIcon);
    }

    private final void s() {
        this.f29656a.setListener$mediationsdk_release(new c());
    }

    @NotNull
    public final F8 a() {
        return this.f29656a;
    }

    @NotNull
    public final J8 a(@NotNull F8 f82, @Nullable View view, @Nullable View view2, @Nullable View view3, @Nullable View view4, @Nullable View view5, @Nullable View view6, @NotNull View view7) {
        tn.p.k(f82, "containerView");
        tn.p.k(view7, "privacyIconView");
        return new J8(f82, view, view2, view3, view4, view5, view6, view7);
    }

    public final void a(@Nullable View view) {
        this.f29658c = view;
    }

    public final void a(@NotNull F8 f82) {
        tn.p.k(f82, "<set-?>");
        this.f29656a = f82;
    }

    public final void a(@Nullable a aVar) {
        this.f29664i = aVar;
    }

    @Nullable
    public final View b() {
        return this.f29657b;
    }

    public final void b(@Nullable View view) {
        this.f29660e = view;
    }

    @Nullable
    public final View c() {
        return this.f29658c;
    }

    public final void c(@Nullable View view) {
        this.f29662g = view;
    }

    @Nullable
    public final View d() {
        return this.f29659d;
    }

    public final void d(@Nullable View view) {
        this.f29659d = view;
    }

    @Nullable
    public final View e() {
        return this.f29660e;
    }

    public final void e(@Nullable View view) {
        this.f29661f = view;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J8)) {
            return false;
        }
        J8 j82 = (J8) obj;
        return tn.p.f(this.f29656a, j82.f29656a) && tn.p.f(this.f29657b, j82.f29657b) && tn.p.f(this.f29658c, j82.f29658c) && tn.p.f(this.f29659d, j82.f29659d) && tn.p.f(this.f29660e, j82.f29660e) && tn.p.f(this.f29661f, j82.f29661f) && tn.p.f(this.f29662g, j82.f29662g) && tn.p.f(this.f29663h, j82.f29663h);
    }

    @Nullable
    public final View f() {
        return this.f29661f;
    }

    public final void f(@NotNull View view) {
        tn.p.k(view, "<set-?>");
        this.f29663h = view;
    }

    @Nullable
    public final View g() {
        return this.f29662g;
    }

    public final void g(@Nullable View view) {
        this.f29657b = view;
    }

    @NotNull
    public final View h() {
        return this.f29663h;
    }

    public int hashCode() {
        int iHashCode = this.f29656a.hashCode() * 31;
        View view = this.f29657b;
        int iHashCode2 = (iHashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.f29658c;
        int iHashCode3 = (iHashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        View view3 = this.f29659d;
        int iHashCode4 = (iHashCode3 + (view3 == null ? 0 : view3.hashCode())) * 31;
        View view4 = this.f29660e;
        int iHashCode5 = (iHashCode4 + (view4 == null ? 0 : view4.hashCode())) * 31;
        View view5 = this.f29661f;
        int iHashCode6 = (iHashCode5 + (view5 == null ? 0 : view5.hashCode())) * 31;
        View view6 = this.f29662g;
        return ((iHashCode6 + (view6 != null ? view6.hashCode() : 0)) * 31) + this.f29663h.hashCode();
    }

    @Nullable
    public final View i() {
        return this.f29658c;
    }

    @Nullable
    public final View j() {
        return this.f29660e;
    }

    @NotNull
    public final F8 k() {
        return this.f29656a;
    }

    @Nullable
    public final View l() {
        return this.f29662g;
    }

    @Nullable
    public final View m() {
        return this.f29659d;
    }

    @Nullable
    public final a n() {
        return this.f29664i;
    }

    @Nullable
    public final View o() {
        return this.f29661f;
    }

    @NotNull
    public final View p() {
        return this.f29663h;
    }

    @Nullable
    public final View q() {
        return this.f29657b;
    }

    @NotNull
    public final JSONObject t() throws JSONException {
        JSONObject jSONObjectPut = IronSourceVideoBridge.jsonObjectInit().put("title", this.f29657b != null).put(C3978d4.i.F0, this.f29658c != null).put("body", this.f29660e != null).put("cta", this.f29662g != null).put(C3978d4.i.I0, this.f29661f != null).put("icon", this.f29659d != null);
        tn.p.j(jSONObjectPut, "JSONObject()\n        .pu…\"icon\", iconView != null)");
        return jSONObjectPut;
    }

    @NotNull
    public String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.f29656a + ", titleView=" + this.f29657b + ", advertiserView=" + this.f29658c + ", iconView=" + this.f29659d + ", bodyView=" + this.f29660e + ", mediaView=" + this.f29661f + ", ctaView=" + this.f29662g + ", privacyIconView=" + this.f29663h + ")";
    }
}
