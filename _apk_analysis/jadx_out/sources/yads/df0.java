package yads;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class df0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Spatializer f88841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f88842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f88843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public cf0 f88844d;

    public df0(Spatializer spatializer) {
        this.f88841a = spatializer;
        this.f88842b = spatializer.getImmersiveAudioLevel() != 0;
    }

    public static df0 a(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new df0(audioManager.getSpatializer());
    }

    public final void a(if0 if0Var, Looper looper) {
        if (this.f88844d == null && this.f88843c == null) {
            this.f88844d = new cf0(if0Var);
            Handler handler = new Handler(looper);
            this.f88843c = handler;
            this.f88841a.addOnSpatializerStateChangedListener(new androidx.emoji2.text.b(handler), this.f88844d);
        }
    }

    public final boolean a() {
        return this.f88841a.isAvailable();
    }

    public final boolean a(mx0 mx0Var, pk pkVar) {
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(ib3.a(("audio/eac3-joc".equals(mx0Var.f92610m) && mx0Var.f92623z == 16) ? 12 : mx0Var.f92623z));
        int i10 = mx0Var.A;
        if (i10 != -1) {
            channelMask.setSampleRate(i10);
        }
        Spatializer spatializer = this.f88841a;
        if (pkVar.f93618g == null) {
            pkVar.f93618g = new ok(pkVar);
        }
        return spatializer.canBeSpatialized(pkVar.f93618g.f93242a, channelMask.build());
    }

    public final boolean b() {
        return this.f88841a.isEnabled();
    }

    public final void c() {
        cf0 cf0Var = this.f88844d;
        if (cf0Var == null || this.f88843c == null) {
            return;
        }
        this.f88841a.removeOnSpatializerStateChangedListener(cf0Var);
        Handler handler = this.f88843c;
        int i10 = ib3.f90737a;
        handler.removeCallbacksAndMessages(null);
        this.f88843c = null;
        this.f88844d = null;
    }
}
