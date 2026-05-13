package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeMaskBase.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivTextRangeMaskBase implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f57805c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Expression<Boolean> f57806d = Expression.Companion.constant$default(Expression.Companion, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTextRangeMaskBase> f57807e = new sn.p<ParsingEnvironment, JSONObject, DivTextRangeMaskBase>() { // from class: com.yandex.div2.DivTextRangeMaskBase$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextRangeMaskBase mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTextRangeMaskBase.f57805c.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Expression<Boolean> f57808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f57809b;

    /* JADX INFO: compiled from: DivTextRangeMaskBase.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivTextRangeMaskBase a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().B8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DivTextRangeMaskBase() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public DivTextRangeMaskBase(@NotNull Expression<Boolean> expression) {
        this.f57808a = expression;
    }

    public /* synthetic */ DivTextRangeMaskBase(Expression expression, int i10, tn.i iVar) {
        this((i10 & 1) != 0 ? f57806d : expression);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f57809b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivTextRangeMaskBase.class).hashCode() + this.f57808a.hashCode();
        this.f57809b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().B8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
