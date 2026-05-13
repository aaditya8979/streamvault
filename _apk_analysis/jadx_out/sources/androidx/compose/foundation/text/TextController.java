package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import bn.h;
import bn.r;
import hn.c;
import in.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jn.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.p;

/* JADX INFO: compiled from: CoreText.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b3\u00104J%\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\n\u001a\u00020\t*\u00020\tH\u0003J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0016R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010+R\u0011\u00102\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b1\u0010/\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/foundation/text/TextController;", "Landroidx/compose/runtime/RememberObserver;", "Landroidx/compose/ui/geometry/Offset;", "start", "end", "", "outOfBoundary-0a9Yr6o", "(JJ)Z", "outOfBoundary", "Landroidx/compose/ui/Modifier;", "drawTextAndSelectionBehind", "Landroidx/compose/ui/text/AnnotatedString;", "text", "createSemanticsModifierFor", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "selectionRegistrar", "Lbn/r;", "update", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "setTextDelegate", "onRemembered", "onForgotten", "onAbandoned", "Landroidx/compose/foundation/text/TextState;", "state", "Landroidx/compose/foundation/text/TextState;", "getState", "()Landroidx/compose/foundation/text/TextState;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "Landroidx/compose/foundation/text/TextDragObserver;", "longPressDragObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getLongPressDragObserver", "()Landroidx/compose/foundation/text/TextDragObserver;", "setLongPressDragObserver", "(Landroidx/compose/foundation/text/TextDragObserver;)V", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicy", "Landroidx/compose/ui/layout/MeasurePolicy;", "getMeasurePolicy", "()Landroidx/compose/ui/layout/MeasurePolicy;", "coreModifiers", "Landroidx/compose/ui/Modifier;", "<set-?>", "semanticsModifier", "getSemanticsModifier$foundation_release", "()Landroidx/compose/ui/Modifier;", "selectionModifiers", "getModifiers", "modifiers", "<init>", "(Landroidx/compose/foundation/text/TextState;)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class TextController implements RememberObserver {

    @NotNull
    private final Modifier coreModifiers;
    public TextDragObserver longPressDragObserver;

    @NotNull
    private final MeasurePolicy measurePolicy;

    @NotNull
    private Modifier selectionModifiers;

    @Nullable
    private SelectionRegistrar selectionRegistrar;

    @NotNull
    private Modifier semanticsModifier;

    @NotNull
    private final TextState state;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextController$update$2, reason: invalid class name */
    /* JADX INFO: compiled from: CoreText.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @d(c = "androidx.compose.foundation.text.TextController$update$2", f = "CoreText.kt", l = {191}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<PointerInputScope, c<? super r>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass2 anonymousClass2 = TextController.this.new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull PointerInputScope pointerInputScope, @Nullable c<? super r> cVar) {
            return ((AnonymousClass2) create(pointerInputScope, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                TextDragObserver longPressDragObserver = TextController.this.getLongPressDragObserver();
                this.label = 1;
                if (LongPressTextDragObserverKt.detectDragGesturesAfterLongPressWithObserver(pointerInputScope, longPressDragObserver, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.TextController$update$3, reason: invalid class name */
    /* JADX INFO: compiled from: CoreText.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lbn/r;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @d(c = "androidx.compose.foundation.text.TextController$update$3", f = "CoreText.kt", l = {282}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements p<PointerInputScope, c<? super r>, Object> {
        public final /* synthetic */ TextController$update$mouseSelectionObserver$1 $mouseSelectionObserver;
        private /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TextController$update$mouseSelectionObserver$1 textController$update$mouseSelectionObserver$1, c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$mouseSelectionObserver = textController$update$mouseSelectionObserver$1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final c<r> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$mouseSelectionObserver, cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // sn.p
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(@NotNull PointerInputScope pointerInputScope, @Nullable c<? super r> cVar) {
            return ((AnonymousClass3) create(pointerInputScope, cVar)).invokeSuspend(r.f5635a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = a.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.c.b(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
                TextController$update$mouseSelectionObserver$1 textController$update$mouseSelectionObserver$1 = this.$mouseSelectionObserver;
                this.label = 1;
                if (TextSelectionMouseDetectorKt.mouseSelectionDetector(pointerInputScope, textController$update$mouseSelectionObserver$1, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f5635a;
        }
    }

    public TextController(@NotNull TextState textState) {
        tn.p.k(textState, "state");
        this.state = textState;
        this.measurePolicy = new MeasurePolicy() { // from class: androidx.compose.foundation.text.TextController$measurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10) {
                tn.p.k(intrinsicMeasureScope, "<this>");
                tn.p.k(list, "measurables");
                return IntSize.m3985getHeightimpl(TextDelegate.m731layoutNN6EwU$default(this.this$0.getState().getTextDelegate(), ConstraintsKt.Constraints(0, i10, 0, Integer.MAX_VALUE), intrinsicMeasureScope.getLayoutDirection(), null, 4, null).getSize());
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10) {
                tn.p.k(intrinsicMeasureScope, "<this>");
                tn.p.k(list, "measurables");
                this.this$0.getState().getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                return this.this$0.getState().getTextDelegate().getMaxIntrinsicWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            @NotNull
            /* JADX INFO: renamed from: measure-3p2s80s */
            public MeasureResult mo6measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j10) {
                int i10;
                Pair pair;
                SelectionRegistrar selectionRegistrar;
                tn.p.k(measureScope, "$this$measure");
                tn.p.k(list, "measurables");
                TextLayoutResult layoutResult = this.this$0.getState().getLayoutResult();
                TextLayoutResult textLayoutResultM734layoutNN6EwU = this.this$0.getState().getTextDelegate().m734layoutNN6EwU(j10, measureScope.getLayoutDirection(), layoutResult);
                if (!tn.p.f(layoutResult, textLayoutResultM734layoutNN6EwU)) {
                    this.this$0.getState().getOnTextLayout().invoke(textLayoutResultM734layoutNN6EwU);
                    if (layoutResult != null) {
                        TextController textController = this.this$0;
                        if (!tn.p.f(layoutResult.getLayoutInput().getText(), textLayoutResultM734layoutNN6EwU.getLayoutInput().getText()) && (selectionRegistrar = textController.selectionRegistrar) != null) {
                            selectionRegistrar.notifySelectableChange(textController.getState().getSelectableId());
                        }
                    }
                }
                this.this$0.getState().setLayoutResult(textLayoutResultM734layoutNN6EwU);
                if (!(list.size() >= textLayoutResultM734layoutNN6EwU.getPlaceholderRects().size())) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                List<Rect> placeholderRects = textLayoutResultM734layoutNN6EwU.getPlaceholderRects();
                final ArrayList arrayList = new ArrayList(placeholderRects.size());
                int size = placeholderRects.size();
                int i11 = 0;
                while (i11 < size) {
                    Rect rect = placeholderRects.get(i11);
                    if (rect != null) {
                        i10 = size;
                        pair = new Pair(list.get(i11).mo3112measureBRTryo0(ConstraintsKt.Constraints$default(0, (int) Math.floor(rect.getWidth()), 0, (int) Math.floor(rect.getHeight()), 5, null)), IntOffset.m3935boximpl(IntOffsetKt.IntOffset(vn.c.d(rect.getLeft()), vn.c.d(rect.getTop()))));
                    } else {
                        i10 = size;
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                    i11++;
                    size = i10;
                }
                return measureScope.layout(IntSize.m3986getWidthimpl(textLayoutResultM734layoutNN6EwU.getSize()), IntSize.m3985getHeightimpl(textLayoutResultM734layoutNN6EwU.getSize()), kotlin.collections.a.m(h.a(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(vn.c.d(textLayoutResultM734layoutNN6EwU.getFirstBaseline()))), h.a(AlignmentLineKt.getLastBaseline(), Integer.valueOf(vn.c.d(textLayoutResultM734layoutNN6EwU.getLastBaseline())))), new l<Placeable.PlacementScope, r>() { // from class: androidx.compose.foundation.text.TextController$measurePolicy$1$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // sn.l
                    public /* bridge */ /* synthetic */ r invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return r.f5635a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                        tn.p.k(placementScope, "$this$layout");
                        List<Pair<Placeable, IntOffset>> list2 = arrayList;
                        int size2 = list2.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            Pair<Placeable, IntOffset> pair2 = list2.get(i12);
                            Placeable.PlacementScope.m3154place70tqf50$default(placementScope, pair2.component1(), pair2.component2().getPackedValue(), 0.0f, 2, null);
                        }
                    }
                });
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10) {
                tn.p.k(intrinsicMeasureScope, "<this>");
                tn.p.k(list, "measurables");
                return IntSize.m3985getHeightimpl(TextDelegate.m731layoutNN6EwU$default(this.this$0.getState().getTextDelegate(), ConstraintsKt.Constraints(0, i10, 0, Integer.MAX_VALUE), intrinsicMeasureScope.getLayoutDirection(), null, 4, null).getSize());
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull List<? extends IntrinsicMeasurable> list, int i10) {
                tn.p.k(intrinsicMeasureScope, "<this>");
                tn.p.k(list, "measurables");
                this.this$0.getState().getTextDelegate().layoutIntrinsics(intrinsicMeasureScope.getLayoutDirection());
                return this.this$0.getState().getTextDelegate().getMinIntrinsicWidth();
            }
        };
        Modifier.Companion companion = Modifier.INSTANCE;
        this.coreModifiers = OnGloballyPositionedModifierKt.onGloballyPositioned(drawTextAndSelectionBehind(companion), new l<LayoutCoordinates, r>() { // from class: androidx.compose.foundation.text.TextController$coreModifiers$1
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull LayoutCoordinates layoutCoordinates) {
                SelectionRegistrar selectionRegistrar;
                tn.p.k(layoutCoordinates, "it");
                this.this$0.getState().setLayoutCoordinates(layoutCoordinates);
                if (SelectionRegistrarKt.hasSelection(this.this$0.selectionRegistrar, this.this$0.getState().getSelectableId())) {
                    long jPositionInWindow = LayoutCoordinatesKt.positionInWindow(layoutCoordinates);
                    if (!Offset.m1380equalsimpl0(jPositionInWindow, this.this$0.getState().getPreviousGlobalPosition()) && (selectionRegistrar = this.this$0.selectionRegistrar) != null) {
                        selectionRegistrar.notifyPositionChange(this.this$0.getState().getSelectableId());
                    }
                    this.this$0.getState().m766setPreviousGlobalPositionk4lQ0M(jPositionInWindow);
                }
            }
        });
        this.semanticsModifier = createSemanticsModifierFor(textState.getTextDelegate().getText());
        this.selectionModifiers = companion;
    }

    private final Modifier createSemanticsModifierFor(final AnnotatedString text) {
        return SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new l<SemanticsPropertyReceiver, r>() { // from class: androidx.compose.foundation.text.TextController.createSemanticsModifierFor.1
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
                tn.p.k(semanticsPropertyReceiver, "$this$semantics");
                SemanticsPropertiesKt.setText(semanticsPropertyReceiver, text);
                final TextController textController = this;
                SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new l<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.TextController.createSemanticsModifierFor.1.1
                    {
                        super(1);
                    }

                    @Override // sn.l
                    @NotNull
                    public final Boolean invoke(@NotNull List<TextLayoutResult> list) {
                        boolean z10;
                        tn.p.k(list, "it");
                        if (textController.getState().getLayoutResult() != null) {
                            TextLayoutResult layoutResult = textController.getState().getLayoutResult();
                            tn.p.h(layoutResult);
                            list.add(layoutResult);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    }
                }, 1, null);
            }
        }, 1, null);
    }

    @Stable
    private final Modifier drawTextAndSelectionBehind(Modifier modifier) {
        return DrawModifierKt.drawBehind(GraphicsLayerModifierKt.m1756graphicsLayerpANQ8Wg$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65535, null), new l<DrawScope, r>() { // from class: androidx.compose.foundation.text.TextController.drawTextAndSelectionBehind.1
            {
                super(1);
            }

            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DrawScope drawScope) {
                Map<Long, Selection> subselections;
                tn.p.k(drawScope, "$this$drawBehind");
                TextLayoutResult layoutResult = TextController.this.getState().getLayoutResult();
                if (layoutResult != null) {
                    TextController textController = TextController.this;
                    textController.getState().getDrawScopeInvalidation();
                    SelectionRegistrar selectionRegistrar = textController.selectionRegistrar;
                    Selection selection = (selectionRegistrar == null || (subselections = selectionRegistrar.getSubselections()) == null) ? null : subselections.get(Long.valueOf(textController.getState().getSelectableId()));
                    if (selection != null) {
                        int offset = !selection.getHandlesCrossed() ? selection.getStart().getOffset() : selection.getEnd().getOffset();
                        int offset2 = !selection.getHandlesCrossed() ? selection.getEnd().getOffset() : selection.getStart().getOffset();
                        if (offset != offset2) {
                            DrawScope.m2104drawPathLG529CI$default(drawScope, layoutResult.getMultiParagraph().getPathForRange(offset, offset2), textController.getState().getSelectionBackgroundColor(), 0.0f, null, null, 0, 60, null);
                        }
                    }
                    TextDelegate.INSTANCE.paint(drawScope.getDrawContext().getCanvas(), layoutResult);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: outOfBoundary-0a9Yr6o, reason: not valid java name */
    public final boolean m723outOfBoundary0a9Yr6o(long start, long end) {
        TextLayoutResult layoutResult = this.state.getLayoutResult();
        if (layoutResult == null) {
            return false;
        }
        int length = layoutResult.getLayoutInput().getText().getText().length();
        int iM3459getOffsetForPositionk4lQ0M = layoutResult.m3459getOffsetForPositionk4lQ0M(start);
        int iM3459getOffsetForPositionk4lQ0M2 = layoutResult.m3459getOffsetForPositionk4lQ0M(end);
        int i10 = length - 1;
        return (iM3459getOffsetForPositionk4lQ0M >= i10 && iM3459getOffsetForPositionk4lQ0M2 >= i10) || (iM3459getOffsetForPositionk4lQ0M < 0 && iM3459getOffsetForPositionk4lQ0M2 < 0);
    }

    @NotNull
    public final TextDragObserver getLongPressDragObserver() {
        TextDragObserver textDragObserver = this.longPressDragObserver;
        if (textDragObserver != null) {
            return textDragObserver;
        }
        tn.p.C("longPressDragObserver");
        return null;
    }

    @NotNull
    public final MeasurePolicy getMeasurePolicy() {
        return this.measurePolicy;
    }

    @NotNull
    public final Modifier getModifiers() {
        return this.coreModifiers.then(this.semanticsModifier).then(this.selectionModifiers);
    }

    @NotNull
    /* JADX INFO: renamed from: getSemanticsModifier$foundation_release, reason: from getter */
    public final Modifier getSemanticsModifier() {
        return this.semanticsModifier;
    }

    @NotNull
    public final TextState getState() {
        return this.state;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        SelectionRegistrar selectionRegistrar;
        Selectable selectable = this.state.getSelectable();
        if (selectable == null || (selectionRegistrar = this.selectionRegistrar) == null) {
            return;
        }
        selectionRegistrar.unsubscribe(selectable);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        SelectionRegistrar selectionRegistrar;
        Selectable selectable = this.state.getSelectable();
        if (selectable == null || (selectionRegistrar = this.selectionRegistrar) == null) {
            return;
        }
        selectionRegistrar.unsubscribe(selectable);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        SelectionRegistrar selectionRegistrar = this.selectionRegistrar;
        if (selectionRegistrar != null) {
            TextState textState = this.state;
            textState.setSelectable(selectionRegistrar.subscribe(new MultiWidgetSelectionDelegate(textState.getSelectableId(), new sn.a<LayoutCoordinates>() { // from class: androidx.compose.foundation.text.TextController$onRemembered$1$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // sn.a
                @Nullable
                public final LayoutCoordinates invoke() {
                    return this.this$0.getState().getLayoutCoordinates();
                }
            }, new sn.a<TextLayoutResult>() { // from class: androidx.compose.foundation.text.TextController$onRemembered$1$2
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // sn.a
                @Nullable
                public final TextLayoutResult invoke() {
                    return this.this$0.getState().getLayoutResult();
                }
            })));
        }
    }

    public final void setLongPressDragObserver(@NotNull TextDragObserver textDragObserver) {
        tn.p.k(textDragObserver, "<set-?>");
        this.longPressDragObserver = textDragObserver;
    }

    public final void setTextDelegate(@NotNull TextDelegate textDelegate) {
        tn.p.k(textDelegate, "textDelegate");
        if (this.state.getTextDelegate() == textDelegate) {
            return;
        }
        this.state.setTextDelegate(textDelegate);
        this.semanticsModifier = createSemanticsModifierFor(this.state.getTextDelegate().getText());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.foundation.text.TextController$update$mouseSelectionObserver$1, java.lang.Object] */
    public final void update(@Nullable final SelectionRegistrar selectionRegistrar) {
        Modifier modifierPointerHoverIcon$default;
        this.selectionRegistrar = selectionRegistrar;
        if (selectionRegistrar == null) {
            modifierPointerHoverIcon$default = Modifier.INSTANCE;
        } else if (TouchMode_androidKt.isInTouchMode()) {
            setLongPressDragObserver(new TextDragObserver() { // from class: androidx.compose.foundation.text.TextController.update.1
                private long dragTotalDistance;
                private long lastPosition;

                {
                    Offset.Companion companion = Offset.INSTANCE;
                    this.lastPosition = companion.m1399getZeroF1C5BW0();
                    this.dragTotalDistance = companion.m1399getZeroF1C5BW0();
                }

                public final long getDragTotalDistance() {
                    return this.dragTotalDistance;
                }

                public final long getLastPosition() {
                    return this.lastPosition;
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onCancel() {
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar, TextController.this.getState().getSelectableId())) {
                        selectionRegistrar.notifySelectionUpdateEnd();
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* JADX INFO: renamed from: onDown-k-4lQ0M, reason: not valid java name */
                public void mo724onDownk4lQ0M(long point) {
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* JADX INFO: renamed from: onDrag-k-4lQ0M, reason: not valid java name */
                public void mo725onDragk4lQ0M(long delta) {
                    LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                    if (layoutCoordinates != null) {
                        SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                        TextController textController = TextController.this;
                        if (layoutCoordinates.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId())) {
                            long jM1388plusMKHz9U = Offset.m1388plusMKHz9U(this.dragTotalDistance, delta);
                            this.dragTotalDistance = jM1388plusMKHz9U;
                            long jM1388plusMKHz9U2 = Offset.m1388plusMKHz9U(this.lastPosition, jM1388plusMKHz9U);
                            if (textController.m723outOfBoundary0a9Yr6o(this.lastPosition, jM1388plusMKHz9U2) || !selectionRegistrar2.mo844notifySelectionUpdate5iVPX68(layoutCoordinates, jM1388plusMKHz9U2, this.lastPosition, false, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate())) {
                                return;
                            }
                            this.lastPosition = jM1388plusMKHz9U2;
                            this.dragTotalDistance = Offset.INSTANCE.m1399getZeroF1C5BW0();
                        }
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                /* JADX INFO: renamed from: onStart-k-4lQ0M, reason: not valid java name */
                public void mo726onStartk4lQ0M(long startPoint) {
                    LayoutCoordinates layoutCoordinates = TextController.this.getState().getLayoutCoordinates();
                    if (layoutCoordinates != null) {
                        TextController textController = TextController.this;
                        SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                        if (!layoutCoordinates.isAttached()) {
                            return;
                        }
                        if (textController.m723outOfBoundary0a9Yr6o(startPoint, startPoint)) {
                            selectionRegistrar2.notifySelectionUpdateSelectAll(textController.getState().getSelectableId());
                        } else {
                            selectionRegistrar2.mo845notifySelectionUpdateStartd4ec7I(layoutCoordinates, startPoint, SelectionAdjustment.INSTANCE.getWord());
                        }
                        this.lastPosition = startPoint;
                    }
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar, TextController.this.getState().getSelectableId())) {
                        this.dragTotalDistance = Offset.INSTANCE.m1399getZeroF1C5BW0();
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onStop() {
                    if (SelectionRegistrarKt.hasSelection(selectionRegistrar, TextController.this.getState().getSelectableId())) {
                        selectionRegistrar.notifySelectionUpdateEnd();
                    }
                }

                @Override // androidx.compose.foundation.text.TextDragObserver
                public void onUp() {
                }

                public final void setDragTotalDistance(long j10) {
                    this.dragTotalDistance = j10;
                }

                public final void setLastPosition(long j10) {
                    this.lastPosition = j10;
                }
            });
            modifierPointerHoverIcon$default = SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, getLongPressDragObserver(), new AnonymousClass2(null));
        } else {
            ?? r02 = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.TextController$update$mouseSelectionObserver$1
                private long lastPosition = Offset.INSTANCE.m1399getZeroF1C5BW0();

                public final long getLastPosition() {
                    return this.lastPosition;
                }

                @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
                /* JADX INFO: renamed from: onDrag-3MmeM6k, reason: not valid java name */
                public boolean mo727onDrag3MmeM6k(long dragPosition, @NotNull SelectionAdjustment adjustment) {
                    tn.p.k(adjustment, "adjustment");
                    LayoutCoordinates layoutCoordinates = this.this$0.getState().getLayoutCoordinates();
                    if (layoutCoordinates != null) {
                        SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                        TextController textController = this.this$0;
                        if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId())) {
                            return false;
                        }
                        if (selectionRegistrar2.mo844notifySelectionUpdate5iVPX68(layoutCoordinates, dragPosition, this.lastPosition, false, adjustment)) {
                            this.lastPosition = dragPosition;
                        }
                    }
                    return true;
                }

                @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
                /* JADX INFO: renamed from: onExtend-k-4lQ0M, reason: not valid java name */
                public boolean mo728onExtendk4lQ0M(long downPosition) {
                    LayoutCoordinates layoutCoordinates = this.this$0.getState().getLayoutCoordinates();
                    if (layoutCoordinates == null) {
                        return false;
                    }
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    TextController textController = this.this$0;
                    if (!layoutCoordinates.isAttached()) {
                        return false;
                    }
                    if (selectionRegistrar2.mo844notifySelectionUpdate5iVPX68(layoutCoordinates, downPosition, this.lastPosition, false, SelectionAdjustment.INSTANCE.getNone())) {
                        this.lastPosition = downPosition;
                    }
                    return SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId());
                }

                @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
                /* JADX INFO: renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
                public boolean mo729onExtendDragk4lQ0M(long dragPosition) {
                    LayoutCoordinates layoutCoordinates = this.this$0.getState().getLayoutCoordinates();
                    if (layoutCoordinates == null) {
                        return true;
                    }
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    TextController textController = this.this$0;
                    if (!layoutCoordinates.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId())) {
                        return false;
                    }
                    if (!selectionRegistrar2.mo844notifySelectionUpdate5iVPX68(layoutCoordinates, dragPosition, this.lastPosition, false, SelectionAdjustment.INSTANCE.getNone())) {
                        return true;
                    }
                    this.lastPosition = dragPosition;
                    return true;
                }

                @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
                /* JADX INFO: renamed from: onStart-3MmeM6k, reason: not valid java name */
                public boolean mo730onStart3MmeM6k(long downPosition, @NotNull SelectionAdjustment adjustment) {
                    tn.p.k(adjustment, "adjustment");
                    LayoutCoordinates layoutCoordinates = this.this$0.getState().getLayoutCoordinates();
                    if (layoutCoordinates == null) {
                        return false;
                    }
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    TextController textController = this.this$0;
                    if (!layoutCoordinates.isAttached()) {
                        return false;
                    }
                    selectionRegistrar2.mo845notifySelectionUpdateStartd4ec7I(layoutCoordinates, downPosition, adjustment);
                    this.lastPosition = downPosition;
                    return SelectionRegistrarKt.hasSelection(selectionRegistrar2, textController.getState().getSelectableId());
                }

                public final void setLastPosition(long j10) {
                    this.lastPosition = j10;
                }
            };
            modifierPointerHoverIcon$default = PointerIconKt.pointerHoverIcon$default(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, (Object) r02, new AnonymousClass3(r02, null)), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
        }
        this.selectionModifiers = modifierPointerHoverIcon$default;
    }
}
