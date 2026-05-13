package sg.bigo.ads.ad.interstitial.c;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes7.dex */
public class k extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f80515o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RoundedImageView f80516p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f80517q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f80518r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RoundedImageView f80519s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RoundedImageView f80520t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Button f80521u;

    public k(@NonNull sg.bigo.ads.ad.b.b bVar, int i10, @NonNull sg.bigo.ads.api.a.m mVar, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, i10, mVar, cVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void a(double d10) {
        if (d10 <= 3.0d) {
            TextView textView = this.f80416l;
            if (textView != null) {
                textView.setTextColor(sg.bigo.ads.common.w.b.a(sg.bigo.ads.ad.interstitial.d.f80589b, 0.6f));
                return;
            }
            return;
        }
        TextView textView2 = this.f80416l;
        if (textView2 != null) {
            textView2.setTextColor(sg.bigo.ads.common.w.b.a(sg.bigo.ads.ad.interstitial.d.f80588a, 0.6f));
        }
    }

    public void a(int i10) {
        Button button = (Button) this.f80415k.findViewById(R.id.inter_btn_cta);
        this.f80521u = button;
        if (button != null) {
            float fA = sg.bigo.ads.common.utils.e.a(this.f80415k.getContext(), 8);
            this.f80521u.setBackground(sg.bigo.ads.common.utils.d.a(fA, fA, fA, fA, (Rect) null, i10));
            sg.bigo.ads.ad.interstitial.d.a(this.f80521u, sg.bigo.ads.common.w.b.a(i10));
            l().a(this.f80521u);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public void a(int i10, boolean z10, boolean z11) {
        sg.bigo.ads.ad.b.a.a(this.f80519s, 5);
        sg.bigo.ads.ad.b.a.a(this.f80520t, 5);
        if (z10) {
            sg.bigo.ads.ad.b.a.a(this.f80414j, this.f80519s, 4, this.f81466f, i10);
            sg.bigo.ads.ad.b.a.a(this.f80414j, this.f80520t, 4, this.f81466f, i10);
        } else {
            ViewGroup viewGroup = this.f80414j;
            RoundedImageView roundedImageView = this.f80519s;
            sg.bigo.ads.core.adview.h hVar = sg.bigo.ads.ad.interstitial.q.F;
            sg.bigo.ads.ad.b.a.a(viewGroup, roundedImageView, 4, hVar, 0);
            sg.bigo.ads.ad.b.a.a(this.f80414j, this.f80520t, 4, hVar, 0);
        }
        sg.bigo.ads.ad.b.a.a(this.f80415k, 9);
        if (z11) {
            sg.bigo.ads.ad.b.a.a(this.f80414j, this.f80415k, 4, this.f81466f, i10);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f80414j, this.f80415k, 4, sg.bigo.ads.ad.interstitial.q.F, 0);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void a(final Runnable runnable) {
        super.a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.k.2
            @Override // java.lang.Runnable
            public final void run() {
                k.this.m();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }

    public void a(sg.bigo.ads.ad.interstitial.q qVar, @NonNull Rect rect) {
        sg.bigo.ads.common.p pVarB = b(qVar);
        int iA = sg.bigo.ads.common.utils.e.a(this.f80518r.getContext(), 16);
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i10 = iA * 2;
        int i11 = iWidth - i10;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f80518r.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f80519s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f80520t.getLayoutParams();
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.common.p.a(pVarB.f82290b, pVarB.f82291c, iWidth, iHeight - i10);
        sg.bigo.ads.common.p pVarA2 = sg.bigo.ads.common.p.a(pVarB.f82290b, pVarB.f82291c, i11, iHeight);
        if (pVarA.a(pVarA2)) {
            layoutParams.width = pVarA.f82290b;
            layoutParams.height = pVarA.f82291c + i10;
            marginLayoutParams.topMargin = iA;
            marginLayoutParams.bottomMargin = iA;
            marginLayoutParams2.leftMargin = iA;
            marginLayoutParams2.rightMargin = iA;
        } else {
            layoutParams.width = pVarA2.f82290b + i10;
            layoutParams.height = pVarA2.f82291c;
            marginLayoutParams.leftMargin = iA;
            marginLayoutParams.rightMargin = iA;
            marginLayoutParams2.topMargin = iA;
            marginLayoutParams2.bottomMargin = iA;
        }
        this.f80518r.requestLayout();
        this.f80519s.requestLayout();
        this.f80520t.requestLayout();
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public void d(final sg.bigo.ads.ad.interstitial.q qVar) {
        ViewGroup viewGroup = this.f80415k;
        if (viewGroup == null) {
            return;
        }
        this.f80515o = viewGroup.findViewById(R.id.inter_end_page);
        this.f80516p = (RoundedImageView) this.f80415k.findViewById(R.id.inter_icon);
        this.f80517q = (TextView) this.f80415k.findViewById(R.id.inter_title);
        l().a(this.f80516p);
        l().a(this.f80517q, null);
        this.f80518r = this.f80415k.findViewById(R.id.inter_end_page_image_layout);
        this.f80519s = (RoundedImageView) this.f80415k.findViewById(R.id.inter_end_page_image);
        this.f80520t = (RoundedImageView) this.f80415k.findViewById(R.id.inter_end_page_image_background);
        float fA = sg.bigo.ads.common.utils.e.a(this.f80519s.getContext(), 8);
        this.f80519s.setCornerRadius(fA);
        this.f80520t.setCornerRadius(fA);
        this.f80520t.setBackgroundColor(654311423);
        sg.bigo.ads.common.utils.u.a(this.f80518r, new u.a() { // from class: sg.bigo.ads.ad.interstitial.c.k.1
            @Override // sg.bigo.ads.common.utils.u.a
            public final void a(@NonNull Rect rect) {
                k.this.a(qVar, rect);
            }
        });
        a(f(qVar));
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

    @Override // sg.bigo.ads.ad.interstitial.u
    public final boolean f() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_18;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void i() {
        String strI = ((sg.bigo.ads.core.a.a) this.f81466f.f()).i();
        TextView textView = (TextView) this.f80415k.findViewById(R.id.inter_advertiser);
        if (TextUtils.isEmpty(strI)) {
            textView.setVisibility(8);
        } else {
            textView.setText(strI);
        }
    }

    @NonNull
    public sg.bigo.ads.ad.interstitial.b l() {
        return sg.bigo.ads.ad.interstitial.b.f80351d;
    }

    public final void m() {
        if (this.f80521u == null || !j()) {
            return;
        }
        sg.bigo.ads.ad.interstitial.c.e(this.f80521u);
    }
}
