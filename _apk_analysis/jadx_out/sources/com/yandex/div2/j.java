package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionScrollDestination;
import com.yandex.div2.DivActionScrollDestinationTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionScrollDestinationJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j implements TemplateResolver<JSONObject, DivActionScrollDestinationTemplate, DivActionScrollDestination> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58841a;

    public j(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58841a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionScrollDestination resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionScrollDestinationTemplate divActionScrollDestinationTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.d) {
            return new DivActionScrollDestination.d(this.f58841a.W9().getValue().resolve(parsingContext, ((DivActionScrollDestinationTemplate.d) divActionScrollDestinationTemplate).b(), jSONObject));
        }
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.c) {
            return new DivActionScrollDestination.c(this.f58841a.H9().getValue().resolve(parsingContext, ((DivActionScrollDestinationTemplate.c) divActionScrollDestinationTemplate).b(), jSONObject));
        }
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.e) {
            return new DivActionScrollDestination.e(this.f58841a.ca().getValue().resolve(parsingContext, ((DivActionScrollDestinationTemplate.e) divActionScrollDestinationTemplate).b(), jSONObject));
        }
        if (divActionScrollDestinationTemplate instanceof DivActionScrollDestinationTemplate.b) {
            return new DivActionScrollDestination.b(this.f58841a.E9().getValue().resolve(parsingContext, ((DivActionScrollDestinationTemplate.b) divActionScrollDestinationTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
