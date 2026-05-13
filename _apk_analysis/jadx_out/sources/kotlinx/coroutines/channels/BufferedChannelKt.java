package kotlinx.coroutines.channels;

import bn.r;
import fo.h;
import io.e0;
import io.h0;
import kotlin.coroutines.d;
import kotlin.reflect.KFunction;
import org.jetbrains.annotations.NotNull;
import p000do.k;
import sn.q;

/* JADX INFO: compiled from: BufferedChannel.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class BufferedChannelKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h<Object> f73291a = new h<>(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f73292b = h0.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f73293c = h0.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final e0 f73294d = new e0("BUFFERED");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final e0 f73295e = new e0("SHOULD_BUFFER");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final e0 f73296f = new e0("S_RESUMING_BY_RCV");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final e0 f73297g = new e0("RESUMING_BY_EB");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final e0 f73298h = new e0("POISONED");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final e0 f73299i = new e0("DONE_RCV");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final e0 f73300j = new e0("INTERRUPTED_SEND");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public static final e0 f73301k = new e0("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public static final e0 f73302l = new e0("CHANNEL_CLOSED");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public static final e0 f73303m = new e0("SUSPEND");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final e0 f73304n = new e0("SUSPEND_NO_WAITER");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final e0 f73305o = new e0("FAILED");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final e0 f73306p = new e0("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public static final e0 f73307q = new e0("CLOSE_HANDLER_CLOSED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public static final e0 f73308r = new e0("CLOSE_HANDLER_INVOKED");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public static final e0 f73309s = new e0("NO_CLOSE_CAUSE");

    public static final long A(int i10) {
        if (i10 == 0) {
            return 0L;
        }
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        return Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean B(k<? super T> kVar, T t10, q<? super Throwable, ? super T, ? super d, r> qVar) {
        Object objE = kVar.E(t10, null, qVar);
        if (objE == null) {
            return false;
        }
        kVar.A(objE);
        return true;
    }

    public static /* synthetic */ boolean C(k kVar, Object obj, q qVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            qVar = null;
        }
        return B(kVar, obj, qVar);
    }

    public static final long v(long j10, boolean z10) {
        return (z10 ? 4611686018427387904L : 0L) + j10;
    }

    public static final long w(long j10, int i10) {
        return (((long) i10) << 60) + j10;
    }

    public static final <E> h<E> x(long j10, h<E> hVar) {
        return new h<>(j10, hVar, hVar.y(), 0);
    }

    @NotNull
    public static final <E> KFunction<h<E>> y() {
        return BufferedChannelKt$createSegmentFunction$1.INSTANCE;
    }

    @NotNull
    public static final e0 z() {
        return f73302l;
    }
}
