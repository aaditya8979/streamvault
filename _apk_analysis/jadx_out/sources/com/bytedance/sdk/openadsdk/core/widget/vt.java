package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import com.bytedance.sdk.component.utils.vpp;
import com.bytedance.sdk.openadsdk.utils.jqy;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public final class vt extends Dialog {
    private com.bytedance.sdk.openadsdk.core.le.ouw bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final Context f14085cf;
    private com.bytedance.sdk.openadsdk.core.le.yu fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private OnBackInvokedCallback f14086jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private boolean f14087ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.le.pno f14088le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public String f14089lh;
    private int mwh;
    public String ouw;
    private com.bytedance.sdk.openadsdk.core.le.ouw pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.le.pno f14090ra;
    private String ryl;
    private View tlj;
    public String vt;
    public InterfaceC0247vt yu;

    public static class ouw implements OnBackInvokedCallback {
        private final WeakReference<vt> ouw;

        public ouw(vt vtVar) {
            this.ouw = new WeakReference<>(vtVar);
        }

        @Override // android.window.OnBackInvokedCallback
        public final void onBackInvoked() {
            vt vtVar = this.ouw.get();
            if (vtVar != null) {
                com.bytedance.sdk.component.utils.qbp.ouw("CustomCommonDialog", "onBackInvoked");
                vtVar.onBackPressed();
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.widget.vt$vt, reason: collision with other inner class name */
    public interface InterfaceC0247vt {
        void ouw();

        void vt();
    }

    public vt(Context context) {
        super(context, vpp.le(context, "tt_custom_dialog"));
        this.mwh = -1;
        this.f14087ko = false;
        this.f14085cf = context;
    }

    private int ouw(float f10) {
        return osn.ouw(getContext(), f10);
    }

    private void ouw() {
        if (TextUtils.isEmpty(this.ryl)) {
            this.f14088le.setVisibility(8);
        } else {
            this.f14088le.setText(this.ryl);
            this.f14088le.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.ouw)) {
            this.f14090ra.setText(this.ouw);
        }
        if (TextUtils.isEmpty(this.vt)) {
            this.bly.setText(vpp.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), "tt_postive_txt"));
        } else {
            this.bly.setText(this.vt);
        }
        if (TextUtils.isEmpty(this.f14089lh)) {
            this.pno.setText(vpp.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), "tt_negtive_txt"));
        } else {
            this.pno.setText(this.f14089lh);
        }
        int i10 = this.mwh;
        if (i10 != -1) {
            this.fkw.setImageResource(i10);
            this.fkw.setVisibility(0);
        } else {
            this.fkw.setVisibility(8);
        }
        if (this.f14087ko) {
            this.tlj.setVisibility(8);
            this.pno.setVisibility(8);
        } else {
            this.pno.setVisibility(0);
            this.tlj.setVisibility(0);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        if (this.f14086jg == null || !jqy.ouw()) {
            return;
        }
        com.bytedance.sdk.component.utils.qbp.ouw("CustomCommonDialog", "isAtLeastT unregisterOnBackInvokedCallback");
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f14086jg);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        com.bytedance.sdk.component.utils.qbp.ouw("CustomCommonDialog", "onBackPressed");
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context context = this.f14085cf;
        com.bytedance.sdk.openadsdk.core.le.ra raVar = new com.bytedance.sdk.openadsdk.core.le.ra(context);
        raVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        fkwVar.setMinimumWidth(ouw(260.0f));
        fkwVar.setPadding(0, ouw(32.0f), 0, 0);
        fkwVar.setBackground(com.bytedance.sdk.openadsdk.utils.cf.ouw(context, "tt_custom_dialog_bg"));
        fkwVar.setOrientation(1);
        fkwVar.setLayoutParams(layoutParams);
        this.f14088le = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = ouw(16.0f);
        layoutParams2.rightMargin = ouw(16.0f);
        layoutParams2.bottomMargin = ouw(16.0f);
        this.f14088le.setGravity(17);
        this.f14088le.setVisibility(0);
        this.f14088le.setTextColor(Color.parseColor("#333333"));
        this.f14088le.setTextSize(18.0f);
        this.f14088le.setLayoutParams(layoutParams2);
        this.fkw = new com.bytedance.sdk.openadsdk.core.le.yu(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        layoutParams3.leftMargin = ouw(16.0f);
        layoutParams3.rightMargin = ouw(16.0f);
        layoutParams3.bottomMargin = ouw(10.0f);
        this.fkw.setMaxHeight(ouw(150.0f));
        this.fkw.setMaxWidth(ouw(150.0f));
        this.fkw.setVisibility(0);
        this.fkw.setLayoutParams(layoutParams3);
        this.f14090ra = new com.bytedance.sdk.openadsdk.core.le.pno(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.leftMargin = ouw(20.0f);
        layoutParams4.rightMargin = ouw(20.0f);
        this.f14090ra.setGravity(17);
        this.f14090ra.setLineSpacing(ouw(3.0f), 1.2f);
        this.f14090ra.setTextSize(18.0f);
        this.f14090ra.setTextColor(Color.parseColor("#000000"));
        this.f14090ra.setLayoutParams(layoutParams4);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams5.topMargin = ouw(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.le.fkw fkwVar2 = new com.bytedance.sdk.openadsdk.core.le.fkw(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        fkwVar2.setOrientation(0);
        fkwVar2.setLayoutParams(layoutParams6);
        com.bytedance.sdk.openadsdk.core.le.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.le.ouw(context);
        this.pno = ouwVar;
        ouwVar.setId(520093718);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2);
        layoutParams7.leftMargin = ouw(10.0f);
        layoutParams7.weight = 1.0f;
        this.pno.setPadding(0, ouw(16.0f), 0, ouw(16.0f));
        this.pno.setBackground(null);
        this.pno.setGravity(17);
        this.pno.setSingleLine(true);
        this.pno.setTextColor(Color.parseColor("#999999"));
        this.pno.setTextSize(16.0f);
        this.pno.setLayoutParams(layoutParams7);
        this.tlj = new View(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(1, -1);
        this.tlj.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.tlj.setLayoutParams(layoutParams8);
        this.bly = new com.bytedance.sdk.openadsdk.core.le.ouw(context);
        this.pno.setId(520093719);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(0, -2);
        layoutParams9.rightMargin = ouw(10.0f);
        layoutParams9.weight = 1.0f;
        this.bly.setPadding(0, ouw(16.0f), 0, ouw(16.0f));
        this.bly.setBackground(null);
        this.bly.setGravity(17);
        this.bly.setSingleLine(true);
        this.bly.setTextColor(Color.parseColor("#38ADFF"));
        this.bly.setTextSize(16.0f);
        this.bly.setLayoutParams(layoutParams9);
        raVar.addView(fkwVar);
        fkwVar.addView(this.f14088le);
        fkwVar.addView(this.fkw);
        fkwVar.addView(this.f14090ra);
        fkwVar.addView(view);
        fkwVar.addView(fkwVar2);
        fkwVar2.addView(this.pno);
        fkwVar2.addView(this.tlj);
        fkwVar2.addView(this.bly);
        setContentView(raVar);
        if (jqy.ouw()) {
            com.bytedance.sdk.component.utils.qbp.ouw("CustomCommonDialog", "isAtLeastT registerOnBackInvokedCallback");
            this.f14086jg = new ouw(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f14086jg);
        }
        setCanceledOnTouchOutside(false);
        ouw();
        this.bly.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.vt.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/vt$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f53147u, view2);
                safedk_vt$1_onClick_f28d2dbf6d9687160184ead9b242f0f1(view2);
            }

            public void safedk_vt$1_onClick_f28d2dbf6d9687160184ead9b242f0f1(View view2) {
                InterfaceC0247vt interfaceC0247vt = vt.this.yu;
                if (interfaceC0247vt != null) {
                    interfaceC0247vt.ouw();
                }
            }
        });
        this.pno.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.vt.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/vt$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f53147u, view2);
                safedk_vt$2_onClick_23ec247696342819e8927586b4618d56(view2);
            }

            public void safedk_vt$2_onClick_23ec247696342819e8927586b4618d56(View view2) {
                InterfaceC0247vt interfaceC0247vt = vt.this.yu;
                if (interfaceC0247vt != null) {
                    interfaceC0247vt.vt();
                }
            }
        });
    }

    @Override // android.app.Dialog
    public final void show() {
        super.show();
        ouw();
    }
}
