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
import sn.q;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
public final class ComposableSingletons$ScaffoldKt {

    @NotNull
    public static final ComposableSingletons$ScaffoldKt INSTANCE = new ComposableSingletons$ScaffoldKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static p<Composer, Integer, r> f7lambda1 = ComposableLambdaKt.composableLambdaInstance(2069405901, false, new p<Composer, Integer, r>() { // from class: androidx.compose.material.ComposableSingletons$ScaffoldKt$lambda-1$1
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r.f5635a;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i10) {
            if ((i10 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static p<Composer, Integer, r> f8lambda2 = ComposableLambdaKt.composableLambdaInstance(-231850563, false, new p<Composer, Integer, r>() { // from class: androidx.compose.material.ComposableSingletons$ScaffoldKt$lambda-2$1
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r.f5635a;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i10) {
            if ((i10 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            }
        }
    });

    /* JADX INFO: renamed from: lambda-3, reason: not valid java name */
    @NotNull
    public static q<SnackbarHostState, Composer, Integer, r> f9lambda3 = ComposableLambdaKt.composableLambdaInstance(-147687984, false, new q<SnackbarHostState, Composer, Integer, r>() { // from class: androidx.compose.material.ComposableSingletons$ScaffoldKt$lambda-3$1
        @Override // sn.q
        public /* bridge */ /* synthetic */ r invoke(SnackbarHostState snackbarHostState, Composer composer, Integer num) {
            invoke(snackbarHostState, composer, num.intValue());
            return r.f5635a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@NotNull SnackbarHostState snackbarHostState, @Nullable Composer composer, int i10) {
            tn.p.k(snackbarHostState, "it");
            if ((i10 & 14) == 0) {
                i10 |= composer.changed(snackbarHostState) ? 4 : 2;
            }
            if ((i10 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                SnackbarHostKt.SnackbarHost(snackbarHostState, null, null, composer, i10 & 14, 6);
            }
        }
    });

    /* JADX INFO: renamed from: lambda-4, reason: not valid java name */
    @NotNull
    public static p<Composer, Integer, r> f10lambda4 = ComposableLambdaKt.composableLambdaInstance(-900670499, false, new p<Composer, Integer, r>() { // from class: androidx.compose.material.ComposableSingletons$ScaffoldKt$lambda-4$1
        @Override // sn.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ r mo2invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r.f5635a;
        }

        @Composable
        public final void invoke(@Nullable Composer composer, int i10) {
            if ((i10 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$material_release, reason: not valid java name */
    public final p<Composer, Integer, r> m993getLambda1$material_release() {
        return f7lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$material_release, reason: not valid java name */
    public final p<Composer, Integer, r> m994getLambda2$material_release() {
        return f8lambda2;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-3$material_release, reason: not valid java name */
    public final q<SnackbarHostState, Composer, Integer, r> m995getLambda3$material_release() {
        return f9lambda3;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-4$material_release, reason: not valid java name */
    public final p<Composer, Integer, r> m996getLambda4$material_release() {
        return f10lambda4;
    }
}
