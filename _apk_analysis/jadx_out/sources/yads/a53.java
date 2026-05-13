package yads;

import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.MainThread;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class a53 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SurfaceView f87585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f87586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ij1 f87587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public li f87588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ji3 f87589e;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        hj1 hj1VarA = this.f87587c.a(i10, i11);
        super.onMeasure(hj1VarA.f90433a, hj1VarA.f90434b);
        li liVar = this.f87588d;
        if (liVar != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f10 = measuredWidth;
            float f11 = measuredHeight;
            float f12 = liVar.f91970a;
            if ((f12 / (f10 / f11)) - 1 > 0.0f) {
                measuredHeight = (int) (f10 / f12);
            } else {
                measuredWidth = (int) (f11 * f12);
            }
            liVar.f91971b.f90433a = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            liVar.f91971b.f90434b = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            hj1 hj1Var = liVar.f91971b;
            if (hj1Var == null) {
                return;
            }
            this.f87585a.measure(hj1Var.f90433a, hj1Var.f90434b);
        }
    }

    public final void setAspectRatio(float f10) {
        if (f10 <= 0.0f || f10 == this.f87586b) {
            return;
        }
        this.f87586b = f10;
        this.f87588d = new li(f10, new hj1());
        this.f87587c = new ok2(f10);
        requestLayout();
    }

    @MainThread
    public final void setPlayer(@Nullable ji3 ji3Var) {
        if (tn.p.f(this.f87589e, ji3Var)) {
            return;
        }
        ji3 ji3Var2 = this.f87589e;
        if (ji3Var2 != null) {
            ji3Var2.clearVideoSurfaceView(this.f87585a);
        }
        this.f87589e = ji3Var;
        if (ji3Var == null || !ji3Var.a()) {
            return;
        }
        ji3Var.setVideoSurfaceView(this.f87585a);
    }
}
