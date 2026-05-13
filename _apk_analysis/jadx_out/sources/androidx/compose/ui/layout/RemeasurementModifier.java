package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: RemeasurementModifier.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/RemeasurementModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/layout/Remeasurement;", "remeasurement", "Lbn/r;", "onRemeasurementAvailable", "ui_release"}, k = 1, mv = {1, 6, 0})
public interface RemeasurementModifier extends Modifier.Element {

    /* JADX INFO: compiled from: RemeasurementModifier.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull RemeasurementModifier remeasurementModifier, @NotNull l<? super Modifier.Element, Boolean> lVar) {
            p.k(lVar, "predicate");
            return RemeasurementModifier.super.all(lVar);
        }

        @Deprecated
        public static boolean any(@NotNull RemeasurementModifier remeasurementModifier, @NotNull l<? super Modifier.Element, Boolean> lVar) {
            p.k(lVar, "predicate");
            return RemeasurementModifier.super.any(lVar);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull RemeasurementModifier remeasurementModifier, R r10, @NotNull sn.p<? super R, ? super Modifier.Element, ? extends R> pVar) {
            p.k(pVar, "operation");
            return (R) RemeasurementModifier.super.foldIn(r10, pVar);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull RemeasurementModifier remeasurementModifier, R r10, @NotNull sn.p<? super Modifier.Element, ? super R, ? extends R> pVar) {
            p.k(pVar, "operation");
            return (R) RemeasurementModifier.super.foldOut(r10, pVar);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull RemeasurementModifier remeasurementModifier, @NotNull Modifier modifier) {
            p.k(modifier, "other");
            return RemeasurementModifier.super.then(modifier);
        }
    }

    void onRemeasurementAvailable(@NotNull Remeasurement remeasurement);
}
