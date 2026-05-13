package yads;

import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: loaded from: classes6.dex */
public final class wi3 implements qf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dk3 f96396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ff f96397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a20 f96398c;

    public /* synthetic */ wi3(dk3 dk3Var) {
        this(dk3Var, new ff(), new a20());
    }

    public wi3(dk3 dk3Var, ff ffVar, a20 a20Var) {
        this.f96396a = dk3Var;
        this.f96397b = ffVar;
        this.f96398c = a20Var;
    }

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        e72 e72Var = (e72) this.f96396a.b();
        if (e72Var != null) {
            gl1 gl1Var = e72Var.f89137c.f92745b;
            ProgressBar videoProgress = gl1Var != null ? gl1Var.getVideoProgress() : null;
            if (videoProgress != null) {
                this.f96397b.getClass();
                ff.a(videoProgress, j10, j11);
            }
            gl1 gl1Var2 = e72Var.f89137c.f92745b;
            TextView countDownProgress = gl1Var2 != null ? gl1Var2.getCountDownProgress() : null;
            if (countDownProgress != null) {
                this.f96398c.f87550a.getClass();
                countDownProgress.setText(oj2.a(j10 - j11));
            }
        }
    }
}
