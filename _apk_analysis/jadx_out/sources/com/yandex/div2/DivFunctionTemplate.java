package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFunctionTemplate.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class DivFunctionTemplate implements JSONSerializable, JsonTemplate<DivFunction> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f55394e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivFunctionTemplate> f55395f = new sn.p<ParsingEnvironment, JSONObject, DivFunctionTemplate>() { // from class: com.yandex.div2.DivFunctionTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFunctionTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivFunctionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<List<DivFunctionArgumentTemplate>> f55396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<String> f55397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<String> f55398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<DivEvaluableType> f55399d;

    /* JADX INFO: compiled from: DivFunctionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivFunctionTemplate(@NotNull Field<List<DivFunctionArgumentTemplate>> field, @NotNull Field<String> field2, @NotNull Field<String> field3, @NotNull Field<DivEvaluableType> field4) {
        this.f55396a = field;
        this.f55397b = field2;
        this.f55398c = field3;
        this.f55399d = field4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivFunctionTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivFunctionTemplate divFunctionTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this((Field<List<DivFunctionArgumentTemplate>>) companion.nullField(false), (Field<String>) companion.nullField(false), (Field<String>) companion.nullField(false), (Field<DivEvaluableType>) companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivFunctionTemplate(ParsingEnvironment parsingEnvironment, DivFunctionTemplate divFunctionTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divFunctionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().J3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
