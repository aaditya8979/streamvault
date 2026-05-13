package sg.bigo.ads.ad.interstitial.h;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.q;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.p;
import sg.bigo.ads.common.utils.e;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes10.dex */
public class c extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f81058s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f81059t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f81060u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public RoundedImageView f81061v;

    public c(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull m mVar, @NonNull p pVar) {
        super(bVar, mVar, pVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    public void a(int i10, boolean z10, boolean z11) {
        super.a(i10, z10, z11);
        sg.bigo.ads.ad.b.a.a(this.f81061v, 5);
        RoundedImageView roundedImageView = this.f81061v;
        if (roundedImageView != null) {
            if (z10) {
                sg.bigo.ads.ad.b.a.a(this.f81034j, roundedImageView, 10, this.f81466f, i10);
            } else {
                sg.bigo.ads.ad.b.a.a(this.f81034j, roundedImageView, 10, q.F, 0);
            }
        }
    }

    public void a(@NonNull q qVar, @NonNull Rect rect) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f81038n.getLayoutParams();
        layoutParams.addRule(12, 0);
        layoutParams.addRule(3, this.f81060u.getId());
        this.f81038n.requestLayout();
        p pVarB = b(qVar);
        int iA = e.a(this.f81060u.getContext(), 16);
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i10 = iA * 2;
        int i11 = iWidth - i10;
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f81060u.getLayoutParams();
        layoutParams2.addRule(2, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f81037m.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f81061v.getLayoutParams();
        p pVarA = p.a(pVarB.f82290b, pVarB.f82291c, iWidth, iHeight - i10);
        p pVarA2 = p.a(pVarB.f82290b, pVarB.f82291c, i11, iHeight);
        if (pVarA.a(pVarA2)) {
            layoutParams2.width = pVarA.f82290b;
            layoutParams2.height = pVarA.f82291c + i10;
            marginLayoutParams.topMargin = iA;
            marginLayoutParams.bottomMargin = iA;
            marginLayoutParams2.leftMargin = iA;
            marginLayoutParams2.rightMargin = iA;
        } else {
            layoutParams2.width = pVarA2.f82290b + i10;
            layoutParams2.height = pVarA2.f82291c;
            marginLayoutParams.leftMargin = iA;
            marginLayoutParams.rightMargin = iA;
            marginLayoutParams2.topMargin = iA;
            marginLayoutParams2.bottomMargin = iA;
        }
        this.f81037m.requestLayout();
        this.f81061v.requestLayout();
        this.f81060u.requestLayout();
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    public void d(@NonNull final q qVar) {
        ViewGroup viewGroup = this.f81035k;
        if (viewGroup == null) {
            return;
        }
        this.f81058s = viewGroup.findViewById(R.id.inter_click_guide_container);
        this.f81060u = this.f81035k.findViewById(R.id.inter_click_guide_image_layout);
        this.f81061v = (RoundedImageView) this.f81035k.findViewById(R.id.inter_click_guide_image_background);
        this.f81061v.setCornerRadius(e.a(this.f81035k.getContext(), 8));
        this.f81061v.setBackgroundColor(654311423);
        u.a(this.f81060u, new u.a() { // from class: sg.bigo.ads.ad.interstitial.h.c.1
            @Override // sg.bigo.ads.common.utils.u.a
            public final void a(@NonNull Rect rect) {
                c.this.a(qVar, rect);
            }
        });
        l().a(this.f81059t, null);
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final boolean d() {
        sg.bigo.ads.core.a.a aVar;
        sg.bigo.ads.ad.b.b bVar = this.f81466f;
        if (bVar == null || (aVar = (sg.bigo.ads.core.a.a) bVar.f()) == null) {
            return true;
        }
        return aVar.aR();
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    public final void e(@NonNull q qVar) {
        super.e(qVar);
        RoundedImageView roundedImageView = this.f81037m;
        if (roundedImageView != null) {
            roundedImageView.setCornerRadius(e.a(roundedImageView.getContext(), 8));
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    public void f(@NonNull q qVar) {
        super.f(qVar);
        l().a(this.f81038n);
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    public final boolean g() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    public int h() {
        return R.layout.bigo_ad_view_click_guide_2;
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    public final void k() {
        super.k();
        l().a(this.f81036l);
    }

    @NonNull
    public sg.bigo.ads.ad.interstitial.b l() {
        return sg.bigo.ads.ad.interstitial.b.f80351d;
    }
}
