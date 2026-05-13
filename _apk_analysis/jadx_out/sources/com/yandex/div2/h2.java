package com.yandex.div2;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.Div;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class h2 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58814a;

    public h2(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58814a = jsonParserComponent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Div deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        String string = JsonPropertyParser.readString(parsingContext, jSONObject, "type");
        switch (string.hashCode()) {
            case -1349088399:
                if (string.equals("custom")) {
                    return new Div.c(this.f58814a.B2().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -906021636:
                if (string.equals("select")) {
                    return new Div.k(this.f58814a.D6().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -899647263:
                if (string.equals("slider")) {
                    return new Div.m(this.f58814a.h7().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -889473228:
                if (string.equals("switch")) {
                    return new Div.o(this.f58814a.O7().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -711999985:
                if (string.equals("indicator")) {
                    return new Div.h(this.f58814a.d4().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -410956671:
                if (string.equals("container")) {
                    return new Div.b(this.f58814a.m2().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case -196315310:
                if (string.equals("gallery")) {
                    return new Div.d(this.f58814a.L3().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 102340:
                if (string.equals("gif")) {
                    return new Div.e(this.f58814a.O3().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 3181382:
                if (string.equals("grid")) {
                    return new Div.f(this.f58814a.R3().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 3552126:
                if (string.equals("tabs")) {
                    return new Div.p(this.f58814a.U7().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 3556653:
                if (string.equals("text")) {
                    return new Div.q(this.f58814a.p8().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 100313435:
                if (string.equals("image")) {
                    return new Div.g(this.f58814a.X3().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 100358090:
                if (string.equals("input")) {
                    return new Div.i(this.f58814a.s4().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 106426307:
                if (string.equals("pager")) {
                    return new Div.j(this.f58814a.z5().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 109757585:
                if (string.equals("state")) {
                    return new Div.n(this.f58814a.t7().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 112202875:
                if (string.equals("video")) {
                    return new Div.r(this.f58814a.n9().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
            case 1732829925:
                if (string.equals("separator")) {
                    return new Div.l(this.f58814a.M6().getValue().deserialize(parsingContext, jSONObject));
                }
                break;
        }
        EntityTemplate orThrow = parsingContext.getTemplates().getOrThrow(string, jSONObject);
        DivTemplate divTemplate = orThrow instanceof DivTemplate ? (DivTemplate) orThrow : null;
        if (divTemplate != null) {
            return this.f58814a.O4().getValue().resolve(parsingContext, divTemplate, jSONObject);
        }
        throw ParsingExceptionKt.typeMismatch(jSONObject, "type", string);
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull Div div) throws ParsingException {
        if (div instanceof Div.g) {
            return this.f58814a.X3().getValue().serialize(parsingContext, ((Div.g) div).c());
        }
        if (div instanceof Div.e) {
            return this.f58814a.O3().getValue().serialize(parsingContext, ((Div.e) div).c());
        }
        if (div instanceof Div.q) {
            return this.f58814a.p8().getValue().serialize(parsingContext, ((Div.q) div).c());
        }
        if (div instanceof Div.l) {
            return this.f58814a.M6().getValue().serialize(parsingContext, ((Div.l) div).c());
        }
        if (div instanceof Div.b) {
            return this.f58814a.m2().getValue().serialize(parsingContext, ((Div.b) div).c());
        }
        if (div instanceof Div.f) {
            return this.f58814a.R3().getValue().serialize(parsingContext, ((Div.f) div).c());
        }
        if (div instanceof Div.d) {
            return this.f58814a.L3().getValue().serialize(parsingContext, ((Div.d) div).c());
        }
        if (div instanceof Div.j) {
            return this.f58814a.z5().getValue().serialize(parsingContext, ((Div.j) div).c());
        }
        if (div instanceof Div.p) {
            return this.f58814a.U7().getValue().serialize(parsingContext, ((Div.p) div).c());
        }
        if (div instanceof Div.n) {
            return this.f58814a.t7().getValue().serialize(parsingContext, ((Div.n) div).c());
        }
        if (div instanceof Div.c) {
            return this.f58814a.B2().getValue().serialize(parsingContext, ((Div.c) div).c());
        }
        if (div instanceof Div.h) {
            return this.f58814a.d4().getValue().serialize(parsingContext, ((Div.h) div).c());
        }
        if (div instanceof Div.m) {
            return this.f58814a.h7().getValue().serialize(parsingContext, ((Div.m) div).c());
        }
        if (div instanceof Div.o) {
            return this.f58814a.O7().getValue().serialize(parsingContext, ((Div.o) div).c());
        }
        if (div instanceof Div.i) {
            return this.f58814a.s4().getValue().serialize(parsingContext, ((Div.i) div).c());
        }
        if (div instanceof Div.k) {
            return this.f58814a.D6().getValue().serialize(parsingContext, ((Div.k) div).c());
        }
        if (div instanceof Div.r) {
            return this.f58814a.n9().getValue().serialize(parsingContext, ((Div.r) div).c());
        }
        throw new NoWhenBranchMatchedException();
    }
}
