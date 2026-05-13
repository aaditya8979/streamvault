package sg.bigo.ads.ad.interstitial.c;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.webkit.ValueCallback;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.badge.BadgeDrawable;
import java.lang.ref.WeakReference;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.common.utils.b;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.common.view.RoundedImageView;
import sg.bigo.ads.common.w.b;

/* JADX INFO: loaded from: classes7.dex */
public class ab extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f80421o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewGroup f80422p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f80423q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f80424r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f80425s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f80426t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f80427u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View f80428v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private sg.bigo.ads.common.utils.n f80429w;

    public ab(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull sg.bigo.ads.api.a.m mVar, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, 0, mVar, cVar);
        this.f80425s = false;
        this.f80425s = 1 == mVar.a("endpage.ep_sprt", 0);
        this.f80421o = mVar.a("endpage.ad_component_layout");
    }

    public static void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int iA = sg.bigo.ads.common.utils.e.a(viewGroup.getContext(), 16);
            RoundedImageView roundedImageView = (RoundedImageView) viewGroup.findViewById(R.id.inter_icon);
            if (roundedImageView != null) {
                roundedImageView.setCornerRadius(iA);
            }
            float f10 = iA;
            viewGroup.setBackground(sg.bigo.ads.common.utils.d.a(f10, f10, f10, f10, (Rect) null, -1));
            sg.bigo.ads.ad.interstitial.b.f80348a.b(viewGroup);
        }
    }

    public static /* synthetic */ void a(ab abVar) {
        sg.bigo.ads.api.a.m mVar;
        String str;
        sg.bigo.ads.api.a.m mVar2;
        String str2;
        if (abVar.k() || (abVar instanceof ac)) {
            mVar = abVar.f81467g;
            str = "multi_ads_endpage.guide_click";
        } else {
            mVar = abVar.f81467g;
            str = "endpage.guide_click";
        }
        final int iA = mVar.a(str);
        if (iA > 0) {
            if (abVar.k() || (abVar instanceof ac)) {
                mVar2 = abVar.f81467g;
                str2 = "multi_ads_endpage.guide_click_timing";
            } else {
                mVar2 = abVar.f81467g;
                str2 = "endpage.guide_click_timing";
            }
            int iA2 = mVar2.a(str2, 0);
            final ViewGroup viewGroupN = abVar.n();
            ViewGroup viewGroup = abVar.f80422p;
            int i10 = R.id.inter_btn_cta_layout;
            final ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(i10);
            ViewGroup viewGroup3 = null;
            if (viewGroupN != null) {
                viewGroup3 = (ViewGroup) viewGroupN.findViewById(i10);
                viewGroupN.setClipChildren(false);
            }
            final ViewGroup viewGroup4 = viewGroup3;
            if (viewGroup2 != null) {
                abVar.f80422p.setClipChildren(false);
                viewGroup2.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.ab.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) ab.this.f81466f)) {
                            return;
                        }
                        int i11 = iA;
                        if (1 == i11) {
                            sg.bigo.ads.ad.interstitial.c.e(viewGroup2);
                            ViewGroup viewGroup5 = viewGroup4;
                            if (viewGroup5 != null) {
                                sg.bigo.ads.ad.interstitial.c.e(viewGroup5);
                                return;
                            }
                            return;
                        }
                        if (2 == i11) {
                            ab abVar2 = ab.this;
                            ab.a(abVar2, abVar2.f80422p);
                            ViewGroup viewGroup6 = viewGroupN;
                            if (viewGroup6 != null) {
                                ab.a(ab.this, viewGroup6);
                            }
                        }
                    }
                }, ((long) iA2) * 1000);
            }
        }
    }

    public static /* synthetic */ void a(ab abVar, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) new WeakReference(viewGroup).get();
        if (viewGroup2 != null) {
            View viewA = sg.bigo.ads.common.utils.a.a(viewGroup2.getContext(), R.layout.bigo_ad_endpage_cta_click_guide, viewGroup2, false);
            if (viewA != null) {
                viewGroup2.addView(viewA);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewA.getLayoutParams();
                layoutParams.gravity = BadgeDrawable.BOTTOM_END;
                layoutParams.bottomMargin = -sg.bigo.ads.common.utils.e.a(viewGroup2.getContext(), 30);
                viewA.setLayoutParams(layoutParams);
                final View viewFindViewById = viewA.findViewById(R.id.click_gesture);
                final View viewFindViewById2 = viewA.findViewById(R.id.click_ripple);
                final RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 10.0f, 1, 0.5f, 1, 0.6f);
                rotateAnimation.setDuration(200L);
                rotateAnimation.setStartOffset(560L);
                rotateAnimation.setFillAfter(true);
                final RotateAnimation rotateAnimation2 = new RotateAnimation(10.0f, 0.0f, 1, 0.5f, 1, 0.6f);
                rotateAnimation2.setDuration(240L);
                rotateAnimation2.setFillAfter(true);
                final AnimationSet animationSet = new AnimationSet(false);
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 5.0f, 1.0f, 5.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(400L);
                scaleAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(2));
                scaleAnimation.setFillAfter(true);
                animationSet.addAnimation(scaleAnimation);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(400L);
                scaleAnimation.setInterpolator(sg.bigo.ads.common.utils.b.a(2));
                alphaAnimation.setFillAfter(true);
                animationSet.addAnimation(alphaAnimation);
                alphaAnimation.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.interstitial.c.ab.5
                    @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        viewFindViewById2.setVisibility(4);
                    }
                });
                rotateAnimation.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.interstitial.c.ab.6
                    @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        viewFindViewById.startAnimation(rotateAnimation2);
                    }
                });
                rotateAnimation2.setAnimationListener(new b.d() { // from class: sg.bigo.ads.ad.interstitial.c.ab.7
                    @Override // sg.bigo.ads.common.utils.b.d, android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        viewFindViewById.startAnimation(rotateAnimation);
                        viewFindViewById2.setVisibility(0);
                        viewFindViewById2.startAnimation(animationSet);
                    }
                });
                viewFindViewById.startAnimation(rotateAnimation);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    @Override // sg.bigo.ads.ad.interstitial.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View a(@androidx.annotation.NonNull sg.bigo.ads.ad.interstitial.q r3, @androidx.annotation.NonNull android.view.ViewGroup r4, int r5) {
        /*
            r2 = this;
            if (r3 == 0) goto L3b
            if (r4 != 0) goto L5
            goto L3b
        L5:
            r2.f80414j = r4
            boolean r0 = r3 instanceof sg.bigo.ads.ad.interstitial.g.b
            if (r0 == 0) goto L15
            r0 = r3
            sg.bigo.ads.ad.interstitial.g.b r0 = (sg.bigo.ads.ad.interstitial.g.b) r0
            android.view.View r0 = r0.g_()
        L12:
            r2.f80428v = r0
            goto L21
        L15:
            boolean r0 = r3 instanceof sg.bigo.ads.ad.interstitial.g.a
            if (r0 == 0) goto L21
            r0 = r3
            sg.bigo.ads.ad.interstitial.g.a r0 = (sg.bigo.ads.ad.interstitial.g.a) r0
            android.view.View r0 = r0.c()
            goto L12
        L21:
            android.view.View r0 = r2.f80428v
            if (r0 == 0) goto L36
            android.view.ViewGroup r4 = r2.f80414j
            android.view.ViewGroup$LayoutParams r5 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r5.<init>(r1, r1)
            r4.addView(r0, r5)
            r2.d(r3)
            android.view.View r3 = r2.f80428v
            return r3
        L36:
            android.view.View r3 = super.a(r3, r4, r5)
            return r3
        L3b:
            android.view.ViewGroup r3 = r2.f80414j
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.c.ab.a(sg.bigo.ads.ad.interstitial.q, android.view.ViewGroup, int):android.view.View");
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void a(double d10) {
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void a(int i10, boolean z10, boolean z11) {
        this.f80423q = z10;
        this.f80424r = i10;
        this.f80415k.setTag(34);
        ViewGroup viewGroup = this.f80414j;
        if (z11) {
            sg.bigo.ads.ad.b.a.a(viewGroup, this.f80415k, l(), m(), this.f80424r);
        } else {
            sg.bigo.ads.ad.b.a.a(viewGroup, this.f80415k, l(), sg.bigo.ads.ad.interstitial.q.F, 0);
        }
        o();
        String str = (k() || (this instanceof ac)) ? "multi_ads_endpage.ad_component_clickable_switch" : "endpage.ad_component_clickable_switch";
        sg.bigo.ads.api.a.m mVar = this.f81467g;
        a(mVar == null || mVar.a(str) == 1);
    }

    public final void a(Button button, sg.bigo.ads.ad.interstitial.q qVar) {
        sg.bigo.ads.api.a.m mVar;
        String str;
        if (button == null || qVar == null) {
            return;
        }
        int iIntValue = -16736769;
        if ((this instanceof w) || (this instanceof ac)) {
            mVar = this.f81467g;
            str = "multi_ads_endpage.cta_color";
        } else {
            mVar = this.f81467g;
            str = "endpage.cta_color";
        }
        int iA = mVar.a(str);
        if (iA == 2) {
            iIntValue = -14972829;
        } else if (iA == 3) {
            sg.bigo.ads.ad.b.b bVarM = m();
            if (bVarM.I() != null) {
                iIntValue = bVarM.I().intValue();
            }
        }
        sg.bigo.ads.ad.interstitial.d.a(button, iIntValue, new b.a() { // from class: sg.bigo.ads.ad.interstitial.c.ab.1
            @Override // sg.bigo.ads.common.w.b.a
            public final void b(int i10) {
                ab.a(ab.this);
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public void a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, int i10) {
        super.a(qVar, i10);
        a((Button) this.f80422p.findViewById(R.id.inter_btn_cta), qVar);
    }

    public final void a(sg.bigo.ads.ad.interstitial.q qVar, final ViewGroup viewGroup, sg.bigo.ads.ad.b.b bVar) {
        a(true, false);
        if (viewGroup == null || qVar == null || bVar == null) {
            return;
        }
        final int iA = sg.bigo.ads.common.utils.e.a(viewGroup.getContext(), 16);
        final RoundedImageView roundedImageView = new RoundedImageView(viewGroup.getContext());
        roundedImageView.setCornerRadius(iA);
        final int iA2 = roundedImageView.getContext().getResources().getDisplayMetrics().widthPixels - sg.bigo.ads.common.utils.e.a(roundedImageView.getContext(), p());
        final int iA3 = sg.bigo.ads.common.utils.e.a(roundedImageView.getContext(), q());
        roundedImageView.setLayoutParams(new FrameLayout.LayoutParams(iA2, iA3));
        roundedImageView.setTag(9);
        sg.bigo.ads.ad.interstitial.r.a(bVar, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.c.ab.4
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Bitmap bitmap) {
                final Bitmap bitmap2 = bitmap;
                if (bitmap2 == null || bitmap2.isRecycled()) {
                    return;
                }
                int width = bitmap2.getWidth();
                int height = bitmap2.getHeight();
                if (width < iA2 || height < iA3) {
                    roundedImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    sg.bigo.ads.common.utils.d.a(roundedImageView.getContext(), bitmap2, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.interstitial.c.ab.4.1
                        @Override // android.webkit.ValueCallback
                        public final /* synthetic */ void onReceiveValue(Bitmap bitmap3) {
                            RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(viewGroup.getContext());
                            roundedFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, iA3));
                            roundedFrameLayout.setCornerRadius(iA);
                            sg.bigo.ads.common.utils.u.a(roundedFrameLayout, viewGroup, null, -1);
                            RoundedImageView roundedImageView2 = new RoundedImageView(viewGroup.getContext());
                            roundedImageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, iA3));
                            roundedImageView2.setImageBitmap(bitmap3);
                            roundedImageView2.setCornerRadius(iA);
                            roundedImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            roundedImageView2.setTag(9);
                            sg.bigo.ads.common.utils.u.a(roundedImageView2, roundedFrameLayout, null, -1);
                            int iA4 = sg.bigo.ads.common.utils.e.a(viewGroup.getContext(), 10);
                            roundedImageView.setImageBitmap(bitmap2);
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) roundedImageView.getLayoutParams();
                            layoutParams.width = -2;
                            layoutParams.height = -2;
                            layoutParams.gravity = 17;
                            layoutParams.setMargins(iA4, iA4, iA4, iA4);
                            roundedImageView.setLayoutParams(layoutParams);
                            sg.bigo.ads.common.utils.u.a(roundedImageView, roundedFrameLayout, null, -1);
                            ab.this.o();
                        }
                    });
                } else {
                    roundedImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    sg.bigo.ads.common.utils.u.a(roundedImageView, viewGroup, null, -1);
                    roundedImageView.setImageBitmap(bitmap2);
                    ab.this.o();
                }
            }
        });
    }

    public void a(boolean z10) {
        if (this.f80427u) {
            return;
        }
        this.f80427u = true;
        if (z10) {
            sg.bigo.ads.ad.b.a.a(this.f80414j, this.f80422p, l(), m(), this.f80424r);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f80414j, this.f80422p, l(), sg.bigo.ads.ad.interstitial.q.F, 0);
        }
    }

    public void a(boolean z10, boolean z11) {
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public boolean a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, @NonNull ViewGroup viewGroup, @NonNull View view, t.a aVar, int i10, int i11, int i12, @Nullable View... viewArr) {
        if (!this.f80425s) {
            return super.a(qVar, viewGroup, view, aVar, i10, i11, i12, viewArr);
        }
        View view2 = this.f80422p;
        if (view2 == null) {
            view2 = this.f80428v;
        }
        return super.a(this.f81466f, qVar, viewGroup, view2, aVar, i10, l(), i12, viewArr);
    }

    @Override // sg.bigo.ads.ad.interstitial.e
    public final void b() {
        super.b();
        sg.bigo.ads.common.utils.n nVar = this.f80429w;
        if (nVar == null || !nVar.e()) {
            return;
        }
        this.f80429w.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.e
    public final void c() {
        super.c();
        sg.bigo.ads.common.utils.n nVar = this.f80429w;
        if (nVar == null || nVar.e()) {
            return;
        }
        this.f80429w.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Type inference failed for: r1v8, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.ad.interstitial.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(final sg.bigo.ads.ad.interstitial.q r14) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.c.ab.d(sg.bigo.ads.ad.interstitial.q):void");
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public int h() {
        return R.layout.bigo_ad_activity_interstitial_multi_single_end;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void i() {
        AdOptionsView adOptionsView;
        if (m() == null || this.f80415k == null) {
            return;
        }
        String strI = ((sg.bigo.ads.core.a.a) m().f()).i();
        TextView textView = (TextView) this.f80415k.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) this.f80415k.findViewById(R.id.inter_ad_label);
        if (textView != null && textView2 != null) {
            textView.setVisibility(8);
            if (!TextUtils.isEmpty(strI)) {
                textView2.setText(sg.bigo.ads.common.utils.a.a(textView2.getContext(), R.string.bigo_ad_tag, new Object[0]) + " · " + strI);
            }
        }
        TextView textView3 = this.f80416l;
        if (textView3 != null) {
            textView3.setText(m().getWarning());
        }
        ViewGroup viewGroup = this.f80415k;
        if (viewGroup == null || (adOptionsView = (AdOptionsView) viewGroup.findViewById(R.id.inter_options)) == 0) {
            return;
        }
        adOptionsView.setTag(4);
        adOptionsView.a((sg.bigo.ads.api.core.b) m().f(), ((sg.bigo.ads.core.a.a) m().f()).l());
    }

    public int l() {
        return this.f80425s ? 14 : 4;
    }

    public sg.bigo.ads.ad.b.b m() {
        return this.f81466f;
    }

    public ViewGroup n() {
        return null;
    }

    public void o() {
        if (this.f80426t) {
            return;
        }
        View viewFindViewWithTag = this.f80422p.findViewWithTag(9);
        if (this.f80423q && viewFindViewWithTag != null) {
            this.f80426t = true;
            sg.bigo.ads.ad.b.a.a(this.f80414j, viewFindViewWithTag, l(), m(), this.f80424r);
        } else if (viewFindViewWithTag != null) {
            this.f80426t = true;
            sg.bigo.ads.ad.b.a.a(this.f80414j, viewFindViewWithTag, l(), sg.bigo.ads.ad.interstitial.q.F, this.f80424r);
        }
    }

    public int p() {
        return 40;
    }

    public int q() {
        return 142;
    }
}
