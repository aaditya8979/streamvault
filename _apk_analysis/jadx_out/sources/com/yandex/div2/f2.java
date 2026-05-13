package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivInputValidator;
import com.yandex.div2.DivInputValidatorTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivInputValidatorJsonParser.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class f2 implements TemplateResolver<JSONObject, DivInputValidatorTemplate, DivInputValidator> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58773a;

    public f2(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58773a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivInputValidator resolve(@NotNull ParsingContext parsingContext, @NotNull DivInputValidatorTemplate divInputValidatorTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divInputValidatorTemplate instanceof DivInputValidatorTemplate.c) {
            return new DivInputValidator.c(this.f58773a.L4().getValue().resolve(parsingContext, ((DivInputValidatorTemplate.c) divInputValidatorTemplate).b(), jSONObject));
        }
        if (divInputValidatorTemplate instanceof DivInputValidatorTemplate.b) {
            return new DivInputValidator.b(this.f58773a.F4().getValue().resolve(parsingContext, ((DivInputValidatorTemplate.b) divInputValidatorTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
