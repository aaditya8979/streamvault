package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.internal.parser.TypeHelpersKt;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextTemplate;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class j4 implements TemplateResolver<JSONObject, DivTextTemplate.EllipsisTemplate, DivText.Ellipsis> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58846a;

    public j4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58846a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivText.Ellipsis resolve(@NotNull ParsingContext parsingContext, @NotNull DivTextTemplate.EllipsisTemplate ellipsisTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivText.Ellipsis(JsonFieldResolver.resolveOptionalList(parsingContext, ellipsisTemplate.f57906a, jSONObject, "actions", this.f58846a.w0(), this.f58846a.u0()), JsonFieldResolver.resolveOptionalList(parsingContext, ellipsisTemplate.f57907b, jSONObject, "images", this.f58846a.o8(), this.f58846a.m8()), JsonFieldResolver.resolveOptionalList(parsingContext, ellipsisTemplate.f57908c, jSONObject, "ranges", this.f58846a.A8(), this.f58846a.y8()), JsonFieldResolver.resolveExpression(parsingContext, ellipsisTemplate.f57909d, jSONObject, "text", TypeHelpersKt.TYPE_HELPER_STRING));
    }
}
