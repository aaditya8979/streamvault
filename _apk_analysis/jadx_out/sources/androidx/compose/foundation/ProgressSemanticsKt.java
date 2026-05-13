package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;
import zn.m;
import zn.n;

/* JADX INFO: compiled from: ProgressSemantics.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a.\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "value", "Lzn/e;", "valueRange", "", "steps", "progressSemantics", "foundation_release"}, k = 2, mv = {1, 6, 0})
public final class ProgressSemanticsKt {
    @Stable
    @NotNull
    public static final Modifier progressSemantics(@NotNull Modifier modifier) {
        p.k(modifier, "<this>");
        return SemanticsModifierKt.semantics(modifier, true, new l<SemanticsPropertyReceiver, r>() { // from class: androidx.compose.foundation.ProgressSemanticsKt.progressSemantics.2
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                p.k(semanticsPropertyReceiver, "$this$semantics");
                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, ProgressBarRangeInfo.INSTANCE.getIndeterminate());
            }
        });
    }

    @Stable
    @NotNull
    public static final Modifier progressSemantics(@NotNull Modifier modifier, final float f10, @NotNull final zn.e<Float> eVar, final int i10) {
        p.k(modifier, "<this>");
        p.k(eVar, "valueRange");
        return SemanticsModifierKt.semantics(modifier, true, new l<SemanticsPropertyReceiver, r>() { // from class: androidx.compose.foundation.ProgressSemanticsKt.progressSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                p.k(semanticsPropertyReceiver, "$this$semantics");
                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(((Number) n.q(Float.valueOf(f10), eVar)).floatValue(), eVar, i10));
            }
        });
    }

    public static /* synthetic */ Modifier progressSemantics$default(Modifier modifier, float f10, zn.e eVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            eVar = m.b(0.0f, 1.0f);
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return progressSemantics(modifier, f10, eVar, i10);
    }
}
