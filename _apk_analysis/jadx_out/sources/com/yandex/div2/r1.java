package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivIndicatorItemPlacement;
import com.yandex.div2.DivIndicatorItemPlacementTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivIndicatorItemPlacementJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class r1 implements TemplateResolver<JSONObject, DivIndicatorItemPlacementTemplate, DivIndicatorItemPlacement> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58989a;

    public r1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58989a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivIndicatorItemPlacement resolve(@NotNull ParsingContext parsingContext, @NotNull DivIndicatorItemPlacementTemplate divIndicatorItemPlacementTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divIndicatorItemPlacementTemplate instanceof DivIndicatorItemPlacementTemplate.b) {
            return new DivIndicatorItemPlacement.b(this.f58989a.L2().getValue().resolve(parsingContext, ((DivIndicatorItemPlacementTemplate.b) divIndicatorItemPlacementTemplate).b(), jSONObject));
        }
        if (divIndicatorItemPlacementTemplate instanceof DivIndicatorItemPlacementTemplate.c) {
            return new DivIndicatorItemPlacement.c(this.f58989a.B7().getValue().resolve(parsingContext, ((DivIndicatorItemPlacementTemplate.c) divIndicatorItemPlacementTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
