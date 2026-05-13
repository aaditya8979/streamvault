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

/* JADX INFO: compiled from: DivDefaultIndicatorItemPlacementTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivDefaultIndicatorItemPlacementTemplate implements JSONSerializable, JsonTemplate<DivDefaultIndicatorItemPlacement> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f55120b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final DivFixedSize f55121c = new DivFixedSize(null, Expression.Companion.constant$default(Expression.Companion, 15L, null, 2, null), 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivDefaultIndicatorItemPlacementTemplate> f55122d = new sn.p<ParsingEnvironment, JSONObject, DivDefaultIndicatorItemPlacementTemplate>() { // from class: com.yandex.div2.DivDefaultIndicatorItemPlacementTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivDefaultIndicatorItemPlacementTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivDefaultIndicatorItemPlacementTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<DivFixedSizeTemplate> f55123a;

    /* JADX INFO: compiled from: DivDefaultIndicatorItemPlacementTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivDefaultIndicatorItemPlacementTemplate(@NotNull Field<DivFixedSizeTemplate> field) {
        this.f55123a = field;
    }

    public DivDefaultIndicatorItemPlacementTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivDefaultIndicatorItemPlacementTemplate divDefaultIndicatorItemPlacementTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivDefaultIndicatorItemPlacementTemplate(ParsingEnvironment parsingEnvironment, DivDefaultIndicatorItemPlacementTemplate divDefaultIndicatorItemPlacementTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divDefaultIndicatorItemPlacementTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().K2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
