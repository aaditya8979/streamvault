package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCloudBackground.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivCloudBackground implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f54753e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivCloudBackground> f54754f = new sn.p<ParsingEnvironment, JSONObject, DivCloudBackground>() { // from class: com.yandex.div2.DivCloudBackground$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCloudBackground mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivCloudBackground.f54753e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Integer> f54755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Long> f54756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final DivEdgeInsets f54757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f54758d;

    /* JADX INFO: compiled from: DivCloudBackground.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivCloudBackground a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().a2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivCloudBackground(@NotNull Expression<Integer> expression, @NotNull Expression<Long> expression2, @Nullable DivEdgeInsets divEdgeInsets) {
        this.f54755a = expression;
        this.f54756b = expression2;
        this.f54757c = divEdgeInsets;
    }

    public final boolean a(@Nullable DivCloudBackground divCloudBackground, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divCloudBackground == null || this.f54755a.evaluate(expressionResolver).intValue() != divCloudBackground.f54755a.evaluate(expressionResolver2).intValue() || this.f54756b.evaluate(expressionResolver).longValue() != divCloudBackground.f54756b.evaluate(expressionResolver2).longValue()) {
            return false;
        }
        DivEdgeInsets divEdgeInsets = this.f54757c;
        DivEdgeInsets divEdgeInsets2 = divCloudBackground.f54757c;
        return divEdgeInsets != null ? divEdgeInsets.a(divEdgeInsets2, expressionResolver, expressionResolver2) : divEdgeInsets2 == null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54758d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivCloudBackground.class).hashCode() + this.f54755a.hashCode() + this.f54756b.hashCode();
        DivEdgeInsets divEdgeInsets = this.f54757c;
        int iHash = iHashCode + (divEdgeInsets != null ? divEdgeInsets.hash() : 0);
        this.f54758d = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().a2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
