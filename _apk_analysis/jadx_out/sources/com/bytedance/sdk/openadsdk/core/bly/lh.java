package com.bytedance.sdk.openadsdk.core.bly;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.bly.fkw;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.google.android.material.badge.BadgeDrawable;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class lh {
    private int bly;
    public ScheduledFuture<?> fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final Context f13414le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public qbp f13415lh;
    public ouw ouw;
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f13416ra;
    public com.bytedance.sdk.component.adexpress.vt.ko vt;
    public com.bytedance.sdk.openadsdk.core.model.vpp yu;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.bly.lh$lh, reason: collision with other inner class name */
    public interface InterfaceC0217lh {
        void ouw();

        void ouw(int i10, int i11);

        void ouw(String str);

        void vt(String str);
    }

    public static class ouw implements com.bytedance.sdk.component.adexpress.vt.yu<View>, fkw.vt {
        public PAGExpressAdWrapperListener bly;

        /* JADX INFO: renamed from: cf, reason: collision with root package name */
        private final int f13417cf;
        public com.bytedance.sdk.openadsdk.core.model.vpp fkw;

        /* JADX INFO: renamed from: jg, reason: collision with root package name */
        private int f13418jg;

        /* JADX INFO: renamed from: ko, reason: collision with root package name */
        private com.bytedance.sdk.component.adexpress.vt.ra f13419ko;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public AtomicBoolean f13420le = new AtomicBoolean(false);

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f13421lh;
        private final int mwh;
        public com.bytedance.sdk.openadsdk.lh.lh ouw;
        public fkw pno;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public String f13422ra;
        private FrameLayout ryl;
        private final int tlj;
        public TTDislikeDialogAbstract vt;
        public final Context yu;

        public ouw(Context context, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, int i10, int i11, String str, int i12) {
            fkw fkwVarRemove;
            this.f13422ra = str;
            if (vppVar != null && vppVar.lso()) {
                this.f13422ra = "fullscreen_interstitial_ad";
            }
            this.yu = context;
            this.tlj = i10;
            this.f13417cf = i11;
            this.fkw = vppVar;
            int iOuw = osn.ouw(context, 3.0f);
            this.mwh = iOuw;
            this.f13418jg = i12;
            FrameLayout frameLayout = new FrameLayout(context);
            this.ryl = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams = layoutParams == null ? new FrameLayout.LayoutParams(i10, i11) : layoutParams;
            layoutParams.width = i10;
            layoutParams.height = i11;
            layoutParams.gravity = 17;
            this.ryl.setLayoutParams(layoutParams);
            yu yuVarOuw = yu.ouw();
            fkw fkwVar = null;
            if (yuVarOuw.ouw.size() > 0 && (fkwVarRemove = yuVarOuw.ouw.remove(0)) != null) {
                fkwVar = fkwVarRemove;
            }
            this.pno = fkwVar;
            if (fkwVar == null) {
                this.pno = new fkw(context);
            }
            yu.ouw();
            yu.vt(this.pno);
            this.pno.ouw(this.fkw, this, this.f13422ra);
            this.pno.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            fkw fkwVar2 = this.pno;
            this.ryl.addView(fkwVar2);
            View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, this.fkw);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.fkw;
            if (vppVar2 == null || !vppVar2.lso()) {
                layoutParams2.topMargin = iOuw;
                layoutParams2.leftMargin = iOuw;
            } else {
                layoutParams2.leftMargin = osn.ouw(context, 20.0f);
                layoutParams2.bottomMargin = osn.ouw(context, 20.0f);
                layoutParams2.gravity = BadgeDrawable.BOTTOM_START;
            }
            viewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams2);
            viewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.bly.lh.ouw.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/bly/lh$ouw$1;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f53147u, view);
                    safedk_lh$ouw$1_onClick_7ac8b78879b780cf742865703e37c3bf(view);
                }

                public void safedk_lh$ouw$1_onClick_7ac8b78879b780cf742865703e37c3bf(View view) {
                    ouw ouwVar = ouw.this;
                    TTWebsiteActivity.ouw(ouwVar.yu, ouwVar.fkw, ouwVar.f13422ra);
                }
            });
            this.ryl.addView(viewCreatePAGLogoViewByMaterial);
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar3 = this.fkw;
            if (vppVar3 != null && vppVar3.lso()) {
                fkwVar2.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
                fkwVar2.ouw(((Activity) context).findViewById(com.bytedance.sdk.openadsdk.utils.rn.upp), FriendlyObstructionPurpose.OTHER);
            }
            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
            fkwVar2.ouw(viewCreatePAGLogoViewByMaterial, friendlyObstructionPurpose);
            if (context == null || !(context instanceof Activity)) {
                return;
            }
            View viewFindViewById = ((Activity) context).findViewById(com.bytedance.sdk.openadsdk.utils.rn.amr);
            if (viewFindViewById != null) {
                fkwVar2.ouw(viewFindViewById, friendlyObstructionPurpose);
            }
            View viewFindViewById2 = ((Activity) context).findViewById(com.bytedance.sdk.openadsdk.utils.rn.f14372uj);
            if (viewFindViewById2 != null) {
                fkwVar2.ouw(viewFindViewById2, friendlyObstructionPurpose);
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.vt.yu
        public final View lh() {
            return this.ryl;
        }

        @Override // com.bytedance.sdk.openadsdk.core.bly.fkw.vt
        public final void m_() {
            PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.bly;
            if (pAGExpressAdWrapperListener != null) {
                pAGExpressAdWrapperListener.onAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.bly.fkw.vt
        @SuppressLint({"ClickableViewAccessibility"})
        public final void n_() {
            if (this.f13419ko != null) {
                com.bytedance.sdk.component.adexpress.vt.jg jgVar = new com.bytedance.sdk.component.adexpress.vt.jg();
                jgVar.vt = true;
                jgVar.f12444lh = osn.vt(this.yu, this.tlj);
                jgVar.yu = osn.vt(this.yu, this.f13417cf);
                this.f13419ko.ouw(this.ryl, jgVar);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.bly.fkw.vt
        public final View ouw() {
            FrameLayout frameLayout = this.ryl;
            if (frameLayout == null) {
                return null;
            }
            return (View) frameLayout.getParent();
        }

        @Override // com.bytedance.sdk.openadsdk.core.bly.fkw.vt
        public final void ouw(int i10) {
            com.bytedance.sdk.component.adexpress.vt.ra raVar = this.f13419ko;
            if (raVar != null) {
                raVar.ouw(i10, "render fail");
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.vt.yu
        public final void ouw(com.bytedance.sdk.component.adexpress.vt.ra raVar) {
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar;
            if (this.f13420le.get()) {
                return;
            }
            if (this.yu == null || (vppVar = this.fkw) == null) {
                raVar.ouw(106, "material null");
                return;
            }
            this.f13419ko = raVar;
            if (TextUtils.isEmpty(vppVar.swm)) {
                raVar.ouw(106, "dsp data is null");
            } else {
                this.pno.cf();
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.vt.yu
        public final int vt() {
            return 5;
        }

        public final void yu() {
            this.ryl = null;
            this.ouw = null;
            this.vt = null;
            this.f13419ko = null;
            this.fkw = null;
            fkw fkwVar = this.pno;
            if (fkwVar != null) {
                fkwVar.bly();
                yu.ouw().ouw(this.pno);
            }
            this.f13420le.set(true);
        }
    }

    public static class vt implements Runnable {
        public InterfaceC0217lh ouw;

        public vt(InterfaceC0217lh interfaceC0217lh) {
            this.ouw = interfaceC0217lh;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC0217lh interfaceC0217lh = this.ouw;
            if (interfaceC0217lh != null) {
                interfaceC0217lh.ouw(107, 107);
            }
        }
    }

    public lh(Context context, qbp qbpVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, String str) {
        this.yu = vppVar;
        this.f13414le = context;
        this.f13415lh = qbpVar;
        if (vppVar == null || !vppVar.lso()) {
            vm vmVarOuw = com.bytedance.sdk.openadsdk.core.yu.vt.ouw(qbpVar.getExpectExpressWidth(), qbpVar.getExpectExpressHeight());
            this.bly = vmVarOuw.ouw;
            if (qbpVar.getExpectExpressWidth() <= 0 || qbpVar.getExpectExpressHeight() <= 0) {
                int iYu = osn.yu(context);
                this.f13416ra = iYu;
                this.pno = Float.valueOf(iYu / vmVarOuw.vt).intValue();
            } else {
                this.f13416ra = osn.ouw(context, qbpVar.getExpectExpressWidth());
                this.pno = osn.ouw(context, qbpVar.getExpectExpressHeight());
            }
            int i10 = this.f13416ra;
            if (i10 > 0 && i10 > osn.yu(context)) {
                this.f13416ra = osn.yu(context);
                this.pno = Float.valueOf(this.pno * (osn.yu(context) / this.f13416ra)).intValue();
            }
        } else {
            this.f13416ra = -1;
            this.pno = -1;
        }
        this.ouw = new ouw(context, vppVar, this.f13416ra, this.pno, str, this.bly);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vt() {
        try {
            ScheduledFuture<?> scheduledFuture = this.fkw;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.fkw.cancel(false);
            this.fkw = null;
        } catch (Throwable unused) {
        }
    }

    public final void ouw() {
        ouw ouwVar = this.ouw;
        if (ouwVar != null) {
            ouwVar.yu();
            this.ouw = null;
        }
        vt();
        this.vt = null;
        this.f13415lh = null;
    }
}
