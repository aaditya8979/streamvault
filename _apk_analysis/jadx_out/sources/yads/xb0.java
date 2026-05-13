package yads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: loaded from: classes11.dex */
public final class xb0 extends AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yb0 f96701a;

    public xb0(yb0 yb0Var) {
        this.f96701a = yb0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        ln2 ln2Var;
        zb0 zb0Var = this.f96701a.f97056c;
        if (audioTrack != zb0Var.f97474u) {
            throw new IllegalStateException();
        }
        gl glVar = zb0Var.f97471r;
        if (glVar == null || !zb0Var.U || (ln2Var = ((ek1) glVar).f89284a.Q0) == null) {
            return;
        }
        ((ao0) ln2Var).f87761a.f90061i.f90680a.sendEmptyMessage(2);
    }

    public final void onTearDown(AudioTrack audioTrack) {
        ln2 ln2Var;
        zb0 zb0Var = this.f96701a.f97056c;
        if (audioTrack != zb0Var.f97474u) {
            throw new IllegalStateException();
        }
        gl glVar = zb0Var.f97471r;
        if (glVar == null || !zb0Var.U || (ln2Var = ((ek1) glVar).f89284a.Q0) == null) {
            return;
        }
        ((ao0) ln2Var).f87761a.f90061i.f90680a.sendEmptyMessage(2);
    }
}
