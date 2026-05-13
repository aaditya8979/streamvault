package kotlin.text;

import ao.k;
import bn.r;
import bo.d0;
import bo.m;
import cn.b0;
import cn.v;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import hn.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jn.d;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.i;
import tn.p;
import zn.n;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class Regex implements Serializable {

    @NotNull
    public static final a Companion = new a(null);

    @Nullable
    private Set<? extends RegexOption> _options;

    @NotNull
    private final Pattern nativePattern;

    /* JADX INFO: compiled from: Regex.kt */
    public static final class Serialized implements Serializable {

        @NotNull
        public static final a Companion = new a(null);
        private static final long serialVersionUID = 0;
        private final int flags;

        @NotNull
        private final String pattern;

        /* JADX INFO: compiled from: Regex.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(i iVar) {
                this();
            }
        }

        public Serialized(@NotNull String str, int i10) {
            p.k(str, "pattern");
            this.pattern = str;
            this.flags = i10;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.pattern, this.flags);
            p.j(patternCompile, "compile(...)");
            return new Regex(patternCompile);
        }

        public final int getFlags() {
            return this.flags;
        }

        @NotNull
        public final String getPattern() {
            return this.pattern;
        }
    }

    /* JADX INFO: compiled from: Regex.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }

        public final int b(int i10) {
            return (i10 & 2) != 0 ? i10 | 64 : i10;
        }
    }

    /* JADX INFO: compiled from: Regex.kt */
    public static final class b implements l<RegexOption, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f73241b;

        public b(int i10) {
            this.f73241b = i10;
        }

        @Override // sn.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(RegexOption regexOption) {
            RegexOption regexOption2 = regexOption;
            return Boolean.valueOf((this.f73241b & regexOption2.getMask()) == regexOption2.getValue());
        }
    }

    /* JADX INFO: renamed from: kotlin.text.Regex$findAll$2, reason: invalid class name */
    /* JADX INFO: compiled from: Regex.kt */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements l<bo.l, bo.l> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1, bo.l.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // sn.l
        public final bo.l invoke(bo.l lVar) {
            p.k(lVar, "p0");
            return lVar.next();
        }
    }

    /* JADX INFO: renamed from: kotlin.text.Regex$splitToSequence$1, reason: invalid class name */
    /* JADX INFO: compiled from: Regex.kt */
    @d(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", l = {279, MBSupportMuteAdType.INTERSTITIAL_VIDEO, 291}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements sn.p<k<? super String>, c<? super r>, Object> {
        public final /* synthetic */ CharSequence $input;
        public final /* synthetic */ int $limit;
        public int I$0;
        private /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CharSequence charSequence, int i10, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$input = charSequence;
            this.$limit = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = Regex.this.new AnonymousClass1(this.$input, this.$limit, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // sn.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo2invoke(k<? super String> kVar, c<? super r> cVar) {
            return ((AnonymousClass1) create(kVar, cVar)).invokeSuspend(r.f5635a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0072 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009e A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0070 -> B:21:0x0073). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = in.a.g()
                int r1 = r10.label
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L35
                if (r1 == r5) goto L30
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                kotlin.c.b(r11)
                goto L9f
            L17:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1f:
                int r1 = r10.I$0
                java.lang.Object r2 = r10.L$1
                java.util.regex.Matcher r2 = (java.util.regex.Matcher) r2
                java.lang.Object r6 = r10.L$0
                ao.k r6 = (ao.k) r6
                kotlin.c.b(r11)
                r7 = r10
                r11 = r1
                r1 = r2
                goto L73
            L30:
                kotlin.c.b(r11)
                goto Lb1
            L35:
                kotlin.c.b(r11)
                java.lang.Object r11 = r10.L$0
                ao.k r11 = (ao.k) r11
                kotlin.text.Regex r1 = kotlin.text.Regex.this
                java.util.regex.Pattern r1 = kotlin.text.Regex.access$getNativePattern$p(r1)
                java.lang.CharSequence r6 = r10.$input
                java.util.regex.Matcher r1 = r1.matcher(r6)
                int r6 = r10.$limit
                if (r6 == r5) goto La2
                boolean r6 = r1.find()
                if (r6 != 0) goto L53
                goto La2
            L53:
                r7 = r10
                r6 = r11
                r11 = r2
            L56:
                java.lang.CharSequence r8 = r7.$input
                int r9 = r1.start()
                java.lang.CharSequence r2 = r8.subSequence(r2, r9)
                java.lang.String r2 = r2.toString()
                r7.L$0 = r6
                r7.L$1 = r1
                r7.I$0 = r11
                r7.label = r4
                java.lang.Object r2 = r6.b(r2, r7)
                if (r2 != r0) goto L73
                return r0
            L73:
                int r2 = r1.end()
                int r11 = r11 + r5
                int r8 = r7.$limit
                int r8 = r8 - r5
                if (r11 == r8) goto L83
                boolean r8 = r1.find()
                if (r8 != 0) goto L56
            L83:
                java.lang.CharSequence r11 = r7.$input
                int r1 = r11.length()
                java.lang.CharSequence r11 = r11.subSequence(r2, r1)
                java.lang.String r11 = r11.toString()
                r1 = 0
                r7.L$0 = r1
                r7.L$1 = r1
                r7.label = r3
                java.lang.Object r11 = r6.b(r11, r7)
                if (r11 != r0) goto L9f
                return r0
            L9f:
                bn.r r11 = bn.r.f5635a
                return r11
            La2:
                java.lang.CharSequence r1 = r10.$input
                java.lang.String r1 = r1.toString()
                r10.label = r5
                java.lang.Object r11 = r11.b(r1, r10)
                if (r11 != r0) goto Lb1
                return r0
            Lb1:
                bn.r r11 = bn.r.f5635a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String str) {
        p.k(str, "pattern");
        Pattern patternCompile = Pattern.compile(str);
        p.j(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String str, @NotNull Set<? extends RegexOption> set) {
        p.k(str, "pattern");
        p.k(set, "options");
        Pattern patternCompile = Pattern.compile(str, Companion.b(bo.p.j(set)));
        p.j(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Regex(@NotNull String str, @NotNull RegexOption regexOption) {
        p.k(str, "pattern");
        p.k(regexOption, "option");
        Pattern patternCompile = Pattern.compile(str, Companion.b(regexOption.getValue()));
        p.j(patternCompile, "compile(...)");
        this(patternCompile);
    }

    public Regex(@NotNull Pattern pattern) {
        p.k(pattern, "nativePattern");
        this.nativePattern = pattern;
    }

    public static final bo.l b(Regex regex, CharSequence charSequence, int i10) {
        return regex.find(charSequence, i10);
    }

    public static /* synthetic */ bo.l find$default(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.find(charSequence, i10);
    }

    public static /* synthetic */ ao.i findAll$default(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.findAll(charSequence, i10);
    }

    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.split(charSequence, i10);
    }

    public static /* synthetic */ ao.i splitToSequence$default(Regex regex, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return regex.splitToSequence(charSequence, i10);
    }

    private final Object writeReplace() {
        String strPattern = this.nativePattern.pattern();
        p.j(strPattern, "pattern(...)");
        return new Serialized(strPattern, this.nativePattern.flags());
    }

    public final boolean containsMatchIn(@NotNull CharSequence charSequence) {
        p.k(charSequence, "input");
        return this.nativePattern.matcher(charSequence).find();
    }

    @Nullable
    public final bo.l find(@NotNull CharSequence charSequence, int i10) {
        p.k(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        p.j(matcher, "matcher(...)");
        return bo.p.f(matcher, i10, charSequence);
    }

    @NotNull
    public final ao.i<bo.l> findAll(@NotNull final CharSequence charSequence, final int i10) {
        p.k(charSequence, "input");
        if (i10 >= 0 && i10 <= charSequence.length()) {
            return ao.r.p(new sn.a() { // from class: bo.o
                @Override // sn.a
                public final Object invoke() {
                    return Regex.b(this.f5706b, charSequence, i10);
                }
            }, AnonymousClass2.INSTANCE);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i10 + ", input length: " + charSequence.length());
    }

    @NotNull
    public final Set<RegexOption> getOptions() {
        Set set = this._options;
        if (set != null) {
            return set;
        }
        int iFlags = this.nativePattern.flags();
        EnumSet enumSetAllOf = EnumSet.allOf(RegexOption.class);
        p.h(enumSetAllOf);
        b0.T(enumSetAllOf, new b(iFlags));
        Set<RegexOption> setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
        p.j(setUnmodifiableSet, "unmodifiableSet(...)");
        this._options = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    @NotNull
    public final String getPattern() {
        String strPattern = this.nativePattern.pattern();
        p.j(strPattern, "pattern(...)");
        return strPattern;
    }

    @Nullable
    public final bo.l matchAt(@NotNull CharSequence charSequence, int i10) {
        p.k(charSequence, "input");
        Matcher matcherRegion = this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i10, charSequence.length());
        if (!matcherRegion.lookingAt()) {
            return null;
        }
        p.h(matcherRegion);
        return new m(matcherRegion, charSequence);
    }

    @Nullable
    public final bo.l matchEntire(@NotNull CharSequence charSequence) {
        p.k(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        p.j(matcher, "matcher(...)");
        return bo.p.g(matcher, charSequence);
    }

    public final boolean matches(@NotNull CharSequence charSequence) {
        p.k(charSequence, "input");
        return this.nativePattern.matcher(charSequence).matches();
    }

    public final boolean matchesAt(@NotNull CharSequence charSequence, int i10) {
        p.k(charSequence, "input");
        return this.nativePattern.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i10, charSequence.length()).lookingAt();
    }

    @NotNull
    public final String replace(@NotNull CharSequence charSequence, @NotNull String str) {
        p.k(charSequence, "input");
        p.k(str, "replacement");
        String strReplaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        p.j(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    @NotNull
    public final String replace(@NotNull CharSequence charSequence, @NotNull l<? super bo.l, ? extends CharSequence> lVar) {
        p.k(charSequence, "input");
        p.k(lVar, "transform");
        int iIntValue = 0;
        bo.l lVarFind$default = find$default(this, charSequence, 0, 2, null);
        if (lVarFind$default == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(charSequence, iIntValue, lVarFind$default.c().getStart().intValue());
            sb2.append(lVar.invoke(lVarFind$default));
            iIntValue = lVarFind$default.c().getEndInclusive().intValue() + 1;
            lVarFind$default = lVarFind$default.next();
            if (iIntValue >= length) {
                break;
            }
        } while (lVarFind$default != null);
        if (iIntValue < length) {
            sb2.append(charSequence, iIntValue, length);
        }
        String string = sb2.toString();
        p.j(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String replaceFirst(@NotNull CharSequence charSequence, @NotNull String str) {
        p.k(charSequence, "input");
        p.k(str, "replacement");
        String strReplaceFirst = this.nativePattern.matcher(charSequence).replaceFirst(str);
        p.j(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    @NotNull
    public final List<String> split(@NotNull CharSequence charSequence, int i10) {
        p.k(charSequence, "input");
        d0.P0(i10);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i10 == 1 || !matcher.find()) {
            return v.e(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(i10 > 0 ? n.j(i10, 10) : 10);
        int iEnd = 0;
        int i11 = i10 - 1;
        do {
            arrayList.add(charSequence.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i11 >= 0 && arrayList.size() == i11) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(iEnd, charSequence.length()).toString());
        return arrayList;
    }

    @NotNull
    public final ao.i<String> splitToSequence(@NotNull CharSequence charSequence, int i10) {
        p.k(charSequence, "input");
        d0.P0(i10);
        return ao.l.b(new AnonymousClass1(charSequence, i10, null));
    }

    @NotNull
    public final Pattern toPattern() {
        return this.nativePattern;
    }

    @NotNull
    public String toString() {
        String string = this.nativePattern.toString();
        p.j(string, "toString(...)");
        return string;
    }
}
