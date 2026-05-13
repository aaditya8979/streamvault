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

/* JADX INFO: compiled from: DivWrapContentSizeTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivWrapContentSizeTemplate implements JSONSerializable, JsonTemplate<DivWrapContentSize> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f58274d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivWrapContentSizeTemplate> f58275e = new sn.p<ParsingEnvironment, JSONObject, DivWrapContentSizeTemplate>() { // from class: com.yandex.div2.DivWrapContentSizeTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivWrapContentSizeTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivWrapContentSizeTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<Boolean>> f58276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeUnitValueTemplate> f58277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Field<DivSizeUnitValueTemplate> f58278c;

    /* JADX INFO: compiled from: DivWrapContentSizeTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivWrapContentSizeTemplate(@NotNull Field<Expression<Boolean>> field, @NotNull Field<DivSizeUnitValueTemplate> field2, @NotNull Field<DivSizeUnitValueTemplate> field3) {
        this.f58276a = field;
        this.f58277b = field2;
        this.f58278c = field3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivWrapContentSizeTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivWrapContentSizeTemplate divWrapContentSizeTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivWrapContentSizeTemplate(ParsingEnvironment parsingEnvironment, DivWrapContentSizeTemplate divWrapContentSizeTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divWrapContentSizeTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().A9().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
