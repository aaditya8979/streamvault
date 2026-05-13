package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.lh.lh;
import com.bytedance.sdk.openadsdk.core.lh.vt;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vm;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.tlj.yu;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.ironsource.C3978d4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class le {

    @NonNull
    public ouw ouw;
    public boolean vt;

    public le(ouw ouwVar) {
        this.ouw = ouwVar;
    }

    public final void ouw() {
        com.bytedance.sdk.openadsdk.activity.pno pnoVar;
        ouw ouwVar = this.ouw;
        Activity activity = ouwVar.jvy;
        vpp vppVar = ouwVar.vt;
        String str = ouwVar.fkw;
        com.bytedance.sdk.openadsdk.core.bly.bly blyVar = new com.bytedance.sdk.openadsdk.core.bly.bly(activity, vppVar, str, uoy.ouw(str)) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.le.3
            @Override // com.bytedance.sdk.openadsdk.core.lh.vt, com.bytedance.sdk.openadsdk.core.lh.lh
            public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z10) {
                super.ouw(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        blyVar.ouw(new vt.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.le.4
            @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
            public final void ouw(View view, int i10) {
                le.this.ouw.fqk.osn();
            }
        });
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        ouw ouwVar2 = this.ouw;
        if (ouwVar2.euf && (pnoVar = ouwVar2.f13261gh) != null) {
            int i10 = pnoVar.f12985cf + 1;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i10);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
        }
        blyVar.ouw(map);
        ouw ouwVar3 = this.ouw;
        Activity activity2 = ouwVar3.jvy;
        vpp vppVar2 = ouwVar3.vt;
        String str2 = ouwVar3.fkw;
        com.bytedance.sdk.openadsdk.core.bly.pno pnoVar2 = new com.bytedance.sdk.openadsdk.core.bly.pno(activity2, vppVar2, str2, uoy.ouw(str2)) { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.le.5
            @Override // com.bytedance.sdk.openadsdk.core.lh.ouw, com.bytedance.sdk.openadsdk.core.lh.vt, com.bytedance.sdk.openadsdk.core.lh.lh
            public final void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<lh.ouw> sparseArray, boolean z10) {
                HashMap map2 = new HashMap();
                map2.put("duration", Long.valueOf(le.this.ouw.ex.fkw()));
                com.bytedance.sdk.openadsdk.activity.pno pnoVar3 = le.this.ouw.f13261gh;
                if (pnoVar3 != null) {
                    pnoVar3.ouw(map2, f10, f11);
                }
                ouw(map2);
                super.ouw(view, f10, f11, f12, f13, sparseArray, z10);
            }
        };
        pnoVar2.ouw(new vt.ouw() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.le.6
            @Override // com.bytedance.sdk.openadsdk.core.lh.vt.ouw
            public final void ouw(View view, int i11) {
                le.this.ouw.fqk.osn();
            }
        });
        HashMap map2 = new HashMap();
        map2.put("click_scence", 1);
        pnoVar2.ouw(map2);
        this.ouw.jae.ouw(blyVar, pnoVar2);
    }

    public final void ouw(float[] fArr) {
        com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar;
        this.vt = true;
        com.bytedance.sdk.component.utils.ko.vt("TTAD.RFExpressM", "initExpressView() called with: size = [" + Arrays.toString(fArr) + C3978d4.j.f31385e);
        AdSlot adSlotBuild = new AdSlot.Builder().setCodeId(String.valueOf(this.ouw.vt.fqk())).setExpressViewAcceptedSize(fArr[0], fArr[1]).build();
        ouw ouwVar = this.ouw;
        ouwVar.jae.ouw(adSlotBuild, ouwVar.ey.f13361rn);
        ouw ouwVar2 = this.ouw;
        ryl rylVar = ouwVar2.uoy;
        if (rylVar != null && (tljVar = ouwVar2.jae) != null) {
            rylVar.yu = tljVar.ouw;
        }
        ouwVar2.jae.ouw(new com.bytedance.sdk.openadsdk.core.bly.ko() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.le.1
            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final long fkw() {
                return le.this.ouw.ex.ryl;
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final boolean l_() {
                return com.bytedance.sdk.openadsdk.component.reward.ouw.ouw(le.this.ouw);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final int le() {
                ouw ouwVar3 = le.this.ouw;
                com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar2 = ouwVar3.jae;
                if (tljVar2.yu) {
                    return 4;
                }
                if (tljVar2.fkw) {
                    return 5;
                }
                com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar = ouwVar3.ex.f13242ra;
                if (lhVar != null && lhVar.ex()) {
                    return 1;
                }
                if (le.this.ouw.ex.ouw()) {
                    return 2;
                }
                le.this.ouw.ex.yu();
                return 3;
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final void lh() {
                com.bytedance.sdk.openadsdk.component.reward.view.ryl rylVar2 = le.this.ouw.ey;
                if (rylVar2 == null || rylVar2.tlj() == null) {
                    return;
                }
                le.this.ouw.ey.tlj().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final void ouw() {
                le.this.ouw.uoy.lh();
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final void ouw(int i10) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        le.this.ouw.ex.th();
                        return;
                    }
                    if (i10 == 3) {
                        ouw ouwVar3 = le.this.ouw;
                        ouwVar3.ex.ouw(ouwVar3.fqk);
                        return;
                    } else if (i10 == 4) {
                        le.this.ouw.ex.bly();
                        return;
                    } else if (i10 != 5) {
                        return;
                    }
                }
                if (le.this.ouw.ex.ouw() || le.this.ouw.ex.yu()) {
                    return;
                }
                le.this.ouw.fqk.ouw(0L, false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final void ouw(final int i10, com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
                final float f10;
                int i11;
                final th thVar = le.this.ouw.ey.f13361rn;
                if (thVar != null) {
                    if ((i10 != 3 && !th.ouw(i10)) || thVar.f13717kn == null || jgVar == null) {
                        return;
                    }
                    AtomicBoolean atomicBoolean = thVar.ucs;
                    if (atomicBoolean != null) {
                        if (i10 == 1) {
                            return;
                        }
                        if (i10 == 5 && atomicBoolean.get()) {
                            return;
                        }
                    }
                    final LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) thVar.qbp.getLayoutParams();
                    thVar.yhj = (LinearLayout.LayoutParams) thVar.f13726rn.getLayoutParams();
                    final float f11 = layoutParams.weight;
                    vm vmVar = thVar.jqy.f13775mb;
                    if (th.ouw(i10)) {
                        if (vmVar != null) {
                            i11 = vmVar.yu;
                            f10 = i11;
                        } else {
                            f10 = 30.0f;
                        }
                    } else if (vmVar != null) {
                        i11 = vmVar.fkw;
                        f10 = i11;
                    } else {
                        f10 = 70.0f;
                    }
                    com.bytedance.sdk.component.utils.ko.ouw("LandingPageModel", "expressStartWeight is :", Float.valueOf(f11), "expressEndWeight is:", Float.valueOf(f10));
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) thVar.f13717kn.getLayoutParams();
                    if (layoutParams2 == null) {
                        layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    }
                    final FrameLayout.LayoutParams layoutParams3 = layoutParams2;
                    final int i12 = layoutParams3.height;
                    final int i13 = layoutParams3.width;
                    final int i14 = layoutParams3.leftMargin;
                    final int i15 = layoutParams3.topMargin;
                    final int iOuw = osn.ouw(thVar.vpp, (float) jgVar.f12440cf);
                    final int iOuw2 = osn.ouw(thVar.vpp, (float) jgVar.ryl);
                    final int iOuw3 = osn.ouw(thVar.vpp, (float) jgVar.fkw);
                    final int iOuw4 = osn.ouw(thVar.vpp, (float) jgVar.f12443le);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    thVar.f13712bs = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.setDuration(500L);
                    thVar.f13712bs.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.th.9
                        public final /* synthetic */ int bly;

                        /* JADX INFO: renamed from: cf */
                        public final /* synthetic */ int f13735cf;
                        public final /* synthetic */ int fkw;

                        /* JADX INFO: renamed from: le */
                        public final /* synthetic */ int f13737le;

                        /* JADX INFO: renamed from: lh */
                        public final /* synthetic */ float f13738lh;
                        public final /* synthetic */ int mwh;
                        public final /* synthetic */ LinearLayout.LayoutParams ouw;
                        public final /* synthetic */ int pno;

                        /* JADX INFO: renamed from: ra */
                        public final /* synthetic */ int f13739ra;
                        public final /* synthetic */ int ryl;
                        public final /* synthetic */ int tlj;
                        public final /* synthetic */ float vt;
                        public final /* synthetic */ FrameLayout.LayoutParams yu;

                        public AnonymousClass9(final LinearLayout.LayoutParams layoutParams4, final float f112, final float f102, final FrameLayout.LayoutParams layoutParams32, final int i132, final int iOuw5, final int i122, final int iOuw22, final int i142, final int iOuw32, final int i152, final int iOuw42, final int i102) {
                            layoutParams = layoutParams4;
                            f = f112;
                            f = f102;
                            layoutParams = layoutParams32;
                            i = i132;
                            i = iOuw5;
                            i = i122;
                            i = iOuw22;
                            i = i142;
                            i = iOuw32;
                            i = i152;
                            i = iOuw42;
                            i = i102;
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            LinearLayout.LayoutParams layoutParams4 = layoutParams;
                            float f12 = f;
                            layoutParams4.weight = f12 + ((f - f12) * fFloatValue);
                            th.this.yhj.weight = 100.0f - layoutParams.weight;
                            if (th.this.qbp != null) {
                                th.this.qbp.setLayoutParams(layoutParams);
                            }
                            if (th.this.f13726rn != null) {
                                th.this.f13726rn.setLayoutParams(th.this.yhj);
                            }
                            if (th.this.yhj.weight < 30.0f) {
                                th.this.fkw(8);
                            } else {
                                th.this.fkw(0);
                            }
                            FrameLayout.LayoutParams layoutParams5 = layoutParams;
                            layoutParams5.width = i + ((int) ((i - r2) * fFloatValue));
                            layoutParams5.height = i + ((int) ((i - r2) * fFloatValue));
                            layoutParams5.leftMargin = i + ((int) ((i - r2) * fFloatValue));
                            layoutParams5.topMargin = i + ((int) ((i - r2) * fFloatValue));
                            if (th.this.f13717kn != null) {
                                th.this.f13717kn.setLayoutParams(layoutParams);
                            }
                            th.this.lh();
                            if (fFloatValue == 1.0f) {
                                if (th.this.f13734wp != null) {
                                    osn.ouw((View) th.this.f13734wp, 0);
                                    if (th.ouw(i)) {
                                        th.this.f13734wp.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(th.this.vpp, "tt_ad_zoom_down"));
                                        th.this.f13734wp.setTag(1);
                                    } else {
                                        th.this.f13734wp.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(th.this.vpp, "tt_ad_zoom_up"));
                                        th.this.f13734wp.setTag(2);
                                    }
                                }
                                if (th.this.ucs == null) {
                                    th.this.ucs = new AtomicBoolean();
                                }
                                th.this.ucs.set(th.ouw(i));
                            }
                        }
                    });
                    com.bytedance.sdk.openadsdk.yu.lh.yu(thVar.jqy, thVar.f13728tc, i102);
                    thVar.f13712bs.start();
                    if (thVar.mt.compareAndSet(false, true)) {
                        thVar.xdk = SystemClock.elapsedRealtime();
                    }
                    com.bytedance.sdk.openadsdk.yu.mwh mwhVar = thVar.f13731uq;
                    if (mwhVar != null) {
                        mwhVar.ouw(true, SystemClock.elapsedRealtime());
                    }
                    osn.ouw((View) thVar.f13734wp, 8);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final void ouw(int i10, String str) {
                ko koVar = le.this.ouw.ex;
                koVar.mwh = i10;
                koVar.f13238ko = str;
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final void ouw(String str, JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar;
                ouw ouwVar3 = le.this.ouw;
                if (ouwVar3 == null || (vtVar = ouwVar3.fqk) == null) {
                    return;
                }
                vtVar.ouw(str, jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final void ouw(boolean z10, String str) {
                com.bytedance.sdk.openadsdk.component.reward.top.lh lhVar;
                ouw ouwVar3 = le.this.ouw;
                if (ouwVar3.f13260cj == z10 || (lhVar = ouwVar3.uoy.f13312lh) == null) {
                    return;
                }
                lhVar.clickSound(str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final boolean ouw(JSONObject jSONObject) {
                ko koVar;
                ouw ouwVar3 = le.this.ouw;
                if (ouwVar3 == null || (koVar = ouwVar3.ex) == null) {
                    return false;
                }
                return koVar.ouw(jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final void ra() {
                ouw ouwVar3 = le.this.ouw;
                ouwVar3.f13270pd.ouw(ouwVar3.coz);
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final void vt(int i10) {
                le.this.ouw.f13281wp = i10;
            }

            @Override // com.bytedance.sdk.openadsdk.core.bly.ko
            public final long yu() {
                return le.this.ouw.ex.pno;
            }
        });
        this.ouw.jae.ouw(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.le.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public final void onAdClicked() {
                vpp vppVar;
                ouw ouwVar3 = le.this.ouw;
                if (ouwVar3 == null || (vppVar = ouwVar3.vt) == null || !vppVar.pd()) {
                    return;
                }
                le.this.ouw.fqk.osn();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public final void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public final void onAdShow(View view, int i10) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public final void onRenderFail(View view, String str, int i10) {
                if (!le.this.ouw.vt.lso()) {
                    le.this.ouw.f13257bs.ouw(true);
                    le.this.ouw.f13257bs.ouw();
                }
                com.bytedance.sdk.component.utils.ko.vt("TTAD.RFExpressM", "onRenderFail、、、code:".concat(String.valueOf(i10)));
                com.bytedance.sdk.openadsdk.component.reward.view.tlj tljVar2 = le.this.ouw.jae;
                if (tljVar2.f13366lh == null) {
                    tljVar2.f13366lh = new Handler(Looper.getMainLooper());
                }
                tljVar2.f13366lh.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.ouw.le.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        le.this.ouw.coz.ouw(false, false, false, 90);
                    }
                });
                le.this.ouw.ey.mwh();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i10);
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ko.fkw("TTAD.RFExpressM", "onRenderFail、、、error:" + th2.getMessage());
                }
                ouw ouwVar3 = le.this.ouw;
                com.bytedance.sdk.openadsdk.yu.tlj.ouw(ouwVar3.vt, "show_ad_fail", ouwVar3.fkw, str, jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public final void onRenderSuccess(View view, float f10, float f11) {
                final th thVar;
                if (!le.this.ouw.vt.lso()) {
                    if (le.this.ouw.jae.yu()) {
                        le.this.ouw.coz.ouw(true);
                        le.this.ouw.ex.ouw(false);
                    } else {
                        le.this.ouw.ex.ouw(true);
                    }
                    le.this.ouw.ey.ouw(8);
                    le.this.ouw.f13257bs.ouw(true);
                    le.this.ouw.f13257bs.ouw();
                    if (le.this.ouw.jae.yu()) {
                        le.this.ouw.jae.ouw().setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                        ouw ouwVar3 = le.this.ouw;
                        ouwVar3.coz.ouw(ouwVar3.ey.le());
                    } else {
                        ouw ouwVar4 = le.this.ouw;
                        if (ouwVar4.vt.f13788sd != null && ouwVar4.coz.ouw()) {
                            le.this.ouw.f13263kn = true;
                        }
                    }
                }
                le.this.ouw.coz.vpp();
                if (th.lh(le.this.ouw.vt) && (thVar = le.this.ouw.ey.f13361rn) != null && vpp.fkw(thVar.jqy)) {
                    try {
                        String str = thVar.jqy.f13788sd.f11283le;
                        yu.ouw.vt.ouw(str).ouw(thVar.jqy.f13788sd.vt).vt(thVar.jqy.f13788sd.ouw).fkw(osn.le(com.bytedance.sdk.openadsdk.core.zih.ouw())).yu(osn.yu(com.bytedance.sdk.openadsdk.core.zih.ouw())).lh(2).ouw(new th.ouw()).vt(new com.bytedance.sdk.openadsdk.tlj.vt(thVar.jqy, str, new com.bytedance.sdk.component.fkw.rn() { // from class: com.bytedance.sdk.openadsdk.core.model.th.4
                            public AnonymousClass4() {
                            }

                            @Override // com.bytedance.sdk.component.fkw.rn
                            public final void ouw(int i10, String str2, @Nullable Throwable th2) {
                            }

                            @Override // com.bytedance.sdk.component.fkw.rn
                            public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
                                try {
                                    Object objVt = cfVar.vt();
                                    if (objVt != null && cfVar.lh() != null) {
                                        BitmapDrawable bitmapDrawable = objVt instanceof Bitmap ? new BitmapDrawable(com.bytedance.sdk.openadsdk.core.zih.ouw().getResources(), (Bitmap) objVt) : null;
                                        View viewRn = th.this.ksc.rn();
                                        if (bitmapDrawable == null || viewRn == null || !(viewRn.getParent() instanceof View)) {
                                            return;
                                        }
                                        ((View) viewRn.getParent()).setBackground(bitmapDrawable);
                                    }
                                } catch (Throwable th2) {
                                    com.bytedance.sdk.component.utils.qbp.lh("LandingPageModel", th2.getMessage());
                                }
                            }
                        }));
                    } catch (Exception unused) {
                    }
                }
                le.this.ouw.ey.mwh();
            }
        });
        ouw();
        FrameLayout.LayoutParams layoutParams = (this.ouw.vt.lso() || com.bytedance.sdk.openadsdk.core.cf.yu.ouw(this.ouw.vt.kfa) || th.lh(this.ouw.vt)) ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.ouw.ey.le().addView(this.ouw.jae.ouw, layoutParams);
        if (!this.ouw.jae.yu()) {
            this.ouw.coz.ouw(false);
        }
        this.ouw.jae.ra();
    }
}
