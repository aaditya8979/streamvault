package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: ParentDataModifier.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/Modifier$Element;", "modifyParentData", "", "Landroidx/compose/ui/unit/Density;", "parentData", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface ParentDataModifier extends Modifier.Element {

    /* JADX INFO: compiled from: ParentDataModifier.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull ParentDataModifier parentDataModifier, @NotNull l<? super Modifier.Element, Boolean> lVar) {
            p.k(lVar, "predicate");
            return ParentDataModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@NotNull ParentDataModifier parentDataModifier, @NotNull l<? super Modifier.Element, Boolean> lVar) {
            p.k(lVar, "predicate");
            return ParentDataModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull ParentDataModifier parentDataModifier, R r10, @NotNull sn.p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            p.k(pVar, "operation");
            return (R) ParentDataModifier.super.foldIn(r10, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull ParentDataModifier parentDataModifier, R r10, @NotNull sn.p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            p.k(pVar, "operation");
            return (R) ParentDataModifier.super.foldOut(r10, pVar);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull ParentDataModifier parentDataModifier, @NotNull Modifier modifier) {
            p.k(modifier, "other");
            return ParentDataModifier.super.then(modifier);
        }
    }

    @Nullable
    Object modifyParentData(@NotNull Density density, @Nullable Object obj);
}
