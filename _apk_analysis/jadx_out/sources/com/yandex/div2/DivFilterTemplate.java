package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivFilterTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFilterTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class DivFilterTemplate implements JSONSerializable, JsonTemplate<DivFilter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f55290a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivFilterTemplate> f55291b = new sn.p<ParsingEnvironment, JSONObject, DivFilterTemplate>() { // from class: com.yandex.div2.DivFilterTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivFilterTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivFilterTemplate.b.b(DivFilterTemplate.f55290a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivFilterTemplate.kt */
    public static final class a extends DivFilterTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivBlurTemplate f55292c;

        public a(@NotNull DivBlurTemplate divBlurTemplate) {
            super(null);
            this.f55292c = divBlurTemplate;
        }

        @NotNull
        public final DivBlurTemplate b() {
            return this.f55292c;
        }
    }

    /* JADX INFO: compiled from: DivFilterTemplate.kt */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivFilterTemplate b(b bVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivFilterTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().i3().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivFilterTemplate.kt */
    public static final class c extends DivFilterTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivFilterRtlMirrorTemplate f55293c;

        public c(@NotNull DivFilterRtlMirrorTemplate divFilterRtlMirrorTemplate) {
            super(null);
            this.f55293c = divFilterRtlMirrorTemplate;
        }

        @NotNull
        public final DivFilterRtlMirrorTemplate b() {
            return this.f55293c;
        }
    }

    public DivFilterTemplate() {
    }

    public /* synthetic */ DivFilterTemplate(tn.i iVar) {
        this();
    }

    @NotNull
    public final Object a() {
        if (this instanceof a) {
            return ((a) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getType() {
        if (this instanceof a) {
            return "blur";
        }
        if (this instanceof c) {
            return "rtl_mirror";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().i3().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
