package androidx.activity;

import android.view.View;
import ao.r;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewTreeFullyLoadedReporterOwner.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeFullyDrawnReporterOwner {
    @Nullable
    public static final FullyDrawnReporterOwner get(@NotNull View view) {
        tn.p.k(view, "<this>");
        return (FullyDrawnReporterOwner) SequencesKt___SequencesKt.D(SequencesKt___SequencesKt.L(r.n(view, new sn.l<View, View>() { // from class: androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1
            @Override // sn.l
            @Nullable
            public final View invoke(@NotNull View view2) {
                tn.p.k(view2, "it");
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new sn.l<View, FullyDrawnReporterOwner>() { // from class: androidx.activity.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2
            @Override // sn.l
            @Nullable
            public final FullyDrawnReporterOwner invoke(@NotNull View view2) {
                tn.p.k(view2, "it");
                Object tag = view2.getTag(R.id.report_drawn);
                if (tag instanceof FullyDrawnReporterOwner) {
                    return (FullyDrawnReporterOwner) tag;
                }
                return null;
            }
        }));
    }

    public static final void set(@NotNull View view, @NotNull FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        tn.p.k(view, "<this>");
        tn.p.k(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(R.id.report_drawn, fullyDrawnReporterOwner);
    }
}
