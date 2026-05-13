package androidx.compose.ui.window;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: compiled from: AndroidDialog.android.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
public final class ComposableSingletons$AndroidDialog_androidKt {

    @NotNull
    public static final ComposableSingletons$AndroidDialog_androidKt INSTANCE = new ComposableSingletons$AndroidDialog_androidKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static p<Composer, Integer, r> f20lambda1 = ComposableLambdaKt.composableLambdaInstance(210148896, false, new p<Composer, Integer, r>() { // from class: androidx.compose.ui.window.ComposableSingletons$AndroidDialog_androidKt$lambda-1$1
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
    /* JADX INFO: renamed from: getLambda-1$ui_release, reason: not valid java name */
    public final p<Composer, Integer, r> m4072getLambda1$ui_release() {
        return f20lambda1;
    }
}
