package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: CoreText.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b=\u0010>R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR.\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R.\u0010&\u001a\u0004\u0018\u00010\u000f2\b\u0010%\u001a\u0004\u0018\u00010\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R+\u0010-\u001a\u00020,8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b-\u0010\u000b\u001a\u0004\b.\u0010\r\"\u0004\b/\u00100R+\u00102\u001a\u0002018\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b2\u0010\u000b\u001a\u0004\b3\u0010\r\"\u0004\b4\u00100R+\u0010<\u001a\u00020\u00102\u0006\u00105\u001a\u00020\u00108F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/foundation/text/TextState;", "", "Landroidx/compose/foundation/text/TextDelegate;", "textDelegate", "Landroidx/compose/foundation/text/TextDelegate;", "getTextDelegate", "()Landroidx/compose/foundation/text/TextDelegate;", "setTextDelegate", "(Landroidx/compose/foundation/text/TextDelegate;)V", "", "selectableId", "J", "getSelectableId", "()J", "Lkotlin/Function1;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lbn/r;", "onTextLayout", "Lsn/l;", "getOnTextLayout", "()Lsn/l;", "setOnTextLayout", "(Lsn/l;)V", "Landroidx/compose/foundation/text/selection/Selectable;", "selectable", "Landroidx/compose/foundation/text/selection/Selectable;", "getSelectable", "()Landroidx/compose/foundation/text/selection/Selectable;", "setSelectable", "(Landroidx/compose/foundation/text/selection/Selectable;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setLayoutCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "value", "layoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "getLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "setLayoutResult", "(Landroidx/compose/ui/text/TextLayoutResult;)V", "Landroidx/compose/ui/geometry/Offset;", "previousGlobalPosition", "getPreviousGlobalPosition-F1C5BW0", "setPreviousGlobalPosition-k-4lQ0M", "(J)V", "Landroidx/compose/ui/graphics/Color;", "selectionBackgroundColor", "getSelectionBackgroundColor-0d7_KjU", "setSelectionBackgroundColor-8_81llA", "<set-?>", "drawScopeInvalidation$delegate", "Landroidx/compose/runtime/MutableState;", "getDrawScopeInvalidation", "()Lbn/r;", "setDrawScopeInvalidation", "(Lbn/r;)V", "drawScopeInvalidation", "<init>", "(Landroidx/compose/foundation/text/TextDelegate;J)V", "foundation_release"}, k = 1, mv = {1, 6, 0})
public final class TextState {

    /* JADX INFO: renamed from: drawScopeInvalidation$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState drawScopeInvalidation;

    @Nullable
    private LayoutCoordinates layoutCoordinates;

    @Nullable
    private TextLayoutResult layoutResult;

    @NotNull
    private l<? super TextLayoutResult, r> onTextLayout;
    private long previousGlobalPosition;

    @Nullable
    private Selectable selectable;
    private final long selectableId;
    private long selectionBackgroundColor;

    @NotNull
    private TextDelegate textDelegate;

    public TextState(@NotNull TextDelegate textDelegate, long j10) {
        p.k(textDelegate, "textDelegate");
        this.textDelegate = textDelegate;
        this.selectableId = j10;
        this.onTextLayout = new l<TextLayoutResult, r>() { // from class: androidx.compose.foundation.text.TextState$onTextLayout$1
            @Override // sn.l
            public /* bridge */ /* synthetic */ r invoke(TextLayoutResult textLayoutResult) {
                invoke2(textLayoutResult);
                return r.f5635a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull TextLayoutResult textLayoutResult) {
                p.k(textLayoutResult, "it");
            }
        };
        this.previousGlobalPosition = Offset.INSTANCE.m1399getZeroF1C5BW0();
        this.selectionBackgroundColor = Color.INSTANCE.m1655getUnspecified0d7_KjU();
        this.drawScopeInvalidation = SnapshotStateKt.mutableStateOf(r.f5635a, SnapshotStateKt.neverEqualPolicy());
    }

    private final void setDrawScopeInvalidation(r rVar) {
        this.drawScopeInvalidation.setValue(rVar);
    }

    @NotNull
    public final r getDrawScopeInvalidation() {
        this.drawScopeInvalidation.getValue();
        return r.f5635a;
    }

    @Nullable
    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    @Nullable
    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult;
    }

    @NotNull
    public final l<TextLayoutResult, r> getOnTextLayout() {
        return this.onTextLayout;
    }

    /* JADX INFO: renamed from: getPreviousGlobalPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPreviousGlobalPosition() {
        return this.previousGlobalPosition;
    }

    @Nullable
    public final Selectable getSelectable() {
        return this.selectable;
    }

    public final long getSelectableId() {
        return this.selectableId;
    }

    /* JADX INFO: renamed from: getSelectionBackgroundColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectionBackgroundColor() {
        return this.selectionBackgroundColor;
    }

    @NotNull
    public final TextDelegate getTextDelegate() {
        return this.textDelegate;
    }

    public final void setLayoutCoordinates(@Nullable LayoutCoordinates layoutCoordinates) {
        this.layoutCoordinates = layoutCoordinates;
    }

    public final void setLayoutResult(@Nullable TextLayoutResult textLayoutResult) {
        setDrawScopeInvalidation(r.f5635a);
        this.layoutResult = textLayoutResult;
    }

    public final void setOnTextLayout(@NotNull l<? super TextLayoutResult, r> lVar) {
        p.k(lVar, "<set-?>");
        this.onTextLayout = lVar;
    }

    /* JADX INFO: renamed from: setPreviousGlobalPosition-k-4lQ0M, reason: not valid java name */
    public final void m766setPreviousGlobalPositionk4lQ0M(long j10) {
        this.previousGlobalPosition = j10;
    }

    public final void setSelectable(@Nullable Selectable selectable) {
        this.selectable = selectable;
    }

    /* JADX INFO: renamed from: setSelectionBackgroundColor-8_81llA, reason: not valid java name */
    public final void m767setSelectionBackgroundColor8_81llA(long j10) {
        this.selectionBackgroundColor = j10;
    }

    public final void setTextDelegate(@NotNull TextDelegate textDelegate) {
        p.k(textDelegate, "<set-?>");
        this.textDelegate = textDelegate;
    }
}
