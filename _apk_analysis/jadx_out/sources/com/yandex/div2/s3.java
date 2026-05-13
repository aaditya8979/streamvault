package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivSizeTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivSizeJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class s3 implements TemplateResolver<JSONObject, DivSizeTemplate, DivSize> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59001a;

    public s3(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59001a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivSize resolve(@NotNull ParsingContext parsingContext, @NotNull DivSizeTemplate divSizeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divSizeTemplate instanceof DivSizeTemplate.b) {
            return new DivSize.b(this.f59001a.y3().getValue().resolve(parsingContext, ((DivSizeTemplate.b) divSizeTemplate).b(), jSONObject));
        }
        if (divSizeTemplate instanceof DivSizeTemplate.c) {
            return new DivSize.c(this.f59001a.a5().getValue().resolve(parsingContext, ((DivSizeTemplate.c) divSizeTemplate).b(), jSONObject));
        }
        if (divSizeTemplate instanceof DivSizeTemplate.d) {
            return new DivSize.d(this.f59001a.B9().getValue().resolve(parsingContext, ((DivSizeTemplate.d) divSizeTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
