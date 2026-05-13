package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import bn.r;
import fo.d;
import fo.g;
import fo.p;
import hn.c;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.g;
import org.jetbrains.annotations.NotNull;
import p000do.i;
import p000do.l0;
import sn.p;

/* JADX INFO: compiled from: PredictiveBackHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
final class OnBackInstance {

    @NotNull
    private final d<BackEventCompat> channel = g.b(-2, BufferOverflow.SUSPEND, null, 4, null);
    private boolean isPredictiveBack;

    @NotNull
    private final kotlinx.coroutines.g job;

    public OnBackInstance(@NotNull l0 l0Var, boolean z10, @NotNull p<? super go.d<BackEventCompat>, ? super c<? super r>, ? extends Object> pVar) {
        this.isPredictiveBack = z10;
        this.job = i.d(l0Var, null, null, new OnBackInstance$job$1(pVar, this, null), 3, null);
    }

    public final void cancel() {
        this.channel.cancel(new CancellationException("onBack cancelled"));
        g.a.a(this.job, null, 1, null);
    }

    public final boolean close() {
        return p.a.a(this.channel, null, 1, null);
    }

    @NotNull
    public final d<BackEventCompat> getChannel() {
        return this.channel;
    }

    @NotNull
    public final kotlinx.coroutines.g getJob() {
        return this.job;
    }

    public final boolean isPredictiveBack() {
        return this.isPredictiveBack;
    }

    @NotNull
    /* JADX INFO: renamed from: send-JP2dKIU, reason: not valid java name */
    public final Object m0sendJP2dKIU(@NotNull BackEventCompat backEventCompat) {
        return this.channel.i(backEventCompat);
    }

    public final void setPredictiveBack(boolean z10) {
        this.isPredictiveBack = z10;
    }
}
