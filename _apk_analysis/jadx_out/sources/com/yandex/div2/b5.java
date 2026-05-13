package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivTooltipMode;
import com.yandex.div2.DivTooltipModeTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTooltipModeJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class b5 implements TemplateResolver<JSONObject, DivTooltipModeTemplate, DivTooltipMode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58723a;

    public b5(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58723a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivTooltipMode resolve(@NotNull ParsingContext parsingContext, @NotNull DivTooltipModeTemplate divTooltipModeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divTooltipModeTemplate instanceof DivTooltipModeTemplate.c) {
            return new DivTooltipMode.c(this.f58723a.a9().getValue().resolve(parsingContext, ((DivTooltipModeTemplate.c) divTooltipModeTemplate).b(), jSONObject));
        }
        if (divTooltipModeTemplate instanceof DivTooltipModeTemplate.b) {
            return new DivTooltipMode.b(this.f58723a.X8().getValue().resolve(parsingContext, ((DivTooltipModeTemplate.b) divTooltipModeTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
