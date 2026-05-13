package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityOptionsCompat;
import bn.r;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 0)
public final class ActivityResultLauncherHolder<I> {
    public static final int $stable = 8;

    @Nullable
    private ActivityResultLauncher<I> launcher;

    @Nullable
    public final ActivityResultLauncher<I> getLauncher() {
        return this.launcher;
    }

    public final void launch(I i10, @Nullable ActivityOptionsCompat activityOptionsCompat) {
        r rVar;
        ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(i10, activityOptionsCompat);
            rVar = r.f5635a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }

    public final void setLauncher(@Nullable ActivityResultLauncher<I> activityResultLauncher) {
        this.launcher = activityResultLauncher;
    }

    public final void unregister() {
        r rVar;
        ActivityResultLauncher<I> activityResultLauncher = this.launcher;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
            rVar = r.f5635a;
        } else {
            rVar = null;
        }
        if (rVar == null) {
            throw new IllegalStateException("Launcher has not been initialized".toString());
        }
    }
}
