package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.SolidColor;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import tn.p;

/* JADX INFO: compiled from: TextDrawStyle.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fJ\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0016J\u0016\u0010\f\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\rH\u0016R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001b\u0010\u0006\u001a\u00020\u0007X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/style/TextDrawStyle;", "", "brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "color", "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", "merge", "other", "takeOrElse", "Lkotlin/Function0;", VastTagName.COMPANION, "Unspecified", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface TextDrawStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: TextDrawStyle.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001b\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/style/TextDrawStyle$Companion;", "", "()V", TypedValues.TransitionType.S_FROM, "Landroidx/compose/ui/text/style/TextDrawStyle;", "brush", "Landroidx/compose/ui/graphics/Brush;", "color", "Landroidx/compose/ui/graphics/Color;", "from-8_81llA", "(J)Landroidx/compose/ui/text/style/TextDrawStyle;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final TextDrawStyle from(@Nullable Brush brush) {
            if (brush == null) {
                return Unspecified.INSTANCE;
            }
            if (brush instanceof SolidColor) {
                return m3752from8_81llA(((SolidColor) brush).getValue());
            }
            if (brush instanceof ShaderBrush) {
                return new BrushStyle((ShaderBrush) brush);
            }
            throw new NoWhenBranchMatchedException();
        }

        @NotNull
        /* JADX INFO: renamed from: from-8_81llA, reason: not valid java name */
        public final TextDrawStyle m3752from8_81llA(long color) {
            return (color > Color.INSTANCE.m1655getUnspecified0d7_KjU() ? 1 : (color == Color.INSTANCE.m1655getUnspecified0d7_KjU() ? 0 : -1)) != 0 ? new ColorStyle(color, null) : Unspecified.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TextDrawStyle.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\u00020\b8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/style/TextDrawStyle$Unspecified;", "Landroidx/compose/ui/text/style/TextDrawStyle;", "()V", "brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "color", "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Unspecified implements TextDrawStyle {

        @NotNull
        public static final Unspecified INSTANCE = new Unspecified();

        private Unspecified() {
        }

        @Override // androidx.compose.ui.text.style.TextDrawStyle
        @Nullable
        public Brush getBrush() {
            return null;
        }

        @Override // androidx.compose.ui.text.style.TextDrawStyle
        /* JADX INFO: renamed from: getColor-0d7_KjU */
        public long mo3697getColor0d7_KjU() {
            return Color.INSTANCE.m1655getUnspecified0d7_KjU();
        }
    }

    @Nullable
    Brush getBrush();

    /* JADX INFO: renamed from: getColor-0d7_KjU */
    long mo3697getColor0d7_KjU();

    @NotNull
    default TextDrawStyle merge(@NotNull TextDrawStyle other) {
        p.k(other, "other");
        return other.getBrush() != null ? other : getBrush() != null ? this : other.takeOrElse(new a<TextDrawStyle>() { // from class: androidx.compose.ui.text.style.TextDrawStyle.merge.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // sn.a
            @NotNull
            public final TextDrawStyle invoke() {
                return TextDrawStyle.this;
            }
        });
    }

    @NotNull
    default TextDrawStyle takeOrElse(@NotNull a<? extends TextDrawStyle> aVar) {
        p.k(aVar, "other");
        return !p.f(this, Unspecified.INSTANCE) ? this : aVar.invoke();
    }
}
