package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: ActivityResultContract.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ActivityResultContract<I, O> {

    /* JADX INFO: compiled from: ActivityResultContract.kt */
    public static final class SynchronousResult<T> {
        private final T value;

        public SynchronousResult(T t10) {
            this.value = t10;
        }

        public final T getValue() {
            return this.value;
        }
    }

    @NotNull
    public abstract Intent createIntent(@NotNull Context context, I i10);

    @Nullable
    public SynchronousResult<O> getSynchronousResult(@NotNull Context context, I i10) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return null;
    }

    public abstract O parseResult(int i10, @Nullable Intent intent);
}
