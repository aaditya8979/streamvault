package com.bytedance.sdk.openadsdk.core.lh;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.zih;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lh implements View.OnClickListener, View.OnTouchListener {
    private static long fkw = 0;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static float f13615lh = 0.0f;
    private static float ouw = 0.0f;
    public static int uoy = 8;
    private static float vt;
    private static float yu;
    public View ey;
    public float ksc = -1.0f;
    public float jae = -1.0f;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public float f13619od = -1.0f;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public float f13617cd = -1.0f;

    /* JADX INFO: renamed from: uq, reason: collision with root package name */
    public long f13622uq = -1;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public long f13620pd = -1;
    public int fvf = -1;

    /* JADX INFO: renamed from: bs, reason: collision with root package name */
    public int f13616bs = -1024;
    public int fak = -1;
    public boolean osn = true;
    public SparseArray<ouw> rrs = new SparseArray<>();

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f13618le = 0;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f13621ra = 0;

    public static class ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public double f13623lh;
        public int ouw;
        public double vt;
        public long yu;

        public ouw(int i10, double d10, double d11, long j10) {
            this.ouw = i10;
            this.vt = d10;
            this.f13623lh = d11;
            this.yu = j10;
        }
    }

    static {
        if (zih.ouw() != null) {
            uoy = zih.vt();
        }
        ouw = 0.0f;
        vt = 0.0f;
        f13615lh = 0.0f;
        yu = 0.0f;
        fkw = 0L;
    }

    private boolean ouw(View view, Point point) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                View childAt = viewGroup.getChildAt(i14);
                if (vt.vt(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i10 = point.x) >= (i11 = iArr[0]) && i10 <= i11 + childAt.getWidth() && (i12 = point.y) >= (i13 = iArr[1]) && i12 <= i13 + childAt.getHeight();
                }
                if (ouw(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/lh/lh;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(g.f53147u, view);
        safedk_lh_onClick_5e8bb9c3f6c0daebb5c8c9ce81d78777(view);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/lh/lh;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        CreativeInfoManager.onViewTouched(g.f53147u, view, motionEvent);
        return safedk_lh_onTouch_142e4d5725857f1365965fa6d064820e(view, motionEvent);
    }

    public abstract void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<ouw> sparseArray, boolean z10);

    public void safedk_lh_onClick_5e8bb9c3f6c0daebb5c8c9ce81d78777(View view) {
        if (com.bytedance.sdk.openadsdk.core.settings.ra.ouw()) {
            ouw(view, this.ksc, this.jae, this.f13619od, this.f13617cd, this.rrs, this.osn);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean safedk_lh_onTouch_142e4d5725857f1365965fa6d064820e(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.lh.lh.safedk_lh_onTouch_142e4d5725857f1365965fa6d064820e(android.view.View, android.view.MotionEvent):boolean");
    }

    public final boolean yu() {
        return this.osn;
    }
}
