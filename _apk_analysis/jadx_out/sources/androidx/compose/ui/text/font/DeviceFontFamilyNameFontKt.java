package androidx.compose.ui.text.font;

import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.ui.text.ExperimentalTextApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: DeviceFontFamilyNameFont.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "familyName", "Landroidx/compose/ui/text/font/DeviceFontFamilyName;", ActivityChooserModel.ATTRIBUTE_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "Font-KH_DTmE", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class DeviceFontFamilyNameFontKt {
    @ExperimentalTextApi
    @NotNull
    /* JADX INFO: renamed from: Font-KH_DTmE, reason: not valid java name */
    public static final Font m3527FontKH_DTmE(@NotNull String str, @NotNull FontWeight fontWeight, int i10) {
        p.k(str, "familyName");
        p.k(fontWeight, ActivityChooserModel.ATTRIBUTE_WEIGHT);
        return new Font(str, fontWeight, i10, null);
    }

    /* JADX INFO: renamed from: Font-KH_DTmE$default, reason: not valid java name */
    public static /* synthetic */ Font m3528FontKH_DTmE$default(String str, FontWeight fontWeight, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i11 & 4) != 0) {
            i10 = FontStyle.INSTANCE.m3557getNormal_LCdwA();
        }
        return m3527FontKH_DTmE(str, fontWeight, i10);
    }
}
