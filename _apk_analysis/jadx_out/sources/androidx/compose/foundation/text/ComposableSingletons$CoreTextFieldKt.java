package androidx.compose.foundation.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.p;
import sn.q;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
public final class ComposableSingletons$CoreTextFieldKt {

    @NotNull
    public static final ComposableSingletons$CoreTextFieldKt INSTANCE = new ComposableSingletons$CoreTextFieldKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static q<p<? super Composer, ? super Integer, r>, Composer, Integer, r> f3lambda1 = ComposableLambdaKt.composableLambdaInstance(1894572096, false, new q<p<? super Composer, ? super Integer, ? extends r>, Composer, Integer, r>() { // from class: androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt$lambda-1$1
        @Override // sn.q
        public /* bridge */ /* synthetic */ r invoke(p<? super Composer, ? super Integer, ? extends r> pVar, Composer composer, Integer num) {
            invoke((p<? super Composer, ? super Integer, r>) pVar, composer, num.intValue());
            return r.f5635a;
        }

        @Composable
        @ComposableInferredTarget(scheme = "[0[0]]")
        public final void invoke(@NotNull p<? super Composer, ? super Integer, r> pVar, @Nullable Composer composer, int i10) {
            tn.p.k(pVar, "innerTextField");
            if ((i10 & 14) == 0) {
                i10 |= composer.changed(pVar) ? 4 : 2;
            }
            if ((i10 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
            } else {
                pVar.mo2invoke(composer, Integer.valueOf(i10 & 14));
            }
        }
    });

    @NotNull
    /* JADX INFO: renamed from: getLambda-1$foundation_release, reason: not valid java name */
    public final q<p<? super Composer, ? super Integer, r>, Composer, Integer, r> m679getLambda1$foundation_release() {
        return f3lambda1;
    }
}
