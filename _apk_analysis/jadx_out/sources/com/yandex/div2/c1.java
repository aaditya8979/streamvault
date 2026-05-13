package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivDrawable;
import com.yandex.div2.DivDrawableTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivDrawableJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class c1 implements TemplateResolver<JSONObject, DivDrawableTemplate, DivDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58730a;

    public c1(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58730a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivDrawable resolve(@NotNull ParsingContext parsingContext, @NotNull DivDrawableTemplate divDrawableTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divDrawableTemplate instanceof DivDrawableTemplate.b) {
            return new DivDrawable.b(this.f58730a.U6().getValue().resolve(parsingContext, ((DivDrawableTemplate.b) divDrawableTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
