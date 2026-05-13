package androidx.compose.material;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
public final class ComposableSingletons$AppBarKt {

    @NotNull
    public static final ComposableSingletons$AppBarKt INSTANCE = new ComposableSingletons$AppBarKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static q<RowScope, Composer, Integer, r> f4lambda1 = ComposableLambdaKt.composableLambdaInstance(-771938130, false, new q<RowScope, Composer, Integer, r>() { // from class: androidx.compose.material.ComposableSingletons$AppBarKt$lambda-1$1
        @Override // sn.q
        public /* bridge */ /* synthetic */ r invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return r.f5635a;
        }

        @Composable
        public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer, int i10) {
            p.k(rowScope, "$this$null");
            if ((i10 & 81) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$material_release, reason: not valid java name */
    public final q<RowScope, Composer, Integer, r> m990getLambda1$material_release() {
        return f4lambda1;
    }
}
