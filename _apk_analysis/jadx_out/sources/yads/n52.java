package yads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class n52 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final un2 f92744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gl1 f92745b;

    /* JADX WARN: Multi-variable type inference failed */
    public n52(Context context, un2 un2Var, gl1 gl1Var) {
        super(context);
        this.f92744a = un2Var;
        this.f92745b = gl1Var;
        addView(un2Var);
        if (gl1Var == 0 || !(gl1Var instanceof View)) {
            return;
        }
        addView((View) gl1Var);
    }
}
