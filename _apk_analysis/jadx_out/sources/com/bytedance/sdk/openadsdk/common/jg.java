package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.openadsdk.core.model.vpp;

/* JADX INFO: loaded from: classes4.dex */
public final class jg {
    public th fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final vpp f13091le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public ImageView f13092lh;
    public RelativeLayout ouw;
    private final String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final Context f13093ra;
    public com.bytedance.sdk.component.bly.le vt;
    public zin yu;

    public jg(Context context, vpp vppVar, String str) {
        this.f13093ra = context;
        this.f13091le = vppVar;
        this.pno = str;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setBackgroundColor(-1);
        relativeLayout.addView(new tlj(context));
        com.bytedance.sdk.component.bly.le leVar = new com.bytedance.sdk.component.bly.le(context, le.lh.LANDING_PAGE);
        int i10 = com.bytedance.sdk.openadsdk.utils.rn.ux;
        leVar.setId(i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(12);
        int i11 = com.bytedance.sdk.openadsdk.utils.rn.myk;
        layoutParams.addRule(3, i11);
        relativeLayout.addView(leVar, layoutParams);
        bly blyVar = new bly(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(blyVar.getLayoutParams());
        layoutParams2.addRule(12);
        relativeLayout.addView(blyVar, layoutParams2);
        this.ouw = relativeLayout;
        this.vt = (com.bytedance.sdk.component.bly.le) relativeLayout.findViewById(i10);
        zin zinVar = new zin(context, (RelativeLayout) this.ouw.findViewById(i11), vppVar);
        this.yu = zinVar;
        this.f13092lh = zinVar.yu;
        this.fkw = new th(context, (LinearLayout) this.ouw.findViewById(com.bytedance.sdk.openadsdk.utils.rn.f14367sd), this.vt, vppVar, str);
    }
}
