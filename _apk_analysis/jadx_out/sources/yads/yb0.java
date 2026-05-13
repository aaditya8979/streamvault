package yads;

import android.media.AudioTrack;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class yb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f97054a = new Handler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xb0 f97055b = new xb0(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zb0 f97056c;

    public yb0(zb0 zb0Var) {
        this.f97056c = zb0Var;
    }

    public final void a(AudioTrack audioTrack) {
        Handler handler = this.f97054a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new androidx.emoji2.text.b(handler), this.f97055b);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f97055b);
        this.f97054a.removeCallbacksAndMessages(null);
    }
}
