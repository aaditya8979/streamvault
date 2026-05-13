package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivInputFilterTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputFilterTemplate.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class DivInputFilterTemplate implements JSONSerializable, JsonTemplate<DivInputFilter> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f56020a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivInputFilterTemplate> f56021b = new sn.p<ParsingEnvironment, JSONObject, DivInputFilterTemplate>() { // from class: com.yandex.div2.DivInputFilterTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivInputFilterTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivInputFilterTemplate.a.b(DivInputFilterTemplate.f56020a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivInputFilterTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivInputFilterTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivInputFilterTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().n4().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivInputFilterTemplate.kt */
    public static final class b extends DivInputFilterTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivInputFilterExpressionTemplate f56022c;

        public b(@NotNull DivInputFilterExpressionTemplate divInputFilterExpressionTemplate) {
            super(null);
            this.f56022c = divInputFilterExpressionTemplate;
        }

        @NotNull
        public final DivInputFilterExpressionTemplate b() {
            return this.f56022c;
        }
    }

    /* JADX INFO: compiled from: DivInputFilterTemplate.kt */
    public static final class c extends DivInputFilterTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final DivInputFilterRegexTemplate f56023c;

        public c(@NotNull DivInputFilterRegexTemplate divInputFilterRegexTemplate) {
            super(null);
            this.f56023c = divInputFilterRegexTemplate;
        }

        @NotNull
        public final DivInputFilterRegexTemplate b() {
            return this.f56023c;
        }
    }

    public DivInputFilterTemplate() {
    }

    public /* synthetic */ DivInputFilterTemplate(tn.i iVar) {
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
        return BuiltInParserKt.getBuiltInParserComponent().n4().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
