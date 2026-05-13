package yads;

import android.graphics.Matrix;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class ij3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz2 f90860a;

    public ij3(yz2 yz2Var, yz2 yz2Var2) {
        this.f90860a = yz2Var;
    }

    public final Matrix a(float f10, float f11, gj3 gj3Var) {
        int iOrdinal = gj3Var.ordinal();
        if (iOrdinal == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(f10, f11, 0.0f, 0.0f);
            return matrix;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        yz2 yz2Var = this.f90860a;
        Matrix matrix2 = new Matrix();
        matrix2.setScale(f10, f11, yz2Var.f97337b / 2.0f, yz2Var.f97338c / 2.0f);
        return matrix2;
    }
}
