package yads;

import android.widget.ProgressBar;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final class hf1 implements tj2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f90396d = {tn.t.f(new MutablePropertyReference1Impl(hf1.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gf1 f90397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ff f90398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lm2 f90399c;

    public /* synthetic */ hf1() {
        this(new gf1(), new ff());
    }

    public hf1(gf1 gf1Var, ff ffVar) {
        this.f90397a = gf1Var;
        this.f90398b = ffVar;
        this.f90399c = mm2.a(null);
    }

    @Override // yads.tj2
    public final void a() {
        lm2 lm2Var = this.f90399c;
        KProperty kProperty = f90396d[0];
        ProgressBar progressBar = (ProgressBar) lm2Var.f92035a.get();
        if (progressBar != null) {
            long max = progressBar.getMax();
            this.f90398b.getClass();
            ff.a(progressBar, max, max);
        }
    }

    @Override // yads.tj2
    public final void a(long j10, long j11) {
        lm2 lm2Var = this.f90399c;
        KProperty kProperty = f90396d[0];
        ProgressBar progressBar = (ProgressBar) lm2Var.f92035a.get();
        if (progressBar != null) {
            this.f90398b.getClass();
            ff.a(progressBar, j10, j11);
        }
    }
}
