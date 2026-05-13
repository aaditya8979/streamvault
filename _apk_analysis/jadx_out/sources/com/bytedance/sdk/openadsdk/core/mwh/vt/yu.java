package com.bytedance.sdk.openadsdk.core.mwh.vt;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.jae;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.qbp;
import com.bytedance.sdk.openadsdk.core.widget.th;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.cf;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public final class yu extends fkw {

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private final int f13879an;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    private ImageView f13880cj;
    private final Rect coz;
    private final Rect euf;
    private View fqk;
    private int fwd;

    /* JADX INFO: renamed from: gh, reason: collision with root package name */
    private final th f13881gh;
    private TextView hun;
    private ImageView jvy;
    private ColorStateList kfa;

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    private SeekBar f13882kn;
    private TextView lso;
    private ColorStateList lvd;

    /* JADX INFO: renamed from: mq, reason: collision with root package name */
    private final int f13883mq;

    /* JADX INFO: renamed from: ms, reason: collision with root package name */
    private final Rect f13884ms;
    private boolean mt;
    private final Rect mwe;
    private int myk;

    /* JADX INFO: renamed from: ng, reason: collision with root package name */
    private int f13885ng;
    private int njr;
    private float npr;
    private float odc;
    public View ouw;
    private TextView pv;
    private TextView rrs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private float f13886sd;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    private ImageView f13887ub;
    private TextView ucs;
    private TextView ux;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    private TextView f13888vh;

    /* JADX INFO: renamed from: vi, reason: collision with root package name */
    private ColorStateList f13889vi;
    public boolean vt;

    /* JADX INFO: renamed from: wp, reason: collision with root package name */
    private View f13890wp;
    private int xdk;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private final Rect f13891xn;
    private final View.OnTouchListener ycd;
    private final jae yhj;
    private ImageView yib;
    private float yw;
    private float zjp;
    private int zvq;

    public yu(Context context, ViewGroup viewGroup, vpp vppVar, com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar) {
        super(context, viewGroup, vppVar, lhVar, false);
        this.yhj = new jae(this);
        this.vt = false;
        this.mt = false;
        this.xdk = 0;
        this.zvq = 0;
        this.myk = 0;
        this.f13885ng = 0;
        this.fwd = 0;
        this.coz = new Rect();
        this.euf = new Rect();
        this.njr = 0;
        this.ycd = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.yu.7
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/mwh/vt/yu$7;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                CreativeInfoManager.onViewTouched(g.f53147u, view, motionEvent);
                return safedk_yu$7_onTouch_9a2b04bdc97c90979e5757b66d65e5c5(view, motionEvent);
            }

            @SuppressLint({"ClickableViewAccessibility"})
            public boolean safedk_yu$7_onTouch_9a2b04bdc97c90979e5757b66d65e5c5(View view, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                } else if (actionMasked == 3) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            }
        };
        this.f13891xn = new Rect();
        this.f13884ms = new Rect();
        this.mwe = new Rect();
        this.f13847od = zih.ouw().getApplicationContext();
        fkw(false);
        this.fkw = viewGroup;
        this.jqy = true;
        th thVar = new th(this);
        this.f13881gh = thVar;
        thVar.vt = this.jqy;
        DisplayMetrics displayMetrics = this.f13847od.getResources().getDisplayMetrics();
        this.f13883mq = displayMetrics.widthPixels;
        this.f13879an = displayMetrics.heightPixels;
        this.ksc = 17;
        this.f13840bs = lhVar;
        this.jae = vppVar;
        yu(8);
        ouw(context, this.fkw);
        le();
        ko();
    }

    private void ex() {
        DisplayMetrics displayMetrics = this.f13847od.getResources().getDisplayMetrics();
        TextView textView = this.f13888vh;
        if (textView != null) {
            this.odc = textView.getTextSize();
            this.f13888vh.setTextSize(2, 14.0f);
            ColorStateList textColors = this.f13888vh.getTextColors();
            this.f13889vi = textColors;
            if (textColors != null) {
                this.f13888vh.setTextColor(-1);
            }
            this.npr = this.f13888vh.getAlpha();
            this.f13888vh.setAlpha(0.85f);
            this.f13888vh.setShadowLayer(0.0f, osn.ouw(this.f13847od, 0.5f), osn.ouw(this.f13847od, 0.5f), com.bytedance.sdk.component.utils.vpp.ra(this.f13847od, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams = this.f13888vh.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f13891xn.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                osn.ouw(this.f13888vh, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.f13891xn.top, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.f13891xn.bottom);
            }
        }
        TextView textView2 = this.ucs;
        if (textView2 != null) {
            this.zjp = textView2.getTextSize();
            this.ucs.setTextSize(2, 14.0f);
            ColorStateList textColors2 = this.ucs.getTextColors();
            this.kfa = textColors2;
            if (textColors2 != null) {
                this.ucs.setTextColor(-1);
            }
            this.yw = this.ucs.getAlpha();
            this.ucs.setAlpha(0.85f);
            this.ucs.setShadowLayer(0.0f, osn.ouw(this.f13847od, 0.5f), osn.ouw(this.f13847od, 0.5f), com.bytedance.sdk.component.utils.vpp.ra(this.f13847od, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams2 = this.ucs.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                this.f13884ms.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                TextView textView3 = this.ucs;
                int iApplyDimension = (int) TypedValue.applyDimension(1, 14.0f, displayMetrics);
                Rect rect = this.f13884ms;
                osn.ouw(textView3, iApplyDimension, rect.top, rect.right, rect.bottom);
            }
        }
        ImageView imageView = this.yib;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                this.mwe.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                ImageView imageView2 = this.yib;
                Rect rect2 = this.mwe;
                osn.ouw(imageView2, rect2.left, rect2.top, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.mwe.bottom);
            }
        }
        ImageView imageView3 = this.yib;
        if (imageView3 != null) {
            imageView3.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(this.f13847od, "tt_shrink_fullscreen"));
        }
        TextView textView4 = this.ux;
        if (textView4 != null) {
            ColorStateList textColors3 = textView4.getTextColors();
            this.lvd = textColors3;
            if (textColors3 != null) {
                this.ux.setTextColor(-1);
            }
            this.f13886sd = this.ux.getAlpha();
            this.ux.setAlpha(0.85f);
            ViewGroup.LayoutParams layoutParams4 = this.ux.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                this.euf.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                TextView textView5 = this.ux;
                int iApplyDimension2 = (int) TypedValue.applyDimension(1, 1.0f, displayMetrics);
                Rect rect3 = this.f13884ms;
                osn.ouw(textView5, iApplyDimension2, rect3.top, rect3.right, rect3.bottom);
            }
        }
        View view = this.fqk;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.njr = layoutParams5.height;
            layoutParams5.height = (int) TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.fqk.setLayoutParams(layoutParams5);
            this.fqk.setBackgroundResource(com.bytedance.sdk.component.utils.vpp.yu(this.f13847od, "tt_shadow_fullscreen_top"));
        }
        le(false);
    }

    private void ra(boolean z10) {
        if (z10) {
            ex();
        } else {
            tc();
        }
    }

    private void tc() {
        TextView textView = this.f13888vh;
        if (textView != null) {
            textView.setTextSize(0, this.odc);
            ColorStateList colorStateList = this.f13889vi;
            if (colorStateList != null) {
                this.f13888vh.setTextColor(colorStateList);
            }
            this.f13888vh.setAlpha(this.npr);
            this.f13888vh.setShadowLayer(osn.ouw(this.f13847od, 1.0f), 0.0f, 0.0f, com.bytedance.sdk.component.utils.vpp.ra(this.f13847od, "tt_72000000"));
            TextView textView2 = this.f13888vh;
            Rect rect = this.f13891xn;
            osn.ouw(textView2, rect.left, rect.top, rect.right, rect.bottom);
        }
        TextView textView3 = this.ucs;
        if (textView3 != null) {
            textView3.setTextSize(0, this.zjp);
            ColorStateList colorStateList2 = this.kfa;
            if (colorStateList2 != null) {
                this.ucs.setTextColor(colorStateList2);
            }
            this.ucs.setAlpha(this.yw);
            this.ucs.setShadowLayer(osn.ouw(this.f13847od, 1.0f), 0.0f, 0.0f, com.bytedance.sdk.component.utils.vpp.ra(this.f13847od, "tt_72000000"));
            TextView textView4 = this.ucs;
            Rect rect2 = this.f13884ms;
            osn.ouw(textView4, rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        ImageView imageView = this.yib;
        if (imageView != null) {
            Rect rect3 = this.mwe;
            osn.ouw(imageView, rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ImageView imageView2 = this.yib;
        if (imageView2 != null) {
            imageView2.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(this.f13847od, "tt_enlarge_video"));
        }
        TextView textView5 = this.ux;
        if (textView5 != null) {
            ColorStateList colorStateList3 = this.lvd;
            if (colorStateList3 != null) {
                textView5.setTextColor(colorStateList3);
            }
            this.ux.setAlpha(this.f13886sd);
            TextView textView6 = this.ux;
            Rect rect4 = this.f13884ms;
            osn.ouw(textView6, rect4.left, rect4.top, rect4.right, rect4.bottom);
        }
        View view = this.fqk;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.njr;
            this.fqk.setLayoutParams(layoutParams);
            this.fqk.setBackground(cf.ouw(this.f13847od, "tt_video_black_desc_gradient"));
        }
        le(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void bly() {
        boolean z10 = this.vt;
        int i10 = z10 ? this.f13879an : this.f13852th;
        int iOuw = z10 ? this.f13883mq : this.qbp;
        if (this.vpp <= 0 || this.zin <= 0 || i10 <= 0) {
            return;
        }
        if (!this.jqy && !z10 && (this.ksc & 8) != 8) {
            iOuw = osn.ouw(this.f13847od, 228.0f);
        }
        int i11 = this.zin;
        int i12 = this.vpp;
        int i13 = (int) (i12 * ((i10 * 1.0f) / i11));
        if (i13 > iOuw) {
            i10 = (int) (i11 * ((iOuw * 1.0f) / i12));
        } else {
            iOuw = i13;
        }
        this.f13845le.ouw(i10, iOuw);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void cf() {
        this.f13882kn.setProgress(0);
        this.f13882kn.setSecondaryProgress(0);
        this.ucs.setText(com.bytedance.sdk.component.utils.vpp.ouw(this.f13847od, "tt_00_00"));
        this.f13888vh.setText(com.bytedance.sdk.component.utils.vpp.ouw(this.f13847od, "tt_00_00"));
        yu(8);
        if (jqy()) {
            this.f13845le.setVisibility(8);
        }
        ImageView imageView = this.tlj;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        yu(8);
        osn.ouw(this.f13890wp, 8);
        osn.ouw(this.ryl, 8);
        osn.ouw((View) this.mwh, 8);
        osn.ouw(this.f13843jg, 8);
        osn.ouw((View) this.f13844ko, 8);
        osn.ouw((View) this.f13850rn, 8);
        osn.ouw((View) this.zih, 8);
        qbp qbpVar = this.f13841cd;
        if (qbpVar != null) {
            qbpVar.ouw(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw, com.bytedance.sdk.openadsdk.core.widget.th.ouw
    public final void jg() {
        if (this.vt) {
            String str = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            vpp vppVar = this.jae;
            if (vppVar != null && !TextUtils.isEmpty(vppVar.fqk)) {
                ouw(this.jae.fqk);
            }
            this.lso.setText(str);
        } else {
            ouw("");
            this.lso.setText("");
        }
        if (this.f13848pd) {
            return;
        }
        yu(this.jqy && !this.vt);
        if (zih()) {
            this.f13853uq.ouw(this.pno.getVisibility() != 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    @SuppressLint({"ClickableViewAccessibility"})
    public final void le() {
        super.le();
        this.f13881gh.ouw(this.fkw);
        osn.ouw((View) this.jvy, (this.jqy || (this.ksc & 1) == 1) ? 8 : 0);
        this.jvy.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.yu.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/mwh/vt/yu$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f53147u, view);
                safedk_yu$1_onClick_5ef3649d324f59878e17b204fdeb2dd6(view);
            }

            public void safedk_yu$1_onClick_5ef3649d324f59878e17b204fdeb2dd6(View view) {
                if (yu.this.zih()) {
                    yu.this.f13853uq.yu();
                }
            }
        });
        osn.ouw((View) this.rrs, (!this.jqy || (this.ksc & 2) == 2) ? 0 : 8);
        this.rrs.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.yu.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/mwh/vt/yu$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f53147u, view);
                safedk_yu$2_onClick_ae817d552a7aa2733853afa87ae8ee92(view);
            }

            public void safedk_yu$2_onClick_ae817d552a7aa2733853afa87ae8ee92(View view) {
                if (yu.this.zih()) {
                    yu.this.f13853uq.fkw();
                }
            }
        });
        this.f13887ub.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.yu.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/mwh/vt/yu$3;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f53147u, view);
                safedk_yu$3_onClick_fe0c88010d232be91aad5c11db83aa83(view);
            }

            public void safedk_yu$3_onClick_fe0c88010d232be91aad5c11db83aa83(View view) {
                if (yu.this.zih()) {
                    yu.this.f13853uq.le();
                }
            }
        });
        this.f13880cj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.yu.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/mwh/vt/yu$4;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f53147u, view);
                safedk_yu$4_onClick_2510523d02b64f9685f6cd7986c5dc1e(view);
            }

            public void safedk_yu$4_onClick_2510523d02b64f9685f6cd7986c5dc1e(View view) {
                yu.this.le(false);
                yu yuVar = yu.this;
                osn.fkw(yuVar.pno);
                osn.fkw(yuVar.ouw);
                yu.this.tlj();
                yu.this.zih();
            }
        });
        this.yib.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.yu.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/mwh/vt/yu$5;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f53147u, view);
                safedk_yu$5_onClick_e9092352c23d591c9e522f653d69838a(view);
            }

            public void safedk_yu$5_onClick_e9092352c23d591c9e522f653d69838a(View view) {
                if (yu.this.zih()) {
                    yu.this.f13853uq.lh();
                }
            }
        });
        this.f13882kn.setThumbOffset(0);
        this.f13882kn.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.mwh.vt.yu.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
                if (yu.this.zih()) {
                    yu.this.f13853uq.vt(i10);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar) {
                yu yuVar = yu.this;
                if (!yuVar.vt && yuVar.f13847od != null) {
                    seekBar.setThumb(cf.ouw(zih.ouw(), "tt_seek_thumb_press"));
                }
                if (yu.this.zih()) {
                    seekBar.setThumbOffset(0);
                    ouw ouwVar = yu.this.f13853uq;
                    seekBar.getProgress();
                    ouwVar.vt();
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar) {
                yu yuVar = yu.this;
                if (!yuVar.vt && yuVar.f13847od != null) {
                    seekBar.setThumb(cf.ouw(zih.ouw(), "tt_seek_thumb_normal"));
                }
                if (yu.this.zih()) {
                    seekBar.setThumbOffset(0);
                    yu.this.f13853uq.ouw(seekBar.getProgress());
                }
            }
        });
        this.f13882kn.setOnTouchListener(this.ycd);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void lh(boolean z10) {
        osn.ouw(this.f13890wp, 8);
        osn.ouw(this.fqk, 8);
        osn.ouw((View) this.f13849ra, 8);
        if (!this.jqy && !this.vt) {
            osn.ouw((View) this.jvy, 8);
            if ((this.ksc & 2) != 2) {
                osn.ouw((View) this.rrs, 8);
            }
        } else if ((this.ksc & 1) == 1) {
            osn.ouw((View) this.jvy, 8);
        }
        if (z10) {
            osn.ouw((View) this.jvy, 8);
            osn.ouw((View) this.rrs, 8);
        }
        yu(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw, com.bytedance.sdk.openadsdk.core.widget.qbp.vt
    public final void mwh() {
        lh(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw, com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt
    public final void ouw() {
        lh(this.jqy);
        qbp();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void ouw(int i10) {
        View view = this.f13890wp;
        if (view == null || view.getVisibility() != 0) {
            this.f13882kn.setProgress(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void ouw(long j10) {
        this.f13888vh.setText(com.bykv.vk.openvk.ouw.ouw.vt.yu.ouw.ouw(j10));
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void ouw(long j10, long j11) {
        this.ucs.setText(com.bykv.vk.openvk.ouw.ouw.vt.yu.ouw.ouw(j11));
        this.f13888vh.setText(com.bykv.vk.openvk.ouw.ouw.vt.yu.ouw.ouw(j10));
        this.f13882kn.setProgress(com.bykv.vk.openvk.ouw.ouw.vt.yu.ouw.ouw(j10, j11));
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void ouw(Context context, View view) {
        super.ouw(context, view);
        this.rrs = (TextView) view.findViewById(rn.swm);
        this.jvy = (ImageView) view.findViewById(rn.f14359nn);
        this.fqk = view.findViewById(rn.eot);
        this.f13887ub = (ImageView) view.findViewById(rn.mu);
        this.hun = (TextView) view.findViewById(rn.zjq);
        this.ux = (TextView) view.findViewById(rn.xne);
        this.lso = (TextView) view.findViewById(rn.ajl);
        this.ouw = view.findViewById(rn.xwt);
        this.f13880cj = (ImageView) view.findViewById(rn.f14342fg);
        TextView textView = (TextView) view.findViewById(rn.baa);
        this.pv = textView;
        textView.setText(com.bytedance.sdk.component.utils.vpp.ouw(context, "tt_video_retry_des_txt"));
        this.f13882kn = (SeekBar) view.findViewById(rn.f14351kq);
        this.ucs = (TextView) view.findViewById(rn.nbp);
        this.f13888vh = (TextView) view.findViewById(rn.f14374vf);
        this.f13890wp = view.findViewById(rn.f14368sm);
        this.yib = (ImageView) view.findViewById(rn.cu);
        this.f13842cf = view.findViewById(rn.f14355ln);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw, com.bytedance.sdk.component.utils.jae.ouw
    public final void ouw(Message message) {
        if (message.what != 1) {
            return;
        }
        lh(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void ouw(@Nullable ViewGroup viewGroup) {
        if (viewGroup != null && (this.fkw.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.vt = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.fkw.getLayoutParams();
            this.zvq = marginLayoutParams.leftMargin;
            this.xdk = marginLayoutParams.topMargin;
            this.myk = marginLayoutParams.width;
            this.f13885ng = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.fkw.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.fwd = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                this.coz.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                osn.ouw(viewGroup, 0, 0, 0, 0);
            }
            bly();
            this.yib.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(this.f13847od, "tt_shrink_video"));
            this.f13882kn.setThumb(cf.ouw(this.f13847od, "tt_seek_thumb_fullscreen_selector"));
            this.f13882kn.setThumbOffset(0);
            com.bykv.vk.openvk.ouw.ouw.vt.yu.ouw.ouw((View) this.fkw, false);
            ra(this.vt);
            osn.ouw(this.fqk, 8);
            if (!this.jqy) {
                osn.ouw((View) this.jvy, 8);
                osn.ouw((View) this.rrs, 8);
            } else if ((this.ksc & 1) == 1) {
                osn.ouw((View) this.jvy, 8);
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw, com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt
    @SuppressLint({"ClickableViewAccessibility"})
    public final void ouw(vpp vppVar) {
        com.bytedance.sdk.openadsdk.core.model.zih zihVar;
        vpp vppVar2;
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar;
        if (vppVar == null) {
            return;
        }
        ouw(this.fkw, zih.ouw());
        lh(this.jqy);
        osn.ouw(this.ryl, 0);
        osn.ouw((View) this.mwh, 0);
        osn.ouw(this.f13843jg, 0);
        if (this.mwh != null && (vppVar2 = this.jae) != null && (vtVar = vppVar2.f13788sd) != null && vtVar.f11283le != null) {
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar3 = this.jae;
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar2 = vppVar3.f13788sd;
            com.bytedance.sdk.openadsdk.th.vt.ouw(vtVar2.f11283le, vtVar2.vt, vtVar2.ouw, this.mwh, vppVar3);
        }
        String str = !TextUtils.isEmpty(vppVar.f13798vh) ? vppVar.f13798vh : !TextUtils.isEmpty(vppVar.fqk) ? vppVar.fqk : !TextUtils.isEmpty(vppVar.hun) ? vppVar.hun : "";
        vpp vppVar4 = this.jae;
        if (vppVar4 != null && (zihVar = vppVar4.fak) != null && zihVar.ouw != null) {
            osn.ouw((View) this.f13844ko, 0);
            osn.ouw((View) this.f13850rn, 4);
            if (this.f13844ko != null) {
                com.bytedance.sdk.openadsdk.th.vt.ouw();
                com.bytedance.sdk.openadsdk.th.vt.ouw(this.jae.fak, this.f13844ko, vppVar);
                this.f13844ko.setOnClickListener(this.fak);
                this.f13844ko.setOnTouchListener(this.fak);
            }
        } else if (!TextUtils.isEmpty(str)) {
            osn.ouw((View) this.f13844ko, 4);
            osn.ouw((View) this.f13850rn, 0);
            TextView textView = this.f13850rn;
            if (textView != null) {
                textView.setText(str.substring(0, 1));
                this.f13850rn.setOnClickListener(this.fak);
                this.f13850rn.setOnTouchListener(this.fak);
            }
        }
        if (this.zih != null && !TextUtils.isEmpty(str)) {
            this.zih.setText(str);
        }
        osn.ouw((View) this.zih, 0);
        osn.ouw((View) this.f13854vm, 0);
        int i10 = vppVar.f13782pd;
        String strOuw = i10 != 4 ? i10 != 5 ? com.bytedance.sdk.component.utils.vpp.ouw(this.f13847od, "tt_video_mobile_go_detail") : com.bytedance.sdk.component.utils.vpp.ouw(this.f13847od, "tt_video_dial_phone") : com.bytedance.sdk.component.utils.vpp.ouw(this.f13847od, "tt_video_download_apk");
        TextView textView2 = this.f13854vm;
        if (textView2 != null) {
            textView2.setText(strOuw);
            this.f13854vm.setOnClickListener(this.fak);
            this.f13854vm.setOnTouchListener(this.fak);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void ouw(String str) {
        TextView textView = this.hun;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.ux;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void pno() {
        this.yhj.removeMessages(1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void ra() {
        this.yhj.removeMessages(1);
        this.yhj.sendMessageDelayed(this.yhj.obtainMessage(1), 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw, com.bytedance.sdk.openadsdk.core.widget.qbp.vt
    public final boolean ryl() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void tlj() {
        vpp vppVar;
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar;
        osn.le(this.pno);
        osn.le(this.bly);
        osn.fkw(this.ouw);
        ImageView imageView = this.tlj;
        if (imageView != null && (vppVar = this.jae) != null && (vtVar = vppVar.f13788sd) != null && vtVar.f11283le != null) {
            osn.le(imageView);
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar2 = this.jae;
            com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar2 = vppVar2.f13788sd;
            com.bytedance.sdk.openadsdk.th.vt.ouw(vtVar2.f11283le, vtVar2.vt, vtVar2.ouw, this.tlj, vppVar2);
        }
        if (this.f13849ra.getVisibility() == 0) {
            osn.ouw((View) this.f13849ra, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void vt(@Nullable ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        ko.fkw("FullScreen", "Detail exitFullScreen.....");
        if (viewGroup == null || (viewGroup2 = this.fkw) == null || !(viewGroup2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        this.vt = false;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.fkw.getLayoutParams();
        marginLayoutParams.width = this.myk;
        marginLayoutParams.height = this.f13885ng;
        marginLayoutParams.leftMargin = this.zvq;
        marginLayoutParams.topMargin = this.xdk;
        this.fkw.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, this.fwd);
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            Rect rect = this.coz;
            osn.ouw(viewGroup, rect.left, rect.top, rect.right, rect.bottom);
        }
        bly();
        this.yib.setImageDrawable(com.bytedance.sdk.component.utils.vpp.lh(this.f13847od, "tt_enlarge_video"));
        this.f13882kn.setThumb(cf.ouw(this.f13847od, "tt_seek_thumb_normal"));
        this.f13882kn.setThumbOffset(0);
        com.bykv.vk.openvk.ouw.ouw.vt.yu.ouw.ouw((View) this.fkw, true);
        ra(this.vt);
        osn.ouw(this.fqk, 8);
        if ((this.ksc & 2) == 2) {
            osn.ouw((View) this.rrs, 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void vt(boolean z10) {
        osn.ouw(this.f13890wp, 0);
        if (this.vt) {
            osn.ouw(this.fqk, 0);
            osn.ouw((View) this.ux, 0);
        }
        osn.ouw((View) this.f13849ra, (!z10 || this.pno.getVisibility() == 0) ? 8 : 0);
        if (!this.jqy && !this.vt) {
            if ((this.ksc & 1) != 1) {
                osn.ouw((View) this.jvy, 0);
            }
            osn.ouw((View) this.rrs, 0);
        }
        osn.ouw((View) this.ucs, 0);
        osn.ouw((View) this.f13888vh, 0);
        osn.ouw((View) this.f13882kn, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final boolean vt(int i10) {
        SeekBar seekBar = this.f13882kn;
        return seekBar != null && i10 > seekBar.getSecondaryProgress();
    }

    @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.fkw
    public final void yu(boolean z10) {
        TextView textView = this.hun;
        if (textView != null) {
            osn.ouw((View) textView, (!this.jqy && z10) ? 0 : 8);
        }
    }
}
