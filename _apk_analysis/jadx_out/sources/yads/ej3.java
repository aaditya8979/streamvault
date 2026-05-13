package yads;

import android.graphics.Matrix;
import android.view.TextureView;
import androidx.media3.common.Player;
import androidx.media3.common.VideoSize;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class ej3 implements Player.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yz2 f89278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yz2 f89279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextureView f89280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kj3 f89281d;

    public final void a() {
        Matrix matrixA;
        yz2 yz2Var = this.f89279b;
        kj3 kj3Var = this.f89281d;
        yz2 yz2Var2 = this.f89278a;
        TextureView textureView = this.f89280c;
        if (yz2Var2 == null || yz2Var == null || kj3Var == null || textureView == null) {
            return;
        }
        ij3 ij3Var = new ij3(yz2Var, yz2Var2);
        if (yz2Var2.f97337b <= 0 || yz2Var2.f97338c <= 0 || yz2Var.f97337b <= 0 || yz2Var.f97338c <= 0) {
            matrixA = null;
        } else {
            int iOrdinal = kj3Var.ordinal();
            if (iOrdinal == 0) {
                matrixA = ij3Var.a(1.0f, 1.0f, gj3.f90011b);
            } else if (iOrdinal == 1) {
                float f10 = yz2Var.f97337b / yz2Var2.f97337b;
                float f11 = yz2Var.f97338c / yz2Var2.f97338c;
                float fMin = Math.min(f10, f11);
                matrixA = ij3Var.a(fMin / f10, fMin / f11, gj3.f90012c);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                float f12 = yz2Var.f97337b / yz2Var2.f97337b;
                float f13 = yz2Var.f97338c / yz2Var2.f97338c;
                float fMax = Math.max(f12, f13);
                matrixA = ij3Var.a(fMax / f12, fMax / f13, gj3.f90012c);
            }
        }
        if (matrixA != null) {
            textureView.setTransform(matrixA);
        }
    }

    public final void b() {
        TextureView textureView = this.f89280c;
        if (this.f89281d == null || textureView == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(0.0f, 0.0f, 0.0f, 0.0f);
        textureView.setTransform(matrix);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSurfaceSizeChanged(int i10, int i11) {
        this.f89279b = new yz2(i10, i11);
        a();
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(VideoSize videoSize) {
        int iD = videoSize.width;
        float f10 = videoSize.pixelWidthHeightRatio;
        if (f10 > 0.0f) {
            iD = vn.c.d(iD * f10);
        }
        this.f89278a = new yz2(iD, videoSize.height);
        a();
    }
}
