package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivInputValidatorTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputValidatorTemplate.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class DivInputValidatorTemplate implements JSONSerializable, JsonTemplate<DivInputValidator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56166a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivInputValidatorTemplate> f56167b = new sn.p<ParsingEnvironment, JSONObject, DivInputValidatorTemplate>() { // from class: com.yandex.div2.DivInputValidatorTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputValidatorTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputValidatorTemplate.a.b(DivInputValidatorTemplate.f56166a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivInputValidatorTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivInputValidatorTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivInputValidatorTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().H4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorTemplate.kt */
    public static final class b extends DivInputValidatorTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivInputValidatorExpressionTemplate f56168c;

        public b(@NotNull DivInputValidatorExpressionTemplate divInputValidatorExpressionTemplate) {
            super(null);
            this.f56168c = divInputValidatorExpressionTemplate;
        }

        @NotNull
        public final DivInputValidatorExpressionTemplate b() {
            return this.f56168c;
        }
    }

    /* JADX INFO: compiled from: DivInputValidatorTemplate.kt */
    public static final class c extends DivInputValidatorTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivInputValidatorRegexTemplate f56169c;

        public c(@NotNull DivInputValidatorRegexTemplate divInputValidatorRegexTemplate) {
            super(null);
            this.f56169c = divInputValidatorRegexTemplate;
        }

        @NotNull
        public final DivInputValidatorRegexTemplate b() {
            return this.f56169c;
        }
    }

    public DivInputValidatorTemplate() {
    }

    public /* synthetic */ DivInputValidatorTemplate(tn.i iVar) {
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
            return "regex";
        }
        if (this instanceof b) {
            return "expression";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().H4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
