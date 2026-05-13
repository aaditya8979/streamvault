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

/* JADX INFO: compiled from: ColorValueTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ColorValueTemplate implements JSONSerializable, JsonTemplate<ColorValue> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f54053b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, ColorValueTemplate> f54054c = new sn.p<ParsingEnvironment, JSONObject, ColorValueTemplate>() { // from class: com.yandex.div2.ColorValueTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final ColorValueTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new ColorValueTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Integer>> f54055a;

    /* JADX INFO: compiled from: ColorValueTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public ColorValueTemplate(@NotNull Field<Expression<Integer>> field) {
        this.f54055a = field;
    }

    public ColorValueTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable ColorValueTemplate colorValueTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ ColorValueTemplate(ParsingEnvironment parsingEnvironment, ColorValueTemplate colorValueTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : colorValueTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().n().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
