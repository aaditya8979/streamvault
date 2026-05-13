package yads;

import android.graphics.Matrix;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes12.dex */
public final class jj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz2 f91253a;

    public jj3(yz2 yz2Var, yz2 yz2Var2) {
        this.f91253a = yz2Var;
    }

    public final Matrix a(float f10, float f11, hj3 hj3Var) {
        int iOrdinal = hj3Var.ordinal();
        if (iOrdinal == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(f10, f11, 0.0f, 0.0f);
            return matrix;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        yz2 yz2Var = this.f91253a;
        Matrix matrix2 = new Matrix();
        matrix2.setScale(f10, f11, yz2Var.f97337b / 2.0f, yz2Var.f97338c / 2.0f);
        return matrix2;
    }
}
