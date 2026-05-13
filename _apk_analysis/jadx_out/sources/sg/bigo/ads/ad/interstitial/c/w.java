package sg.bigo.ads.ad.interstitial.c;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.t;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends ab {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ViewGroup f80565t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final sg.bigo.ads.ad.b.a.a.b f80566u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f80567v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f80568w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f80569x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f80570y;

    public w(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull sg.bigo.ads.api.a.m mVar, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, mVar, cVar);
        this.f80569x = 0;
        this.f80570y = 1;
        this.f80566u = (sg.bigo.ads.ad.b.a.a.b) bVar;
        this.f80421o = mVar.a("multi_ads_endpage.ad_component_layout");
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab, sg.bigo.ads.ad.interstitial.c.a
    public final void a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, int i10) {
        super.a(qVar, i10);
        a((Button) this.f80565t.findViewById(R.id.inter_btn_cta), qVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab
    public final void a(boolean z10) {
        super.a(z10);
        if (this.f80568w) {
            return;
        }
        this.f80568w = true;
        if (z10) {
            sg.bigo.ads.ad.b.a.a(this.f80414j, this.f80565t, 13, this.f80566u.f(1), this.f80424r);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f80414j, this.f80565t, 13, sg.bigo.ads.ad.interstitial.q.F, 0);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab, sg.bigo.ads.ad.interstitial.u
    public final boolean a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, @NonNull ViewGroup viewGroup, @NonNull View view, t.a aVar, int i10, int i11, int i12, @Nullable View... viewArr) {
        sg.bigo.ads.ad.b.b bVarF = this.f80566u.f(0);
        if (bVarF != null) {
            super.a(bVarF, qVar, viewGroup, this.f80422p, aVar, i10, 13, i12, viewArr);
        } else {
            this.f80422p.setVisibility(8);
        }
        sg.bigo.ads.ad.b.b bVarF2 = this.f80566u.f(1);
        if (bVarF2 != null) {
            super.a(bVarF2, qVar, viewGroup, this.f80565t, aVar, i10, 13, i12, viewArr);
        } else {
            this.f80565t.setVisibility(8);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    @Override // sg.bigo.ads.ad.interstitial.c.ab, sg.bigo.ads.ad.interstitial.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(sg.bigo.ads.ad.interstitial.q r4) {
        /*
            r3 = this;
            super.d(r4)
            int r0 = r3.f80421o
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L33
            r1 = 3
            if (r0 == r1) goto L17
            r1 = 4
            if (r0 == r1) goto L33
            r1 = 5
            if (r0 == r1) goto L17
            android.view.ViewGroup r4 = r3.f80415k
            int r0 = sg.bigo.ads.R.id.bigo_ad_end_stub_2_half_wrap
            goto L37
        L17:
            android.view.ViewGroup r0 = r3.f80415k
            int r1 = sg.bigo.ads.R.id.bigo_ad_end_stub_2_img_wrap
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.f80565t = r0
            sg.bigo.ads.ad.b.a.a.b r1 = r3.f80566u
            sg.bigo.ads.ad.b.b r1 = r1.f(r2)
            r3.a(r4, r0, r1)
            goto L45
        L33:
            android.view.ViewGroup r4 = r3.f80415k
            int r0 = sg.bigo.ads.R.id.bigo_ad_end_stub_2_all_wrap
        L37:
            android.view.View r4 = r4.findViewById(r0)
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            android.view.View r4 = r4.inflate()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r3.f80565t = r4
        L45:
            int r4 = r3.f80421o
            if (r2 != r4) goto L61
            android.view.ViewGroup r4 = r3.f80565t
            if (r4 == 0) goto L61
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            android.view.ViewGroup r0 = r3.f80415k
            android.content.Context r0 = r0.getContext()
            r1 = 58
            int r0 = sg.bigo.ads.common.utils.e.a(r0, r1)
            r4.topMargin = r0
        L61:
            android.view.ViewGroup r4 = r3.f80565t
            int r0 = sg.bigo.ads.R.id.bigo_ad_inter_layout_end_page
            android.view.View r4 = r4.findViewById(r0)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            sg.bigo.ads.ad.interstitial.c.ab.a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.c.w.d(sg.bigo.ads.ad.interstitial.q):void");
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab, sg.bigo.ads.ad.interstitial.c.a
    public final int h() {
        return R.layout.bigo_ad_activity_interstitial_multi_mix_end;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final boolean k() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab
    public final int l() {
        return 13;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab
    public final sg.bigo.ads.ad.b.b m() {
        sg.bigo.ads.ad.b.a.a.b bVar = this.f80566u;
        if (bVar != null) {
            return bVar.f(0);
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab
    public final ViewGroup n() {
        return this.f80565t;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab
    public final void o() {
        super.o();
        if (this.f80567v) {
            return;
        }
        ViewGroup viewGroup = this.f80565t;
        View viewFindViewWithTag = viewGroup != null ? viewGroup.findViewWithTag(9) : null;
        if (this.f80423q && viewFindViewWithTag != null) {
            this.f80567v = true;
            sg.bigo.ads.ad.b.a.a(this.f80414j, viewFindViewWithTag, 13, this.f80566u.f(1), this.f80424r);
        } else if (viewFindViewWithTag != null) {
            this.f80567v = true;
            sg.bigo.ads.ad.b.a.a(this.f80414j, viewFindViewWithTag, 13, sg.bigo.ads.ad.interstitial.q.F, this.f80424r);
        }
    }
}
