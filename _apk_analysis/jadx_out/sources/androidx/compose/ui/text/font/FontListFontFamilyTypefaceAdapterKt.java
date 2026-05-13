package androidx.compose.ui.text.font;

import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.AsyncTypefaceCache;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import bn.h;
import bn.r;
import cn.w;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.c;
import sn.l;

/* JADX INFO: compiled from: FontListFontFamilyTypefaceAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aR\u0010\u0000\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\fH\u0003¨\u0006\r"}, d2 = {"firstImmediatelyAvailable", "Lkotlin/Pair;", "", "Landroidx/compose/ui/text/font/Font;", "", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "platformFontLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "createDefaultTypeface", "Lkotlin/Function1;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class FontListFontFamilyTypefaceAdapterKt {
    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalTextApi
    public static final Pair<List<Font>, Object> firstImmediatelyAvailable(List<? extends Font> list, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, PlatformFontLoader platformFontLoader, l<? super TypefaceRequest, ? extends Object> lVar) {
        Object objLoadBlocking;
        Object objM7534constructorimpl;
        int size = list.size();
        List listS = null;
        for (int i10 = 0; i10 < size; i10++) {
            Font font = list.get(i10);
            int loadingStrategy = font.getLoadingStrategy();
            FontLoadingStrategy.Companion companion = FontLoadingStrategy.INSTANCE;
            if (FontLoadingStrategy.m3539equalsimpl0(loadingStrategy, companion.m3544getBlockingPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    AsyncTypefaceCache.Key key = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                    AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key);
                    if (asyncTypefaceResult == null) {
                        asyncTypefaceResult = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key);
                    }
                    if (asyncTypefaceResult != null) {
                        objLoadBlocking = asyncTypefaceResult.m3519unboximpl();
                    } else {
                        r rVar = r.f5635a;
                        try {
                            objLoadBlocking = platformFontLoader.loadBlocking(font);
                            AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, objLoadBlocking, false, 8, null);
                        } catch (Exception e10) {
                            throw new IllegalStateException("Unable to load font " + font, e10);
                        }
                    }
                }
                if (objLoadBlocking != null) {
                    return h.a(listS, FontSynthesis_androidKt.m3571synthesizeTypefaceFxwP2eA(typefaceRequest.m3593getFontSynthesisGVVA2EU(), objLoadBlocking, font, typefaceRequest.getFontWeight(), typefaceRequest.m3592getFontStyle_LCdwA()));
                }
                throw new IllegalStateException("Unable to load font " + font);
            }
            if (FontLoadingStrategy.m3539equalsimpl0(loadingStrategy, companion.m3545getOptionalLocalPKNRLFQ())) {
                synchronized (asyncTypefaceCache.cacheLock) {
                    AsyncTypefaceCache.Key key2 = new AsyncTypefaceCache.Key(font, platformFontLoader.getCacheKey());
                    AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.resultCache.get(key2);
                    if (asyncTypefaceResult2 == null) {
                        asyncTypefaceResult2 = (AsyncTypefaceCache.AsyncTypefaceResult) asyncTypefaceCache.permanentCache.get(key2);
                    }
                    if (asyncTypefaceResult2 != null) {
                        objM7534constructorimpl = asyncTypefaceResult2.m3519unboximpl();
                    } else {
                        r rVar2 = r.f5635a;
                        try {
                            Result.a aVar = Result.Companion;
                            objM7534constructorimpl = Result.m7534constructorimpl(platformFontLoader.loadBlocking(font));
                        } catch (Throwable th2) {
                            Result.a aVar2 = Result.Companion;
                            objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
                        }
                        if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
                            objM7534constructorimpl = null;
                        }
                        AsyncTypefaceCache.put$default(asyncTypefaceCache, font, platformFontLoader, objM7534constructorimpl, false, 8, null);
                    }
                }
                if (objM7534constructorimpl != null) {
                    return h.a(listS, FontSynthesis_androidKt.m3571synthesizeTypefaceFxwP2eA(typefaceRequest.m3593getFontSynthesisGVVA2EU(), objM7534constructorimpl, font, typefaceRequest.getFontWeight(), typefaceRequest.m3592getFontStyle_LCdwA()));
                }
            } else {
                if (!FontLoadingStrategy.m3539equalsimpl0(loadingStrategy, companion.m3543getAsyncPKNRLFQ())) {
                    throw new IllegalStateException("Unknown font type " + font);
                }
                AsyncTypefaceCache.AsyncTypefaceResult asyncTypefaceResultM3511get1ASDuI8 = asyncTypefaceCache.m3511get1ASDuI8(font, platformFontLoader);
                if (asyncTypefaceResultM3511get1ASDuI8 != null) {
                    if (!AsyncTypefaceCache.AsyncTypefaceResult.m3517isPermanentFailureimpl(asyncTypefaceResultM3511get1ASDuI8.m3519unboximpl()) && asyncTypefaceResultM3511get1ASDuI8.m3519unboximpl() != null) {
                        return h.a(listS, FontSynthesis_androidKt.m3571synthesizeTypefaceFxwP2eA(typefaceRequest.m3593getFontSynthesisGVVA2EU(), asyncTypefaceResultM3511get1ASDuI8.m3519unboximpl(), font, typefaceRequest.getFontWeight(), typefaceRequest.m3592getFontStyle_LCdwA()));
                    }
                } else if (listS == null) {
                    listS = w.s(font);
                } else {
                    listS.add(font);
                }
            }
        }
        return h.a(listS, lVar.invoke(typefaceRequest));
    }
}
