package yads;

import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class qn3 implements gl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y12 f94090a;

    public qn3(y12 y12Var) {
        this.f94090a = y12Var;
    }

    @Override // yads.gl1
    public final TextView getCountDownProgress() {
        return null;
    }

    @Override // yads.gl1
    public final CheckBox getMuteControl() {
        lm2 lm2Var = this.f94090a.f96974c;
        KProperty kProperty = y12.f96971g[2];
        return (CheckBox) lm2Var.f92035a.get();
    }

    @Override // yads.gl1
    public final ProgressBar getVideoProgress() {
        lm2 lm2Var = this.f94090a.f96975d;
        KProperty kProperty = y12.f96971g[3];
        return (ProgressBar) lm2Var.f92035a.get();
    }
}
