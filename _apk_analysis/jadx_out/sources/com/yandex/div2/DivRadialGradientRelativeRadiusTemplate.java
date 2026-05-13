package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivRadialGradientRelativeRadiusTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivRadialGradientRelativeRadiusTemplate implements JSONSerializable, JsonTemplate<DivRadialGradientRelativeRadius> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f56638b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivRadialGradientRelativeRadiusTemplate> f56639c = new sn.p<ParsingEnvironment, JSONObject, DivRadialGradientRelativeRadiusTemplate>() { // from class: com.yandex.div2.DivRadialGradientRelativeRadiusTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivRadialGradientRelativeRadiusTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivRadialGradientRelativeRadiusTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivRadialGradientRelativeRadius.Value>> f56640a;

    /* JADX INFO: compiled from: DivRadialGradientRelativeRadiusTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivRadialGradientRelativeRadiusTemplate(@NotNull Field<Expression<DivRadialGradientRelativeRadius.Value>> field) {
        this.f56640a = field;
    }

    public DivRadialGradientRelativeRadiusTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivRadialGradientRelativeRadiusTemplate divRadialGradientRelativeRadiusTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivRadialGradientRelativeRadiusTemplate(ParsingEnvironment parsingEnvironment, DivRadialGradientRelativeRadiusTemplate divRadialGradientRelativeRadiusTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divRadialGradientRelativeRadiusTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().v6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
