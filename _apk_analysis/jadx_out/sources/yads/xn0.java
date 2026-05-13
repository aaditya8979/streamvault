package yads;

import android.media.MediaFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class xn0 implements nh3, at, af2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nh3 f96823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public at f96824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ps2 f96825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ps2 f96826e;

    @Override // yads.nh3
    public final void a(long j10, long j11, mx0 mx0Var, MediaFormat mediaFormat) {
        ps2 ps2Var = this.f96825d;
        if (ps2Var != null) {
            ps2Var.a(j10, j11, mx0Var, mediaFormat);
        }
        nh3 nh3Var = this.f96823b;
        if (nh3Var != null) {
            nh3Var.a(j10, j11, mx0Var, mediaFormat);
        }
    }

    @Override // yads.af2
    public final void handleMessage(int i10, Object obj) {
        if (i10 == 7) {
            this.f96823b = (nh3) obj;
            return;
        }
        if (i10 == 8) {
            this.f96824c = (at) obj;
            return;
        }
        if (i10 != 10000) {
            return;
        }
        i23 i23Var = (i23) obj;
        if (i23Var == null) {
            this.f96825d = null;
            this.f96826e = null;
        } else {
            ps2 ps2Var = i23Var.f90650f;
            this.f96825d = ps2Var;
            this.f96826e = ps2Var;
        }
    }

    @Override // yads.at
    public final void onCameraMotion(long j10, float[] fArr) {
        ps2 ps2Var = this.f96826e;
        if (ps2Var != null) {
            ps2Var.onCameraMotion(j10, fArr);
        }
        at atVar = this.f96824c;
        if (atVar != null) {
            atVar.onCameraMotion(j10, fArr);
        }
    }

    @Override // yads.at
    public final void onCameraMotionReset() {
        ps2 ps2Var = this.f96826e;
        if (ps2Var != null) {
            ps2Var.onCameraMotionReset();
        }
        at atVar = this.f96824c;
        if (atVar != null) {
            atVar.onCameraMotionReset();
        }
    }
}
