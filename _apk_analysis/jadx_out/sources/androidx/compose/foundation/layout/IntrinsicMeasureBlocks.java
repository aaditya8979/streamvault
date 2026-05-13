package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: RowColumnImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R5\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR5\u0010\n\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR5\u0010\f\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR5\u0010\u000e\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR5\u0010\u0010\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\tR5\u0010\u0012\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\tR5\u0010\u0014\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\tR5\u0010\u0016\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0017\u0010\t¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicMeasureBlocks;", "", "Lkotlin/Function3;", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "HorizontalMinWidth", "Lsn/q;", "getHorizontalMinWidth", "()Lsn/q;", "VerticalMinWidth", "getVerticalMinWidth", "HorizontalMinHeight", "getHorizontalMinHeight", "VerticalMinHeight", "getVerticalMinHeight", "HorizontalMaxWidth", "getHorizontalMaxWidth", "VerticalMaxWidth", "getVerticalMaxWidth", "HorizontalMaxHeight", "getHorizontalMaxHeight", "VerticalMaxHeight", "getVerticalMaxHeight", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 6, 0})
final class IntrinsicMeasureBlocks {

    @NotNull
    public static final IntrinsicMeasureBlocks INSTANCE = new IntrinsicMeasureBlocks();

    @NotNull
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> HorizontalMinWidth = new q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1
        @NotNull
        public final Integer invoke(@NotNull List<? extends IntrinsicMeasurable> list, int i10, int i11) {
            p.k(list, "measurables");
            AnonymousClass1 anonymousClass1 = new sn.p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1.1
                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i12) {
                    p.k(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i12));
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Integer mo2invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }
            };
            AnonymousClass2 anonymousClass2 = new sn.p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinWidth$1.2
                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i12) {
                    p.k(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i12));
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Integer mo2invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(list, anonymousClass1, anonymousClass2, i10, i11, layoutOrientation, layoutOrientation));
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }
    };

    @NotNull
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> VerticalMinWidth = new q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1
        @NotNull
        public final Integer invoke(@NotNull List<? extends IntrinsicMeasurable> list, int i10, int i11) {
            p.k(list, "measurables");
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(list, new sn.p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1.1
                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i12) {
                    p.k(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i12));
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Integer mo2invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }
            }, new sn.p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinWidth$1.2
                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i12) {
                    p.k(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i12));
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Integer mo2invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }
            }, i10, i11, LayoutOrientation.Vertical, LayoutOrientation.Horizontal));
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }
    };

    @NotNull
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> HorizontalMinHeight = new q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1
        @NotNull
        public final Integer invoke(@NotNull List<? extends IntrinsicMeasurable> list, int i10, int i11) {
            p.k(list, "measurables");
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(list, new sn.p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1.1
                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i12) {
                    p.k(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i12));
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Integer mo2invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }
            }, new sn.p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMinHeight$1.2
                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i12) {
                    p.k(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i12));
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Integer mo2invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }
            }, i10, i11, LayoutOrientation.Horizontal, LayoutOrientation.Vertical));
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }
    };

    @NotNull
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> VerticalMinHeight = new q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1
        @NotNull
        public final Integer invoke(@NotNull List<? extends IntrinsicMeasurable> list, int i10, int i11) {
            p.k(list, "measurables");
            AnonymousClass1 anonymousClass1 = new sn.p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1.1
                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i12) {
                    p.k(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i12));
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Integer mo2invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }
            };
            AnonymousClass2 anonymousClass2 = new sn.p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMinHeight$1.2
                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i12) {
                    p.k(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i12));
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Integer mo2invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(list, anonymousClass1, anonymousClass2, i10, i11, layoutOrientation, layoutOrientation));
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }
    };

    @NotNull
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> HorizontalMaxWidth = new q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1
        @NotNull
        public final Integer invoke(@NotNull List<? extends IntrinsicMeasurable> list, int i10, int i11) {
            p.k(list, "measurables");
            AnonymousClass1 anonymousClass1 = new sn.p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1.1
                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i12) {
                    p.k(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i12));
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Integer mo2invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }
            };
            AnonymousClass2 anonymousClass2 = new sn.p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxWidth$1.2
                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i12) {
                    p.k(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i12));
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Integer mo2invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(list, anonymousClass1, anonymousClass2, i10, i11, layoutOrientation, layoutOrientation));
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }
    };

    @NotNull
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> VerticalMaxWidth = new q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1
        @NotNull
        public final Integer invoke(@NotNull List<? extends IntrinsicMeasurable> list, int i10, int i11) {
            p.k(list, "measurables");
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(list, new sn.p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1.1
                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i12) {
                    p.k(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i12));
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Integer mo2invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }
            }, new sn.p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxWidth$1.2
                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i12) {
                    p.k(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i12));
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Integer mo2invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }
            }, i10, i11, LayoutOrientation.Vertical, LayoutOrientation.Horizontal));
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }
    };

    @NotNull
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> HorizontalMaxHeight = new q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1
        @NotNull
        public final Integer invoke(@NotNull List<? extends IntrinsicMeasurable> list, int i10, int i11) {
            p.k(list, "measurables");
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(list, new sn.p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1.1
                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i12) {
                    p.k(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i12));
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Integer mo2invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }
            }, new sn.p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$HorizontalMaxHeight$1.2
                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i12) {
                    p.k(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i12));
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Integer mo2invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }
            }, i10, i11, LayoutOrientation.Horizontal, LayoutOrientation.Vertical));
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }
    };

    @NotNull
    private static final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> VerticalMaxHeight = new q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1
        @NotNull
        public final Integer invoke(@NotNull List<? extends IntrinsicMeasurable> list, int i10, int i11) {
            p.k(list, "measurables");
            AnonymousClass1 anonymousClass1 = new sn.p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1.1
                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i12) {
                    p.k(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i12));
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Integer mo2invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }
            };
            AnonymousClass2 anonymousClass2 = new sn.p<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.foundation.layout.IntrinsicMeasureBlocks$VerticalMaxHeight$1.2
                @NotNull
                public final Integer invoke(@NotNull IntrinsicMeasurable intrinsicMeasurable, int i12) {
                    p.k(intrinsicMeasurable, "$this$intrinsicSize");
                    return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i12));
                }

                @Override // sn.p
                /* JADX INFO: renamed from: invoke */
                public /* bridge */ /* synthetic */ Integer mo2invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                    return invoke(intrinsicMeasurable, num.intValue());
                }
            };
            LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
            return Integer.valueOf(RowColumnImplKt.intrinsicSize(list, anonymousClass1, anonymousClass2, i10, i11, layoutOrientation, layoutOrientation));
        }

        @Override // sn.q
        public /* bridge */ /* synthetic */ Integer invoke(List<? extends IntrinsicMeasurable> list, Integer num, Integer num2) {
            return invoke(list, num.intValue(), num2.intValue());
        }
    };

    private IntrinsicMeasureBlocks() {
    }

    @NotNull
    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getHorizontalMaxHeight() {
        return HorizontalMaxHeight;
    }

    @NotNull
    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getHorizontalMaxWidth() {
        return HorizontalMaxWidth;
    }

    @NotNull
    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getHorizontalMinHeight() {
        return HorizontalMinHeight;
    }

    @NotNull
    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getHorizontalMinWidth() {
        return HorizontalMinWidth;
    }

    @NotNull
    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getVerticalMaxHeight() {
        return VerticalMaxHeight;
    }

    @NotNull
    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getVerticalMaxWidth() {
        return VerticalMaxWidth;
    }

    @NotNull
    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getVerticalMinHeight() {
        return VerticalMinHeight;
    }

    @NotNull
    public final q<List<? extends IntrinsicMeasurable>, Integer, Integer, Integer> getVerticalMinWidth() {
        return VerticalMinWidth;
    }
}
