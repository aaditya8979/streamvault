package com.bytedance.sdk.openadsdk.core.cf.le;

import android.content.Context;
import android.graphics.Color;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class fkw {
    public JSONObject bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public boolean f13499cf;
    public com.bytedance.adsdk.ugeno.vt.lh fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public JSONArray f13500jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final vpp f13502le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.adsdk.ugeno.vt.lh f13503lh;
    public boolean mwh;
    public com.bytedance.sdk.openadsdk.core.widget.fkw pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final String f13504ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private final Context f13505rn;
    public boolean ryl;
    public final JSONObject tlj;
    public com.bytedance.adsdk.ugeno.vt.lh yu;
    public int ouw = -1;
    public int vt = -1;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final String f13501ko = "UGenSwiperEvent";

    public fkw(Context context, vpp vppVar, String str, JSONObject jSONObject) {
        this.f13505rn = context;
        this.f13502le = vppVar;
        this.f13504ra = str;
        this.tlj = jSONObject;
    }

    private static void ouw(TextView textView, int i10) {
        int currentTextColor = textView.getCurrentTextColor();
        textView.setTextColor(Color.argb(i10, Color.red(currentTextColor), Color.green(currentTextColor), Color.blue(currentTextColor)));
    }

    public final void ouw(boolean z10, boolean z11, boolean z12) {
        com.bytedance.adsdk.ugeno.vt.lh lhVar;
        com.bytedance.adsdk.ugeno.vt.lh lhVar2 = this.f13503lh;
        if (lhVar2 == null || (lhVar = this.yu) == null) {
            return;
        }
        T t10 = lhVar2.fkw;
        T t11 = lhVar.fkw;
        JSONArray jSONArray = this.f13500jg;
        if (jSONArray != null && jSONArray.length() == 1) {
            t10.setVisibility(8);
            t11.setVisibility(8);
            return;
        }
        if (z10) {
            return;
        }
        if (z11) {
            if (t10 instanceof TextView) {
                ouw((TextView) t10, 90);
            }
            if (t11 instanceof TextView) {
                ouw((TextView) t11, 255);
                return;
            }
            return;
        }
        if (z12) {
            if (t10 instanceof TextView) {
                ouw((TextView) t10, 255);
            }
            if (t11 instanceof TextView) {
                ouw((TextView) t11, 90);
                return;
            }
            return;
        }
        if (t10 instanceof TextView) {
            ouw((TextView) t10, 255);
        }
        if (t11 instanceof TextView) {
            ouw((TextView) t11, 255);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8 A[Catch: all -> 0x00f8, TryCatch #1 {all -> 0x00f8, blocks: (B:6:0x0015, B:8:0x0019, B:10:0x0021, B:14:0x0031, B:17:0x003a, B:20:0x006b, B:22:0x0073, B:23:0x0077, B:25:0x007d, B:29:0x009a, B:50:0x00d5, B:52:0x00db, B:54:0x00e0, B:36:0x00b4, B:38:0x00ba, B:41:0x00c1, B:44:0x00c8), top: B:64:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean ouw(com.bytedance.adsdk.ugeno.core.mwh r18) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.cf.le.fkw.ouw(com.bytedance.adsdk.ugeno.core.mwh):boolean");
    }
}
