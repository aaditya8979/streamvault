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

/* JADX INFO: compiled from: DivShapeDrawable.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class DivShapeDrawable implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f56931e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivShapeDrawable> f56932f = new sn.p<ParsingEnvironment, JSONObject, DivShapeDrawable>() { // from class: com.yandex.div2.DivShapeDrawable$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivShapeDrawable mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivShapeDrawable.f56931e.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Integer> f56933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DivShape f56934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final DivStroke f56935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Integer f56936d;

    /* JADX INFO: compiled from: DivShapeDrawable.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivShapeDrawable a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().S6().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivShapeDrawable(@NotNull Expression<Integer> expression, @NotNull DivShape divShape, @Nullable DivStroke divStroke) {
        this.f56933a = expression;
        this.f56934b = divShape;
        this.f56935c = divStroke;
    }

    public final boolean a(@Nullable DivShapeDrawable divShapeDrawable, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divShapeDrawable == null || this.f56933a.evaluate(expressionResolver).intValue() != divShapeDrawable.f56933a.evaluate(expressionResolver2).intValue() || !this.f56934b.a(divShapeDrawable.f56934b, expressionResolver, expressionResolver2)) {
            return false;
        }
        DivStroke divStroke = this.f56935c;
        DivStroke divStroke2 = divShapeDrawable.f56935c;
        return divStroke != null ? divStroke.a(divStroke2, expressionResolver, expressionResolver2) : divStroke2 == null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56936d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivShapeDrawable.class).hashCode() + this.f56933a.hashCode() + this.f56934b.hash();
        DivStroke divStroke = this.f56935c;
        int iHash = iHashCode + (divStroke != null ? divStroke.hash() : 0);
        this.f56936d = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().S6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
