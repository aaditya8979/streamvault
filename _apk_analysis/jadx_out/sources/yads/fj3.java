package yads;

import android.graphics.Matrix;
import android.view.TextureView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class fj3 implements me2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yz2 f89596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yz2 f89597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextureView f89598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kj3 f89599d;

    public final void a() {
        Matrix matrixA;
        yz2 yz2Var = this.f89597b;
        kj3 kj3Var = this.f89599d;
        yz2 yz2Var2 = this.f89596a;
        TextureView textureView = this.f89598c;
        if (yz2Var2 == null || yz2Var == null || kj3Var == null || textureView == null) {
            return;
        }
        jj3 jj3Var = new jj3(yz2Var, yz2Var2);
        if (yz2Var2.f97337b <= 0 || yz2Var2.f97338c <= 0 || yz2Var.f97337b <= 0 || yz2Var.f97338c <= 0) {
            matrixA = null;
        } else {
            int iOrdinal = kj3Var.ordinal();
            if (iOrdinal == 0) {
                matrixA = jj3Var.a(1.0f, 1.0f, hj3.f90435b);
            } else if (iOrdinal == 1) {
                float f10 = yz2Var.f97337b / yz2Var2.f97337b;
                float f11 = yz2Var.f97338c / yz2Var2.f97338c;
                float fMin = Math.min(f10, f11);
                matrixA = jj3Var.a(fMin / f10, fMin / f11, hj3.f90436c);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                float f12 = yz2Var.f97337b / yz2Var2.f97337b;
                float f13 = yz2Var.f97338c / yz2Var2.f97338c;
                float fMax = Math.max(f12, f13);
                matrixA = jj3Var.a(fMax / f12, fMax / f13, hj3.f90436c);
            }
        }
        if (matrixA != null) {
            textureView.setTransform(matrixA);
        }
    }

    @Override // yads.me2
    public final void a(oj3 oj3Var) {
        int iD = oj3Var.f93238b;
        float f10 = oj3Var.f93241e;
        if (f10 > 0.0f) {
            iD = vn.c.d(iD * f10);
        }
        this.f89596a = new yz2(iD, oj3Var.f93239c);
        a();
    }

    public final void b() {
        TextureView textureView = this.f89598c;
        if (this.f89599d == null || textureView == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(0.0f, 0.0f, 0.0f, 0.0f);
        textureView.setTransform(matrix);
    }

    @Override // yads.me2
    public final void onSurfaceSizeChanged(int i10, int i11) {
        this.f89597b = new yz2(i10, i11);
        a();
    }
}
