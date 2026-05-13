package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFunctionArgumentTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivFunctionArgumentTemplate implements JSONSerializable, JsonTemplate<DivFunctionArgument> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f55390c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivFunctionArgumentTemplate> f55391d = new sn.p<ParsingEnvironment, JSONObject, DivFunctionArgumentTemplate>() { // from class: com.yandex.div2.DivFunctionArgumentTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFunctionArgumentTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivFunctionArgumentTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<String> f55392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivEvaluableType> f55393b;

    /* JADX INFO: compiled from: DivFunctionArgumentTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivFunctionArgumentTemplate(@NotNull Field<String> field, @NotNull Field<DivEvaluableType> field2) {
        this.f55392a = field;
        this.f55393b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivFunctionArgumentTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivFunctionArgumentTemplate divFunctionArgumentTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivFunctionArgumentTemplate(ParsingEnvironment parsingEnvironment, DivFunctionArgumentTemplate divFunctionArgumentTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divFunctionArgumentTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().G3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
