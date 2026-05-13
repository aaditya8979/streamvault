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

/* JADX INFO: compiled from: BoolValueTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class BoolValueTemplate implements JSONSerializable, JsonTemplate<BoolValue> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f54037b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, BoolValueTemplate> f54038c = new sn.p<ParsingEnvironment, JSONObject, BoolValueTemplate>() { // from class: com.yandex.div2.BoolValueTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final BoolValueTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new BoolValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f54039a;

    /* JADX INFO: compiled from: BoolValueTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public BoolValueTemplate(@NotNull Field<Expression<Boolean>> field) {
        this.f54039a = field;
    }

    public BoolValueTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable BoolValueTemplate boolValueTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ BoolValueTemplate(ParsingEnvironment parsingEnvironment, BoolValueTemplate boolValueTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : boolValueTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().h().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
