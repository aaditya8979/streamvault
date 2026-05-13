package com.yandex.div2;

import com.yandex.div.internal.template.Field;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.serialization.BuiltInParserKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionAnimatorStopTemplate.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DivActionAnimatorStopTemplate implements JSONSerializable, JsonTemplate<DivActionAnimatorStop> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f54227b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionAnimatorStopTemplate> f54228c = new sn.p<ParsingEnvironment, JSONObject, DivActionAnimatorStopTemplate>() { // from class: com.yandex.div2.DivActionAnimatorStopTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionAnimatorStopTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivActionAnimatorStopTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<String> f54229a;

    /* JADX INFO: compiled from: DivActionAnimatorStopTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivActionAnimatorStopTemplate(@NotNull Field<String> field) {
        this.f54229a = field;
    }

    public DivActionAnimatorStopTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivActionAnimatorStopTemplate divActionAnimatorStopTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivActionAnimatorStopTemplate(ParsingEnvironment parsingEnvironment, DivActionAnimatorStopTemplate divActionAnimatorStopTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divActionAnimatorStopTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().O().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
