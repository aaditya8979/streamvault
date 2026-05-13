package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivText;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class h4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58816a;

    public h4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58816a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivText.Ellipsis deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivText.Ellipsis(JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "actions", this.f58816a.u0()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "images", this.f58816a.m8()), JsonPropertyParser.readOptionalList(parsingContext, jSONObject, "ranges", this.f58816a.y8()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivText.Ellipsis ellipsis) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.writeList(parsingContext, jSONObject, "actions", ellipsis.f57652a, this.f58816a.u0());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "images", ellipsis.f57653b, this.f58816a.m8());
        JsonPropertyParser.writeList(parsingContext, jSONObject, "ranges", ellipsis.f57654c, this.f58816a.y8());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "text", ellipsis.f57655d);
        return jSONObject;
    }
}
