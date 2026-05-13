package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: AndroidParagraphIntrinsics.android.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aP\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\b0\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a+\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0016\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"ActualParagraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "resolveTextDirectionHeuristics", "", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "resolveTextDirectionHeuristics-9GRLPo0", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AndroidParagraphIntrinsics_androidKt {
    @NotNull
    public static final ParagraphIntrinsics ActualParagraphIntrinsics(@NotNull String str, @NotNull TextStyle textStyle, @NotNull List<AnnotatedString.Range<SpanStyle>> list, @NotNull List<AnnotatedString.Range<Placeholder>> list2, @NotNull Density density, @NotNull FontFamily.Resolver resolver) {
        p.k(str, "text");
        p.k(textStyle, "style");
        p.k(list, "spanStyles");
        p.k(list2, "placeholders");
        p.k(density, "density");
        p.k(resolver, "fontFamilyResolver");
        return new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        if (r6 == 1) goto L10;
     */
    /* JADX INFO: renamed from: resolveTextDirectionHeuristics-9GRLPo0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int m3660resolveTextDirectionHeuristics9GRLPo0(@org.jetbrains.annotations.Nullable androidx.compose.ui.text.style.TextDirection r6, @org.jetbrains.annotations.Nullable androidx.compose.ui.text.intl.LocaleList r7) {
        /*
            if (r6 == 0) goto L7
            int r6 = r6.getValue()
            goto Ld
        L7:
            androidx.compose.ui.text.style.TextDirection$Companion r6 = androidx.compose.ui.text.style.TextDirection.INSTANCE
            int r6 = r6.m3747getContents_7Xco()
        Ld:
            androidx.compose.ui.text.style.TextDirection$Companion r0 = androidx.compose.ui.text.style.TextDirection.INSTANCE
            int r1 = r0.m3748getContentOrLtrs_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m3743equalsimpl0(r6, r1)
            r2 = 1
            r3 = 0
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L1f
        L1d:
            r2 = r5
            goto L6b
        L1f:
            int r1 = r0.m3749getContentOrRtls_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m3743equalsimpl0(r6, r1)
            if (r1 == 0) goto L2b
        L29:
            r2 = r4
            goto L6b
        L2b:
            int r1 = r0.m3750getLtrs_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m3743equalsimpl0(r6, r1)
            if (r1 == 0) goto L37
            r2 = r3
            goto L6b
        L37:
            int r1 = r0.m3751getRtls_7Xco()
            boolean r1 = androidx.compose.ui.text.style.TextDirection.m3743equalsimpl0(r6, r1)
            if (r1 == 0) goto L42
            goto L6b
        L42:
            int r0 = r0.m3747getContents_7Xco()
            boolean r6 = androidx.compose.ui.text.style.TextDirection.m3743equalsimpl0(r6, r0)
            if (r6 == 0) goto L6c
            if (r7 == 0) goto L5e
            androidx.compose.ui.text.intl.Locale r6 = r7.get(r3)
            androidx.compose.ui.text.intl.PlatformLocale r6 = r6.getPlatformLocale()
            androidx.compose.ui.text.intl.AndroidLocale r6 = (androidx.compose.ui.text.intl.AndroidLocale) r6
            java.util.Locale r6 = r6.getJavaLocale()
            if (r6 != 0) goto L62
        L5e:
            java.util.Locale r6 = java.util.Locale.getDefault()
        L62:
            int r6 = androidx.core.text.TextUtilsCompat.getLayoutDirectionFromLocale(r6)
            if (r6 == 0) goto L1d
            if (r6 == r2) goto L29
            goto L1d
        L6b:
            return r2
        L6c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid TextDirection."
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt.m3660resolveTextDirectionHeuristics9GRLPo0(androidx.compose.ui.text.style.TextDirection, androidx.compose.ui.text.intl.LocaleList):int");
    }

    /* JADX INFO: renamed from: resolveTextDirectionHeuristics-9GRLPo0$default, reason: not valid java name */
    public static /* synthetic */ int m3661resolveTextDirectionHeuristics9GRLPo0$default(TextDirection textDirection, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            textDirection = null;
        }
        if ((i10 & 2) != 0) {
            localeList = null;
        }
        return m3660resolveTextDirectionHeuristics9GRLPo0(textDirection, localeList);
    }
}
