package androidx.activity.compose;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.State;
import bn.r;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import sn.l;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1 extends Lambda implements l<DisposableEffectScope, DisposableEffectResult> {
    public final /* synthetic */ ActivityResultRegistry $activityResultRegistry;
    public final /* synthetic */ ActivityResultContract<I, O> $contract;
    public final /* synthetic */ State<l<O, r>> $currentOnResult;
    public final /* synthetic */ String $key;
    public final /* synthetic */ ActivityResultLauncherHolder<I> $realLauncher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1(ActivityResultLauncherHolder<I> activityResultLauncherHolder, ActivityResultRegistry activityResultRegistry, String str, ActivityResultContract<I, O> activityResultContract, State<? extends l<? super O, r>> state) {
        super(1);
        this.$realLauncher = activityResultLauncherHolder;
        this.$activityResultRegistry = activityResultRegistry;
        this.$key = str;
        this.$contract = activityResultContract;
        this.$currentOnResult = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(State state, Object obj) {
        ((l) state.getValue()).invoke(obj);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // sn.l
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
        ActivityResultLauncherHolder<I> activityResultLauncherHolder = this.$realLauncher;
        ActivityResultRegistry activityResultRegistry = this.$activityResultRegistry;
        String str = this.$key;
        ActivityResultContract<I, O> activityResultContract = this.$contract;
        final State<l<O, r>> state = this.$currentOnResult;
        activityResultLauncherHolder.setLauncher((ActivityResultLauncher<I>) activityResultRegistry.register(str, activityResultContract, new ActivityResultCallback() { // from class: androidx.activity.compose.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1.invoke$lambda$0(state, obj);
            }
        }));
        final ActivityResultLauncherHolder<I> activityResultLauncherHolder2 = this.$realLauncher;
        return new DisposableEffectResult() { // from class: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                activityResultLauncherHolder2.unregister();
            }
        };
    }
}
