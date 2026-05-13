package yads;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public final class t53 implements gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f95070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArgbEvaluator f95071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ValueAnimator f95072c;

    public /* synthetic */ t53(int i10) {
        this(i10, new ArgbEvaluator());
    }

    public t53(int i10, ArgbEvaluator argbEvaluator) {
        this.f95070a = i10;
        this.f95071b = argbEvaluator;
    }

    @Override // yads.gf
    public final void a(View view) {
        TextView textView = (TextView) view;
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(this.f95071b, Integer.valueOf(textView.getCurrentTextColor()), Integer.valueOf(this.f95070a));
        this.f95072c = valueAnimatorOfObject;
        s53 s53Var = new s53(textView);
        if (valueAnimatorOfObject != null) {
            valueAnimatorOfObject.addUpdateListener(s53Var);
        }
        ValueAnimator valueAnimator = this.f95072c;
        if (valueAnimator != null) {
            valueAnimator.setDuration(500);
        }
        ValueAnimator valueAnimator2 = this.f95072c;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    @Override // yads.gf
    public final void cancel() {
        ValueAnimator valueAnimator = this.f95072c;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.f95072c;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }
}
