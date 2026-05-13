package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.os.HandlerCompat;
import com.squareup.picasso.Utils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p000do.h0;
import p000do.w0;

/* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0001*\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u0019\b\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b2\u00103J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher;", "Ldo/h0;", "Ljava/lang/Runnable;", "nextTask", "Lbn/r;", "performTrampolineDispatch", "", "frameTimeNanos", "performFrameDispatch", "Landroid/view/Choreographer$FrameCallback;", "callback", "postFrameCallback$ui_release", "(Landroid/view/Choreographer$FrameCallback;)V", "postFrameCallback", "removeFrameCallback$ui_release", "removeFrameCallback", "Lkotlin/coroutines/d;", GAMConfig.KEY_CONTEXT, "block", "dispatch", "Landroid/view/Choreographer;", "choreographer", "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "", "lock", "Ljava/lang/Object;", "Lcn/m;", "toRunTrampolined", "Lcn/m;", "", "toRunOnFrame", "Ljava/util/List;", "spareToRunOnFrame", "", "scheduledTrampolineDispatch", "Z", "scheduledFrameDispatch", "androidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1", "dispatchCallback", "Landroidx/compose/ui/platform/AndroidUiDispatcher$dispatchCallback$1;", "Landroidx/compose/runtime/MonotonicFrameClock;", "frameClock", "Landroidx/compose/runtime/MonotonicFrameClock;", "getFrameClock", "()Landroidx/compose/runtime/MonotonicFrameClock;", "<init>", "(Landroid/view/Choreographer;Landroid/os/Handler;)V", VastTagName.COMPANION, "ui_release"}, k = 1, mv = {1, 6, 0})
public final class AndroidUiDispatcher extends h0 {

    @NotNull
    private final Choreographer choreographer;

    @NotNull
    private final AndroidUiDispatcher$dispatchCallback$1 dispatchCallback;

    @NotNull
    private final MonotonicFrameClock frameClock;

    @NotNull
    private final Handler handler;

    @NotNull
    private final Object lock;
    private boolean scheduledFrameDispatch;
    private boolean scheduledTrampolineDispatch;

    @NotNull
    private List<Choreographer.FrameCallback> spareToRunOnFrame;

    @NotNull
    private List<Choreographer.FrameCallback> toRunOnFrame;

    @NotNull
    private final cn.m<Runnable> toRunTrampolined;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final bn.g<kotlin.coroutines.d> Main$delegate = kotlin.b.b(new sn.a<kotlin.coroutines.d>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2
        @Override // sn.a
        @NotNull
        public final kotlin.coroutines.d invoke() {
            tn.i iVar = null;
            Choreographer choreographer = AndroidUiDispatcher_androidKt.isMainThread() ? Choreographer.getInstance() : (Choreographer) p000do.g.e(w0.c(), new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null));
            tn.p.j(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
            Handler handlerCreateAsync = HandlerCompat.createAsync(Looper.getMainLooper());
            tn.p.j(handlerCreateAsync, "createAsync(Looper.getMainLooper())");
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, handlerCreateAsync, iVar);
            return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
        }
    });

    @NotNull
    private static final ThreadLocal<kotlin.coroutines.d> currentThread = new ThreadLocal<kotlin.coroutines.d>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$currentThread$1
        @Override // java.lang.ThreadLocal
        @NotNull
        public kotlin.coroutines.d initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            tn.p.j(choreographer, "getInstance()");
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread".toString());
            }
            Handler handlerCreateAsync = HandlerCompat.createAsync(looperMyLooper);
            tn.p.j(handlerCreateAsync, "createAsync(\n           …d\")\n                    )");
            AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, handlerCreateAsync, null);
            return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
        }
    };

    /* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/AndroidUiDispatcher$Companion;", "", "Lkotlin/coroutines/d;", "Main$delegate", "Lbn/g;", "getMain", "()Lkotlin/coroutines/d;", Utils.OWNER_MAIN, "getCurrentThread", "CurrentThread", "Ljava/lang/ThreadLocal;", "currentThread", "Ljava/lang/ThreadLocal;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(tn.i iVar) {
            this();
        }

        @NotNull
        public final kotlin.coroutines.d getCurrentThread() {
            if (AndroidUiDispatcher_androidKt.isMainThread()) {
                return getMain();
            }
            kotlin.coroutines.d dVar = (kotlin.coroutines.d) AndroidUiDispatcher.currentThread.get();
            if (dVar != null) {
                return dVar;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        @NotNull
        public final kotlin.coroutines.d getMain() {
            return (kotlin.coroutines.d) AndroidUiDispatcher.Main$delegate.getValue();
        }
    }

    private AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.lock = new Object();
        this.toRunTrampolined = new cn.m<>();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new AndroidUiDispatcher$dispatchCallback$1(this);
        this.frameClock = new AndroidUiFrameClock(choreographer);
    }

    public /* synthetic */ AndroidUiDispatcher(Choreographer choreographer, Handler handler, tn.i iVar) {
        this(choreographer, handler);
    }

    private final Runnable nextTask() {
        Runnable runnableR;
        synchronized (this.lock) {
            runnableR = this.toRunTrampolined.r();
        }
        return runnableR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performFrameDispatch(long j10) {
        synchronized (this.lock) {
            if (this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = false;
                List<Choreographer.FrameCallback> list = this.toRunOnFrame;
                this.toRunOnFrame = this.spareToRunOnFrame;
                this.spareToRunOnFrame = list;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).doFrame(j10);
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performTrampolineDispatch() {
        boolean z10;
        do {
            Runnable runnableNextTask = nextTask();
            while (runnableNextTask != null) {
                runnableNextTask.run();
                runnableNextTask = nextTask();
            }
            synchronized (this.lock) {
                z10 = false;
                if (this.toRunTrampolined.isEmpty()) {
                    this.scheduledTrampolineDispatch = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    @Override // p000do.h0
    public void dispatch(@NotNull kotlin.coroutines.d dVar, @NotNull Runnable runnable) {
        tn.p.k(dVar, GAMConfig.KEY_CONTEXT);
        tn.p.k(runnable, "block");
        synchronized (this.lock) {
            this.toRunTrampolined.addLast(runnable);
            if (!this.scheduledTrampolineDispatch) {
                this.scheduledTrampolineDispatch = true;
                this.handler.post(this.dispatchCallback);
                if (!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.choreographer.postFrameCallback(this.dispatchCallback);
                }
            }
            bn.r rVar = bn.r.f5635a;
        }
    }

    @NotNull
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @NotNull
    public final MonotonicFrameClock getFrameClock() {
        return this.frameClock;
    }

    public final void postFrameCallback$ui_release(@NotNull Choreographer.FrameCallback callback) {
        tn.p.k(callback, "callback");
        synchronized (this.lock) {
            this.toRunOnFrame.add(callback);
            if (!this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = true;
                this.choreographer.postFrameCallback(this.dispatchCallback);
            }
            bn.r rVar = bn.r.f5635a;
        }
    }

    public final void removeFrameCallback$ui_release(@NotNull Choreographer.FrameCallback callback) {
        tn.p.k(callback, "callback");
        synchronized (this.lock) {
            this.toRunOnFrame.remove(callback);
        }
    }
}
