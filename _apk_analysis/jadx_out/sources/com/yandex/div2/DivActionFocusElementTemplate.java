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

/* JADX INFO: compiled from: DivActionFocusElementTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivActionFocusElementTemplate implements JSONSerializable, JsonTemplate<DivActionFocusElement> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f54308b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionFocusElementTemplate> f54309c = new sn.p<ParsingEnvironment, JSONObject, DivActionFocusElementTemplate>() { // from class: com.yandex.div2.DivActionFocusElementTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionFocusElementTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionFocusElementTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<Expression<String>> f54310a;

    /* JADX INFO: compiled from: DivActionFocusElementTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivActionFocusElementTemplate(@NotNull Field<Expression<String>> field) {
        this.f54310a = field;
    }

    public DivActionFocusElementTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivActionFocusElementTemplate divActionFocusElementTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivActionFocusElementTemplate(ParsingEnvironment parsingEnvironment, DivActionFocusElementTemplate divActionFocusElementTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionFocusElementTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().p0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
