package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivShape;
import com.yandex.div2.DivShapeTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivShapeJsonParser.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class p3 implements TemplateResolver<JSONObject, DivShapeTemplate, DivShape> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58966a;

    public p3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58966a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivShape resolve(@NotNull ParsingContext parsingContext, @NotNull DivShapeTemplate divShapeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divShapeTemplate instanceof DivShapeTemplate.c) {
            return new DivShape.c(this.f58966a.z6().getValue().resolve(parsingContext, ((DivShapeTemplate.c) divShapeTemplate).b(), jSONObject));
        }
        if (divShapeTemplate instanceof DivShapeTemplate.a) {
            return new DivShape.a(this.f58966a.Z1().getValue().resolve(parsingContext, ((DivShapeTemplate.a) divShapeTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
