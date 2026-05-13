package oe;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import qe.i;

/* JADX INFO: compiled from: RefreshContent.java */
/* JADX INFO: loaded from: classes3.dex */
public interface b {
    void a(MotionEvent motionEvent);

    void b(boolean z10);

    ValueAnimator.AnimatorUpdateListener c(int i10);

    void d(int i10, int i11, int i12);

    boolean e();

    void f(i iVar);

    @NonNull
    View g();

    @NonNull
    View getView();

    boolean h();

    void j(e eVar, View view, View view2);
}
