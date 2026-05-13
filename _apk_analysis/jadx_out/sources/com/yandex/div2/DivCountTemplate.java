package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivCountTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivCountTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class DivCountTemplate implements JSONSerializable, JsonTemplate<DivCount> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f54997a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivCountTemplate> f54998b = new sn.p<ParsingEnvironment, JSONObject, DivCountTemplate>() { // from class: com.yandex.div2.DivCountTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivCountTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivCountTemplate.a.b(DivCountTemplate.f54997a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivCountTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivCountTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivCountTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().w2().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivCountTemplate.kt */
    public static final class b extends DivCountTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivFixedCountTemplate f54999c;

        public b(@NotNull DivFixedCountTemplate divFixedCountTemplate) {
            super(null);
            this.f54999c = divFixedCountTemplate;
        }

        @NotNull
        public final DivFixedCountTemplate b() {
            return this.f54999c;
        }
    }

    /* JADX INFO: compiled from: DivCountTemplate.kt */
    public static final class c extends DivCountTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivInfinityCountTemplate f55000c;

        public c(@NotNull DivInfinityCountTemplate divInfinityCountTemplate) {
            super(null);
            this.f55000c = divInfinityCountTemplate;
        }

        @NotNull
        public final DivInfinityCountTemplate b() {
            return this.f55000c;
        }
    }

    public DivCountTemplate() {
    }

    public /* synthetic */ DivCountTemplate(tn.i iVar) {
        this();
    }

    @NotNull
    public final Object a() {
        if (this instanceof c) {
            return ((c) this).b();
        }
        if (this instanceof b) {
            return ((b) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getType() {
        if (this instanceof c) {
            return "infinity";
        }
        if (this instanceof b) {
            return "fixed";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().w2().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
