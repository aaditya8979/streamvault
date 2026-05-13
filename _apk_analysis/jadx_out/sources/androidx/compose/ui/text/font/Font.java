package androidx.compose.ui.text.font;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.ActivityChooserModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.AndroidFileDescriptorFont, reason: from toString */
/* JADX INFO: compiled from: AndroidFont.kt */
/* JADX INFO: loaded from: classes4.dex */
@RequiresApi(26)
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B&\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFileDescriptorFont;", "Landroidx/compose/ui/text/font/AndroidPreloadedFont;", "", "toString", "Landroid/os/ParcelFileDescriptor;", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "getFileDescriptor", "()Landroid/os/ParcelFileDescriptor;", "Landroidx/compose/ui/text/font/FontWeight;", ActivityChooserModel.ATTRIBUTE_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "style", "I", "getStyle-_-LCdwA", "()I", "Landroid/graphics/Typeface;", "typefaceInternal", "Landroid/graphics/Typeface;", "getTypefaceInternal", "()Landroid/graphics/Typeface;", "cacheKey", "Ljava/lang/String;", "getCacheKey", "()Ljava/lang/String;", "<init>", "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/FontWeight;ILtn/i;)V", "ui-text_release"}, k = 1, mv = {1, 6, 0})
final class Font extends AndroidPreloadedFont {

    @Nullable
    private final String cacheKey;

    @NotNull
    private final ParcelFileDescriptor fileDescriptor;
    private final int style;

    @NotNull
    private final android.graphics.Typeface typefaceInternal;

    @NotNull
    private final FontWeight weight;

    private Font(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i10) {
        this.fileDescriptor = parcelFileDescriptor;
        this.weight = fontWeight;
        this.style = i10;
        if (Build.VERSION.SDK_INT < 26) {
            throw new IllegalArgumentException("Cannot create font from file descriptor for SDK < 26");
        }
        this.typefaceInternal = AndroidFileDescriptorHelper.INSTANCE.create(parcelFileDescriptor);
    }

    public /* synthetic */ Font(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i10, int i11, i iVar) {
        this(parcelFileDescriptor, (i11 & 2) != 0 ? FontWeight.INSTANCE.getNormal() : fontWeight, (i11 & 4) != 0 ? FontStyle.INSTANCE.m3557getNormal_LCdwA() : i10, null);
    }

    public /* synthetic */ Font(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i10, i iVar) {
        this(parcelFileDescriptor, fontWeight, i10);
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    @Nullable
    public String getCacheKey() {
        return this.cacheKey;
    }

    @NotNull
    public final ParcelFileDescriptor getFileDescriptor() {
        return this.fileDescriptor;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: getStyle-_-LCdwA, reason: from getter */
    public int getStyle() {
        return this.style;
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    @NotNull
    public android.graphics.Typeface getTypefaceInternal() {
        return this.typefaceInternal;
    }

    @Override // androidx.compose.ui.text.font.Font
    @NotNull
    public FontWeight getWeight() {
        return this.weight;
    }

    @NotNull
    public String toString() {
        return "Font(fileDescriptor=" + this.fileDescriptor + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m3554toStringimpl(getStyle())) + ')';
    }
}
