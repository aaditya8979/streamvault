package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
public final class ComposableSingletons$TabRowKt {

    @NotNull
    public static final ComposableSingletons$TabRowKt INSTANCE = new ComposableSingletons$TabRowKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static p<Composer, Integer, r> f12lambda1 = ComposableLambdaKt.composableLambdaInstance(182187156, false, new p<Composer, Integer, r>() { // from class: androidx.compose.material.ComposableSingletons$TabRowKt$lambda-1$1
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r.f5635a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i10) {
            if ((i10 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TabRowDefaults.INSTANCE.m1191Divider9IZ8Weo(null, 0.0f, 0L, composer, 3072, 7);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static p<Composer, Integer, r> f13lambda2 = ComposableLambdaKt.composableLambdaInstance(-1480449365, false, new p<Composer, Integer, r>() { // from class: androidx.compose.material.ComposableSingletons$TabRowKt$lambda-2$1
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r.f5635a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@Nullable Composer composer, int i10) {
            if ((i10 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                TabRowDefaults.INSTANCE.m1191Divider9IZ8Weo(null, 0.0f, 0L, composer, 3072, 7);
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$material_release, reason: not valid java name */
    public final p<Composer, Integer, r> m998getLambda1$material_release() {
        return f12lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$material_release, reason: not valid java name */
    public final p<Composer, Integer, r> m999getLambda2$material_release() {
        return f13lambda2;
    }
}
