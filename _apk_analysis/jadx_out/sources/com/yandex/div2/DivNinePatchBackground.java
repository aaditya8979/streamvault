package com.yandex.div2;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivNinePatchBackground.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivNinePatchBackground implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f56220d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivNinePatchBackground> f56221e = new sn.p<ParsingEnvironment, JSONObject, DivNinePatchBackground>() { // from class: com.yandex.div2.DivNinePatchBackground$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivNinePatchBackground mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivNinePatchBackground.f56220d.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Uri> f56222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DivAbsoluteEdgeInsets f56223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Integer f56224c;

    /* JADX INFO: compiled from: DivNinePatchBackground.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivNinePatchBackground a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().e5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivNinePatchBackground(@NotNull Expression<Uri> expression, @NotNull DivAbsoluteEdgeInsets divAbsoluteEdgeInsets) {
        this.f56222a = expression;
        this.f56223b = divAbsoluteEdgeInsets;
    }

    public final boolean a(@Nullable DivNinePatchBackground divNinePatchBackground, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        return divNinePatchBackground != null && tn.p.f(this.f56222a.evaluate(expressionResolver), divNinePatchBackground.f56222a.evaluate(expressionResolver2)) && this.f56223b.a(divNinePatchBackground.f56223b, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f56224c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivNinePatchBackground.class).hashCode() + this.f56222a.hashCode() + this.f56223b.hash();
        this.f56224c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().e5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
