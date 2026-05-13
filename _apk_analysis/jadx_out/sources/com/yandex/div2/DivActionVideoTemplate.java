package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivActionVideo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionVideoTemplate.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivActionVideoTemplate implements JSONSerializable, JsonTemplate<DivActionVideo> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f54568c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionVideoTemplate> f54569d = new sn.p<ParsingEnvironment, JSONObject, DivActionVideoTemplate>() { // from class: com.yandex.div2.DivActionVideoTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionVideoTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionVideoTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<DivActionVideo.Action>> f54570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f54571b;

    /* JADX INFO: compiled from: DivActionVideoTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivActionVideoTemplate(@NotNull Field<Expression<DivActionVideo.Action>> field, @NotNull Field<Expression<String>> field2) {
        this.f54570a = field;
        this.f54571b = field2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DivActionVideoTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivActionVideoTemplate divActionVideoTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        Field.Companion companion = Field.Companion;
        this(companion.nullField(false), companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivActionVideoTemplate(ParsingEnvironment parsingEnvironment, DivActionVideoTemplate divActionVideoTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionVideoTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().o1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
