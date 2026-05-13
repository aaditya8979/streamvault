package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: IntegerValueTemplate.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class IntegerValueTemplate implements JSONSerializable, JsonTemplate<IntegerValue> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f58295b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, IntegerValueTemplate> f58296c = new sn.p<ParsingEnvironment, JSONObject, IntegerValueTemplate>() { // from class: com.yandex.div2.IntegerValueTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final IntegerValueTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new IntegerValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Long>> f58297a;

    /* JADX INFO: compiled from: IntegerValueTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public IntegerValueTemplate(@NotNull Field<Expression<Long>> field) {
        this.f58297a = field;
    }

    public IntegerValueTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable IntegerValueTemplate integerValueTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ IntegerValueTemplate(ParsingEnvironment parsingEnvironment, IntegerValueTemplate integerValueTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : integerValueTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().J9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
