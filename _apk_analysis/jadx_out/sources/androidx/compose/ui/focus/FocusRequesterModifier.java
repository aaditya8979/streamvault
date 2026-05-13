package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: FocusRequesterModifier.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterModifier;", "Landroidx/compose/ui/Modifier$Element;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface FocusRequesterModifier extends Modifier.Element {

    /* JADX INFO: compiled from: FocusRequesterModifier.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull FocusRequesterModifier focusRequesterModifier, @NotNull l<? super Modifier.Element, Boolean> lVar) {
            p.k(lVar, "predicate");
            return FocusRequesterModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@NotNull FocusRequesterModifier focusRequesterModifier, @NotNull l<? super Modifier.Element, Boolean> lVar) {
            p.k(lVar, "predicate");
            return FocusRequesterModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull FocusRequesterModifier focusRequesterModifier, R r10, @NotNull sn.p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            p.k(pVar, "operation");
            return (R) FocusRequesterModifier.super.foldIn(r10, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull FocusRequesterModifier focusRequesterModifier, R r10, @NotNull sn.p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            p.k(pVar, "operation");
            return (R) FocusRequesterModifier.super.foldOut(r10, pVar);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull FocusRequesterModifier focusRequesterModifier, @NotNull Modifier modifier) {
            p.k(modifier, "other");
            return FocusRequesterModifier.super.then(modifier);
        }
    }

    @NotNull
    FocusRequester getFocusRequester();
}
