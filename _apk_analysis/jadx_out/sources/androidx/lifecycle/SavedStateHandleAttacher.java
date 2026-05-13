package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SavedStateHandleAttacher implements LifecycleEventObserver {

    @NotNull
    private final SavedStateHandlesProvider provider;

    public SavedStateHandleAttacher(@NotNull SavedStateHandlesProvider savedStateHandlesProvider) {
        p.k(savedStateHandlesProvider, IronSourceConstants.EVENTS_PROVIDER);
        this.provider = savedStateHandlesProvider;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event event) {
        p.k(lifecycleOwner, "source");
        p.k(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            lifecycleOwner.getLifecycle().removeObserver(this);
            this.provider.performRestore();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
