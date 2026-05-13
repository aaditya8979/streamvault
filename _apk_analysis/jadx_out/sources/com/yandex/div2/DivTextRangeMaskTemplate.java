package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivTextRangeMaskTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextRangeMaskTemplate.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DivTextRangeMaskTemplate implements JSONSerializable, JsonTemplate<DivTextRangeMask> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f57848a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTextRangeMaskTemplate> f57849b = new sn.p<ParsingEnvironment, JSONObject, DivTextRangeMaskTemplate>() { // from class: com.yandex.div2.DivTextRangeMaskTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextRangeMaskTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTextRangeMaskTemplate.a.b(DivTextRangeMaskTemplate.f57848a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivTextRangeMaskTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivTextRangeMaskTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivTextRangeMaskTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().E8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMaskTemplate.kt */
    public static final class b extends DivTextRangeMaskTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivTextRangeMaskParticlesTemplate f57850c;

        public b(@NotNull DivTextRangeMaskParticlesTemplate divTextRangeMaskParticlesTemplate) {
            super(null);
            this.f57850c = divTextRangeMaskParticlesTemplate;
        }

        @NotNull
        public final DivTextRangeMaskParticlesTemplate b() {
            return this.f57850c;
        }
    }

    /* JADX INFO: compiled from: DivTextRangeMaskTemplate.kt */
    public static final class c extends DivTextRangeMaskTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivTextRangeMaskSolidTemplate f57851c;

        public c(@NotNull DivTextRangeMaskSolidTemplate divTextRangeMaskSolidTemplate) {
            super(null);
            this.f57851c = divTextRangeMaskSolidTemplate;
        }

        @NotNull
        public final DivTextRangeMaskSolidTemplate b() {
            return this.f57851c;
        }
    }

    public DivTextRangeMaskTemplate() {
    }

    public /* synthetic */ DivTextRangeMaskTemplate(tn.i iVar) {
        this();
    }

    @NotNull
    public final Object a() {
        if (this instanceof b) {
            return ((b) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getType() {
        if (this instanceof b) {
            return "particles";
        }
        if (this instanceof c) {
            return "solid";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().E8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
