package com.bytedance.sdk.openadsdk.core.bly;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.cd;
import com.bytedance.sdk.openadsdk.core.mwh.vt.le;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ouw extends com.bytedance.sdk.openadsdk.core.le.lh {
    public int bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public boolean f13425cf;
    public TTDislikeDialogAbstract fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f13426le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.model.vpp f13427lh;
    private com.bytedance.sdk.openadsdk.yu.ra ouw;
    public int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f13428ra;
    public String ryl;
    public boolean tlj;
    public Context vt;
    public com.bytedance.sdk.openadsdk.lh.lh yu;

    public ouw(@NonNull Context context) {
        super(context);
        this.f13426le = "embeded_ad";
        this.tlj = true;
        this.f13425cf = true;
        setTag("tt_express_backup_fl_tag_26");
    }

    public ouw(@NonNull Context context, String str) {
        super(context);
        this.f13426le = "embeded_ad";
        this.tlj = true;
        this.f13425cf = true;
        this.ryl = str;
        setTag("tt_express_backup_fl_tag_26");
    }

    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        DetectTouchUtils.viewOnTouch(g.f53147u, this, motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public String getDescription() {
        return !TextUtils.isEmpty(this.f13427lh.fqk) ? this.f13427lh.fqk : !TextUtils.isEmpty(this.f13427lh.hun) ? this.f13427lh.hun : "";
    }

    public String getNameOrSource() {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f13427lh;
        if (vppVar == null) {
            return "";
        }
        com.bytedance.sdk.openadsdk.core.model.le leVar = vppVar.f13802wp;
        return (leVar == null || TextUtils.isEmpty(leVar.vt)) ? !TextUtils.isEmpty(this.f13427lh.f13798vh) ? this.f13427lh.f13798vh : "" : this.f13427lh.f13802wp.vt;
    }

    public float getRealHeight() {
        return osn.vt(this.vt, this.pno);
    }

    public float getRealWidth() {
        return osn.vt(this.vt, this.f13428ra);
    }

    @Override // android.view.View
    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    public String getTitle() {
        com.bytedance.sdk.openadsdk.core.model.le leVar = this.f13427lh.f13802wp;
        return (leVar == null || TextUtils.isEmpty(leVar.vt)) ? !TextUtils.isEmpty(this.f13427lh.f13798vh) ? this.f13427lh.f13798vh : !TextUtils.isEmpty(this.f13427lh.fqk) ? this.f13427lh.fqk : "" : this.f13427lh.f13802wp.vt;
    }

    public com.bytedance.sdk.openadsdk.core.mwh.vt.le getVideoView() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f13427lh;
        if (vppVar != null && this.vt != null) {
            if (com.bytedance.sdk.openadsdk.core.model.vpp.fkw(vppVar)) {
                try {
                    leVar = new com.bytedance.sdk.openadsdk.core.mwh.vt.le(this.vt, this.f13427lh, this.f13426le, this.ouw);
                    leVar.setVideoCacheUrl(this.ryl);
                    leVar.setControllerStatusCallBack(new le.vt() { // from class: com.bytedance.sdk.openadsdk.core.bly.ouw.2
                        @Override // com.bytedance.sdk.openadsdk.core.mwh.vt.le.vt
                        public final void ouw(boolean z10, long j10, long j11, long j12, boolean z11) {
                        }
                    });
                    leVar.setIsAutoPlay(this.tlj);
                    leVar.ouw(this.f13425cf, "bannerGetVideoView");
                } catch (Throwable unused) {
                    leVar = null;
                }
                if (!com.bytedance.sdk.openadsdk.core.model.vpp.fkw(this.f13427lh) && leVar != null && leVar.ouw(0L, true, false)) {
                    return leVar;
                }
            } else {
                leVar = null;
                if (!com.bytedance.sdk.openadsdk.core.model.vpp.fkw(this.f13427lh)) {
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    public void ouw() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.fkw;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.lh.lh lhVar = this.yu;
        if (lhVar != null) {
            lhVar.ouw();
        } else {
            TTDelegateActivity.ouw(this.f13427lh, null);
        }
    }

    public final void ouw(int i10) {
        com.bytedance.sdk.openadsdk.core.zih.yu();
        this.f13425cf = com.bytedance.sdk.openadsdk.core.settings.cf.vt(String.valueOf(this.bly));
        com.bytedance.sdk.openadsdk.core.zih.yu();
        int iVt = com.bytedance.sdk.openadsdk.core.settings.cf.vt(i10);
        if (3 == iVt) {
            this.tlj = false;
            return;
        }
        int iOuw = ksc.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw(), 60000L);
        if (1 != iVt || !uoy.yu(iOuw)) {
            if (2 == iVt) {
                if (uoy.fkw(iOuw) || uoy.yu(iOuw) || uoy.le(iOuw)) {
                    this.tlj = true;
                    return;
                }
                return;
            }
            if (5 != iVt) {
                return;
            }
            if (!uoy.yu(iOuw) && !uoy.le(iOuw)) {
                return;
            }
        }
        this.tlj = true;
    }

    public final void ouw(View view) {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f13427lh;
        if (vppVar == null || vppVar.f13788sd == null || view == null) {
            return;
        }
        ouw(view, vppVar.f13774ln == 1 && this.tlj);
    }

    public abstract void ouw(View view, int i10, com.bytedance.sdk.openadsdk.core.model.ko koVar);

    public final void ouw(View view, boolean z10) {
        com.bytedance.sdk.openadsdk.core.lh.vt vtVar;
        if (view == null) {
            return;
        }
        if (z10) {
            Context context = this.vt;
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f13427lh;
            String str = this.f13426le;
            vtVar = new com.bytedance.sdk.openadsdk.core.lh.ouw(context, vppVar, str, uoy.ouw(str));
        } else {
            Context context2 = this.vt;
            com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = this.f13427lh;
            String str2 = this.f13426le;
            vtVar = new com.bytedance.sdk.openadsdk.core.lh.vt(context2, vppVar2, str2, uoy.ouw(str2));
        }
        view.setOnTouchListener(vtVar);
        view.setOnClickListener(vtVar);
        vtVar.ouw(new vt() { // from class: com.bytedance.sdk.openadsdk.core.bly.ouw.1
            @Override // com.bytedance.sdk.openadsdk.core.bly.vt
            public final void ouw(View view2, int i10, com.bytedance.sdk.openadsdk.core.model.ko koVar) {
                ouw.this.ouw(view2, i10, koVar);
            }
        });
    }

    public void setDislikeInner(cd cdVar) {
        if (cdVar instanceof com.bytedance.sdk.openadsdk.lh.lh) {
            this.yu = (com.bytedance.sdk.openadsdk.lh.lh) cdVar;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar;
        if (tTDislikeDialogAbstract != null && (vppVar = this.f13427lh) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(vppVar.yhj, vppVar.jae);
        }
        this.fkw = tTDislikeDialogAbstract;
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }
}
