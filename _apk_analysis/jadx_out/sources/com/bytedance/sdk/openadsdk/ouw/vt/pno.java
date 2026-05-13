package com.bytedance.sdk.openadsdk.ouw.vt;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.rn;
import com.bytedance.sdk.openadsdk.utils.od;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class pno extends PAGNativeAd {
    private boolean bly;
    public ouw fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f14218le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final vpp f14219lh;
    private boolean ouw;
    public String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public int f14220ra;
    public rn vt;
    public final Context yu;

    public pno(@NonNull Context context, @NonNull vpp vppVar, boolean z10) {
        if (vppVar == null) {
            ko.yu("materialMeta can't been null");
        }
        this.f14219lh = vppVar;
        this.yu = context;
        this.f14218le = 5;
        this.f14220ra = vppVar.fqk();
        String strLh = uoy.lh(5);
        this.pno = strLh;
        if (z10) {
            ouw ouwVar = new ouw(context, vppVar, strLh);
            this.fkw = ouwVar;
            this.vt = new rn(context, this, vppVar, "embeded_ad", ouwVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        Map<String, Object> map;
        vpp vppVar = this.f14219lh;
        if (vppVar == null || (map = vppVar.npr) == null) {
            return null;
        }
        try {
            return map.get(str);
        } catch (Throwable th2) {
            qbp.lh("TTNativeAdImpl", th2.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        vpp vppVar = this.f14219lh;
        if (vppVar != null) {
            return vppVar.npr;
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public PAGNativeAdData getNativeAdData() {
        return new yu(this.fkw);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.bly) {
            return;
        }
        od.ouw(this.f14219lh, d10, str, str2);
        this.bly = true;
    }

    public void ouw(String str) {
        this.pno = str;
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void registerViewForInteraction(@NonNull ViewGroup viewGroup, @NonNull List<View> list, @Nullable List<View> list2, @Nullable View view, PAGNativeAdInteractionCallback pAGNativeAdInteractionCallback) {
        registerViewForInteraction(viewGroup, list, list2, view, (PAGNativeAdInteractionListener) pAGNativeAdInteractionCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void registerViewForInteraction(@androidx.annotation.NonNull final android.view.ViewGroup r9, @androidx.annotation.NonNull java.util.List<android.view.View> r10, @androidx.annotation.Nullable java.util.List<android.view.View> r11, @androidx.annotation.Nullable android.view.View r12, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener r13) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.ouw.vt.pno.registerViewForInteraction(android.view.ViewGroup, java.util.List, java.util.List, android.view.View, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener):void");
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (this.ouw) {
            return;
        }
        od.ouw(this.f14219lh, d10);
        this.ouw = true;
    }
}
