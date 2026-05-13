package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.google.android.material.badge.BadgeDrawable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes2.dex */
public final class cf extends FrameLayout {
    private com.bytedance.sdk.openadsdk.core.le.pno bly;
    private zih fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private TextView f14030le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.lh.ouw f14031lh;
    public vpp ouw;
    private PAGLogoView pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private rn f14032ra;
    public String vt;
    private boolean yu;

    public cf(@NonNull Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.rn.npr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public final void setClickListener(com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar) {
        this.f14031lh = ouwVar;
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        com.bytedance.sdk.openadsdk.core.model.zih zihVar;
        super.setVisibility(i10);
        if (i10 != 0 || this.yu) {
            return;
        }
        this.yu = true;
        Context context = getContext();
        boolean z10 = this.ouw.jqy() == 1;
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        fkwVar.setGravity(1);
        fkwVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z10 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(osn.ouw(context, 327.0f), -2);
        layoutParams.gravity = 17;
        int iOuw = osn.ouw(context, 24.0f);
        layoutParams.rightMargin = iOuw;
        layoutParams.leftMargin = iOuw;
        addView(fkwVar, layoutParams);
        zih zihVar2 = new zih(context);
        this.fkw = zihVar2;
        zihVar2.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(osn.ouw(context, 80.0f), osn.ouw(context, 80.0f));
        layoutParams2.bottomMargin = osn.ouw(context, 12.0f);
        fkwVar.addView(this.fkw, layoutParams2);
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.f14030le = pnoVar;
        pnoVar.setEllipsize(TextUtils.TruncateAt.END);
        this.f14030le.setGravity(17);
        this.f14030le.setMaxLines(2);
        this.f14030le.setMaxWidth(osn.ouw(context, 180.0f));
        this.f14030le.setTextColor(-1);
        this.f14030le.setTextSize(2, 24.0f);
        fkwVar.addView(this.f14030le, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.le.pno pnoVar2 = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        this.bly = pnoVar2;
        pnoVar2.setEllipsize(TextUtils.TruncateAt.END);
        this.bly.setGravity(17);
        this.bly.setMaxLines(2);
        this.bly.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.bly.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = osn.ouw(context, 8.0f);
        fkwVar.addView(this.bly, layoutParams3);
        this.f14032ra = new rn(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, osn.ouw(context, 16.0f));
        layoutParams4.topMargin = osn.ouw(context, 12.0f);
        this.f14032ra.setVisibility(8);
        fkwVar.addView(this.f14032ra, layoutParams4);
        this.pno = PAGLogoView.createPAGLogoViewByMaterial(context, this.ouw);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, osn.ouw(context, 14.0f));
        layoutParams5.gravity = BadgeDrawable.BOTTOM_START;
        layoutParams5.leftMargin = osn.ouw(context, 18.0f);
        if (z10) {
            layoutParams5.bottomMargin = osn.ouw(context, 61.0f);
        } else {
            layoutParams5.bottomMargin = osn.ouw(context, 24.0f);
        }
        addView(this.pno, layoutParams5);
        if (this.fkw != null && (zihVar = this.ouw.fak) != null && !TextUtils.isEmpty(zihVar.ouw)) {
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar = this.ouw;
            com.bytedance.sdk.openadsdk.th.vt.ouw(vppVar.fak, this.fkw, vppVar);
        }
        rn rnVar = this.f14032ra;
        if (rnVar != null) {
            osn.ouw((TextView) null, rnVar, this.ouw);
            if (this.ouw.f13802wp != null) {
                this.f14032ra.setVisibility(0);
            }
        }
        if (this.f14030le != null) {
            com.bytedance.sdk.openadsdk.core.model.le leVar = this.ouw.f13802wp;
            if (leVar != null && !TextUtils.isEmpty(leVar.vt)) {
                this.f14030le.setText(this.ouw.f13802wp.vt);
            } else if (TextUtils.isEmpty(this.ouw.f13798vh)) {
                this.f14030le.setVisibility(8);
            } else {
                this.f14030le.setText(this.ouw.f13798vh);
            }
        }
        if (this.bly != null) {
            String str = this.ouw.fqk;
            if (TextUtils.isEmpty(str)) {
                this.bly.setVisibility(8);
            } else {
                this.bly.setText(str);
            }
        }
        this.pno.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.cf.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/cf$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f53147u, view);
                safedk_cf$1_onClick_d06a094826deb380ee8fa681b2be67aa(view);
            }

            public void safedk_cf$1_onClick_d06a094826deb380ee8fa681b2be67aa(View view) {
                try {
                    TTWebsiteActivity.ouw(cf.this.getContext(), cf.this.ouw, cf.this.vt);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
