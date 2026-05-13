package com.yandex.div2;

import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.ParsingContext;
import com.yandex.div.serialization.TemplateResolver;
import com.yandex.div2.DivActionCopyToClipboardContent;
import com.yandex.div2.DivActionCopyToClipboardContentTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionCopyToClipboardContentJsonParser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d implements TemplateResolver<JSONObject, DivActionCopyToClipboardContentTemplate, DivActionCopyToClipboardContent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final JsonParserComponent f58744a;

    public d(@NotNull JsonParserComponent jsonParserComponent) {
        this.f58744a = jsonParserComponent;
    }

    @Override // com.yandex.div.serialization.TemplateResolver
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public DivActionCopyToClipboardContent resolve(@NotNull ParsingContext parsingContext, @NotNull DivActionCopyToClipboardContentTemplate divActionCopyToClipboardContentTemplate, @NotNull JSONObject jSONObject) throws ParsingException {
        if (divActionCopyToClipboardContentTemplate instanceof DivActionCopyToClipboardContentTemplate.b) {
            return new DivActionCopyToClipboardContent.b(this.f58744a.u().getValue().resolve(parsingContext, ((DivActionCopyToClipboardContentTemplate.b) divActionCopyToClipboardContentTemplate).b(), jSONObject));
        }
        if (divActionCopyToClipboardContentTemplate instanceof DivActionCopyToClipboardContentTemplate.c) {
            return new DivActionCopyToClipboardContent.c(this.f58744a.x().getValue().resolve(parsingContext, ((DivActionCopyToClipboardContentTemplate.c) divActionCopyToClipboardContentTemplate).b(), jSONObject));
        }
        throw new NoWhenBranchMatchedException();
    }
}
