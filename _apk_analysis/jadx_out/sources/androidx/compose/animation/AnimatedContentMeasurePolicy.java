package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import cn.f0;
import cn.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u000e\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016J/\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\"\u0010\u0018\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\"\u0010\u0019\u001a\u00020\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\bH\u0016R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/animation/AnimatedContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "rootScope", "Landroidx/compose/animation/AnimatedContentScope;", "(Landroidx/compose/animation/AnimatedContentScope;)V", "getRootScope", "()Landroidx/compose/animation/AnimatedContentScope;", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class AnimatedContentMeasurePolicy implements MeasurePolicy {

    @NotNull
    private final AnimatedContentScope<?> rootScope;

    public AnimatedContentMeasurePolicy(@NotNull AnimatedContentScope<?> animatedContentScope) {
        p.k(animatedContentScope, "rootScope");
        this.rootScope = animatedContentScope;
    }

    @NotNull
    public final AnimatedContentScope<?> getRootScope() {
        return this.rootScope;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, final int i10) {
        p.k(intrinsicMeasureScope, "<this>");
        p.k(list, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.M(SequencesKt___SequencesKt.K(f0.g0(list), new l<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy.maxIntrinsicHeight.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable) {
                p.k(intrinsicMeasurable, "it");
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i10));
            }
        }));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, final int i10) {
        p.k(intrinsicMeasureScope, "<this>");
        p.k(list, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.M(SequencesKt___SequencesKt.K(f0.g0(list), new l<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy.maxIntrinsicWidth.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable) {
                p.k(intrinsicMeasurable, "it");
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i10));
            }
        }));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j10) {
        Placeable placeable;
        int i10;
        Placeable placeable2;
        p.k(measureScope, "$this$measure");
        p.k(list, "measurables");
        int size = list.size();
        final Placeable[] placeableArr = new Placeable[size];
        int size2 = list.size();
        int i11 = 0;
        while (true) {
            placeable = null;
            if (i11 >= size2) {
                break;
            }
            Measurable measurable = list.get(i11);
            Object parentData = measurable.getParentData();
            AnimatedContentScope.ChildData childData = parentData instanceof AnimatedContentScope.ChildData ? (AnimatedContentScope.ChildData) parentData : null;
            if (((childData == null || !childData.isTarget()) ? 0 : 1) != 0) {
                placeableArr[i11] = measurable.mo3112measureBRTryo0(j10);
            }
            i11++;
        }
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            Measurable measurable2 = list.get(i12);
            if (placeableArr[i12] == null) {
                placeableArr[i12] = measurable2.mo3112measureBRTryo0(j10);
            }
        }
        if ((size == 0) == true) {
            placeable2 = null;
        } else {
            placeable2 = placeableArr[0];
            int iC0 = r.c0(placeableArr);
            if (iC0 != 0) {
                int width = placeable2 != null ? placeable2.getWidth() : 0;
                if (1 <= iC0) {
                    int i13 = 1;
                    while (true) {
                        Placeable placeable3 = placeableArr[i13];
                        int width2 = placeable3 != null ? placeable3.getWidth() : 0;
                        if (width < width2) {
                            placeable2 = placeable3;
                            width = width2;
                        }
                        if (i13 == iC0) {
                            break;
                        }
                        i13++;
                    }
                }
            }
        }
        final int width3 = placeable2 != null ? placeable2.getWidth() : 0;
        if ((size == 0) == false) {
            placeable = placeableArr[0];
            int iC02 = r.c0(placeableArr);
            if (iC02 != 0) {
                int height = placeable != null ? placeable.getHeight() : 0;
                if (1 <= iC02) {
                    while (true) {
                        Placeable placeable4 = placeableArr[i10];
                        int height2 = placeable4 != null ? placeable4.getHeight() : 0;
                        if (height < height2) {
                            placeable = placeable4;
                            height = height2;
                        }
                        if (i10 == iC02) {
                            break;
                        }
                        i10++;
                    }
                }
            }
        }
        final int height3 = placeable != null ? placeable.getHeight() : 0;
        this.rootScope.m18setMeasuredSizeozmzZPI$animation_release(IntSizeKt.IntSize(width3, height3));
        return MeasureScope.layout$default(measureScope, width3, height3, null, new l<Placeable.PlacementScope, bn.r>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy$measure$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ bn.r invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return bn.r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                p.k(placementScope, "$this$layout");
                Placeable[] placeableArr2 = placeableArr;
                AnimatedContentMeasurePolicy animatedContentMeasurePolicy = this;
                int i14 = width3;
                int i15 = height3;
                for (Placeable placeable5 : placeableArr2) {
                    if (placeable5 != null) {
                        long jMo1291alignKFBX0sM = animatedContentMeasurePolicy.getRootScope().getContentAlignment().mo1291alignKFBX0sM(IntSizeKt.IntSize(placeable5.getWidth(), placeable5.getHeight()), IntSizeKt.IntSize(i14, i15), LayoutDirection.Ltr);
                        Placeable.PlacementScope.place$default(placementScope, placeable5, IntOffset.m3944getXimpl(jMo1291alignKFBX0sM), IntOffset.m3945getYimpl(jMo1291alignKFBX0sM), 0.0f, 4, null);
                    }
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, final int i10) {
        p.k(intrinsicMeasureScope, "<this>");
        p.k(list, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.M(SequencesKt___SequencesKt.K(f0.g0(list), new l<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy.minIntrinsicHeight.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable) {
                p.k(intrinsicMeasurable, "it");
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i10));
            }
        }));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, final int i10) {
        p.k(intrinsicMeasureScope, "<this>");
        p.k(list, "measurables");
        Integer num = (Integer) SequencesKt___SequencesKt.M(SequencesKt___SequencesKt.K(f0.g0(list), new l<IntrinsicMeasurable, Integer>() { // from class: androidx.compose.animation.AnimatedContentMeasurePolicy.minIntrinsicWidth.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // sn.l
            @NotNull
            public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable) {
                p.k(intrinsicMeasurable, "it");
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i10));
            }
        }));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
