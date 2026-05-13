package yads;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public final class hd2 extends Surface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f90361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f90362f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f90363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gd2 f90364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f90365d;

    public hd2(gd2 gd2Var, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f90364c = gd2Var;
        this.f90363b = z10;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f90364c) {
            if (!this.f90365d) {
                gd2 gd2Var = this.f90364c;
                gd2Var.f89948c.getClass();
                gd2Var.f89948c.sendEmptyMessage(2);
                this.f90365d = true;
            }
        }
    }
}
