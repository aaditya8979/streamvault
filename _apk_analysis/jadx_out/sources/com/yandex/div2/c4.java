package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivStrokeStyle;
import com.yandex.div2.DivStrokeStyleTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivStrokeStyleJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class c4 implements TemplateResolver<JSONObject, DivStrokeStyleTemplate, DivStrokeStyle> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58737a;

    public c4(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58737a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivStrokeStyle resolve(@NotNull ParsingContext parsingContext, @NotNull DivStrokeStyleTemplate divStrokeStyleTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divStrokeStyleTemplate instanceof DivStrokeStyleTemplate.c) {
            return new DivStrokeStyle.c(this.f58737a.N7().getValue().resolve(parsingContext, ((DivStrokeStyleTemplate.c) divStrokeStyleTemplate).b(), jSONObject));
        }
        if (divStrokeStyleTemplate instanceof DivStrokeStyleTemplate.b) {
            return new DivStrokeStyle.b(this.f58737a.H7().getValue().resolve(parsingContext, ((DivStrokeStyleTemplate.b) divStrokeStyleTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
