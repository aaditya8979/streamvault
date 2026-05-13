package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ServiceLifecycleDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
public class ServiceLifecycleDispatcher {

    @NotNull
    private final Handler handler;

    @Nullable
    private DispatchRunnable lastDispatchRunnable;

    @NotNull
    private final LifecycleRegistry registry;

    /* JADX INFO: compiled from: ServiceLifecycleDispatcher.kt */
    public static final class DispatchRunnable implements Runnable {

        @NotNull
        private final Lifecycle.Event event;

        @NotNull
        private final LifecycleRegistry registry;
        private boolean wasExecuted;

        public DispatchRunnable(@NotNull LifecycleRegistry lifecycleRegistry, @NotNull Lifecycle.Event event) {
            p.k(lifecycleRegistry, "registry");
            p.k(event, "event");
            this.registry = lifecycleRegistry;
            this.event = event;
        }

        @NotNull
        public final Lifecycle.Event getEvent() {
            return this.event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wasExecuted) {
                return;
            }
            this.registry.handleLifecycleEvent(this.event);
            this.wasExecuted = true;
        }
    }

    public ServiceLifecycleDispatcher(@NotNull LifecycleOwner lifecycleOwner) {
        p.k(lifecycleOwner, IronSourceConstants.EVENTS_PROVIDER);
        this.registry = new LifecycleRegistry(lifecycleOwner);
        this.handler = new Handler();
    }

    private final void postDispatchRunnable(Lifecycle.Event event) {
        DispatchRunnable dispatchRunnable = this.lastDispatchRunnable;
        if (dispatchRunnable != null) {
            dispatchRunnable.run();
        }
        DispatchRunnable dispatchRunnable2 = new DispatchRunnable(this.registry, event);
        this.lastDispatchRunnable = dispatchRunnable2;
        Handler handler = this.handler;
        p.h(dispatchRunnable2);
        handler.postAtFrontOfQueue(dispatchRunnable2);
    }

    @NotNull
    public Lifecycle getLifecycle() {
        return this.registry;
    }

    public void onServicePreSuperOnBind() {
        postDispatchRunnable(Lifecycle.Event.ON_START);
    }

    public void onServicePreSuperOnCreate() {
        postDispatchRunnable(Lifecycle.Event.ON_CREATE);
    }

    public void onServicePreSuperOnDestroy() {
        postDispatchRunnable(Lifecycle.Event.ON_STOP);
        postDispatchRunnable(Lifecycle.Event.ON_DESTROY);
    }

    public void onServicePreSuperOnStart() {
        postDispatchRunnable(Lifecycle.Event.ON_START);
    }
}
