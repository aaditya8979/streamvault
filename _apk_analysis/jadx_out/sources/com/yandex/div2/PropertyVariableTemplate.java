package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: PropertyVariableTemplate.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PropertyVariableTemplate implements JSONSerializable, JsonTemplate<PropertyVariable> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f58650f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final String f58651g = "new_value";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, PropertyVariableTemplate> f58652h = new sn.p<ParsingEnvironment, JSONObject, PropertyVariableTemplate>() { // from class: com.yandex.div2.PropertyVariableTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final PropertyVariableTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new PropertyVariableTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f58653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<String> f58654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<String> f58655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Field<List<DivActionTemplate>> f58656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivEvaluableType>> f58657e;

    /* JADX INFO: compiled from: PropertyVariableTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public PropertyVariableTemplate(@NotNull Field<Expression<String>> field, @NotNull Field<String> field2, @NotNull Field<String> field3, @NotNull Field<List<DivActionTemplate>> field4, @NotNull Field<Expression<DivEvaluableType>> field5) {
        this.f58653a = field;
        this.f58654b = field2;
        this.f58655c = field3;
        this.f58656d = field4;
        this.f58657e = field5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PropertyVariableTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable PropertyVariableTemplate propertyVariableTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ PropertyVariableTemplate(ParsingEnvironment parsingEnvironment, PropertyVariableTemplate propertyVariableTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : propertyVariableTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().Y9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
