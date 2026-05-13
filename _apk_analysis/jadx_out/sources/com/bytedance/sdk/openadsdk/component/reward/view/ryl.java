package com.bytedance.sdk.openadsdk.component.reward.view;

import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.ouw.jg;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.ey;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.tlj.yu;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.utils.zin;
import com.bytedance.sdk.openadsdk.yu.lh;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public class ryl {
    public View bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public ImageView f13355cf;
    public final String fkw;

    @Nullable
    private com.bytedance.sdk.openadsdk.core.widget.cf jqy;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public ImageView f13358le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw f13359lh;
    public jg mwh;
    public View pno;
    private int qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public FrameLayout f13360ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public th f13361rn;
    public RelativeLayout ryl;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private final boolean f13362th;
    public PAGLogoView tlj;
    private fkw vpp;
    public final Activity vt;
    public final vpp yu;
    public com.bytedance.sdk.openadsdk.core.le.le zih;
    private boolean zin;
    public int ouw = 3;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public int f13356jg = 0;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public final AtomicBoolean f13357ko = new AtomicBoolean(false);

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public Runnable f13363vm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ryl.2
        @Override // java.lang.Runnable
        public final void run() {
            ImageView imageView;
            View viewFindViewById;
            try {
                vpp vppVar = ryl.this.yu;
                if ((vppVar == null || !vppVar.lso()) && (imageView = ryl.this.f13358le) != null) {
                    int[] iArr = new int[2];
                    imageView.getLocationOnScreen(iArr);
                    com.bytedance.sdk.openadsdk.component.reward.ouw.ryl rylVar = ryl.this.f13359lh.uoy;
                    int i10 = iArr[0];
                    com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar = rylVar.f13312lh;
                    if (lhVar == null || lhVar.getITopLayout() == null || i10 == 0 || (viewFindViewById = rylVar.f13312lh.getITopLayout().findViewById(520093713)) == null || !(viewFindViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || viewFindViewById.getWidth() <= 0 || viewFindViewById.getVisibility() != 0) {
                        return;
                    }
                    int[] iArr2 = new int[2];
                    viewFindViewById.getLocationOnScreen(iArr2);
                    int width = i10 - (iArr2[0] + viewFindViewById.getWidth());
                    if (width < osn.ouw(rylVar.ouw, 16.0f)) {
                        ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).rightMargin += osn.ouw(rylVar.ouw, 16.0f) - width;
                        viewFindViewById.requestLayout();
                    }
                }
            } catch (Exception unused) {
            }
        }
    };

    public ryl(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.f13359lh = ouwVar;
        this.vt = ouwVar.jvy;
        this.yu = ouwVar.vt;
        this.fkw = ouwVar.fkw;
        this.f13362th = ouwVar.yu;
    }

    public boolean bly() {
        ImageView imageView = this.f13358le;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public View cf() {
        return this.vpp;
    }

    public void fkw() {
        int i10 = this.yu.mwe;
        this.ouw = i10;
        if (i10 == -200) {
            zih.yu();
            this.ouw = com.bytedance.sdk.openadsdk.core.settings.cf.qbp(String.valueOf(this.yu.fqk())).tlj;
        }
        if (this.ouw != -1 || ouw()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f13359lh.coz;
        if ((vtVar instanceof com.bytedance.sdk.openadsdk.component.reward.vt.yu) || (vtVar instanceof com.bytedance.sdk.openadsdk.component.reward.vt.lh)) {
            return;
        }
        vt(0);
    }

    public void fkw(int i10) {
        int i11 = this.ouw;
        if (i11 == -1 || i10 != i11 || this.f13357ko.get()) {
            return;
        }
        vt(0);
        this.f13357ko.set(true);
        pno();
    }

    public void jg() {
        com.bytedance.sdk.component.bly.le leVar;
        th thVar = this.f13361rn;
        if (thVar != null) {
            com.bytedance.sdk.openadsdk.yu.mwh mwhVar = thVar.f13731uq;
            if (mwhVar != null && (leVar = thVar.f13718ko) != null) {
                mwhVar.ouw(leVar);
            }
            Handler handler = thVar.ouw;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            ValueAnimator valueAnimator = thVar.myk;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                thVar.myk.cancel();
            }
            ValueAnimator valueAnimator2 = thVar.f13712bs;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
                thVar.f13712bs.cancel();
            }
            ObjectAnimator objectAnimator = thVar.fak;
            if (objectAnimator != null) {
                objectAnimator.removeAllUpdateListeners();
                thVar.fak.cancel();
            }
            com.bytedance.sdk.openadsdk.common.mwh mwhVar2 = thVar.zih;
            if (mwhVar2 != null) {
                mwhVar2.vt();
            }
            ObjectAnimator objectAnimator2 = thVar.fvf;
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            com.bytedance.sdk.component.bly.le leVar2 = thVar.f13718ko;
            if (leVar2 != null) {
                ey.ouw(leVar2.getWebView());
            }
            thVar.f13718ko = null;
            bs bsVar = thVar.f13716jg;
            if (bsVar != null) {
                bsVar.lh();
            }
            com.bytedance.sdk.openadsdk.yu.mwh mwhVar3 = thVar.f13731uq;
            if (mwhVar3 != null) {
                mwhVar3.ouw(true);
            }
            if (!TextUtils.isEmpty(thVar.jvy) && thVar.f13724pd) {
                lh.ouw.ouw(thVar.ux, thVar.hun, thVar.jqy);
            }
            com.bytedance.sdk.openadsdk.ra.vt.ouw();
            com.bytedance.sdk.openadsdk.ra.vt.ouw(thVar.fqk);
        }
        ImageView imageView = this.f13358le;
        if (imageView != null) {
            imageView.removeCallbacks(this.f13363vm);
        }
    }

    public void ko() {
        th thVar = this.f13361rn;
        if (thVar != null) {
            bs bsVar = thVar.f13716jg;
            if (bsVar != null) {
                bsVar.vt();
            }
            com.bytedance.sdk.openadsdk.yu.mwh mwhVar = thVar.f13731uq;
            if (mwhVar != null) {
                mwhVar.fkw();
            }
        }
    }

    public FrameLayout le() {
        return this.f13360ra;
    }

    public void le(int i10) {
        osn.ouw((View) this.f13358le, i10);
    }

    public void lh() {
        this.f13360ra.removeAllViews();
    }

    public final void lh(int i10) {
        vpp vppVar = this.yu;
        if (vppVar != null && vppVar.an() && od.lh(this.yu)) {
            osn.ouw((View) this.jqy, i10);
        }
    }

    public void mwh() {
        try {
            Activity activity = this.f13359lh.jvy;
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(activity, com.bytedance.sdk.component.utils.vpp.pno(activity, "tt_fade_out"));
            if (animationLoadAnimation == null) {
                this.f13359lh.ey.ryl();
            } else {
                animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ryl.3
                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationEnd(Animation animation) {
                        ryl.this.f13359lh.ey.ryl();
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                    }
                });
                this.f13359lh.ey.ouw(animationLoadAnimation);
            }
        } catch (Throwable unused) {
            this.f13359lh.ey.ryl();
        }
    }

    public void ouw(float f10) {
        osn.ouw(this.f13358le, f10);
    }

    public void ouw(int i10) {
        if (this.zih == null) {
            this.zih = new com.bytedance.sdk.openadsdk.core.le.le(this.f13359lh.jvy);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
            layoutParams.gravity = 17;
            this.zih.setLayoutParams(layoutParams);
            this.zih.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.cf.ouw(this.f13359lh.jvy, "tt_video_loading_progress_bar"));
            this.f13359lh.ey.le().addView(this.zih);
        }
        this.zih.setVisibility(i10);
    }

    public void ouw(int i10, int i11) {
        FrameLayout frameLayout;
        if (this.yu.zih() == 1 && (frameLayout = this.f13360ra) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int iYu = osn.yu((Context) this.vt);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f13360ra.getLayoutParams();
            layoutParams.width = iYu;
            int i12 = (iYu * 9) / 16;
            layoutParams.height = i12;
            this.f13360ra.setLayoutParams(layoutParams);
            this.f13356jg = (osn.le(this.vt) - i12) / 2;
            ko.fkw("TTAD.RFullVideoLayout", "NonContentAreaHeight:" + this.f13356jg);
        }
    }

    public void ouw(View.OnClickListener onClickListener) {
        osn.ouw(this.f13360ra, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public void ouw(Animation animation) {
        RelativeLayout relativeLayout = this.ryl;
        if (relativeLayout != null) {
            relativeLayout.startAnimation(animation);
        }
    }

    public void ouw(com.bytedance.sdk.openadsdk.core.lh.lh lhVar, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        View view;
        View view2;
        vpp vppVar;
        com.bytedance.sdk.openadsdk.core.model.tlj tljVar;
        if (this.f13360ra != null && (vppVar = this.yu) != null && (tljVar = vppVar.f13777ms) != null) {
            if (!tljVar.f13741le || th.vt(vppVar)) {
                ouw(onClickListener);
            } else {
                ouw(lhVar);
                osn.ouw((View) this.f13360ra, (View.OnTouchListener) lhVar, "TTBaseVideoActivity#mVideoNativeFrame");
            }
        }
        vpp vppVar2 = this.yu;
        if (vppVar2 != null && vppVar2.zih() == 1) {
            if (this.yu.f13777ms != null && (view2 = this.pno) != null) {
                osn.ouw(view2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.pno.getLayoutParams();
                layoutParams.height = this.f13356jg;
                this.pno.setLayoutParams(layoutParams);
                if (this.yu.f13777ms.vt) {
                    this.pno.setOnClickListener(lhVar);
                    this.pno.setOnTouchListener(onTouchListener);
                } else {
                    this.pno.setOnClickListener(onClickListener);
                }
            }
            if (this.yu.f13777ms != null && (view = this.bly) != null) {
                osn.ouw(view, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.bly.getLayoutParams();
                layoutParams2.height = this.f13356jg;
                this.bly.setLayoutParams(layoutParams2);
                if (this.yu.f13777ms.yu) {
                    this.bly.setOnClickListener(lhVar);
                    this.bly.setOnTouchListener(onTouchListener);
                } else {
                    this.bly.setOnClickListener(onClickListener);
                }
            }
        }
        PAGLogoView pAGLogoView = this.tlj;
        if (pAGLogoView != null) {
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ryl.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/component/reward/view/ryl$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f53147u, view3);
                    safedk_ryl$1_onClick_107f2c1c99e7172cc741470b13da0101(view3);
                }

                public void safedk_ryl$1_onClick_107f2c1c99e7172cc741470b13da0101(View view3) {
                    ko.lh("mAdLogo", "mAdLogo,,,,,,,onClick,,,,,");
                    try {
                        ryl rylVar = ryl.this;
                        TTWebsiteActivity.ouw(rylVar.vt, rylVar.yu, rylVar.fkw);
                    } catch (Throwable th2) {
                        qbp.lh("TTAD.RFullVideoLayout", th2.getMessage());
                    }
                }
            });
        }
        ImageView imageView = this.f13355cf;
        if (imageView != null) {
            imageView.setClickable(true);
            com.bytedance.sdk.openadsdk.th.vt.ouw().ouw((int) osn.ouw(zih.ouw(), 14.0f, true), this.f13355cf, this.f13359lh.vt);
        }
    }

    public void ouw(boolean z10) {
        int i10 = 8;
        osn.ouw((View) this.tlj, od.lh(this.yu) ? 8 : 0);
        ImageView imageView = this.f13355cf;
        if (this.yu.cd() && this.yu.le()) {
            i10 = 0;
        }
        osn.ouw((View) imageView, i10);
        vt(z10);
        if (this.f13362th) {
            fkw();
        }
    }

    public boolean ouw() {
        return true;
    }

    public void pno() {
        fkw fkwVar = this.vpp;
        if (fkwVar == null) {
            return;
        }
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.65f, 1.0f);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.765f, 0.9f);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(0.88f, 1.0f);
        Keyframe keyframeOfFloat5 = Keyframe.ofFloat(0.95f, 0.95f);
        Keyframe keyframeOfFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(fkwVar, PropertyValuesHolder.ofKeyframe("scaleX", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6), PropertyValuesHolder.ofKeyframe("scaleY", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6));
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.start();
    }

    public void ra() {
        if (this.f13355cf.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f13355cf.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 11, 16);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(11);
            this.f13355cf.setLayoutParams(marginLayoutParams);
        }
    }

    public void rn() {
        com.bytedance.sdk.openadsdk.yu.mwh mwhVar;
        th thVar = this.f13361rn;
        if (thVar == null || (mwhVar = thVar.f13731uq) == null) {
            return;
        }
        mwhVar.le();
    }

    public void ryl() {
        AnimatorSet animatorSet;
        try {
            jg jgVar = this.mwh;
            if (jgVar != null && (animatorSet = jgVar.f13232le) != null) {
                animatorSet.cancel();
            }
            RelativeLayout relativeLayout = this.ryl;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout2 = this.ryl;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(0.0f);
            }
        }
    }

    public View tlj() {
        return this.f13358le;
    }

    public void vt() {
        View view;
        com.bytedance.sdk.openadsdk.common.ryl loadingStyle;
        List<com.bytedance.sdk.openadsdk.core.model.zih> list;
        com.bytedance.sdk.openadsdk.common.mwh mwhVar;
        com.bytedance.sdk.openadsdk.core.model.qbp qbpVar;
        com.bytedance.sdk.openadsdk.core.widget.ra raVar;
        if (this.zin) {
            return;
        }
        this.zin = true;
        this.qbp = this.f13359lh.ucs;
        if (ouw()) {
            jg jgVar = new jg(this.f13359lh);
            this.mwh = jgVar;
            try {
                if (!od.lh(jgVar.ouw)) {
                    com.bytedance.sdk.openadsdk.core.widget.ra raVar2 = new com.bytedance.sdk.openadsdk.core.widget.ra(jgVar.vt);
                    jgVar.fkw = raVar2;
                    jgVar.yu = raVar2.getLoadingProgressBar();
                    com.bytedance.sdk.openadsdk.core.le.pno downloadButton = jgVar.fkw.getDownloadButton();
                    if (downloadButton != null) {
                        downloadButton.setOnClickListener(jgVar.f13233lh.f13258cd.f13313lh);
                    }
                    jgVar.fkw.ouw(jgVar.ouw);
                }
            } catch (Throwable unused) {
            }
        }
        fkw fkwVar = (fkw) this.f13359lh.rrs.findViewById(rn.ryl);
        this.vpp = fkwVar;
        fkwVar.ouw(this.f13359lh);
        com.bytedance.sdk.openadsdk.core.widget.cf cfVar = (com.bytedance.sdk.openadsdk.core.widget.cf) this.f13359lh.rrs.findViewById(rn.npr);
        this.jqy = cfVar;
        if (cfVar != null) {
            com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f13359lh;
            vpp vppVar = ouwVar.vt;
            String str = ouwVar.fkw;
            cfVar.ouw = vppVar;
            cfVar.vt = str;
            cfVar.f14031lh = null;
        }
        this.tlj = (PAGLogoView) this.f13359lh.rrs.findViewById(520093757);
        this.f13355cf = (ImageView) this.f13359lh.rrs.findViewById(rn.f14354lk);
        this.f13358le = (ImageView) this.f13359lh.rrs.findViewById(520093708);
        this.f13360ra = (FrameLayout) this.f13359lh.rrs.findViewById(rn.f14339cf);
        this.pno = this.f13359lh.rrs.findViewById(rn.f14366rn);
        this.bly = this.f13359lh.rrs.findViewById(rn.f14380xn);
        RelativeLayout relativeLayout = (RelativeLayout) this.f13359lh.rrs.findViewById(rn.f14372uj);
        this.ryl = relativeLayout;
        jg jgVar2 = this.mwh;
        if (jgVar2 != null && (raVar = jgVar2.fkw) != null && relativeLayout != null) {
            relativeLayout.addView(raVar, new LinearLayout.LayoutParams(-1, -1));
            final jg jgVar3 = this.mwh;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, 80);
            valueAnimatorOfInt.setDuration(2000L);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.jg.1
                public AnonymousClass1() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    com.bytedance.sdk.openadsdk.core.widget.pno pnoVar = jg.this.yu;
                    if (pnoVar != null) {
                        pnoVar.setProgress(iIntValue);
                    }
                }
            });
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(81, 99);
            valueAnimatorOfInt2.setDuration(3000L);
            valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.jg.2
                public AnonymousClass2() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    com.bytedance.sdk.openadsdk.core.widget.pno pnoVar = jg.this.yu;
                    if (pnoVar != null) {
                        pnoVar.setProgress(iIntValue);
                    }
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            jgVar3.f13232le = animatorSet;
            animatorSet.play(valueAnimatorOfInt).before(valueAnimatorOfInt2);
            jgVar3.f13232le.start();
        }
        Activity activity = this.vt;
        vpp vppVar2 = this.yu;
        String str2 = this.fkw;
        FrameLayout frameLayout = this.f13360ra;
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar2 = this.f13359lh;
        final th thVar = new th(activity, vppVar2, str2, frameLayout, ouwVar2.fqk, ouwVar2.rrs);
        this.f13361rn = thVar;
        Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime());
        com.bytedance.sdk.component.bly.le leVar = (com.bytedance.sdk.component.bly.le) thVar.jae.findViewById(rn.qbp);
        thVar.f13718ko = leVar;
        if (leVar == null || vpp.ouw(thVar.jqy)) {
            osn.ouw((View) thVar.f13718ko, 8);
        } else {
            com.bytedance.sdk.component.bly.le leVar2 = thVar.f13718ko;
            if (!leVar2.f12494lh) {
                leVar2.o_();
            }
        }
        thVar.f13726rn = (FrameLayout) thVar.jae.findViewById(rn.f14370th);
        thVar.zih = (com.bytedance.sdk.openadsdk.common.mwh) thVar.jae.findViewById(rn.ex);
        thVar.f13733vm = thVar.jae.findViewById(rn.zin);
        thVar.f13729th = (ImageView) thVar.jae.findViewById(rn.vpp);
        thVar.qbp = thVar.jae.findViewById(rn.fvf);
        thVar.f13720lh = (FrameLayout) thVar.jae.findViewById(rn.zih);
        thVar.vt = (ImageView) thVar.jae.findViewById(rn.f14377vm);
        thVar.f13725ra = (RelativeLayout) thVar.jae.findViewById(rn.jqy);
        thVar.yu = (TextView) thVar.jae.findViewById(rn.nit);
        thVar.fkw = (FrameLayout) thVar.jae.findViewById(rn.tlj);
        View viewFindViewById = thVar.jae.findViewById(rn.f14369tc);
        thVar.pno = viewFindViewById;
        if (viewFindViewById == null) {
            thVar.pno = thVar.jae.findViewById(rn.fak);
        }
        thVar.bly = thVar.vpp.findViewById(rn.ksc);
        thVar.tlj = (TextView) thVar.jae.findViewById(rn.f14361od);
        thVar.f13714cf = (TextView) thVar.jae.findViewById(rn.f14338cd);
        thVar.ryl = (com.bytedance.sdk.openadsdk.core.widget.zih) thVar.jae.findViewById(rn.jae);
        thVar.mwh = (TextView) thVar.jae.findViewById(rn.f14373uq);
        TextView textView = thVar.yu;
        if (textView != null && (qbpVar = thVar.jqy.f13770kq) != null) {
            textView.setText(qbpVar.fkw);
        }
        thVar.f13719le = thVar.jae.findViewById(rn.f14362pd);
        thVar.f13734wp = (com.bytedance.sdk.openadsdk.core.le.yu) thVar.jae.findViewById(rn.vby);
        if ((th.yu(thVar.jqy) || th.vt(thVar.jqy) || th.ra(thVar.jqy) || th.lh(thVar.jqy)) && thVar.jqy.f13770kq != null) {
            View view2 = thVar.f13719le;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            com.bytedance.sdk.openadsdk.core.jg.lh().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.th.11
                @Override // java.lang.Runnable
                public final void run() {
                    if (th.this.f13722ng.get()) {
                        return;
                    }
                    th thVar2 = th.this;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(thVar2.jqy, thVar2.f13728tc, System.currentTimeMillis() - th.this.zin, false);
                    th.le(th.this);
                }
            }, (th.ra(thVar.jqy) ? thVar.jqy.f13770kq.f13708lh : thVar.jqy.f13770kq.ouw) * 1000);
        }
        com.bytedance.sdk.component.bly.le leVar3 = thVar.f13718ko;
        if (leVar3 != null && leVar3.getWebView() != null) {
            com.bytedance.sdk.openadsdk.core.widget.ouw.lh lhVarOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(zih.ouw());
            lhVarOuw.vt = false;
            lhVarOuw.ouw = false;
            lhVarOuw.ouw(thVar.f13718ko.getWebView());
            com.bytedance.sdk.component.bly.le leVar4 = thVar.f13718ko;
            if (leVar4 != null && leVar4.getWebView() != null) {
                thVar.zvq = new th.vt(thVar.f13730ub, thVar.jqy, thVar.f13728tc, thVar);
                com.bytedance.sdk.component.bly.le leVar5 = thVar.f13718ko;
                if (leVar5.f12494lh && (leVar5.getWebViewClient() instanceof com.bytedance.sdk.openadsdk.core.widget.ouw.fkw)) {
                    com.bytedance.sdk.openadsdk.yu.mwh mwhVarVt = ((com.bytedance.sdk.openadsdk.core.widget.ouw.fkw) thVar.f13718ko.getWebViewClient()).vt();
                    thVar.f13731uq = mwhVarVt;
                    if (mwhVarVt != null) {
                        mwhVarVt.f14482uq = thVar.zvq;
                        mwhVarVt.jae = true;
                    }
                } else {
                    com.bytedance.sdk.openadsdk.yu.mwh mwhVar2 = new com.bytedance.sdk.openadsdk.yu.mwh(thVar.jqy, thVar.f13718ko.getWebView(), thVar.zvq, thVar.f13715cj);
                    mwhVar2.jae = true;
                    thVar.f13731uq = mwhVar2;
                }
                thVar.f13731uq.ouw(thVar.f13728tc);
                com.bytedance.sdk.openadsdk.common.fkw fkwVarOuw = uoy.ouw(thVar.jqy, thVar.f13718ko, thVar.vpp);
                thVar.pv = fkwVarOuw;
                if (fkwVarOuw != null) {
                    fkwVarOuw.ouw(thVar.f13728tc);
                }
                uoy.ouw(thVar.jqy, thVar.f13718ko);
            }
            bs bsVar = new bs(thVar.vpp);
            thVar.f13716jg = bsVar;
            bsVar.f13490uq = thVar.ksc;
            bs bsVarVt = bsVar.vt(thVar.f13718ko);
            bsVarVt.ryl = com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw(thVar.jqy);
            vpp vppVar3 = thVar.jqy;
            bsVarVt.f13482lh = vppVar3.pv;
            bsVarVt.fkw = vppVar3.yhj;
            bs bsVarOuw = bsVarVt.ouw(vppVar3);
            bsVarOuw.f13481le = th.ra(thVar.jqy) ? thVar.f13723od : -1;
            vpp vppVar4 = thVar.jqy;
            bsVarOuw.pno = vppVar4.f13799vi;
            bsVarOuw.ouw = thVar.f13728tc;
            bsVarOuw.f13485ra = vppVar4.hun();
            bsVarOuw.ouw(thVar.f13718ko).vt = new com.bytedance.sdk.openadsdk.core.widget.fkw() { // from class: com.bytedance.sdk.openadsdk.core.model.th.17
                @Override // com.bytedance.sdk.openadsdk.core.widget.fkw
                public final void ouw() {
                    if (th.ra(th.this.jqy) && (th.this.vpp instanceof com.bytedance.sdk.openadsdk.core.mwh.yu.vt)) {
                        ((com.bytedance.sdk.openadsdk.core.mwh.yu.vt) th.this.vpp).osn();
                    } else if (th.this.rrs != null) {
                        th.this.rrs.lh();
                    }
                }
            };
            com.bytedance.sdk.component.bly.le leVar6 = thVar.f13718ko;
            if (leVar6.f12494lh && leVar6 != null && leVar6.getWebView() != null) {
                thVar.hun = thVar.f13718ko.f12497ra;
                thVar.ux = thVar.f13718ko.pno;
                thVar.lso = thVar.f13718ko.bly;
                if (thVar.f13718ko.yu) {
                    thVar.ksc.zih();
                    thVar.zin = System.currentTimeMillis();
                }
                if (thVar.f13718ko.f12493le) {
                    thVar.ouw();
                }
                if (thVar.f13718ko.fkw) {
                    thVar.ouw();
                    int iOuw = uoy.ouw(thVar.f13718ko.getWebView());
                    th.vt vtVar = thVar.zvq;
                    if (vtVar != null) {
                        vtVar.ouw(iOuw == 1 ? 1 : 0);
                    }
                }
            }
            thVar.f13718ko.setLandingPage(true);
            thVar.f13718ko.setTag(thVar.f13728tc);
            thVar.f13718ko.setMaterialMeta(thVar.jqy.bs());
            final Context contextOuw = zih.ouw();
            final bs bsVar2 = thVar.f13716jg;
            final String str3 = thVar.jqy.pv;
            final com.bytedance.sdk.openadsdk.common.fkw fkwVar2 = thVar.pv;
            final com.bytedance.sdk.openadsdk.yu.mwh mwhVar3 = thVar.f13731uq;
            com.bytedance.sdk.openadsdk.core.widget.ouw.fkw fkwVar3 = new com.bytedance.sdk.openadsdk.core.widget.ouw.fkw(contextOuw, bsVar2, str3, fkwVar2, mwhVar3) { // from class: com.bytedance.sdk.openadsdk.core.model.th.12
                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                public void onLoadResource(WebView webView, String str4) {
                    super.onLoadResource(webView, str4);
                    CreativeInfoManager.onResourceLoaded(g.f53147u, webView, str4);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str4) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/model/th$12;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
                    CreativeInfoManager.onWebViewPageFinished(g.f53147u, webView, str4);
                    safedk_th$12_onPageFinished_85568e204478ea207dc9c4aa582adac5(webView, str4);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                public final void onPageStarted(WebView webView, String str4, Bitmap bitmap) {
                    super.onPageStarted(webView, str4, bitmap);
                    th.this.ksc.zih();
                    th.this.zin = System.currentTimeMillis();
                    if (!th.vt(th.this.jqy) || th.this.ouw == null || vpp.fkw(th.this.jqy)) {
                        return;
                    }
                    th.this.ouw.sendEmptyMessageDelayed(101, 2000L);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                public final void onReceivedError(WebView webView, int i10, String str4, String str5) {
                    super.onReceivedError(webView, i10, str4, str5);
                    boolean z10 = false;
                    com.bytedance.sdk.component.utils.ko.ouw("LandingPageModel", "onReceivedError errorCode:%d, description:%s, failingUrl:%s", Integer.valueOf(i10), str4, str5);
                    String strOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.fkw.ouw(str5);
                    if (this.f14037le != null) {
                        this.f14037le.ouw(i10, str4, str5, com.bytedance.sdk.openadsdk.core.widget.ouw.fkw.ouw(str5), (webView == null || str5 == null || !str5.equals(webView.getUrl())) ? false : true);
                    }
                    boolean z11 = strOuw != null && strOuw.startsWith("image");
                    if (strOuw != null && strOuw.startsWith("mp4")) {
                        z10 = true;
                    }
                    if (z11 || z10 || th.this.f13722ng.get()) {
                        return;
                    }
                    th.le(th.this);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    com.bytedance.sdk.component.utils.ko.ouw("LandingPageModel", "onReceivedSslError error:%s", sslError);
                    if (sslErrorHandler != null) {
                        th.le(th.this);
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                public void safedk_th$12_onPageFinished_85568e204478ea207dc9c4aa582adac5(WebView webView, String str4) {
                    super.onPageFinished(webView, str4);
                    th.this.ouw();
                }

                public WebResourceResponse safedk_th$12_shouldInterceptRequest_327422765243f203f042318f3a87b690(WebView webView, String str4) {
                    try {
                        if (TextUtils.isEmpty(th.this.jvy)) {
                            return super.shouldInterceptRequest(webView, str4);
                        }
                        th.ryl(th.this);
                        com.bytedance.sdk.openadsdk.ra.vt.ouw();
                        WebResourceResponseModel webResourceResponseModelOuw = com.bytedance.sdk.openadsdk.ra.vt.ouw(th.this.fqk, th.this.jvy, str4);
                        if (webResourceResponseModelOuw != null && webResourceResponseModelOuw.getWebResourceResponse() != null) {
                            th.jg(th.this);
                            com.bytedance.sdk.component.utils.ko.vt("LandingPageModel", "GeckoLog: hit++");
                            return webResourceResponseModelOuw.getWebResourceResponse();
                        }
                        if (webResourceResponseModelOuw != null && webResourceResponseModelOuw.getMsg() == 2) {
                            th.ko(th.this);
                        }
                        return super.shouldInterceptRequest(webView, str4);
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.qbp.ouw("LandingPageModel", "shouldInterceptRequest url error", th2);
                        return super.shouldInterceptRequest(webView, str4);
                    }
                }

                public boolean safedk_th$12_shouldOverrideUrlLoading_26098f7c70ce9d2e2bfa78d9958aa889(WebView webView, String str4) {
                    if (!th.lh(th.this.jqy) || uoy.ouw(webView) != 1) {
                        return super.shouldOverrideUrlLoading(webView, str4);
                    }
                    Intent intent = new Intent(th.this.vpp, (Class<?>) TTCeilingLandingPageActivity.class);
                    th.this.jqy.f13792th = str4;
                    intent.putExtra("meta_index", com.bytedance.sdk.openadsdk.core.od.ouw().ouw(th.this.jqy));
                    com.bytedance.sdk.component.utils.vt.ouw(this.yu, intent, null);
                    return true;
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    return CreativeInfoManager.onWebViewResponseWithHeaders(g.f53147u, webView, webResourceRequest, super.shouldInterceptRequest(webView, webResourceRequest));
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                public final WebResourceResponse shouldInterceptRequest(WebView webView, String str4) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/model/th$12;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                    return CreativeInfoManager.onWebViewResponse(g.f53147u, webView, str4, safedk_th$12_shouldInterceptRequest_327422765243f203f042318f3a87b690(webView, str4));
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView, String str4) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/model/th$12;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
                    boolean zSafedk_th$12_shouldOverrideUrlLoading_26098f7c70ce9d2e2bfa78d9958aa889 = safedk_th$12_shouldOverrideUrlLoading_26098f7c70ce9d2e2bfa78d9958aa889(webView, str4);
                    BrandSafetyUtils.onShouldOverrideUrlLoading(g.f53147u, webView, str4, zSafedk_th$12_shouldOverrideUrlLoading_26098f7c70ce9d2e2bfa78d9958aa889);
                    return zSafedk_th$12_shouldOverrideUrlLoading_26098f7c70ce9d2e2bfa78d9958aa889;
                }
            };
            thVar.rrs = fkwVar3;
            thVar.f13718ko.setWebViewClient(fkwVar3);
            com.bytedance.sdk.openadsdk.core.widget.ouw.fkw fkwVar4 = thVar.rrs;
            fkwVar4.f14036ko = thVar.jqy;
            fkwVar4.tlj = thVar.f13728tc;
            fkwVar4.mwh = thVar.ksc;
            com.bytedance.sdk.component.bly.le leVar7 = thVar.f13718ko;
            final bs bsVar3 = thVar.f13716jg;
            final com.bytedance.sdk.openadsdk.yu.mwh mwhVar4 = thVar.f13731uq;
            final com.bytedance.sdk.openadsdk.common.fkw fkwVar5 = thVar.pv;
            leVar7.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(bsVar3, mwhVar4, fkwVar5) { // from class: com.bytedance.sdk.openadsdk.core.model.th.13
                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.yu, android.webkit.WebChromeClient
                public final void onProgressChanged(WebView webView, int i10) {
                    super.onProgressChanged(webView, i10);
                    if (th.this.vpp != null && !th.this.vpp.isFinishing() && i10 == 100) {
                        th.this.ouw();
                    }
                    if (th.this.zih != null) {
                        th.this.zih.ouw(i10);
                    }
                }
            });
            if (thVar.f13713cd == null) {
                thVar.f13713cd = com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(zih.ouw(), thVar.f13728tc);
            }
            thVar.f13718ko.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.14
                @Override // android.webkit.DownloadListener
                public final void onDownloadStart(String str4, String str5, String str6, String str7, long j10) {
                    if (th.this.f13713cd != null) {
                        th.this.f13713cd.ouw(th.this.jqy);
                    }
                }
            });
            com.bytedance.sdk.component.bly.le leVar8 = thVar.f13718ko;
            leVar8.setUserAgentString(com.bytedance.sdk.openadsdk.utils.th.ouw(leVar8.getWebView()));
            thVar.f13718ko.setMixedContentMode(0);
            thVar.f13718ko.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.15
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view3, int i10, int i11, int i12, int i13) {
                    if (th.this.f13731uq != null) {
                        th.this.f13731uq.ouw(i11);
                    }
                }
            });
            thVar.f13718ko.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.16
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/model/th$16;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    CreativeInfoManager.onViewTouched(g.f53147u, view3, motionEvent);
                    return safedk_th$16_onTouch_7c343d47d0c6585c877b4a227e0a9d3f(view3, motionEvent);
                }

                public boolean safedk_th$16_onTouch_7c343d47d0c6585c877b4a227e0a9d3f(View view3, MotionEvent motionEvent) {
                    if (th.this.fkw()) {
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            th.this.f13727sd = motionEvent.getY();
                        } else if (action == 1) {
                            if (osn.ouw(th.this.f13727sd, motionEvent.getY(), th.this.vpp)) {
                                th.this.vt(5);
                            }
                        } else if (action == 2) {
                            motionEvent.setAction(3);
                        }
                    }
                    if (th.this.f13721mq && motionEvent.getAction() == 1 && th.this.ksc != null) {
                        th.ouw(th.this, new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.th.16.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.bytedance.sdk.component.utils.ko.vt("LandingPageModel", "onTouch event");
                                th.this.ksc.wp();
                            }
                        });
                    }
                    if ((!th.this.coz || th.tlj(th.this.jqy)) && !th.ra(th.this.jqy)) {
                        th.this.ey.onTouch(view3, motionEvent);
                    }
                    if ((!th.this.coz || th.tlj(th.this.jqy)) && !th.ra(th.this.jqy) && motionEvent.getAction() == 1 && th.this.ey.yu()) {
                        th.this.f13718ko.getWebView().performClick();
                        th.vpp(th.this);
                    }
                    if (th.this.f13731uq != null) {
                        th.this.f13731uq.ouw(motionEvent);
                    }
                    if (th.this.pv == null) {
                        return false;
                    }
                    th.this.pv.ouw(motionEvent);
                    return false;
                }
            });
            thVar.f13718ko.getWebView().setOnClickListener(thVar.ey);
            com.bytedance.sdk.openadsdk.yu.lh.ouw(thVar.jqy, thVar.f13728tc, thVar.f13715cj);
            if (!thVar.f13718ko.f12494lh) {
                qbp.ouw("LandingPageModel", "loadUrlWithRefer url  = " + thVar.jqy.osn);
                zin.ouw(thVar.f13718ko, thVar.jqy.osn);
            }
            thVar.f13724pd = true;
        }
        com.bytedance.sdk.component.bly.le leVar9 = thVar.f13718ko;
        if (leVar9 != null && (mwhVar = thVar.zih) != null && !leVar9.fkw) {
            mwhVar.ouw();
        }
        if (th.vt(thVar.jqy)) {
            if (thVar.vt()) {
                thVar.f13733vm.setVisibility(0);
                ObjectAnimator duration = ObjectAnimator.ofFloat(thVar.f13729th, "translationY", 16.0f, 0.0f).setDuration(500L);
                thVar.fvf = duration;
                duration.setRepeatMode(2);
                thVar.fvf.setRepeatCount(-1);
                thVar.fvf.start();
                thVar.f13733vm.setClickable(true);
                thVar.f13733vm.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.5
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/model/th$5;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        CreativeInfoManager.onViewTouched(g.f53147u, view3, motionEvent);
                        return safedk_th$5_onTouch_a627c8b62b6164f7c97f4e80fea06285(view3, motionEvent);
                    }

                    public boolean safedk_th$5_onTouch_a627c8b62b6164f7c97f4e80fea06285(View view3, MotionEvent motionEvent) {
                        if (!th.this.coz) {
                            th.this.ey.onTouch(view3, motionEvent);
                        }
                        if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                            return false;
                        }
                        th.this.f13712bs = ObjectAnimator.ofFloat(this, "timeSlide", 0.0f, 1.0f);
                        th.this.f13712bs.setDuration(200L);
                        th.this.f13712bs.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.5.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) th.this.f13726rn.getLayoutParams();
                                layoutParams.weight = (float) (((double) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f)) + 0.25d);
                                th thVar2 = th.this;
                                ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                thVar2.lh();
                                th.this.f13726rn.setLayoutParams(layoutParams);
                            }
                        });
                        if (th.this.ey.yu()) {
                            th.this.f13733vm.performClick();
                            th.vpp(th.this);
                        }
                        th.this.f13712bs.start();
                        th.this.f13733vm.setVisibility(8);
                        return true;
                    }
                });
                thVar.f13733vm.setOnClickListener(thVar.ey);
            }
            if (!vpp.fkw(thVar.jqy)) {
                thVar.ex.setVisibility(8);
                thVar.f13720lh.setVisibility(0);
                thVar.vt.setScaleType(ImageView.ScaleType.FIT_CENTER);
                thVar.vt.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/model/th$6;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(g.f53147u, view3);
                        safedk_th$6_onClick_1accceb21eb61a4e2d7d4565d209f549(view3);
                    }

                    public void safedk_th$6_onClick_1accceb21eb61a4e2d7d4565d209f549(View view3) {
                        th thVar2 = th.this;
                        com.bytedance.sdk.openadsdk.yu.lh.vt(thVar2.jqy, thVar2.f13728tc);
                    }
                });
                vpp vppVar5 = thVar.jqy;
                if (vppVar5 != null && (list = vppVar5.f13791tc) != null && list.size() > 0 && thVar.jqy.f13791tc.get(0) != null && !TextUtils.isEmpty(thVar.jqy.f13791tc.get(0).ouw)) {
                    com.bytedance.sdk.openadsdk.th.vt.ouw();
                    com.bytedance.sdk.openadsdk.th.vt.ouw(thVar.jqy.f13791tc.get(0), thVar.vt, thVar.jqy, new com.bytedance.sdk.component.fkw.rn() { // from class: com.bytedance.sdk.openadsdk.core.model.th.7
                        @Override // com.bytedance.sdk.component.fkw.rn
                        public final void ouw(int i10, String str4, @Nullable Throwable th2) {
                            if (th.this.ouw != null) {
                                th.this.ouw.removeMessages(101);
                            }
                            th.this.le();
                        }

                        @Override // com.bytedance.sdk.component.fkw.rn
                        public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar2) {
                            if (th.this.ouw != null) {
                                th.this.ouw.removeMessages(101);
                            }
                        }
                    });
                }
            }
            try {
                String str4 = thVar.jqy.f13791tc.get(0).ouw;
                yu.ouw.vt.ouw(str4).ouw(thVar.jqy.f13791tc.get(0).vt).vt(thVar.jqy.f13791tc.get(0).f13812lh).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw())).lh(1).ouw(new th.ouw()).vt(new com.bytedance.sdk.openadsdk.tlj.vt(thVar.jqy, str4, new com.bytedance.sdk.component.fkw.rn() { // from class: com.bytedance.sdk.openadsdk.core.model.th.8
                    @Override // com.bytedance.sdk.component.fkw.rn
                    public final void ouw(int i10, String str5, @Nullable Throwable th2) {
                    }

                    @Override // com.bytedance.sdk.component.fkw.rn
                    public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar2) {
                        try {
                            Object objVt = cfVar2.vt();
                            if (objVt != null && cfVar2.lh() != null) {
                                Drawable bitmapDrawable = null;
                                if (objVt instanceof Bitmap) {
                                    bitmapDrawable = new BitmapDrawable(com.bytedance.sdk.openadsdk.core.zih.ouw().getResources(), (Bitmap) objVt);
                                } else if (objVt instanceof Drawable) {
                                    if (Build.VERSION.SDK_INT >= 28 && (objVt instanceof AnimatedImageDrawable)) {
                                        ((AnimatedImageDrawable) objVt).start();
                                    }
                                    bitmapDrawable = (Drawable) objVt;
                                }
                                if (!th.uq(th.this)) {
                                    th.this.f13720lh.setBackground(bitmapDrawable);
                                    return;
                                }
                                th.this.fkw.setBackground(bitmapDrawable);
                                View viewRn = th.this.ksc.rn();
                                if (viewRn == null || !(viewRn.getParent() instanceof View)) {
                                    return;
                                }
                                ((View) viewRn.getParent()).setBackground(bitmapDrawable);
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }));
            } catch (Exception unused2) {
            }
            if (!thVar.vt()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) thVar.f13726rn.getLayoutParams();
                layoutParams.weight = 2.33f;
                thVar.f13726rn.setLayoutParams(layoutParams);
            }
        }
        if ((th.yu(thVar.jqy) || th.ra(thVar.jqy)) && (view = thVar.qbp) != null) {
            view.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.common.mwh mwhVar5 = thVar.zih;
        if (mwhVar5 != null) {
            mwhVar5.ouw(thVar.jqy);
        }
        if (th.lh(thVar.jqy)) {
            com.bytedance.sdk.openadsdk.common.mwh mwhVar6 = thVar.zih;
            if (mwhVar6 != null && (loadingStyle = mwhVar6.getLoadingStyle()) != null) {
                thVar.f13732vh = loadingStyle.f13109lh;
                thVar.yib = loadingStyle.yu;
            }
            com.bytedance.sdk.openadsdk.core.le.yu yuVar = thVar.f13734wp;
            if (yuVar != null) {
                yuVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/model/th$3;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(g.f53147u, view3);
                        safedk_th$3_onClick_30d2f5d2342ee48542244c12d1a0dedf(view3);
                    }

                    public void safedk_th$3_onClick_30d2f5d2342ee48542244c12d1a0dedf(View view3) {
                        if (th.this.f13734wp.getTag() != null) {
                            if (th.this.f13734wp.getTag().equals(1)) {
                                th.this.vt(3);
                            } else if (th.this.f13734wp.getTag().equals(2)) {
                                th.this.vt(4);
                            }
                        }
                    }
                });
            }
        }
        lh.ouw.ouw(SystemClock.elapsedRealtime() - lValueOf.longValue(), thVar.jqy, thVar.f13728tc, thVar.fqk, thVar.jvy);
    }

    public void vt(int i10) {
        com.bytedance.sdk.openadsdk.core.model.jg jgVar;
        vpp vppVar = this.yu;
        if (vppVar != null && vppVar.cd()) {
            vpp vppVar2 = this.yu;
            if (vppVar2 != null && vppVar2.cd() && (jgVar = vppVar2.kbx) != null && jgVar.vt == 1) {
                osn.ouw((View) this.vpp, 8);
                return;
            }
        }
        osn.ouw((View) this.vpp, i10);
    }

    public void vt(boolean z10) {
        ImageView imageView;
        if (this.qbp != 1 && (imageView = this.f13358le) != null && z10) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                Resources resources = this.vt.getResources();
                int dimensionPixelSize = resources != null ? resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android")) : 0;
                if (dimensionPixelSize > 0) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (dimensionPixelSize > marginLayoutParams.rightMargin) {
                        marginLayoutParams.rightMargin = dimensionPixelSize;
                    }
                }
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.vt.vt vtVar = this.f13359lh.coz;
        if ((vtVar instanceof com.bytedance.sdk.openadsdk.component.reward.vt.yu) || (vtVar instanceof com.bytedance.sdk.openadsdk.component.reward.vt.lh)) {
            return;
        }
        vt(0);
    }

    public void yu() {
        if (this.f13359lh.vt.an() && od.lh(this.f13359lh.vt)) {
            return;
        }
        osn.ouw((View) this.f13360ra, 8);
        osn.ouw((View) this.jqy, 8);
        osn.ouw(this.pno, 8);
        osn.ouw(this.bly, 8);
        vt(8);
        osn.ouw((View) this.f13358le, 8);
        osn.ouw((View) this.tlj, 8);
        osn.ouw((View) this.ryl, 8);
        osn.ouw((View) this.f13355cf, 8);
    }

    public void yu(int i10) {
        osn.ouw((View) this.tlj, i10);
    }

    public final void zih() {
        com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar = this.f13359lh;
        com.bytedance.sdk.openadsdk.core.lh.fkw fkwVar = ouwVar.f13258cd.f13313lh;
        View view = this.vpp;
        if (view == null) {
            view = ouwVar.rrs;
        }
        fkwVar.onClick(view);
    }
}
