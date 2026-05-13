package yads;

import android.content.Context;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: classes4.dex */
public final class he0 implements s52 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f90372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu2 f90373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v9 f90374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f90375d;

    public he0(Context context, v9 v9Var, lu2 lu2Var, d4 d4Var) {
        this.f90372a = d4Var;
        this.f90373b = lu2Var;
        this.f90374c = v9Var;
        this.f90375d = context.getApplicationContext();
    }

    @Override // yads.s52
    public final p52 a() {
        Context context = this.f90375d;
        d4 d4Var = this.f90372a;
        lu2 lu2Var = this.f90373b;
        v9 v9Var = this.f90374c;
        Context applicationContext = context.getApplicationContext();
        return new rp0(new ExoPlayer.Builder(applicationContext).setRenderersFactory(new DefaultRenderersFactory(applicationContext).setEnableDecoderFallback(true)).build(), new kn1(applicationContext, new jn1()), new qi3(applicationContext, d4Var, lu2Var, v9Var), new o52(), new ej3());
    }
}
