package com.yandex.div2;

import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.JsonTemplate;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivActionCopyToClipboardContentTemplate;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionCopyToClipboardContentTemplate.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class DivActionCopyToClipboardContentTemplate implements JSONSerializable, JsonTemplate<DivActionCopyToClipboardContent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f54275a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionCopyToClipboardContentTemplate> f54276b = new sn.p<ParsingEnvironment, JSONObject, DivActionCopyToClipboardContentTemplate>() { // from class: com.yandex.div2.DivActionCopyToClipboardContentTemplate$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionCopyToClipboardContentTemplate mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionCopyToClipboardContentTemplate.a.b(DivActionCopyToClipboardContentTemplate.f54275a, parsingEnvironment, false, jSONObject, 2, null);
        }
    };

    /* JADX INFO: compiled from: DivActionCopyToClipboardContentTemplate.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        public static /* synthetic */ DivActionCopyToClipboardContentTemplate b(a aVar, ParsingEnvironment parsingEnvironment, boolean z10, JSONObject jSONObject, int i10, Object obj) throws ParsingException {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(parsingEnvironment, z10, jSONObject);
        }

        @NotNull
        public final DivActionCopyToClipboardContentTemplate a(@NotNull ParsingEnvironment parsingEnvironment, boolean z10, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().d0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivActionCopyToClipboardContentTemplate.kt */
    public static final class b extends DivActionCopyToClipboardContentTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ContentTextTemplate f54277c;

        public b(@NotNull ContentTextTemplate contentTextTemplate) {
            super(null);
            this.f54277c = contentTextTemplate;
        }

        @NotNull
        public final ContentTextTemplate b() {
            return this.f54277c;
        }
    }

    /* JADX INFO: compiled from: DivActionCopyToClipboardContentTemplate.kt */
    public static final class c extends DivActionCopyToClipboardContentTemplate {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ContentUrlTemplate f54278c;

        public c(@NotNull ContentUrlTemplate contentUrlTemplate) {
            super(null);
            this.f54278c = contentUrlTemplate;
        }

        @NotNull
        public final ContentUrlTemplate b() {
            return this.f54278c;
        }
    }

    public DivActionCopyToClipboardContentTemplate() {
    }

    public /* synthetic */ DivActionCopyToClipboardContentTemplate(tn.i iVar) {
        this();
    }

    @NotNull
    public final Object a() {
        if (this instanceof b) {
            return ((b) this).b();
        }
        if (this instanceof c) {
            return ((c) this).b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public final String getType() {
        if (this instanceof b) {
            return "text";
        }
        if (this instanceof c) {
            return "url";
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().d0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
