package sg.bigo.ads.ad.interstitial.c;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes4.dex */
public class l extends k {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private TextView f80526v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private TextView f80527w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private IconListView f80528x;

    public l(@NonNull sg.bigo.ads.ad.b.b bVar, int i10, @NonNull sg.bigo.ads.api.a.m mVar, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, i10, mVar, cVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.k
    public final void a(int i10) {
        super.a(i10);
        sg.bigo.ads.ad.interstitial.b.f80348a.a(this.f80521u);
        ViewGroup viewGroup = this.f80415k;
        if (viewGroup != null) {
            TextView textView = (TextView) viewGroup.findViewById(R.id.inter_company);
            this.f80526v = textView;
            if (textView != null) {
                textView.setTextColor(i10);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.k, sg.bigo.ads.ad.interstitial.c.a
    public final void a(int i10, boolean z10, boolean z11) {
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
        ViewGroup viewGroup2 = this.f80414j;
        if (z11) {
            sg.bigo.ads.ad.b.a.a(viewGroup2, this.f80415k, 4, this.f81466f, i10);
        } else {
            sg.bigo.ads.ad.b.a.a(viewGroup2, this.f80415k, 4, sg.bigo.ads.ad.interstitial.q.F, 0);
        }
        sg.bigo.ads.api.a.m mVar = this.f81467g;
        boolean z12 = true;
        if (mVar != null && mVar.a("endpage.ad_component_clickable_switch") != 1) {
            z12 = false;
        }
        View view = this.f80515o;
        if (view != null) {
            sg.bigo.ads.ad.b.a.a(view, 18);
            ViewGroup viewGroup3 = this.f80414j;
            if (z12) {
                sg.bigo.ads.ad.b.a.a(viewGroup3, this.f80515o, 8, this.f81466f, i10);
            } else {
                sg.bigo.ads.ad.b.a.a(viewGroup3, this.f80515o, 8, sg.bigo.ads.ad.interstitial.q.F, 0);
            }
        }
        IconListView iconListView = this.f80528x;
        if (iconListView != null) {
            List<IconListView.a> items = iconListView.getItems();
            for (int i11 = 0; items != null && i11 < items.size(); i11++) {
                IconListView.a aVar = items.get(i11);
                sg.bigo.ads.ad.b.a.a(aVar.f81185d, 26);
                sg.bigo.ads.ad.b.a.a(this.f80414j, aVar.f81185d, 8, this.f81466f, i10);
                sg.bigo.ads.ad.b.a.a(aVar.f81188g, 26);
                sg.bigo.ads.ad.b.a.a(this.f80414j, aVar.f81188g, 8, this.f81466f, i10);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.k
    public final void a(sg.bigo.ads.ad.interstitial.q qVar, @NonNull Rect rect) {
        sg.bigo.ads.common.p pVarB = b(qVar);
        int iA = sg.bigo.ads.common.utils.e.a(this.f80518r.getContext(), 16);
        int iWidth = rect.width();
        int iHeight = rect.height();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f80518r.getLayoutParams();
        int i10 = sg.bigo.ads.common.p.b(pVarB.f82290b, pVarB.f82291c, iWidth).f82291c;
        if (i10 <= iHeight) {
            layoutParams.height = i10;
        } else {
            int i11 = iA * 2;
            layoutParams.height = sg.bigo.ads.common.p.a(pVarB.f82290b, pVarB.f82291c, iWidth - i11, iHeight - i11).f82291c + i11;
            ((ViewGroup.MarginLayoutParams) this.f80519s.getLayoutParams()).setMargins(iA, iA, iA, iA);
            this.f80519s.requestLayout();
        }
        this.f80518r.requestLayout();
    }

    @Override // sg.bigo.ads.ad.interstitial.c.k, sg.bigo.ads.ad.interstitial.c.a
    public final void d(sg.bigo.ads.ad.interstitial.q qVar) {
        IconListView iconListView;
        int i10;
        super.d(qVar);
        ViewGroup viewGroup = this.f80415k;
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_description);
        this.f80527w = textView;
        sg.bigo.ads.ad.interstitial.b bVar = sg.bigo.ads.ad.interstitial.b.f80348a;
        bVar.a(null, textView);
        IconListView iconListView2 = (IconListView) this.f80415k.findViewById(R.id.inter_download_msg);
        this.f80528x = iconListView2;
        iconListView2.a(((a) this).f80413i);
        if (sg.bigo.ads.common.utils.k.a((Collection) this.f80528x.getItems())) {
            iconListView = this.f80528x;
            i10 = 8;
        } else {
            iconListView = this.f80528x;
            i10 = 0;
        }
        iconListView.setVisibility(i10);
        int iA = sg.bigo.ads.common.utils.e.a(this.f80415k.getContext(), 16);
        View view = this.f80515o;
        if (view != null) {
            float f10 = iA;
            view.setBackground(sg.bigo.ads.common.utils.d.a(f10, f10, f10, f10, (Rect) null, -1));
            bVar.b(this.f80515o);
        }
        a(qVar, this.f80520t);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.k, sg.bigo.ads.ad.interstitial.c.a
    public final int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_19;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.k
    @NonNull
    public final sg.bigo.ads.ad.interstitial.b l() {
        return sg.bigo.ads.ad.interstitial.b.f80348a;
    }
}
