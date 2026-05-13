package com.bytedance.adsdk.ugeno.core.vt;

import android.content.Context;
import android.util.Log;
import com.bytedance.adsdk.ugeno.core.ko;
import com.bytedance.adsdk.ugeno.core.mwh;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class fkw {
    public Context bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public ouw f11666cf;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public mwh f11667le;
    private boolean mwh;
    public String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public mwh f11669ra;
    public boolean tlj;
    public float ouw = Float.MIN_VALUE;
    public float vt = Float.MIN_VALUE;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public int f11668lh = 0;
    private int ryl = Integer.MAX_VALUE;
    public int yu = Integer.MAX_VALUE;
    public AtomicBoolean fkw = new AtomicBoolean(true);

    public fkw(Context context, mwh mwhVar, mwh mwhVar2, boolean z10, boolean z11) {
        this.bly = context;
        this.f11667le = mwhVar;
        this.f11669ra = mwhVar2;
        this.tlj = z10;
        this.mwh = z11;
        vt();
    }

    public fkw(Context context, mwh mwhVar, boolean z10, boolean z11) {
        this.bly = context;
        this.f11667le = mwhVar;
        this.tlj = z10;
        this.mwh = z11;
        vt();
    }

    private void vt() {
        if (this.mwh) {
            this.f11666cf = new ouw();
        }
        mwh mwhVar = this.f11667le;
        if (mwhVar == null) {
            return;
        }
        this.f11668lh = mwhVar.f11642lh.optInt("slideThreshold");
        this.pno = this.f11667le.f11642lh.optString("slideDirection");
        this.ryl = this.f11667le.f11642lh.optInt("frequency", Integer.MAX_VALUE);
        this.yu = this.f11667le.f11642lh.optInt("effectiveDuration", Integer.MAX_VALUE);
        Log.d("GesThrough_UGSREvent", "mFrequency: " + this.ryl + ", mEffectiveDuration: " + this.yu + ", inEffectiveDuation: " + this.fkw.get());
    }

    public final void ouw() {
        this.ouw = Float.MIN_VALUE;
        this.vt = Float.MIN_VALUE;
    }

    public final void ouw(ko koVar, mwh mwhVar, com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        if (this.ryl <= 0) {
            Log.d("GesThrough_UGSREvent", "frequency <= 0, no trigger slide");
            ouw(lhVar);
        } else {
            if (!this.fkw.get()) {
                Log.d("GesThrough_UGSREvent", "not in effective duration, no trigger slide");
                ouw(lhVar);
                return;
            }
            koVar.ouw(mwhVar, lhVar);
            int i10 = this.ryl;
            if (i10 != Integer.MAX_VALUE) {
                this.ryl = i10 - 1;
            }
        }
    }

    public final void ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        if (this.f11666cf != null) {
            Log.d("GesThrough_UGSREvent", "need gesture through, replayGestureMotions");
            this.f11666cf.ouw(lhVar);
        }
    }
}
