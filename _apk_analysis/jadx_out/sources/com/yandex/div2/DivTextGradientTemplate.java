package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivTextGradientTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextGradientTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class DivTextGradientTemplate implements JSONSerializable, JsonTemplate<DivTextGradient> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f57717a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivTextGradientTemplate> f57718b = new sn.p<ParsingEnvironment, JSONObject, DivTextGradientTemplate>() { // from class: com.yandex.div2.DivTextGradientTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivTextGradientTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivTextGradientTemplate.a.b(DivTextGradientTemplate.f57717a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivTextGradientTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivTextGradientTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivTextGradientTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().h8().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivTextGradientTemplate.kt */
    public static final class b extends DivTextGradientTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivLinearGradientTemplate f57719c;

        public b(@NotNull DivLinearGradientTemplate divLinearGradientTemplate) {
            super(null);
            this.f57719c = divLinearGradientTemplate;
        }

        @NotNull
        public final DivLinearGradientTemplate b() {
            return this.f57719c;
        }
    }

    /* JADX INFO: compiled from: DivTextGradientTemplate.kt */
    public static final class c extends DivTextGradientTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivRadialGradientTemplate f57720c;

        public c(@NotNull DivRadialGradientTemplate divRadialGradientTemplate) {
            super(null);
            this.f57720c = divRadialGradientTemplate;
        }

        @NotNull
        public final DivRadialGradientTemplate b() {
            return this.f57720c;
        }
    }

    public DivTextGradientTemplate() {
    }

    public /* synthetic */ DivTextGradientTemplate(tn.i iVar) {
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
            return "gradient";
        }
        if (this instanceof c) {
            return "radial_gradient";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().h8().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
