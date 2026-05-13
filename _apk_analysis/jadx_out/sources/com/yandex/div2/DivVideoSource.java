package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivVideoSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivVideoSource.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivVideoSource implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f58178f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivVideoSource> f58179g = new sn.p<ParsingEnvironment, JSONObject, DivVideoSource>() { // from class: com.yandex.div2.DivVideoSource$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivVideoSource mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivVideoSource.f58178f.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Expression<Long> f58180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<String> f58181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Resolution f58182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Expression<Uri> f58183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Integer f58184e;

    /* JADX INFO: compiled from: DivVideoSource.kt */
    public static final class Resolution implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final a f58185d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, Resolution> f58186e = new sn.p<ParsingEnvironment, JSONObject, Resolution>() { // from class: com.yandex.div2.DivVideoSource$Resolution$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivVideoSource.Resolution mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivVideoSource.Resolution.f58185d.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Expression<Long> f58187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Expression<Long> f58188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f58189c;

        /* JADX INFO: compiled from: DivVideoSource.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final Resolution a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().t9().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        public Resolution(@NotNull Expression<Long> expression, @NotNull Expression<Long> expression2) {
            this.f58187a = expression;
            this.f58188b = expression2;
        }

        public final boolean a(@Nullable Resolution resolution, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
            return resolution != null && this.f58187a.evaluate(expressionResolver).longValue() == resolution.f58187a.evaluate(expressionResolver2).longValue() && this.f58188b.evaluate(expressionResolver).longValue() == resolution.f58188b.evaluate(expressionResolver2).longValue();
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f58189c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(Resolution.class).hashCode() + this.f58187a.hashCode() + this.f58188b.hashCode();
            this.f58189c = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().t9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivVideoSource.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivVideoSource a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().q9().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivVideoSource(@Nullable Expression<Long> expression, @NotNull Expression<String> expression2, @Nullable Resolution resolution, @NotNull Expression<Uri> expression3) {
        this.f58180a = expression;
        this.f58181b = expression2;
        this.f58182c = resolution;
        this.f58183d = expression3;
    }

    public final boolean a(@Nullable DivVideoSource divVideoSource, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divVideoSource == null) {
            return false;
        }
        Expression<Long> expression = this.f58180a;
        Long lEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = divVideoSource.f58180a;
        if (!tn.p.f(lEvaluate, expression2 != null ? expression2.evaluate(expressionResolver2) : null) || !tn.p.f(this.f58181b.evaluate(expressionResolver), divVideoSource.f58181b.evaluate(expressionResolver2))) {
            return false;
        }
        Resolution resolution = this.f58182c;
        return (resolution != null ? resolution.a(divVideoSource.f58182c, expressionResolver, expressionResolver2) : divVideoSource.f58182c == null) && tn.p.f(this.f58183d.evaluate(expressionResolver), divVideoSource.f58183d.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f58184e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivVideoSource.class).hashCode();
        Expression<Long> expression = this.f58180a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f58181b.hashCode();
        Resolution resolution = this.f58182c;
        int iHash = iHashCode2 + (resolution != null ? resolution.hash() : 0) + this.f58183d.hashCode();
        this.f58184e = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().q9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
