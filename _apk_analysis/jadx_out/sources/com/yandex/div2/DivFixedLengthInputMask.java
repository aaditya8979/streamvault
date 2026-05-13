package com.yandex.div2;

import ah.f6;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivFixedLengthInputMask;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFixedLengthInputMask.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivFixedLengthInputMask implements JSONSerializable, Hashable, f6 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f55301f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f55302g = Expression.Companion.constant$default(Expression.Companion, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivFixedLengthInputMask> f55303h = new sn.p<ParsingEnvironment, JSONObject, DivFixedLengthInputMask>() { // from class: com.yandex.div2.DivFixedLengthInputMask$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFixedLengthInputMask mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivFixedLengthInputMask.f55301f.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f55304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<String> f55305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<PatternElement> f55306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f55307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Integer f55308e;

    /* JADX INFO: compiled from: DivFixedLengthInputMask.kt */
    public static final class PatternElement implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final a f55309e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final Expression<String> f55310f = Expression.Companion.constant$default(Expression.Companion, "_", null, 2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, PatternElement> f55311g = new sn.p<ParsingEnvironment, JSONObject, PatternElement>() { // from class: com.yandex.div2.DivFixedLengthInputMask$PatternElement$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivFixedLengthInputMask.PatternElement mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivFixedLengthInputMask.PatternElement.f55309e.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Expression<String> f55312a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Expression<String> f55313b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Expression<String> f55314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Integer f55315d;

        /* JADX INFO: compiled from: DivFixedLengthInputMask.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final PatternElement a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().t3().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        public PatternElement(@NotNull Expression<String> expression, @NotNull Expression<String> expression2, @Nullable Expression<String> expression3) {
            this.f55312a = expression;
            this.f55313b = expression2;
            this.f55314c = expression3;
        }

        public final boolean a(@Nullable PatternElement patternElement, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            if (patternElement == null || !tn.p.f(this.f55312a.evaluate(expressionResolver), patternElement.f55312a.evaluate(expressionResolver2)) || !tn.p.f(this.f55313b.evaluate(expressionResolver), patternElement.f55313b.evaluate(expressionResolver2))) {
                return false;
            }
            Expression<String> expression = this.f55314c;
            String strEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
            Expression<String> expression2 = patternElement.f55314c;
            return tn.p.f(strEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null);
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f55315d;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(PatternElement.class).hashCode() + this.f55312a.hashCode() + this.f55313b.hashCode();
            Expression<String> expression = this.f55314c;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
            this.f55315d = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().t3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivFixedLengthInputMask.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivFixedLengthInputMask a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().q3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivFixedLengthInputMask(@NotNull Expression<Boolean> expression, @NotNull Expression<String> expression2, @NotNull List<PatternElement> list, @NotNull String str) {
        this.f55304a = expression;
        this.f55305b = expression2;
        this.f55306c = list;
        this.f55307d = str;
    }

    @Override // ah.f6
    @NotNull
    public String a() {
        return this.f55307d;
    }

    public final boolean b(@Nullable DivFixedLengthInputMask divFixedLengthInputMask, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        boolean z10;
        if (divFixedLengthInputMask == null || this.f55304a.evaluate(expressionResolver).booleanValue() != divFixedLengthInputMask.f55304a.evaluate(expressionResolver2).booleanValue() || !tn.p.f(this.f55305b.evaluate(expressionResolver), divFixedLengthInputMask.f55305b.evaluate(expressionResolver2))) {
            return false;
        }
        List<PatternElement> list = this.f55306c;
        List<PatternElement> list2 = divFixedLengthInputMask.f55306c;
        if (list.size() != list2.size()) {
            z10 = false;
            break;
        }
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                cn.w.w();
            }
            if (!((PatternElement) obj).a(list2.get(i10), expressionResolver, expressionResolver2)) {
                z10 = false;
                break;
            }
            i10 = i11;
        }
        z10 = true;
        return z10 && tn.p.f(a(), divFixedLengthInputMask.a());
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f55308e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivFixedLengthInputMask.class).hashCode() + this.f55304a.hashCode() + this.f55305b.hashCode();
        int iHash = 0;
        Iterator<T> it = this.f55306c.iterator();
        while (it.hasNext()) {
            iHash += ((PatternElement) it.next()).hash();
        }
        int iHashCode2 = iHashCode + iHash + a().hashCode();
        this.f55308e = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().q3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
