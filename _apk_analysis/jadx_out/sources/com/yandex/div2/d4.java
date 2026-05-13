package com.yandex.div2;

import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.JsonPropertyParser;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivTabs;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTabsJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class d4 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58753a;

    public d4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58753a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTabs.Item deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivTabs.Item((Div) JsonPropertyParser.read(parsingContext, jSONObject, "div", this.f58753a.M4()), JsonExpressionParser.readExpression(parsingContext, jSONObject, "title", TypeHelpersKt.TYPE_HELPER_STRING), (DivAction) JsonPropertyParser.readOptional(parsingContext, jSONObject, "title_click_action", this.f58753a.u0()));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivTabs.Item item) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonPropertyParser.write(parsingContext, jSONObject, "div", item.f57421a, this.f58753a.M4());
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "title", item.f57422b);
        JsonPropertyParser.write(parsingContext, jSONObject, "title_click_action", item.f57423c, this.f58753a.u0());
        return jSONObject;
    }
}
