package com.bytedance.adsdk.ugeno.bly.vt;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.vt.ouw;

/* JADX INFO: loaded from: classes12.dex */
public class vt extends com.bytedance.adsdk.ugeno.vt.ouw<com.bytedance.adsdk.ugeno.bly.vt.ouw> {

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.bly.vt.ouw f11611ln;

    public static class ouw extends ouw.C0182ouw {
        public int ksc;

        public ouw(com.bytedance.adsdk.ugeno.vt.ouw ouwVar) {
            super(ouwVar);
            this.ksc = -1;
        }

        @Override // com.bytedance.adsdk.ugeno.vt.ouw.C0182ouw
        public final /* synthetic */ ViewGroup.LayoutParams ouw() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.ouw, (int) this.vt);
            layoutParams.leftMargin = (int) this.f11851le;
            layoutParams.rightMargin = (int) this.f11853ra;
            layoutParams.topMargin = (int) this.pno;
            layoutParams.bottomMargin = (int) this.bly;
            layoutParams.gravity = this.ksc;
            return layoutParams;
        }

        @Override // com.bytedance.adsdk.ugeno.vt.ouw.C0182ouw
        public final void ouw(Context context, String str, String str2) {
            String[] strArrSplit;
            int i10;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.ouw(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                int i11 = -1;
                if (!TextUtils.isEmpty(str2) && (strArrSplit = str2.split("\\|")) != null && strArrSplit.length > 0) {
                    int i12 = 0;
                    for (String str3 : strArrSplit) {
                        str3.hashCode();
                        i10 = 5;
                        switch (str3) {
                            case "bottom":
                                i10 = 80;
                                break;
                            case "center":
                                i10 = 17;
                                break;
                            case "center_vertical":
                                i10 = 16;
                                break;
                            case "top":
                                i10 = 48;
                                break;
                            case "left":
                                i10 = 3;
                                break;
                            case "right":
                                break;
                            case "center_horizontal":
                                i10 = 1;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                        i12 |= i10;
                    }
                    i11 = i12;
                }
                this.ksc = i11;
            }
        }
    }

    public vt(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw
    public final ouw.C0182ouw bly() {
        return new ouw(this);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final /* synthetic */ View ouw() {
        com.bytedance.adsdk.ugeno.bly.vt.ouw ouwVar = new com.bytedance.adsdk.ugeno.bly.vt.ouw(this.vt);
        this.f11611ln = ouwVar;
        ouwVar.ouw = this;
        return ouwVar;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw, com.bytedance.adsdk.ugeno.vt.lh
    public final void vt() {
        this.f11611ln.setEventMap(this.mwe);
        super.vt();
    }
}
