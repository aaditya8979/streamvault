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

/* JADX INFO: compiled from: BoolVariableTemplate.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BoolVariableTemplate implements JSONSerializable, JsonTemplate<BoolVariable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f54045c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, BoolVariableTemplate> f54046d = new sn.p<ParsingEnvironment, JSONObject, BoolVariableTemplate>() { // from class: com.yandex.div2.BoolVariableTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final BoolVariableTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new BoolVariableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<String> f54047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f54048b;

    /* JADX INFO: compiled from: BoolVariableTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public BoolVariableTemplate(@NotNull Field<String> field, @NotNull Field<Expression<Boolean>> field2) {
        this.f54047a = field;
        this.f54048b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BoolVariableTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable BoolVariableTemplate boolVariableTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ BoolVariableTemplate(ParsingEnvironment parsingEnvironment, BoolVariableTemplate boolVariableTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : boolVariableTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().k().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
