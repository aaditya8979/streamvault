package yads;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class zd2 implements ef3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ef3 f97539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ae2 f97540b;

    public zd2(ae2 ae2Var) {
        this.f97540b = ae2Var;
    }

    @Override // yads.ef3
    public final void a() {
        ef3 ef3Var = this.f97539a;
        if (ef3Var != null) {
            ef3Var.a();
        }
    }

    @Override // yads.ef3
    public final void b() {
        e72 e72Var = (e72) this.f97540b.f87673a.b();
        if (e72Var != null) {
            n52 n52Var = e72Var.f89137c;
            g72 g72Var = this.f97540b.f87675c;
            gl1 gl1Var = n52Var.f92745b;
            g72Var.getClass();
            if (gl1Var != null) {
                CheckBox muteControl = gl1Var.getMuteControl();
                if (muteControl != null) {
                    muteControl.setOnClickListener(null);
                    muteControl.setVisibility(8);
                }
                ProgressBar videoProgress = gl1Var.getVideoProgress();
                if (videoProgress != null) {
                    videoProgress.setProgress(0);
                    videoProgress.setVisibility(8);
                }
                TextView countDownProgress = gl1Var.getCountDownProgress();
                if (countDownProgress != null) {
                    countDownProgress.setText("");
                    countDownProgress.setVisibility(8);
                }
            }
        }
        ef3 ef3Var = this.f97539a;
        if (ef3Var != null) {
            ef3Var.b();
        }
    }

    @Override // yads.ef3
    public final void c() {
        e72 e72Var = (e72) this.f97540b.f87673a.b();
        if (e72Var != null) {
            this.f97540b.f87676d.a(e72Var);
        }
        ef3 ef3Var = this.f97539a;
        if (ef3Var != null) {
            ef3Var.c();
        }
    }
}
