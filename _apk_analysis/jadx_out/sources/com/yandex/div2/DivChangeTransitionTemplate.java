package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivChangeTransitionTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivChangeTransitionTemplate.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivChangeTransitionTemplate implements JSONSerializable, JsonTemplate<DivChangeTransition> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f54736a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivChangeTransitionTemplate> f54737b = new sn.p<ParsingEnvironment, JSONObject, DivChangeTransitionTemplate>() { // from class: com.yandex.div2.DivChangeTransitionTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivChangeTransitionTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivChangeTransitionTemplate.b.b(DivChangeTransitionTemplate.f54736a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivChangeTransitionTemplate.kt */
    public static final class a extends DivChangeTransitionTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivChangeBoundsTransitionTemplate f54738c;

        public a(@NotNull DivChangeBoundsTransitionTemplate divChangeBoundsTransitionTemplate) {
            super(null);
            this.f54738c = divChangeBoundsTransitionTemplate;
        }

        @NotNull
        public final DivChangeBoundsTransitionTemplate b() {
            return this.f54738c;
        }
    }

    /* JADX INFO: compiled from: DivChangeTransitionTemplate.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivChangeTransitionTemplate b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivChangeTransitionTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().V1().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivChangeTransitionTemplate.kt */
    public static final class c extends DivChangeTransitionTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivChangeSetTransitionTemplate f54739c;

        public c(@NotNull DivChangeSetTransitionTemplate divChangeSetTransitionTemplate) {
            super(null);
            this.f54739c = divChangeSetTransitionTemplate;
        }

        @NotNull
        public final DivChangeSetTransitionTemplate b() {
            return this.f54739c;
        }
    }

    public DivChangeTransitionTemplate() {
    }

    public /* synthetic */ DivChangeTransitionTemplate(tn.i iVar) {
        this();
    }

    @NotNull
    public final Object a() {
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof a) {
            return ((a) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getType() {
        if (this instanceof c) {
            return "set";
        }
        if (this instanceof a) {
            return "change_bounds";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().V1().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
