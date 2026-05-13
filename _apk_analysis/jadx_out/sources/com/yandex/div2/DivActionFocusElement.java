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

/* JADX INFO: compiled from: DivActionFocusElement.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivActionFocusElement implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f54304c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionFocusElement> f54305d = new sn.p<ParsingEnvironment, JSONObject, DivActionFocusElement>() { // from class: com.yandex.div2.DivActionFocusElement$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionFocusElement mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionFocusElement.f54304c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<String> f54306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f54307b;

    /* JADX INFO: compiled from: DivActionFocusElement.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionFocusElement a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().o0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivActionFocusElement(@NotNull Expression<String> expression) {
        this.f54306a = expression;
    }

    public final boolean a(@Nullable DivActionFocusElement divActionFocusElement, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divActionFocusElement == null) {
            return false;
        }
        return tn.p.f(this.f54306a.evaluate(expressionResolver), divActionFocusElement.f54306a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f54307b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivActionFocusElement.class).hashCode() + this.f54306a.hashCode();
        this.f54307b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().o0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
