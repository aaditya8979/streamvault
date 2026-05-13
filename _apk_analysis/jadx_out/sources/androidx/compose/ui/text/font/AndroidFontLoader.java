package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import hn.c;
import in.a;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: AndroidFontLoader.android.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "Landroidx/compose/ui/text/font/Font;", "font", "Landroid/graphics/Typeface;", "loadBlocking", "awaitLoad", "(Landroidx/compose/ui/text/font/Font;Lhn/c;)Ljava/lang/Object;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "", "cacheKey", "Ljava/lang/Object;", "getCacheKey", "()Ljava/lang/Object;", "<init>", "(Landroid/content/Context;)V", "ui-text_release"}, k = 1, mv = {1, 6, 0})
public final class AndroidFontLoader implements PlatformFontLoader {

    @Nullable
    private final Object cacheKey;
    private final Context context;

    public AndroidFontLoader(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        this.context = context.getApplicationContext();
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @Nullable
    public Object awaitLoad(@NotNull Font font, @NotNull c<? super android.graphics.Typeface> cVar) {
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            AndroidFont.TypefaceLoader typefaceLoader = androidFont.getTypefaceLoader();
            Context context = this.context;
            p.j(context, GAMConfig.KEY_CONTEXT);
            return typefaceLoader.awaitLoad(context, androidFont, cVar);
        }
        if (font instanceof ResourceFont) {
            Context context2 = this.context;
            p.j(context2, GAMConfig.KEY_CONTEXT);
            Object objLoadAsync = AndroidFontLoader_androidKt.loadAsync((ResourceFont) font, context2, cVar);
            return objLoadAsync == a.g() ? objLoadAsync : (android.graphics.Typeface) objLoadAsync;
        }
        throw new IllegalArgumentException("Unknown font type: " + font);
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @Nullable
    public Object getCacheKey() {
        return this.cacheKey;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    @Nullable
    public android.graphics.Typeface loadBlocking(@NotNull Font font) {
        Object objM7534constructorimpl;
        p.k(font, "font");
        if (font instanceof AndroidFont) {
            AndroidFont androidFont = (AndroidFont) font;
            AndroidFont.TypefaceLoader typefaceLoader = androidFont.getTypefaceLoader();
            Context context = this.context;
            p.j(context, GAMConfig.KEY_CONTEXT);
            return typefaceLoader.loadBlocking(context, androidFont);
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        int loadingStrategy = font.getLoadingStrategy();
        FontLoadingStrategy.Companion companion = FontLoadingStrategy.INSTANCE;
        if (FontLoadingStrategy.m3539equalsimpl0(loadingStrategy, companion.m3544getBlockingPKNRLFQ())) {
            Context context2 = this.context;
            p.j(context2, GAMConfig.KEY_CONTEXT);
            return AndroidFontLoader_androidKt.load((ResourceFont) font, context2);
        }
        if (!FontLoadingStrategy.m3539equalsimpl0(loadingStrategy, companion.m3545getOptionalLocalPKNRLFQ())) {
            if (FontLoadingStrategy.m3539equalsimpl0(loadingStrategy, companion.m3543getAsyncPKNRLFQ())) {
                throw new UnsupportedOperationException("Unsupported Async font load path");
            }
            throw new IllegalArgumentException("Unknown loading type " + ((Object) FontLoadingStrategy.m3541toStringimpl(font.getLoadingStrategy())));
        }
        try {
            Result.a aVar = Result.Companion;
            Context context3 = this.context;
            p.j(context3, GAMConfig.KEY_CONTEXT);
            objM7534constructorimpl = Result.m7534constructorimpl(AndroidFontLoader_androidKt.load((ResourceFont) font, context3));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM7534constructorimpl = Result.m7534constructorimpl(kotlin.c.a(th2));
        }
        return (android.graphics.Typeface) (Result.m7539isFailureimpl(objM7534constructorimpl) ? null : objM7534constructorimpl);
    }
}
