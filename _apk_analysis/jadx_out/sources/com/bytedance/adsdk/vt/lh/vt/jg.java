package com.bytedance.adsdk.vt.lh.vt;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class jg {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f12055lh;
    public final List<com.bytedance.adsdk.vt.lh.ouw> ouw;
    public PointF vt;

    public jg() {
        this.ouw = new ArrayList();
    }

    public jg(PointF pointF, boolean z10, List<com.bytedance.adsdk.vt.lh.ouw> list) {
        this.vt = pointF;
        this.f12055lh = z10;
        this.ouw = new ArrayList(list);
    }

    public final void ouw(float f10, float f11) {
        if (this.vt == null) {
            this.vt = new PointF();
        }
        this.vt.set(f10, f11);
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.ouw.size() + "closed=" + this.f12055lh + '}';
    }
}
