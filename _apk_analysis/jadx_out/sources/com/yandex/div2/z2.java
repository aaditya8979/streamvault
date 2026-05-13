package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivPivot;
import com.yandex.div2.DivPivotTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPivotJsonParser.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class z2 implements TemplateResolver<JSONObject, DivPivotTemplate, DivPivot> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59090a;

    public z2(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59090a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPivot resolve(@NotNull ParsingContext parsingContext, @NotNull DivPivotTemplate divPivotTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divPivotTemplate instanceof DivPivotTemplate.b) {
            return new DivPivot.b(this.f59090a.S5().getValue().resolve(parsingContext, ((DivPivotTemplate.b) divPivotTemplate).b(), jSONObject));
        }
        if (divPivotTemplate instanceof DivPivotTemplate.c) {
            return new DivPivot.c(this.f59090a.Y5().getValue().resolve(parsingContext, ((DivPivotTemplate.c) divPivotTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
