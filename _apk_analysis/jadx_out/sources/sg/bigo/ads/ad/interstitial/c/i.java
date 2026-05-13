package sg.bigo.ads.ad.interstitial.c;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes2.dex */
public class i extends g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f80508t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private RoundedImageView f80509u;

    public i(@NonNull sg.bigo.ads.ad.b.b bVar, int i10, @NonNull sg.bigo.ads.api.a.m mVar, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, i10, mVar, cVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g, sg.bigo.ads.ad.interstitial.c.a
    public final void a(double d10) {
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g, sg.bigo.ads.ad.interstitial.c.a
    public final void a(int i10, boolean z10, boolean z11) {
        sg.bigo.ads.ad.b.a.a(this.f80509u, 5);
        if (z10) {
            sg.bigo.ads.ad.b.a.a(this.f80414j, this.f80509u, 4, this.f81466f, i10);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f80414j, this.f80509u, 4, sg.bigo.ads.ad.interstitial.q.F, 0);
        }
        sg.bigo.ads.ad.b.a.a(this.f80508t, 9);
        ViewGroup viewGroup = this.f80414j;
        if (z11) {
            sg.bigo.ads.ad.b.a.a(viewGroup, this.f80508t, 4, this.f81466f, i10);
        } else {
            sg.bigo.ads.ad.b.a.a(viewGroup, this.f80508t, 4, sg.bigo.ads.ad.interstitial.q.F, 0);
        }
        sg.bigo.ads.api.a.m mVar = this.f81467g;
        boolean z12 = true;
        if (mVar != null && mVar.a("endpage.ad_component_clickable_switch") != 1) {
            z12 = false;
        }
        View view = this.f80496o;
        if (view != null) {
            sg.bigo.ads.ad.b.a.a(view, 18);
            if (z12) {
                sg.bigo.ads.ad.b.a.a(this.f80414j, this.f80496o, 8, this.f81466f, i10);
            } else {
                sg.bigo.ads.ad.b.a.a(this.f80414j, this.f80496o, 8, sg.bigo.ads.ad.interstitial.q.F, 0);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g, sg.bigo.ads.ad.interstitial.c.a
    public final void a(final Runnable runnable) {
        b(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.i.2
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
                i.this.m();
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g, sg.bigo.ads.ad.interstitial.c.a
    public final void d(final sg.bigo.ads.ad.interstitial.q qVar) {
        super.d(qVar);
        ViewGroup viewGroup = this.f80415k;
        if (viewGroup == null) {
            return;
        }
        this.f80508t = viewGroup.findViewById(R.id.inter_end_page_image_layout);
        this.f80509u = (RoundedImageView) this.f80415k.findViewById(R.id.inter_end_page_image);
        sg.bigo.ads.common.utils.u.a(this.f80508t, new u.a() { // from class: sg.bigo.ads.ad.interstitial.c.i.1
            @Override // sg.bigo.ads.common.utils.u.a
            public final void a(@NonNull Rect rect) {
                float fA;
                int i10;
                int i11;
                sg.bigo.ads.common.p pVarB = i.this.b(qVar);
                int i12 = -1;
                if (pVarB.a(rect.width(), rect.height())) {
                    i11 = 0;
                    fA = 0.0f;
                    i10 = -1;
                } else {
                    int iA = sg.bigo.ads.common.utils.e.a(i.this.f80509u.getContext(), 20);
                    int i13 = iA * 2;
                    sg.bigo.ads.common.p pVarA = sg.bigo.ads.common.p.a(pVarB.f82290b, pVarB.f82291c, rect.width() - i13, rect.height() - i13);
                    i12 = pVarA.f82290b;
                    int i14 = pVarA.f82291c;
                    fA = sg.bigo.ads.common.utils.e.a(i.this.f80509u.getContext(), 8);
                    i10 = i14;
                    i11 = iA;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) i.this.f80509u.getLayoutParams();
                marginLayoutParams.setMargins(i11, i11, i11, i11);
                marginLayoutParams.width = i12;
                marginLayoutParams.height = i10;
                i.this.f80509u.requestLayout();
                i.this.f80509u.setCornerRadius(fA);
            }
        });
        TextView textView = this.f80416l;
        if (textView != null) {
            sg.bigo.ads.ad.interstitial.d.a(textView, -1);
        }
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

    @Override // sg.bigo.ads.ad.interstitial.c.g, sg.bigo.ads.ad.interstitial.c.a
    public final int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_16_17;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.g
    public final void l() {
        View view = this.f80496o;
        if (view != null) {
            view.setBackgroundColor(-1);
        }
    }
}
