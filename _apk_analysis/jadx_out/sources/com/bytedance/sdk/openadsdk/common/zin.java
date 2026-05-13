package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.vm;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zin {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public boolean f13125cf;
    public com.bytedance.sdk.openadsdk.core.le.le fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public vm f13126le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final Context f13127lh;
    public final RelativeLayout ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public TTAdDislikeToast f13128ra;
    private TextView ryl;
    public final vpp vt;
    public ImageView yu;
    public final AtomicBoolean pno = new AtomicBoolean(false);
    public final AtomicBoolean bly = new AtomicBoolean(false);
    public final int tlj = osn.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 44.0f);

    public zin(Context context, RelativeLayout relativeLayout, vpp vppVar) {
        this.f13127lh = context;
        this.ouw = relativeLayout;
        this.vt = vppVar;
        this.yu = (ImageView) relativeLayout.findViewById(com.bytedance.sdk.openadsdk.utils.rn.f14358ng);
        this.ryl = (TextView) relativeLayout.findViewById(com.bytedance.sdk.openadsdk.utils.rn.fwd);
        ImageView imageView = (ImageView) relativeLayout.findViewById(com.bytedance.sdk.openadsdk.utils.rn.coz);
        this.fkw = (com.bytedance.sdk.openadsdk.core.le.le) relativeLayout.findViewById(com.bytedance.sdk.openadsdk.utils.rn.lvd);
        if (vppVar != null) {
            this.ryl.setText(TextUtils.isEmpty(vppVar.fqk) ? com.bytedance.sdk.component.utils.vpp.ouw(context, "tt_web_title_default") : vppVar.fqk);
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.zin.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/zin$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f53147u, view);
                safedk_zin$1_onClick_2ad736bbd33d2fb12bc0e4d402199aec(view);
            }

            public void safedk_zin$1_onClick_2ad736bbd33d2fb12bc0e4d402199aec(View view) {
                final zin zinVar = zin.this;
                if (zinVar.bly.get()) {
                    zinVar.f13128ra.show(TTAdDislikeToast.getDislikeTip());
                    return;
                }
                vm vmVar = zinVar.f13126le;
                if (vmVar == null) {
                    if (vmVar == null) {
                        try {
                            vm vmVar2 = new vm(zinVar.f13127lh, zinVar.vt);
                            zinVar.f13126le = vmVar2;
                            vmVar2.setDislikeSource("landing_page");
                            zinVar.f13126le.setCallback(new vm.ouw() { // from class: com.bytedance.sdk.openadsdk.common.zin.6
                                @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                                public final void ouw() {
                                    zin.this.pno.set(true);
                                }

                                @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                                public final void ouw(FilterWord filterWord) {
                                    if (zin.this.bly.get() || filterWord == null || filterWord.hasSecondOptions()) {
                                        return;
                                    }
                                    zin.this.bly.set(true);
                                }

                                @Override // com.bytedance.sdk.openadsdk.common.vm.ouw
                                public final void vt() {
                                    zin.this.pno.set(false);
                                }
                            });
                        } catch (Throwable th2) {
                            ApmHelper.reportCustomError("initDislike error", "TTTitleNewStyleManager", th2);
                        }
                    }
                    FrameLayout frameLayout = (FrameLayout) zinVar.ouw.getRootView().findViewById(R.id.content);
                    frameLayout.addView(zinVar.f13126le);
                    if (zinVar.f13128ra == null) {
                        TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(zinVar.f13127lh);
                        zinVar.f13128ra = tTAdDislikeToast;
                        frameLayout.addView(tTAdDislikeToast);
                    }
                }
                vm vmVar3 = zinVar.f13126le;
                if (vmVar3 != null) {
                    vmVar3.ouw();
                }
            }
        });
    }
}
