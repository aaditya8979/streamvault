package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.intl.LocaleList;
import bn.r;
import cn.v;
import cn.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import sn.q;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: AnnotatedString.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\u001a \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a(\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a\u001c\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001aF\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012 \b\u0004\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0004\u0012\u00028\u00000\rH\u0080\bø\u0001\u0000\u001a\u0014\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u001a\u0014\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u001a\u0014\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u001a\u0014\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u001a=\u0010\u001b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0017*\u00020\u0016*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u001aH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a?\u0010\u001b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0017*\u00020\u0016*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00012\u0014\b\u0004\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u001aH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001d\u001aG\u0010!\u001a\u00028\u0000\"\b\b\u0000\u0010\u0017*\u00020\u0016*\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0014\b\u0004\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u001aH\u0087\bø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a?\u0010!\u001a\u00028\u0000\"\b\b\u0000\u0010\u0017*\u00020\u0016*\u00020\u00182\u0006\u0010$\u001a\u00020#2\u0014\b\u0004\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u001aH\u0087\bø\u0001\u0000¢\u0006\u0004\b!\u0010%\u001a@\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\"\u0004\b\u0000\u0010\f2\u0014\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002\u001a\"\u0010+\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\t2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0001\u001a\u0016\u0010+\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u0001\u001a \u0010.\u001a\u00020\u00002\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020,0\u001aH\u0086\bø\u0001\u0000\u001a(\u00104\u001a\u0002032\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0000\u001a(\u00109\u001a\u0002032\u0006\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\u0006\u00108\u001a\u00020\u0006H\u0000\u001a\b\u0010:\u001a\u00020\u0000H\u0000\"\u0014\u0010;\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006="}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/ParagraphStyle;", "defaultParagraphStyle", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "normalizedParagraphStyles", "", "start", "end", "Landroidx/compose/ui/text/SpanStyle;", "getLocalStyles", "substringWithoutParagraphStyles", "T", "Lkotlin/Function2;", "block", "mapEachParagraphStyle", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "toUpperCase", "toLowerCase", "capitalize", "decapitalize", "", "R", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "style", "Lkotlin/Function1;", "withStyle", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/SpanStyle;Lsn/l;)Ljava/lang/Object;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/ParagraphStyle;Lsn/l;)Ljava/lang/Object;", "", "tag", "annotation", "withAnnotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/String;Ljava/lang/String;Lsn/l;)Ljava/lang/Object;", "Landroidx/compose/ui/text/TtsAnnotation;", "ttsAnnotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/TtsAnnotation;Lsn/l;)Ljava/lang/Object;", "ranges", "filterRanges", "text", "spanStyle", "paragraphStyle", "AnnotatedString", "Lbn/r;", "builder", "buildAnnotatedString", "baseStart", "baseEnd", "targetStart", "targetEnd", "", "contains", "lStart", "lEnd", "rStart", "rEnd", "intersect", "emptyAnnotatedString", "EmptyAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "ui-text_release"}, k = 2, mv = {1, 6, 0})
public final class AnnotatedStringKt {

    @NotNull
    private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", null, null, 6, null);

    @NotNull
    public static final AnnotatedString AnnotatedString(@NotNull String str, @NotNull ParagraphStyle paragraphStyle) {
        p.k(str, "text");
        p.k(paragraphStyle, "paragraphStyle");
        return new AnnotatedString(str, w.m(), v.e(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    @NotNull
    public static final AnnotatedString AnnotatedString(@NotNull String str, @NotNull SpanStyle spanStyle, @Nullable ParagraphStyle paragraphStyle) {
        p.k(str, "text");
        p.k(spanStyle, "spanStyle");
        return new AnnotatedString(str, v.e(new AnnotatedString.Range(spanStyle, 0, str.length())), paragraphStyle == null ? w.m() : v.e(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    @NotNull
    public static final AnnotatedString buildAnnotatedString(@NotNull l<? super AnnotatedString.Builder, r> lVar) {
        p.k(lVar, "builder");
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        lVar.invoke(builder);
        return builder.toAnnotatedString();
    }

    @NotNull
    public static final AnnotatedString capitalize(@NotNull AnnotatedString annotatedString, @NotNull final LocaleList localeList) {
        p.k(annotatedString, "<this>");
        p.k(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new q<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.capitalize.1
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            @NotNull
            public final String invoke(@NotNull String str, int i10, int i11) {
                p.k(str, "str");
                if (i10 == 0) {
                    String strSubstring = str.substring(i10, i11);
                    p.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return StringKt.capitalize(strSubstring, localeList);
                }
                String strSubstring2 = str.substring(i10, i11);
                p.j(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring2;
            }
        });
    }

    public static /* synthetic */ AnnotatedString capitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return capitalize(annotatedString, localeList);
    }

    public static final boolean contains(int i10, int i11, int i12, int i13) {
        if (i10 <= i12 && i13 <= i11) {
            if (i11 != i13) {
                return true;
            }
            if ((i12 == i13) == (i10 == i11)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final AnnotatedString decapitalize(@NotNull AnnotatedString annotatedString, @NotNull final LocaleList localeList) {
        p.k(annotatedString, "<this>");
        p.k(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new q<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.decapitalize.1
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            @NotNull
            public final String invoke(@NotNull String str, int i10, int i11) {
                p.k(str, "str");
                if (i10 == 0) {
                    String strSubstring = str.substring(i10, i11);
                    p.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return StringKt.decapitalize(strSubstring, localeList);
                }
                String strSubstring2 = str.substring(i10, i11);
                p.j(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring2;
            }
        });
    }

    public static /* synthetic */ AnnotatedString decapitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return decapitalize(annotatedString, localeList);
    }

    @NotNull
    public static final AnnotatedString emptyAnnotatedString() {
        return EmptyAnnotatedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<AnnotatedString.Range<T>> filterRanges(List<? extends AnnotatedString.Range<? extends T>> list, int i10, int i11) {
        if (!(i10 <= i11)) {
            throw new IllegalArgumentException(("start (" + i10 + ") should be less than or equal to end (" + i11 + ')').toString());
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            AnnotatedString.Range<? extends T> range = list.get(i12);
            AnnotatedString.Range<? extends T> range2 = range;
            if (intersect(i10, i11, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i13);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), Math.max(i10, range3.getStart()) - i10, Math.min(i11, range3.getEnd()) - i10, range3.getTag()));
        }
        return arrayList2;
    }

    private static final List<AnnotatedString.Range<SpanStyle>> getLocalStyles(AnnotatedString annotatedString, int i10, int i11) {
        if (i10 == i11) {
            return w.m();
        }
        if (i10 == 0 && i11 >= annotatedString.getText().length()) {
            return annotatedString.getSpanStyles();
        }
        List<AnnotatedString.Range<SpanStyle>> spanStyles = annotatedString.getSpanStyles();
        ArrayList arrayList = new ArrayList(spanStyles.size());
        int size = spanStyles.size();
        for (int i12 = 0; i12 < size; i12++) {
            AnnotatedString.Range<SpanStyle> range = spanStyles.get(i12);
            AnnotatedString.Range<SpanStyle> range2 = range;
            if (intersect(i10, i11, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i13);
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), n.n(range3.getStart(), i10, i11) - i10, n.n(range3.getEnd(), i10, i11) - i10));
        }
        return arrayList2;
    }

    public static final boolean intersect(int i10, int i11, int i12, int i13) {
        return Math.max(i10, i12) < Math.min(i11, i13) || contains(i10, i11, i12, i13) || contains(i12, i13, i10, i11);
    }

    @NotNull
    public static final <T> List<T> mapEachParagraphStyle(@NotNull AnnotatedString annotatedString, @NotNull ParagraphStyle paragraphStyle, @NotNull sn.p<? super AnnotatedString, ? super AnnotatedString.Range<ParagraphStyle>, ? extends T> pVar) {
        p.k(annotatedString, "<this>");
        p.k(paragraphStyle, "defaultParagraphStyle");
        p.k(pVar, "block");
        List<AnnotatedString.Range<ParagraphStyle>> listNormalizedParagraphStyles = normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(listNormalizedParagraphStyles.size());
        int size = listNormalizedParagraphStyles.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<ParagraphStyle> range = listNormalizedParagraphStyles.get(i10);
            arrayList.add(pVar.mo2invoke(substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    @NotNull
    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(@NotNull AnnotatedString annotatedString, @NotNull ParagraphStyle paragraphStyle) {
        p.k(annotatedString, "<this>");
        p.k(paragraphStyle, "defaultParagraphStyle");
        int length = annotatedString.getText().length();
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStyles = annotatedString.getParagraphStyles();
        ArrayList arrayList = new ArrayList();
        int size = paragraphStyles.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStyles.get(i10);
            ParagraphStyle paragraphStyleComponent1 = range.component1();
            int start = range.getStart();
            int end = range.getEnd();
            if (start != i11) {
                arrayList.add(new AnnotatedString.Range(paragraphStyle, i11, start));
            }
            arrayList.add(new AnnotatedString.Range(paragraphStyle.merge(paragraphStyleComponent1), start, end));
            i10++;
            i11 = end;
        }
        if (i11 != length) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, i11, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString annotatedString, int i10, int i11) {
        String strSubstring;
        if (i10 != i11) {
            strSubstring = annotatedString.getText().substring(i10, i11);
            p.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        return new AnnotatedString(strSubstring, getLocalStyles(annotatedString, i10, i11), null, 4, null);
    }

    @NotNull
    public static final AnnotatedString toLowerCase(@NotNull AnnotatedString annotatedString, @NotNull final LocaleList localeList) {
        p.k(annotatedString, "<this>");
        p.k(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new q<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.toLowerCase.1
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            @NotNull
            public final String invoke(@NotNull String str, int i10, int i11) {
                p.k(str, "str");
                String strSubstring = str.substring(i10, i11);
                p.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringKt.toLowerCase(strSubstring, localeList);
            }
        });
    }

    public static /* synthetic */ AnnotatedString toLowerCase$default(AnnotatedString annotatedString, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return toLowerCase(annotatedString, localeList);
    }

    @NotNull
    public static final AnnotatedString toUpperCase(@NotNull AnnotatedString annotatedString, @NotNull final LocaleList localeList) {
        p.k(annotatedString, "<this>");
        p.k(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new q<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.toUpperCase.1
            {
                super(3);
            }

            @Override // sn.q
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            @NotNull
            public final String invoke(@NotNull String str, int i10, int i11) {
                p.k(str, "str");
                String strSubstring = str.substring(i10, i11);
                p.j(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return StringKt.toUpperCase(strSubstring, localeList);
            }
        });
    }

    public static /* synthetic */ AnnotatedString toUpperCase$default(AnnotatedString annotatedString, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return toUpperCase(annotatedString, localeList);
    }

    @ExperimentalTextApi
    @NotNull
    public static final <R> R withAnnotation(@NotNull AnnotatedString.Builder builder, @NotNull TtsAnnotation ttsAnnotation, @NotNull l<? super AnnotatedString.Builder, ? extends R> lVar) {
        p.k(builder, "<this>");
        p.k(ttsAnnotation, "ttsAnnotation");
        p.k(lVar, "block");
        int iPushTtsAnnotation = builder.pushTtsAnnotation(ttsAnnotation);
        try {
            return lVar.invoke(builder);
        } finally {
            tn.n.b(1);
            builder.pop(iPushTtsAnnotation);
            tn.n.a(1);
        }
    }

    @ExperimentalTextApi
    @NotNull
    public static final <R> R withAnnotation(@NotNull AnnotatedString.Builder builder, @NotNull String str, @NotNull String str2, @NotNull l<? super AnnotatedString.Builder, ? extends R> lVar) {
        p.k(builder, "<this>");
        p.k(str, "tag");
        p.k(str2, "annotation");
        p.k(lVar, "block");
        int iPushStringAnnotation = builder.pushStringAnnotation(str, str2);
        try {
            return lVar.invoke(builder);
        } finally {
            tn.n.b(1);
            builder.pop(iPushStringAnnotation);
            tn.n.a(1);
        }
    }

    @NotNull
    public static final <R> R withStyle(@NotNull AnnotatedString.Builder builder, @NotNull ParagraphStyle paragraphStyle, @NotNull l<? super AnnotatedString.Builder, ? extends R> lVar) {
        p.k(builder, "<this>");
        p.k(paragraphStyle, "style");
        p.k(lVar, "block");
        int iPushStyle = builder.pushStyle(paragraphStyle);
        try {
            return lVar.invoke(builder);
        } finally {
            tn.n.b(1);
            builder.pop(iPushStyle);
            tn.n.a(1);
        }
    }

    @NotNull
    public static final <R> R withStyle(@NotNull AnnotatedString.Builder builder, @NotNull SpanStyle spanStyle, @NotNull l<? super AnnotatedString.Builder, ? extends R> lVar) {
        p.k(builder, "<this>");
        p.k(spanStyle, "style");
        p.k(lVar, "block");
        int iPushStyle = builder.pushStyle(spanStyle);
        try {
            return lVar.invoke(builder);
        } finally {
            tn.n.b(1);
            builder.pop(iPushStyle);
            tn.n.a(1);
        }
    }
}
