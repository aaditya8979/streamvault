package yads;

import android.widget.ProgressBar;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public final class jj2 implements w63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kw f91250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f91251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f91252c;

    public jj2(ProgressBar progressBar, kw kwVar, long j10) {
        this.f91250a = kwVar;
        this.f91251b = j10;
        this.f91252c = new WeakReference(progressBar);
    }

    @Override // yads.w63
    public final void a(long j10, long j11) {
        ProgressBar progressBar = (ProgressBar) this.f91252c.get();
        if (progressBar != null) {
            kw kwVar = this.f91250a;
            long j12 = this.f91251b;
            kwVar.f91784a.getClass();
            ff.a(progressBar, j12, j12 - j10);
        }
    }
}
