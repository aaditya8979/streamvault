package com.bytedance.sdk.openadsdk.core.lh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.rn;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class ouw extends vt {
    public boolean fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public boolean f13624le;
    private WeakReference<InterfaceC0233ouw> ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f13625ra;
    private int vt;
    public boolean yu;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.lh.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0233ouw {
        long getVideoProgress();
    }

    public ouw(@NonNull Context context, @NonNull vpp vppVar, @NonNull String str, int i10) {
        super(context, vppVar, str, i10);
        this.yu = true;
        this.fkw = false;
        this.f13624le = false;
        this.f13625ra = false;
    }

    private boolean fkw() {
        vpp vppVar = this.tlj;
        if (vppVar == null) {
            return true;
        }
        int iFqk = vppVar.fqk();
        zih.yu();
        int iVt = cf.vt(iFqk);
        int iOuw = ksc.ouw(zih.ouw(), 60000L);
        if (iVt == 1) {
            return uoy.yu(iOuw);
        }
        if (iVt == 2) {
            return uoy.fkw(iOuw) || uoy.yu(iOuw) || uoy.le(iOuw);
        }
        if (iVt != 3) {
            return iVt != 5 || uoy.yu(iOuw) || uoy.le(iOuw);
        }
        return false;
    }

    private boolean lh(View view) {
        if (view == null) {
            return false;
        }
        if (view instanceof com.bytedance.sdk.openadsdk.core.mwh.vt.le) {
            ko.lh("ClickCreativeListener", "NativeVideoTsView....");
            return true;
        }
        if (view.getId() == rn.qni || view.getId() == rn.rrs || view.getId() == rn.jvy || view.getId() == rn.fqk || view.getId() == rn.hun) {
            ko.lh("ClickCreativeListener", "tt_video_ad_cover_center_layout....");
            return true;
        }
        if (view.getId() == 520093726 || view.getId() == rn.f14348ki) {
            ko.lh("ClickCreativeListener", "tt_root_view....");
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        int i10 = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i10 >= viewGroup.getChildCount()) {
                return false;
            }
            if (lh(viewGroup.getChildAt(i10))) {
                return true;
            }
            i10++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f8  */
    @Override // com.bytedance.sdk.openadsdk.core.lh.vt, com.bytedance.sdk.openadsdk.core.lh.lh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ouw(android.view.View r32, float r33, float r34, float r35, float r36, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.lh.lh.ouw> r37, boolean r38) {
        /*
            Method dump skipped, instruction units count: 1194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.lh.ouw.ouw(android.view.View, float, float, float, float, android.util.SparseArray, boolean):void");
    }

    public final void ouw(InterfaceC0233ouw interfaceC0233ouw) {
        this.ouw = new WeakReference<>(interfaceC0233ouw);
    }

    public boolean ouw() {
        return false;
    }

    public boolean vt() {
        return false;
    }
}
