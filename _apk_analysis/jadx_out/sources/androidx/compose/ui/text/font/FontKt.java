package androidx.compose.ui.text.font;

import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: Font.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0001H\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "resId", "", ActivityChooserModel.ATTRIBUTE_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "Font-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "loadingStrategy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "Font-YpTlLL0", "(ILandroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/ui/text/font/Font;", "toFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class FontKt {
    @Stable
    /* JADX INFO: renamed from: Font-RetOiIg, reason: not valid java name */
    public static final /* synthetic */ Font m3532FontRetOiIg(int i10, FontWeight fontWeight, int i11) {
        p.k(fontWeight, ActivityChooserModel.ATTRIBUTE_WEIGHT);
        return new ResourceFont(i10, fontWeight, i11, FontLoadingStrategy.INSTANCE.m3544getBlockingPKNRLFQ(), null);
    }

    /* JADX INFO: renamed from: Font-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Font m3533FontRetOiIg$default(int i10, FontWeight fontWeight, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i12 & 4) != 0) {
            i11 = FontStyle.INSTANCE.m3557getNormal_LCdwA();
        }
        return m3532FontRetOiIg(i10, fontWeight, i11);
    }

    @Stable
    @NotNull
    /* JADX INFO: renamed from: Font-YpTlLL0, reason: not valid java name */
    public static final Font m3534FontYpTlLL0(int i10, @NotNull FontWeight fontWeight, int i11, int i12) {
        p.k(fontWeight, ActivityChooserModel.ATTRIBUTE_WEIGHT);
        return new ResourceFont(i10, fontWeight, i11, i12, null);
    }

    /* JADX INFO: renamed from: Font-YpTlLL0$default, reason: not valid java name */
    public static /* synthetic */ Font m3535FontYpTlLL0$default(int i10, FontWeight fontWeight, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i13 & 4) != 0) {
            i11 = FontStyle.INSTANCE.m3557getNormal_LCdwA();
        }
        if ((i13 & 8) != 0) {
            i12 = FontLoadingStrategy.INSTANCE.m3544getBlockingPKNRLFQ();
        }
        return m3534FontYpTlLL0(i10, fontWeight, i11, i12);
    }

    @Stable
    @NotNull
    public static final FontFamily toFontFamily(@NotNull Font font) {
        p.k(font, "<this>");
        return FontFamilyKt.FontFamily(font);
    }
}
