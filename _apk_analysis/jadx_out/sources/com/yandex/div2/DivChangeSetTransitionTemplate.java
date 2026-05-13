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

/* JADX INFO: compiled from: DivChangeSetTransitionTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivChangeSetTransitionTemplate implements JSONSerializable, JsonTemplate<DivChangeSetTransition> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f54728b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivChangeSetTransitionTemplate> f54729c = new sn.p<ParsingEnvironment, JSONObject, DivChangeSetTransitionTemplate>() { // from class: com.yandex.div2.DivChangeSetTransitionTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivChangeSetTransitionTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivChangeSetTransitionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<List<DivChangeTransitionTemplate>> f54730a;

    /* JADX INFO: compiled from: DivChangeSetTransitionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivChangeSetTransitionTemplate(@NotNull Field<List<DivChangeTransitionTemplate>> field) {
        this.f54730a = field;
    }

    public DivChangeSetTransitionTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivChangeSetTransitionTemplate divChangeSetTransitionTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivChangeSetTransitionTemplate(ParsingEnvironment parsingEnvironment, DivChangeSetTransitionTemplate divChangeSetTransitionTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divChangeSetTransitionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().S1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
