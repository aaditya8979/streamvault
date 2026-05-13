package sg.bigo.ads.ad.splash.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.d;
import sg.bigo.ads.ad.interstitial.q;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.ad.splash.a.i;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.p;
import sg.bigo.ads.common.view.Indicator;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.ViewFlow;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private i f81656l;

    public e(@NonNull sg.bigo.ads.api.core.f fVar, @NonNull m mVar, @Nullable m mVar2, @NonNull sg.bigo.ads.ad.splash.b bVar) {
        super(fVar, mVar, mVar2, bVar);
    }

    @Override // sg.bigo.ads.ad.splash.a.b, sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z10, @NonNull ViewGroup viewGroup, int i10) {
        int i11;
        boolean z11;
        T t10;
        MediaView.a aVarB;
        boolean z12;
        sg.bigo.ads.ad.interstitial.multi_img.d dVar;
        boolean z13;
        super.a(z10, viewGroup, i10);
        if (!z10) {
            View viewFindViewWithTag = viewGroup.findViewWithTag("adview_background_second_tag");
            if (viewFindViewWithTag instanceof ImageView) {
                viewGroup.removeView(viewFindViewWithTag);
                return;
            }
            return;
        }
        if (this.f81656l == null) {
            w wVar = new w();
            m mVar = this.f81605c;
            if (mVar != null) {
                wVar.f81492f = mVar.c("video_play_page.media_view_clickable_switch");
                wVar.f81494h = this.f81605c.c("video_play_page.ad_component_clickable_switch");
                wVar.f81493g = this.f81605c.c("video_play_page.other_space_clickable_switch");
                wVar.f81495i = this.f81605c.a("video_play_page.click_type");
                wVar.f81498l = this.f81605c.c("layer.other_space_clickable_switch");
                wVar.f81499m = this.f81605c.a("layer.click_type");
                wVar.f81487a = false;
                wVar.f81488b = 0;
                wVar.f81489c = this.f81605c.a("video_play_page.force_staying_time");
                wVar.f81490d = this.f81605c.c("layer.is_show_layer");
                wVar.f81491e = this.f81605c.a("layer.force_staying_time");
                wVar.f81496j = this.f81605c.a("video_play_page.auto_click");
                wVar.f81500n = this.f81605c.a("video_play_page.time_for_auto_click", -1);
                wVar.f81501o = this.f81605c.a("video_play_page.time_for_show_backup", -1);
            } else {
                wVar.f81496j = 1;
                wVar.f81487a = this.f81604b.c("interstitial_video_style.video_play_page.is_global_click");
                wVar.f81488b = this.f81604b.a("interstitial_video_style.video_play_page.impression_close_seconds");
                wVar.f81489c = this.f81604b.a("interstitial_video_style.video_play_page.close_click_seconds");
                wVar.f81490d = this.f81604b.c("interstitial_video_style.video_play_page.is_jump_layer");
                wVar.f81491e = this.f81604b.a("interstitial_video_style.layer.impression_layer_close_seconds");
            }
            sg.bigo.ads.ad.b.b bVar = this.f81610h.f81733z;
            m mVar2 = this.f81605c;
            if (mVar2 == null) {
                mVar2 = this.f81604b;
            }
            this.f81656l = new i(bVar, viewGroup, wVar, sg.bigo.ads.ad.interstitial.multi_img.b.c(bVar, mVar2));
        }
        final i iVar = this.f81656l;
        Context context = iVar.f81698m.getContext();
        List<String> listA = iVar.f81694h.a();
        sg.bigo.ads.ad.interstitial.multi_img.b bVar2 = iVar.f81694h;
        boolean z14 = bVar2.f81140e;
        sg.bigo.ads.ad.interstitial.multi_img.d dVar2 = bVar2.f81137b;
        sg.bigo.ads.ad.interstitial.multi_img.c cVar = bVar2.f81139d;
        p pVarA = r.a(iVar.f81697l);
        iVar.f81689c = (ViewFlow) iVar.f81698m.findViewById(R.id.inter_media_ad_view_flow);
        iVar.f81690d = (Indicator) iVar.f81698m.findViewById(R.id.vf_indicator);
        m mVar3 = iVar.f81694h.f81136a;
        int iA = mVar3 == null ? 1 : sg.bigo.ads.ad.interstitial.multi_img.e.a(mVar3.a("video_play_page.background_colour"));
        if (iA == 4 || iA == 5) {
            iVar.f81692f = new sg.bigo.ads.ad.interstitial.multi_img.a(iVar.f81698m, iVar.f81689c, iVar.f81699n, iA);
        }
        int i12 = iA;
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar3 = new sg.bigo.ads.ad.interstitial.multi_img.view.b(context, cVar, false, iVar.d(), i12);
        iVar.f81693g = bVar3;
        iVar.f81691e = bVar3.f81217j;
        ((MediaView) bVar3.f81219l).setImageBlurBorder(false);
        iVar.f81693g.a(pVarA.f82290b, pVarA.f82291c);
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar4 = iVar.f81693g;
        bVar4.f81226s = true;
        if (bVar4.c()) {
            if (((sg.bigo.ads.core.a.a) iVar.f81697l.f()).aR()) {
                Set<sg.bigo.ads.ad.interstitial.multi_img.view.d> set = i.f81688j;
                synchronized (set) {
                    set.add(iVar.f81693g);
                }
            }
            if (iVar.f81692f != null) {
                iVar.f81693g.f81225r = new d.a() { // from class: sg.bigo.ads.ad.splash.a.i.4
                    public AnonymousClass4() {
                    }

                    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                    public final void a() {
                        i.this.f81692f.a(i.this.f81689c.a(i.this.f81693g.f81217j));
                    }

                    @Override // sg.bigo.ads.ad.interstitial.multi_img.view.d.a
                    public final void b() {
                        i.this.f81693g.f81225r = null;
                        a();
                    }
                };
            }
        }
        iVar.f81689c.setDividerWidth(sg.bigo.ads.common.utils.e.a(context, dVar2.f81164f));
        iVar.f81689c.setContentMaxWidthSpace(sg.bigo.ads.common.utils.e.a(context, dVar2.f81167i));
        iVar.f81689c.setViewStyle(dVar2.f81168j);
        iVar.f81689c.setOnItemChangeListener(new sg.bigo.ads.ad.interstitial.multi_img.f(dVar2, iVar.f81690d, iVar.f81692f));
        int i13 = 0;
        int i14 = 0;
        while (i13 < listA.size()) {
            String str = listA.get(i13);
            if (TextUtils.isEmpty(str) || !URLUtil.isNetworkUrl(str)) {
                dVar = dVar2;
                z13 = z14;
            } else {
                i14++;
                dVar = dVar2;
                z13 = z14;
                iVar.a(context, cVar, i12, str, ((sg.bigo.ads.core.a.a) iVar.f81697l.f()).al());
            }
            i13++;
            dVar2 = dVar;
            z14 = z13;
        }
        sg.bigo.ads.ad.interstitial.multi_img.d dVar3 = dVar2;
        if (z14) {
            i14++;
            final sg.bigo.ads.ad.interstitial.multi_img.view.a aVarA = iVar.a(context, cVar, i12, null, false);
            sg.bigo.ads.ad.splash.a.a(iVar.f81697l, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.splash.a.i.5

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ sg.bigo.ads.ad.interstitial.multi_img.view.a f81709a;

                public AnonymousClass5(final sg.bigo.ads.ad.interstitial.multi_img.view.a aVarA2) {
                    aVar = aVarA2;
                }

                @Override // android.webkit.ValueCallback
                public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                    Bitmap bitmap2 = bitmap;
                    if (bitmap2 != null) {
                        aVar.a(bitmap2);
                    }
                }
            });
        }
        sg.bigo.ads.ad.interstitial.multi_img.d dVar4 = sg.bigo.ads.ad.interstitial.multi_img.d.CENTER;
        int i15 = dVar3 == dVar4 ? i14 >> 1 : 0;
        ViewFlow.b bVar5 = new ViewFlow.b();
        bVar5.f82680a = pVarA.f82290b;
        bVar5.f82681b = pVarA.f82291c;
        bVar5.f82682c = true;
        bVar5.f82683d = cVar.f81156d;
        iVar.f81689c.addView(iVar.f81691e, Math.max(0, i15), bVar5);
        int i16 = i.AnonymousClass2.f81706a[dVar3.ordinal()];
        int i17 = 3;
        if (i16 == 1 || i16 == 2 || i16 == 3 || i16 == 4) {
            ViewFlow.d dVar5 = new ViewFlow.d() { // from class: sg.bigo.ads.ad.splash.a.i.9
                public AnonymousClass9() {
                }

                @Override // sg.bigo.ads.common.view.ViewFlow.d
                public final void a() {
                    i.this.f81697l.a((sg.bigo.ads.common.i) null, 8, 29);
                }
            };
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar2 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context, true);
            iVar.f81700o = cVar2;
            iVar.f81689c.setStartView(cVar2.f81204a);
            iVar.f81689c.setOnStartViewShowListener(dVar5);
            sg.bigo.ads.ad.interstitial.multi_img.view.c cVar3 = new sg.bigo.ads.ad.interstitial.multi_img.view.c(context, false);
            iVar.f81701p = cVar3;
            iVar.f81689c.setEndView(cVar3.f81204a);
            iVar.f81689c.setOnEndViewShowListener(dVar5);
        }
        int iA2 = dVar3 == dVar4 ? iVar.f81689c.a(iVar.f81691e) : 0;
        iVar.f81689c.b(iA2);
        sg.bigo.ads.ad.interstitial.multi_img.a aVar = iVar.f81692f;
        if (aVar != null) {
            aVar.b(iA2);
        }
        MediaView mediaView = (MediaView) iVar.f81693g.f81219l;
        sg.bigo.ads.ad.b.b bVar6 = iVar.f81697l;
        bVar6.H = iVar.f81695i.f81495i;
        bVar6.a(iVar.f81698m, mediaView, (ImageView) null, (AdOptionsView) null, (List<View>) null, 8, null);
        int i18 = iVar.f81695i.f81495i;
        View viewFindViewById = iVar.f81698m.findViewById(R.id.inter_media_container);
        sg.bigo.ads.ad.b.a.a(viewFindViewById, 9);
        sg.bigo.ads.ad.b.a.a(iVar.f81689c, 9);
        if (iVar.f81695i.f81493g) {
            sg.bigo.ads.ad.interstitial.multi_img.view.b bVar7 = iVar.f81693g;
            if (bVar7 != null) {
                ((MediaView) bVar7.f81219l).setOtherClickAreaClick(true);
            }
            sg.bigo.ads.ad.b.a.a(iVar.f81698m, viewFindViewById, 8, iVar.f81697l, i18);
            sg.bigo.ads.ad.b.a.a(iVar.f81698m, iVar.f81689c, 8, iVar.f81697l, i18);
        } else {
            sg.bigo.ads.ad.interstitial.multi_img.view.b bVar8 = iVar.f81693g;
            if (bVar8 != null) {
                i11 = 0;
                ((MediaView) bVar8.f81219l).setOtherClickAreaClick(false);
            } else {
                i11 = 0;
            }
            ViewGroup viewGroup2 = iVar.f81698m;
            sg.bigo.ads.core.adview.h hVar = q.F;
            sg.bigo.ads.ad.b.a.a(viewGroup2, viewFindViewById, 8, hVar, i11);
            sg.bigo.ads.ad.b.a.a(iVar.f81698m, iVar.f81689c, 8, hVar, i11);
        }
        if (iVar.e()) {
            i17 = i18;
            z11 = false;
        } else {
            int iA3 = iVar.f81694h.f81136a.a("video_play_page.multi_click_type");
            if (iA3 == 2) {
                z11 = false;
            } else {
                if (iA3 == 3) {
                    z11 = i18 == 1 || i18 == 2;
                }
                i17 = i18;
                z11 = false;
            }
        }
        boolean z15 = iVar.f81695i.f81492f;
        sg.bigo.ads.ad.interstitial.multi_img.view.b bVar9 = iVar.f81693g;
        if (bVar9 != null && (t10 = bVar9.f81219l) != 0) {
            ViewGroup viewGroup3 = iVar.f81698m;
            sg.bigo.ads.ad.b.b bVar10 = iVar.f81697l;
            if (z11) {
                sg.bigo.ads.ad.b.a.a(viewGroup3, t10, 8, bVar10, iVar.f81696k);
            } else {
                sg.bigo.ads.ad.b.a.a(viewGroup3, t10, 8, bVar10, i17);
            }
            if (z15) {
                ((MediaView) iVar.f81693g.f81219l).setMediaAreaClickable(true);
                aVarB = ((MediaView) iVar.f81693g.f81219l).b();
                z12 = false;
            } else {
                ((MediaView) iVar.f81693g.f81219l).setMediaAreaClickable(false);
                aVarB = ((MediaView) iVar.f81693g.f81219l).b();
                z12 = true;
            }
            aVarB.a(z12);
        }
        Iterator<View> it = iVar.f81689c.getItems().iterator();
        while (it.hasNext()) {
            Object tag = it.next().getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.f81211e);
            if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                sg.bigo.ads.ad.interstitial.multi_img.view.d dVar6 = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                sg.bigo.ads.ad.b.a.a(dVar6.f81217j, 5);
                ViewGroup viewGroup4 = iVar.f81698m;
                RoundedFrameLayout roundedFrameLayout = dVar6.f81217j;
                if (z15) {
                    sg.bigo.ads.ad.b.b bVar11 = iVar.f81697l;
                    if (z11) {
                        sg.bigo.ads.ad.b.a.a(viewGroup4, roundedFrameLayout, 8, bVar11, iVar.f81696k);
                    } else {
                        sg.bigo.ads.ad.b.a.a(viewGroup4, roundedFrameLayout, 8, bVar11, i17);
                    }
                } else {
                    sg.bigo.ads.ad.b.a.a(viewGroup4, roundedFrameLayout, 8, q.F, 0);
                }
            }
        }
        iVar.f();
        a(this.f81656l.f81702q);
        m mVar4 = this.f81605c;
        if (mVar4 != null) {
            int iA4 = mVar4.a("video_play_page.background_colour");
            TextView textView = (TextView) viewGroup.findViewById(R.id.bigo_ad_splash_title);
            if (textView != null) {
                this.f81656l.f81699n.b(textView);
            }
            if (1 == iA4) {
                this.f81656l.f81699n.a(-1);
                i iVar2 = this.f81656l;
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar4 = iVar2.f81700o;
                if (cVar4 != null) {
                    cVar4.a(false);
                }
                sg.bigo.ads.ad.interstitial.multi_img.view.c cVar5 = iVar2.f81701p;
                if (cVar5 != null) {
                    cVar5.a(false);
                }
                i iVar3 = this.f81656l;
                int iB = sg.bigo.ads.common.utils.q.b("#80202124", -7829368);
                Indicator indicator = iVar3.f81690d;
                if (indicator != null) {
                    indicator.setColorSelected(ViewCompat.MEASURED_STATE_MASK);
                    iVar3.f81690d.setColor(iB);
                }
            }
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.b, sg.bigo.ads.ad.splash.a.c
    public final void c() {
        super.c();
        i iVar = this.f81656l;
        if (iVar != null) {
            iVar.f81702q = null;
            this.f81656l = null;
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.b
    public final int e() {
        return R.layout.bigo_ad_splash_style_3_multi_img;
    }
}
