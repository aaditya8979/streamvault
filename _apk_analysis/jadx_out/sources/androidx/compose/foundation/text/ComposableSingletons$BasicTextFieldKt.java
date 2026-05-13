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

/* JADX INFO: compiled from: BasicTextField.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
public final class ComposableSingletons$BasicTextFieldKt {

    @NotNull
    public static final ComposableSingletons$BasicTextFieldKt INSTANCE = new ComposableSingletons$BasicTextFieldKt();

    /* JADX INFO: renamed from: lambda-1, reason: not valid java name */
    @NotNull
    public static q<p<? super Composer, ? super Integer, r>, Composer, Integer, r> f0lambda1 = ComposableLambdaKt.composableLambdaInstance(434140383, false, new q<p<? super Composer, ? super Integer, ? extends r>, Composer, Integer, r>() { // from class: androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt$lambda-1$1
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

    /* JADX INFO: renamed from: lambda-2, reason: not valid java name */
    @NotNull
    public static q<p<? super Composer, ? super Integer, r>, Composer, Integer, r> f1lambda2 = ComposableLambdaKt.composableLambdaInstance(-34833998, false, new q<p<? super Composer, ? super Integer, ? extends r>, Composer, Integer, r>() { // from class: androidx.compose.foundation.text.ComposableSingletons$BasicTextFieldKt$lambda-2$1
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
    public final q<p<? super Composer, ? super Integer, r>, Composer, Integer, r> m676getLambda1$foundation_release() {
        return f0lambda1;
    }

    @NotNull
    /* JADX INFO: renamed from: getLambda-2$foundation_release, reason: not valid java name */
    public final q<p<? super Composer, ? super Integer, r>, Composer, Integer, r> m677getLambda2$foundation_release() {
        return f1lambda2;
    }
}
