package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivVideoSource;
import io.bidmachine.iab.vast.tags.VastAttributes;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivVideoSourceJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class j5 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58847a;

    public j5(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58847a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivVideoSource deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivVideoSource(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, VastAttributes.BITRATE, TypeHelpersKt.TYPE_HELPER_INT, ParsingConvertersKt.NUMBER_TO_INT), JsonExpressionParser.readExpression(parsingContext, jSONObject, "mime_type", TypeHelpersKt.TYPE_HELPER_STRING), (DivVideoSource.Resolution) JsonPropertyParser.readOptional(parsingContext, jSONObject, "resolution", this.f58847a.t9()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "url", TypeHelpersKt.TYPE_HELPER_URI, ParsingConvertersKt.ANY_TO_URI));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivVideoSource divVideoSource) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, VastAttributes.BITRATE, divVideoSource.f58180a);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "mime_type", divVideoSource.f58181b);
        JsonPropertyParser.write(parsingContext, jSONObject, "resolution", divVideoSource.f58182c, this.f58847a.t9());
        JsonPropertyParser.write(parsingContext, jSONObject, "type", "video_source");
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "url", divVideoSource.f58183d, ParsingConvertersKt.URI_TO_STRING);
        return jSONObject;
    }
}
