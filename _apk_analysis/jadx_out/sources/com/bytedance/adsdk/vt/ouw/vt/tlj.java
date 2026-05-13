package com.bytedance.adsdk.vt.ouw.vt;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tlj extends ra<PointF> {
    private final PointF fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final float[] f12160le;
    private bly pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final PathMeasure f12161ra;

    public tlj(List<? extends com.bytedance.adsdk.vt.ra.ouw<PointF>> list) {
        super(list);
        this.fkw = new PointF();
        this.f12160le = new float[2];
        this.f12161ra = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.adsdk.vt.ouw.vt.ouw
    public final /* synthetic */ Object ouw(com.bytedance.adsdk.vt.ra.ouw ouwVar, float f10) {
        bly blyVar = (bly) ouwVar;
        Path path = blyVar.ouw;
        if (path == null) {
            return (PointF) ouwVar.vt;
        }
        if (this.yu != null) {
            blyVar.pno.floatValue();
            lh();
            ra();
            throw null;
        }
        if (this.pno != blyVar) {
            this.f12161ra.setPath(path, false);
            this.pno = blyVar;
        }
        PathMeasure pathMeasure = this.f12161ra;
        pathMeasure.getPosTan(f10 * pathMeasure.getLength(), this.f12160le, null);
        PointF pointF = this.fkw;
        float[] fArr = this.f12160le;
        pointF.set(fArr[0], fArr[1]);
        return this.fkw;
    }
}
