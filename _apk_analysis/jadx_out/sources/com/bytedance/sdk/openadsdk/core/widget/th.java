package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes3.dex */
public final class th {
    public boolean bly;
    public int fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public int f14078le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public float f14079lh;
    public final ouw ouw;
    public float yu;
    private final boolean tlj = false;
    public boolean vt = false;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f14080ra = true;
    public boolean pno = false;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final View.OnTouchListener f14077cf = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.th.1
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/widget/th$1;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            CreativeInfoManager.onViewTouched(g.f53147u, view, motionEvent);
            return safedk_th$1_onTouch_fcfb370339b803a887e2796367140ace(view, motionEvent);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
        @android.annotation.SuppressLint({"ClickableViewAccessibility"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean safedk_th$1_onTouch_fcfb370339b803a887e2796367140ace(android.view.View r10, android.view.MotionEvent r11) {
            /*
                Method dump skipped, instruction units count: 213
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.widget.th.AnonymousClass1.safedk_th$1_onTouch_fcfb370339b803a887e2796367140ace(android.view.View, android.view.MotionEvent):boolean");
        }
    };

    public interface ouw {
        void jg();

        boolean vpp();
    }

    public th(ouw ouwVar) {
        this.ouw = ouwVar;
    }

    public final void ouw(View view) {
        if (view != null) {
            view.setOnTouchListener(this.f14077cf);
        }
    }
}
