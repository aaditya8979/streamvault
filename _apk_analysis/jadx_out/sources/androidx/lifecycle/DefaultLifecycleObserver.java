package androidx.lifecycle;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DefaultLifecycleObserver.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface DefaultLifecycleObserver extends LifecycleObserver {
    default void onCreate(@NotNull LifecycleOwner lifecycleOwner) {
        p.k(lifecycleOwner, "owner");
    }

    default void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        p.k(lifecycleOwner, "owner");
    }

    default void onPause(@NotNull LifecycleOwner lifecycleOwner) {
        p.k(lifecycleOwner, "owner");
    }

    default void onResume(@NotNull LifecycleOwner lifecycleOwner) {
        p.k(lifecycleOwner, "owner");
    }

    default void onStart(@NotNull LifecycleOwner lifecycleOwner) {
        p.k(lifecycleOwner, "owner");
    }

    default void onStop(@NotNull LifecycleOwner lifecycleOwner) {
        p.k(lifecycleOwner, "owner");
    }
}
