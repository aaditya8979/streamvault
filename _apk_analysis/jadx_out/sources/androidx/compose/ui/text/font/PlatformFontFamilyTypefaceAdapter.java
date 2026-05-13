package androidx.compose.ui.text.font;

import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.AndroidTypeface;
import bn.r;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: PlatformFontFamilyTypefaceAdapter.android.kt */
/* JADX INFO: loaded from: classes7.dex */
@ExperimentalTextApi
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0006H\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/PlatformFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "platformFontLoader", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "Lbn/r;", "onAsyncCompletion", "", "createDefaultTypeface", "Landroidx/compose/ui/text/font/TypefaceResult;", "resolve", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "platformTypefaceResolver", "Landroidx/compose/ui/text/font/PlatformTypefaces;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 6, 0})
public final class PlatformFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {

    @NotNull
    private final PlatformTypefaces platformTypefaceResolver = PlatformTypefacesKt.PlatformTypefaces();

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    @Nullable
    public TypefaceResult resolve(@NotNull TypefaceRequest typefaceRequest, @NotNull PlatformFontLoader platformFontLoader, @NotNull l<? super TypefaceResult.Immutable, r> lVar, @NotNull l<? super TypefaceRequest, ? extends Object> lVar2) {
        android.graphics.Typeface typefaceMo3655getNativeTypefacePYhJU0U;
        p.k(typefaceRequest, "typefaceRequest");
        p.k(platformFontLoader, "platformFontLoader");
        p.k(lVar, "onAsyncCompletion");
        p.k(lVar2, "createDefaultTypeface");
        FontFamily fontFamily = typefaceRequest.getFontFamily();
        if (fontFamily == null ? true : fontFamily instanceof DefaultFontFamily) {
            typefaceMo3655getNativeTypefacePYhJU0U = this.platformTypefaceResolver.mo3574createDefaultFO1MlWM(typefaceRequest.getFontWeight(), typefaceRequest.m3592getFontStyle_LCdwA());
        } else if (fontFamily instanceof GenericFontFamily) {
            typefaceMo3655getNativeTypefacePYhJU0U = this.platformTypefaceResolver.mo3575createNamedRetOiIg((GenericFontFamily) typefaceRequest.getFontFamily(), typefaceRequest.getFontWeight(), typefaceRequest.m3592getFontStyle_LCdwA());
        } else {
            if (!(fontFamily instanceof LoadedFontFamily)) {
                return null;
            }
            typefaceMo3655getNativeTypefacePYhJU0U = ((AndroidTypeface) ((LoadedFontFamily) typefaceRequest.getFontFamily()).getTypeface()).mo3655getNativeTypefacePYhJU0U(typefaceRequest.getFontWeight(), typefaceRequest.m3592getFontStyle_LCdwA(), typefaceRequest.m3593getFontSynthesisGVVA2EU());
        }
        return new TypefaceResult.Immutable(typefaceMo3655getNativeTypefacePYhJU0U, false, 2, null);
    }
}
