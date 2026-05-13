package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivInput;
import com.yandex.div2.DivInputTemplate;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a2 implements TemplateResolver<JSONObject, DivInputTemplate.NativeInterfaceTemplate, DivInput.NativeInterface> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58709a;

    public a2(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58709a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInput.NativeInterface resolve(@NotNull ParsingContext parsingContext, @NotNull DivInputTemplate.NativeInterfaceTemplate nativeInterfaceTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivInput.NativeInterface(JsonFieldResolver.resolveExpression(parsingContext, nativeInterfaceTemplate.f56117a, jSONObject, "color", TypeHelpersKt.TYPE_HELPER_COLOR, ParsingConvertersKt.STRING_TO_COLOR_INT));
    }
}
