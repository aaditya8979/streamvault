package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActivityResultCaller.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface ActivityResultCaller {
    @NotNull
    <I, O> ActivityResultLauncher<I> registerForActivityResult(@NotNull ActivityResultContract<I, O> activityResultContract, @NotNull ActivityResultCallback<O> activityResultCallback);

    @NotNull
    <I, O> ActivityResultLauncher<I> registerForActivityResult(@NotNull ActivityResultContract<I, O> activityResultContract, @NotNull ActivityResultRegistry activityResultRegistry, @NotNull ActivityResultCallback<O> activityResultCallback);
}
