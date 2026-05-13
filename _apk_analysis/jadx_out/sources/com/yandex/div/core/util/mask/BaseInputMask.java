package com.yandex.div.core.util.mask;

import cn.f0;
import com.yandex.div.core.util.mask.BaseInputMask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.PatternSyntaxException;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.a;
import tn.i;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: BaseInputMask.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseInputMask {
    private int cursorPosition;
    public List<? extends MaskChar> destructedValue;

    @NotNull
    private final Map<Character, Regex> filters = new LinkedHashMap();

    @NotNull
    private MaskData maskData;

    /* JADX INFO: compiled from: BaseInputMask.kt */
    public static abstract class MaskChar {

        /* JADX INFO: compiled from: BaseInputMask.kt */
        public static final class Dynamic extends MaskChar {

            /* JADX INFO: renamed from: char, reason: not valid java name */
            @Nullable
            private Character f3282char;

            @Nullable
            private final Regex filter;
            private final char placeholder;

            public Dynamic(@Nullable Character ch2, @Nullable Regex regex, char c10) {
                super(null);
                this.f3282char = ch2;
                this.filter = regex;
                this.placeholder = c10;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Dynamic)) {
                    return false;
                }
                Dynamic dynamic = (Dynamic) obj;
                return p.f(this.f3282char, dynamic.f3282char) && p.f(this.filter, dynamic.filter) && this.placeholder == dynamic.placeholder;
            }

            @Nullable
            public final Character getChar() {
                return this.f3282char;
            }

            @Nullable
            public final Regex getFilter() {
                return this.filter;
            }

            public final char getPlaceholder() {
                return this.placeholder;
            }

            public int hashCode() {
                Character ch2 = this.f3282char;
                int iHashCode = (ch2 == null ? 0 : ch2.hashCode()) * 31;
                Regex regex = this.filter;
                return ((iHashCode + (regex != null ? regex.hashCode() : 0)) * 31) + Character.hashCode(this.placeholder);
            }

            public final void setChar(@Nullable Character ch2) {
                this.f3282char = ch2;
            }

            @NotNull
            public String toString() {
                return "Dynamic(char=" + this.f3282char + ", filter=" + this.filter + ", placeholder=" + this.placeholder + ')';
            }
        }

        /* JADX INFO: compiled from: BaseInputMask.kt */
        public static final class Static extends MaskChar {

            /* JADX INFO: renamed from: char, reason: not valid java name */
            private final char f3283char;

            public Static(char c10) {
                super(null);
                this.f3283char = c10;
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Static) && this.f3283char == ((Static) obj).f3283char;
            }

            public final char getChar() {
                return this.f3283char;
            }

            public int hashCode() {
                return Character.hashCode(this.f3283char);
            }

            @NotNull
            public String toString() {
                return "Static(char=" + this.f3283char + ')';
            }
        }

        private MaskChar() {
        }

        public /* synthetic */ MaskChar(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: BaseInputMask.kt */
    public static final class MaskData {
        private final boolean alwaysVisible;

        @NotNull
        private final List<MaskKey> decoding;

        @NotNull
        private final String pattern;

        public MaskData(@NotNull String str, @NotNull List<MaskKey> list, boolean z10) {
            this.pattern = str;
            this.decoding = list;
            this.alwaysVisible = z10;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MaskData)) {
                return false;
            }
            MaskData maskData = (MaskData) obj;
            return p.f(this.pattern, maskData.pattern) && p.f(this.decoding, maskData.decoding) && this.alwaysVisible == maskData.alwaysVisible;
        }

        public final boolean getAlwaysVisible() {
            return this.alwaysVisible;
        }

        @NotNull
        public final List<MaskKey> getDecoding() {
            return this.decoding;
        }

        @NotNull
        public final String getPattern() {
            return this.pattern;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        public int hashCode() {
            int iHashCode = ((this.pattern.hashCode() * 31) + this.decoding.hashCode()) * 31;
            boolean z10 = this.alwaysVisible;
            ?? r12 = z10;
            if (z10) {
                r12 = 1;
            }
            return iHashCode + r12;
        }

        @NotNull
        public String toString() {
            return "MaskData(pattern=" + this.pattern + ", decoding=" + this.decoding + ", alwaysVisible=" + this.alwaysVisible + ')';
        }
    }

    /* JADX INFO: compiled from: BaseInputMask.kt */
    public static final class MaskKey {

        @Nullable
        private final String filter;
        private final char key;
        private final char placeholder;

        public MaskKey(char c10, @Nullable String str, char c11) {
            this.key = c10;
            this.filter = str;
            this.placeholder = c11;
        }

        @Nullable
        public final String getFilter() {
            return this.filter;
        }

        public final char getKey() {
            return this.key;
        }

        public final char getPlaceholder() {
            return this.placeholder;
        }
    }

    public BaseInputMask(@NotNull MaskData maskData) {
        this.maskData = maskData;
        updateMaskData$default(this, maskData, false, 2, null);
    }

    public static /* synthetic */ void applyChangeFrom$default(BaseInputMask baseInputMask, String str, Integer num, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyChangeFrom");
        }
        if ((i10 & 2) != 0) {
            num = null;
        }
        baseInputMask.applyChangeFrom(str, num);
    }

    private final String buildBodySubstring(TextDiff textDiff, String str) {
        String strSubstring = str.substring(textDiff.getStart(), textDiff.getStart() + textDiff.getAdded());
        p.j(strSubstring, "substring(...)");
        return strSubstring;
    }

    private final String buildTailSubstring(TextDiff textDiff) {
        return collectValueRange(textDiff.getStart() + textDiff.getRemoved(), getDestructedValue().size() - 1);
    }

    private final int calculateMaxShift(String str, int i10) {
        int length;
        if (this.filters.size() <= 1) {
            int i11 = 0;
            while (i10 < getDestructedValue().size()) {
                if (getDestructedValue().get(i10) instanceof MaskChar.Dynamic) {
                    i11++;
                }
                i10++;
            }
            length = i11 - str.length();
        } else {
            String strCalculateInsertableSubstring = calculateInsertableSubstring(str, i10);
            int i12 = 0;
            while (i12 < getDestructedValue().size() && p.f(strCalculateInsertableSubstring, calculateInsertableSubstring(str, i10 + i12))) {
                i12++;
            }
            length = i12 - 1;
        }
        return n.e(length, 0);
    }

    public static /* synthetic */ void replaceChars$default(BaseInputMask baseInputMask, String str, int i10, Integer num, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceChars");
        }
        if ((i11 & 4) != 0) {
            num = null;
        }
        baseInputMask.replaceChars(str, i10, num);
    }

    public static /* synthetic */ void updateMaskData$default(BaseInputMask baseInputMask, MaskData maskData, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMaskData");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        baseInputMask.updateMaskData(maskData, z10);
    }

    public void applyChangeFrom(@NotNull String str, @Nullable Integer num) {
        TextDiff textDiffBuild = TextDiff.Companion.build(getValue(), str);
        if (num != null) {
            textDiffBuild = new TextDiff(n.e(num.intValue() - textDiffBuild.getAdded(), 0), textDiffBuild.getAdded(), textDiffBuild.getRemoved());
        }
        calculateCursorPosition(textDiffBuild, replaceBodyTail(textDiffBuild, str));
    }

    public final void calculateCursorPosition(@NotNull TextDiff textDiff, int i10) {
        int firstEmptyHolderIndex = getFirstEmptyHolderIndex();
        if (textDiff.getStart() < firstEmptyHolderIndex) {
            firstEmptyHolderIndex = Math.min(firstHolderAfter(i10), getValue().length());
        }
        this.cursorPosition = firstEmptyHolderIndex;
    }

    @NotNull
    public final String calculateInsertableSubstring(@NotNull String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = i10;
        a<Regex> aVar = new a<Regex>() { // from class: com.yandex.div.core.util.mask.BaseInputMask$calculateInsertableSubstring$moveToAndGetNextHolderFilter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // sn.a
            @Nullable
            public final Regex invoke() {
                while (ref$IntRef.element < this.getDestructedValue().size() && !(this.getDestructedValue().get(ref$IntRef.element) instanceof BaseInputMask.MaskChar.Dynamic)) {
                    ref$IntRef.element++;
                }
                Object objW0 = f0.w0(this.getDestructedValue(), ref$IntRef.element);
                BaseInputMask.MaskChar.Dynamic dynamic = objW0 instanceof BaseInputMask.MaskChar.Dynamic ? (BaseInputMask.MaskChar.Dynamic) objW0 : null;
                if (dynamic != null) {
                    return dynamic.getFilter();
                }
                return null;
            }
        };
        for (int i11 = 0; i11 < str.length(); i11++) {
            char cCharAt = str.charAt(i11);
            Regex regexInvoke = aVar.invoke();
            if (regexInvoke != null && regexInvoke.matches(String.valueOf(cCharAt))) {
                sb2.append(cCharAt);
                ref$IntRef.element++;
            }
        }
        return sb2.toString();
    }

    public final void cleanup(@NotNull TextDiff textDiff) {
        if (textDiff.getAdded() == 0 && textDiff.getRemoved() == 1) {
            int start = textDiff.getStart();
            while (true) {
                if (start < 0) {
                    break;
                }
                MaskChar maskChar = getDestructedValue().get(start);
                if (maskChar instanceof MaskChar.Dynamic) {
                    MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                    if (dynamic.getChar() != null) {
                        dynamic.setChar(null);
                        break;
                    }
                }
                start--;
            }
        }
        clearRange(textDiff.getStart(), getDestructedValue().size());
    }

    public final void clearRange(int i10, int i11) {
        while (i10 < i11 && i10 < getDestructedValue().size()) {
            MaskChar maskChar = getDestructedValue().get(i10);
            if (maskChar instanceof MaskChar.Dynamic) {
                ((MaskChar.Dynamic) maskChar).setChar(null);
            }
            i10++;
        }
    }

    @NotNull
    public final String collectValueRange(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        while (i10 <= i11) {
            MaskChar maskChar = getDestructedValue().get(i10);
            if (maskChar instanceof MaskChar.Dynamic) {
                MaskChar.Dynamic dynamic = (MaskChar.Dynamic) maskChar;
                if (dynamic.getChar() != null) {
                    sb2.append(dynamic.getChar());
                }
            }
            i10++;
        }
        return sb2.toString();
    }

    public final int firstHolderAfter(int i10) {
        while (i10 < getDestructedValue().size() && !(getDestructedValue().get(i10) instanceof MaskChar.Dynamic)) {
            i10++;
        }
        return i10;
    }

    public final int getCursorPosition() {
        return this.cursorPosition;
    }

    @NotNull
    public final List<MaskChar> getDestructedValue() {
        List list = this.destructedValue;
        if (list != null) {
            return list;
        }
        p.C("destructedValue");
        return null;
    }

    public final int getFirstEmptyHolderIndex() {
        Iterator<MaskChar> it = getDestructedValue().iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            MaskChar next = it.next();
            if ((next instanceof MaskChar.Dynamic) && ((MaskChar.Dynamic) next).getChar() == null) {
                break;
            }
            i10++;
        }
        return i10 != -1 ? i10 : getDestructedValue().size();
    }

    @NotNull
    public final MaskData getMaskData() {
        return this.maskData;
    }

    @NotNull
    public final String getRawValue() {
        return collectValueRange(0, getDestructedValue().size() - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getValue() {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.List r1 = r8.getDestructedValue()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L62
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.yandex.div.core.util.mask.BaseInputMask$MaskChar r4 = (com.yandex.div.core.util.mask.BaseInputMask.MaskChar) r4
            boolean r5 = r4 instanceof com.yandex.div.core.util.mask.BaseInputMask.MaskChar.Static
            r6 = 1
            if (r5 == 0) goto L2e
            com.yandex.div.core.util.mask.BaseInputMask$MaskChar$Static r4 = (com.yandex.div.core.util.mask.BaseInputMask.MaskChar.Static) r4
            char r4 = r4.getChar()
            r0.append(r4)
            goto L5b
        L2e:
            boolean r5 = r4 instanceof com.yandex.div.core.util.mask.BaseInputMask.MaskChar.Dynamic
            if (r5 == 0) goto L43
            r5 = r4
            com.yandex.div.core.util.mask.BaseInputMask$MaskChar$Dynamic r5 = (com.yandex.div.core.util.mask.BaseInputMask.MaskChar.Dynamic) r5
            java.lang.Character r7 = r5.getChar()
            if (r7 == 0) goto L43
            java.lang.Character r4 = r5.getChar()
            r0.append(r4)
            goto L5b
        L43:
            com.yandex.div.core.util.mask.BaseInputMask$MaskData r5 = r8.maskData
            boolean r5 = r5.getAlwaysVisible()
            if (r5 == 0) goto L5a
            java.lang.String r5 = "null cannot be cast to non-null type com.yandex.div.core.util.mask.BaseInputMask.MaskChar.Dynamic"
            tn.p.i(r4, r5)
            com.yandex.div.core.util.mask.BaseInputMask$MaskChar$Dynamic r4 = (com.yandex.div.core.util.mask.BaseInputMask.MaskChar.Dynamic) r4
            char r4 = r4.getPlaceholder()
            r0.append(r4)
            goto L5b
        L5a:
            r6 = 0
        L5b:
            if (r6 != 0) goto L5e
            goto L62
        L5e:
            r2.add(r3)
            goto L12
        L62:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.util.mask.BaseInputMask.getValue():java.lang.String");
    }

    public abstract void onException(@NotNull Exception exc);

    public void overrideRawValue(@NotNull String str) {
        clearRange(0, getDestructedValue().size());
        replaceChars$default(this, str, 0, null, 4, null);
        this.cursorPosition = Math.min(this.cursorPosition, getValue().length());
    }

    public final int replaceBodyTail(@NotNull TextDiff textDiff, @NotNull String str) {
        String strBuildBodySubstring = buildBodySubstring(textDiff, str);
        String strBuildTailSubstring = buildTailSubstring(textDiff);
        cleanup(textDiff);
        int firstEmptyHolderIndex = getFirstEmptyHolderIndex();
        replaceChars(strBuildBodySubstring, firstEmptyHolderIndex, strBuildTailSubstring.length() == 0 ? null : Integer.valueOf(calculateMaxShift(strBuildTailSubstring, firstEmptyHolderIndex)));
        int firstEmptyHolderIndex2 = getFirstEmptyHolderIndex();
        replaceChars$default(this, strBuildTailSubstring, firstEmptyHolderIndex2, null, 4, null);
        return firstEmptyHolderIndex2;
    }

    public final void replaceChars(@NotNull String str, int i10, @Nullable Integer num) {
        String strCalculateInsertableSubstring = calculateInsertableSubstring(str, i10);
        if (num != null) {
            strCalculateInsertableSubstring = bo.f0.F1(strCalculateInsertableSubstring, num.intValue());
        }
        int i11 = 0;
        while (i10 < getDestructedValue().size() && i11 < strCalculateInsertableSubstring.length()) {
            MaskChar maskChar = getDestructedValue().get(i10);
            char cCharAt = strCalculateInsertableSubstring.charAt(i11);
            if (maskChar instanceof MaskChar.Dynamic) {
                ((MaskChar.Dynamic) maskChar).setChar(Character.valueOf(cCharAt));
                i11++;
            }
            i10++;
        }
    }

    public final void setCursorPosition(int i10) {
        this.cursorPosition = i10;
    }

    public final void setDestructedValue(@NotNull List<? extends MaskChar> list) {
        this.destructedValue = list;
    }

    public void updateMaskData(@NotNull MaskData maskData, boolean z10) {
        Object next;
        String rawValue = (p.f(this.maskData, maskData) || !z10) ? null : getRawValue();
        this.maskData = maskData;
        this.filters.clear();
        for (MaskKey maskKey : this.maskData.getDecoding()) {
            try {
                String filter = maskKey.getFilter();
                if (filter != null) {
                    this.filters.put(Character.valueOf(maskKey.getKey()), new Regex(filter));
                }
            } catch (PatternSyntaxException e10) {
                onException(e10);
            }
        }
        String pattern = this.maskData.getPattern();
        ArrayList arrayList = new ArrayList(pattern.length());
        for (int i10 = 0; i10 < pattern.length(); i10++) {
            char cCharAt = pattern.charAt(i10);
            Iterator<T> it = this.maskData.getDecoding().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((MaskKey) next).getKey() == cCharAt) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            MaskKey maskKey2 = (MaskKey) next;
            arrayList.add(maskKey2 != null ? new MaskChar.Dynamic(null, this.filters.get(Character.valueOf(maskKey2.getKey())), maskKey2.getPlaceholder()) : new MaskChar.Static(cCharAt));
        }
        setDestructedValue(arrayList);
        if (rawValue != null) {
            overrideRawValue(rawValue);
        }
    }
}
