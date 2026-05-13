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

/* JADX INFO: compiled from: DivRadialGradientRelativeCenterTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivRadialGradientRelativeCenterTemplate implements JSONSerializable, JsonTemplate<DivRadialGradientRelativeCenter> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f56625b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivRadialGradientRelativeCenterTemplate> f56626c = new sn.p<ParsingEnvironment, JSONObject, DivRadialGradientRelativeCenterTemplate>() { // from class: com.yandex.div2.DivRadialGradientRelativeCenterTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivRadialGradientRelativeCenterTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivRadialGradientRelativeCenterTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Double>> f56627a;

    /* JADX INFO: compiled from: DivRadialGradientRelativeCenterTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivRadialGradientRelativeCenterTemplate(@NotNull Field<Expression<Double>> field) {
        this.f56627a = field;
    }

    public DivRadialGradientRelativeCenterTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivRadialGradientRelativeCenterTemplate divRadialGradientRelativeCenterTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivRadialGradientRelativeCenterTemplate(ParsingEnvironment parsingEnvironment, DivRadialGradientRelativeCenterTemplate divRadialGradientRelativeCenterTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divRadialGradientRelativeCenterTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().s6().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
