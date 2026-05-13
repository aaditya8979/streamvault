package com.yandex.div2;

import com.yandex.div.internal.parser.JsonFieldResolver;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivPatch;
import com.yandex.div2.DivPatchTemplate;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPatchJsonParser.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class v2 implements TemplateResolver<JSONObject, DivPatchTemplate.ChangeTemplate, DivPatch.Change> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f59026a;

    public v2(@NotNull JsonParserComponent jsonParserComponent) {
        this.f59026a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivPatch.Change resolve(@NotNull ParsingContext parsingContext, @NotNull DivPatchTemplate.ChangeTemplate changeTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        return new DivPatch.Change((String) JsonFieldResolver.resolve(parsingContext, changeTemplate.f56512a, jSONObject, "id"), JsonFieldResolver.resolveOptionalList(parsingContext, changeTemplate.f56513b, jSONObject, "items", this.f59026a.O4(), this.f59026a.M4()));
    }
}
