package e4;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: ExoPlayerFactory.java */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class l {
    @Deprecated
    public static u0 a(Context context, s0 s0Var, w5.d dVar, g0 g0Var, @Nullable com.google.android.exoplayer.drm.a<j4.j> aVar) {
        return b(context, s0Var, dVar, g0Var, aVar, a6.k0.N());
    }

    @Deprecated
    public static u0 b(Context context, s0 s0Var, w5.d dVar, g0 g0Var, @Nullable com.google.android.exoplayer.drm.a<j4.j> aVar, Looper looper) {
        return c(context, s0Var, dVar, g0Var, aVar, new f4.a(a6.c.f3524a), looper);
    }

    @Deprecated
    public static u0 c(Context context, s0 s0Var, w5.d dVar, g0 g0Var, @Nullable com.google.android.exoplayer.drm.a<j4.j> aVar, f4.a aVar2, Looper looper) {
        return d(context, s0Var, dVar, g0Var, aVar, y5.k.k(context), aVar2, looper);
    }

    @Deprecated
    public static u0 d(Context context, s0 s0Var, w5.d dVar, g0 g0Var, @Nullable com.google.android.exoplayer.drm.a<j4.j> aVar, y5.c cVar, f4.a aVar2, Looper looper) {
        return new u0(context, s0Var, dVar, g0Var, aVar, cVar, aVar2, a6.c.f3524a, looper);
    }
}
