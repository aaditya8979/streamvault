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

/* JADX INFO: compiled from: DivAppearanceSetTransitionTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DivAppearanceSetTransitionTemplate implements JSONSerializable, JsonTemplate<DivAppearanceSetTransition> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f54633b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivAppearanceSetTransitionTemplate> f54634c = new sn.p<ParsingEnvironment, JSONObject, DivAppearanceSetTransitionTemplate>() { // from class: com.yandex.div2.DivAppearanceSetTransitionTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivAppearanceSetTransitionTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return new DivAppearanceSetTransitionTemplate(parsingEnvironment, null, false, jSONObject, 6, null);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Field<List<DivAppearanceTransitionTemplate>> f54635a;

    /* JADX INFO: compiled from: DivAppearanceSetTransitionTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }
    }

    public DivAppearanceSetTransitionTemplate(@NotNull Field<List<DivAppearanceTransitionTemplate>> field) {
        this.f54635a = field;
    }

    public DivAppearanceSetTransitionTemplate(@NotNull ParsingEnvironment parsingEnvironment, @Nullable DivAppearanceSetTransitionTemplate divAppearanceSetTransitionTemplate, boolean z10, @NotNull JSONObject jSONObject) {
        this(Field.Companion.nullField(false));
        throw new UnsupportedOperationException("Do not use this constructor directly.");
    }

    public /* synthetic */ DivAppearanceSetTransitionTemplate(ParsingEnvironment parsingEnvironment, DivAppearanceSetTransitionTemplate divAppearanceSetTransitionTemplate, boolean z10, JSONObject jSONObject, int i10, tn.i iVar) {
        this(parsingEnvironment, (i10 & 2) != 0 ? null : divAppearanceSetTransitionTemplate, (i10 & 4) != 0 ? false : z10, jSONObject);
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().x1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
