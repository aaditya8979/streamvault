package yads;

import android.app.Dialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class zc implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f97492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Dialog f97493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ke1 f97494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f97495d;

    public zc(ViewGroup viewGroup, Dialog dialog, ke1 ke1Var) {
        this.f97492a = viewGroup;
        this.f97493b = dialog;
        this.f97494c = ke1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f97495d = rawY;
            return true;
        }
        if (action == 1) {
            if (rawY <= this.f97495d) {
                return true;
            }
            this.f97494c.getClass();
            ke1.a(view);
            ng0.a(this.f97493b);
            return true;
        }
        if (action != 2) {
            return false;
        }
        float f10 = this.f97495d;
        if (rawY <= f10) {
            this.f97492a.setTranslationY(0.0f);
            return true;
        }
        this.f97492a.setTranslationY(rawY - f10);
        return true;
    }
}
