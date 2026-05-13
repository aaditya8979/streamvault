package androidx.compose.foundation.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;

/* JADX INFO: compiled from: BasicText.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
public final class ComposableSingletons$BasicTextKt {

    @NotNull
    public static final ComposableSingletons$BasicTextKt INSTANCE = new ComposableSingletons$BasicTextKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static p<Composer, Integer, r> f2lambda1 = ComposableLambdaKt.composableLambdaInstance(1699492330, false, new p<Composer, Integer, r>() { // from class: androidx.compose.foundation.text.ComposableSingletons$BasicTextKt$lambda-1$1
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
    /* JADX INFO: renamed from: getLambda-1$foundation_release, reason: not valid java name */
    public final p<Composer, Integer, r> m678getLambda1$foundation_release() {
        return f2lambda1;
    }
}
