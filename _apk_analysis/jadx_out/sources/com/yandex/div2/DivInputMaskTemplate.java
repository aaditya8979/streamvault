package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivInputMaskTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputMaskTemplate.kt */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DivInputMaskTemplate implements JSONSerializable, JsonTemplate<DivInputMask> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56059a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivInputMaskTemplate> f56060b = new sn.p<ParsingEnvironment, JSONObject, DivInputMaskTemplate>() { // from class: com.yandex.div2.DivInputMaskTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputMaskTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputMaskTemplate.a.b(DivInputMaskTemplate.f56059a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivInputMaskTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivInputMaskTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivInputMaskTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().w4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivInputMaskTemplate.kt */
    public static final class b extends DivInputMaskTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivCurrencyInputMaskTemplate f56061c;

        public b(@NotNull DivCurrencyInputMaskTemplate divCurrencyInputMaskTemplate) {
            super(null);
            this.f56061c = divCurrencyInputMaskTemplate;
        }

        @NotNull
        public final DivCurrencyInputMaskTemplate b() {
            return this.f56061c;
        }
    }

    /* JADX INFO: compiled from: DivInputMaskTemplate.kt */
    public static final class c extends DivInputMaskTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivFixedLengthInputMaskTemplate f56062c;

        public c(@NotNull DivFixedLengthInputMaskTemplate divFixedLengthInputMaskTemplate) {
            super(null);
            this.f56062c = divFixedLengthInputMaskTemplate;
        }

        @NotNull
        public final DivFixedLengthInputMaskTemplate b() {
            return this.f56062c;
        }
    }

    /* JADX INFO: compiled from: DivInputMaskTemplate.kt */
    public static final class d extends DivInputMaskTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivPhoneInputMaskTemplate f56063c;

        public d(@NotNull DivPhoneInputMaskTemplate divPhoneInputMaskTemplate) {
            super(null);
            this.f56063c = divPhoneInputMaskTemplate;
        }

        @NotNull
        public final DivPhoneInputMaskTemplate b() {
            return this.f56063c;
        }
    }

    public DivInputMaskTemplate() {
    }

    public /* synthetic */ DivInputMaskTemplate(tn.i iVar) {
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
        if (this instanceof d) {
            return ((d) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getType() {
        if (this instanceof c) {
            return "fixed_length";
        }
        if (this instanceof b) {
            return "currency";
        }
        if (this instanceof d) {
            return "phone";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().w4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
