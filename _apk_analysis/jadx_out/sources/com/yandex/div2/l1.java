package com.yandex.div2;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.yandex.div.internal.parser.JsonExpressionParser;
import com.yandex.div.internal.parser.TypeHelper;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.Deserializer;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.Serializer;
import com.yandex.div2.DivFocus;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivFocusJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class l1 implements Serializer, Deserializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58869a;

    public l1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58869a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.Deserializer
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivFocus.NextFocusIds deserialize(@NotNull ParsingContext parsingContext, @NotNull JSONObject jSONObject) throws ParsingException {
        TypeHelper<String> typeHelper = TypeHelpersKt.TYPE_HELPER_STRING;
        return new DivFocus.NextFocusIds(JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "down", typeHelper), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, ToolBar.FORWARD, typeHelper), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "left", typeHelper), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "right", typeHelper), JsonExpressionParser.readOptionalExpression(parsingContext, jSONObject, "up", typeHelper));
    }

    @Override // com.yandex.div.serialization.Serializer
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject serialize(@NotNull ParsingContext parsingContext, @NotNull DivFocus.NextFocusIds nextFocusIds) throws ParsingException {
        JSONObject jSONObject = new JSONObject();
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "down", nextFocusIds.f55357a);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, ToolBar.FORWARD, nextFocusIds.f55358b);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "left", nextFocusIds.f55359c);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "right", nextFocusIds.f55360d);
        JsonExpressionParser.writeExpression(parsingContext, jSONObject, "up", nextFocusIds.f55361e);
        return jSONObject;
    }
}
