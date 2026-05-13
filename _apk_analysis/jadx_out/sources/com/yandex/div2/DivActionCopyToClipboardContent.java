package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivActionCopyToClipboardContent.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class DivActionCopyToClipboardContent implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f54270b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivActionCopyToClipboardContent> f54271c = new sn.p<ParsingEnvironment, JSONObject, DivActionCopyToClipboardContent>() { // from class: com.yandex.div2.DivActionCopyToClipboardContent$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivActionCopyToClipboardContent mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivActionCopyToClipboardContent.f54270b.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f54272a;

    /* JADX INFO: compiled from: DivActionCopyToClipboardContent.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivActionCopyToClipboardContent a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) throws ParsingException {
            return BuiltInParserKt.getBuiltInParserComponent().c0().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    /* JADX INFO: compiled from: DivActionCopyToClipboardContent.kt */
    public static final class b extends DivActionCopyToClipboardContent {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final ContentText f54273d;

        public b(@NotNull ContentText contentText) {
            super(null);
            this.f54273d = contentText;
        }

        @NotNull
        public final ContentText c() {
            return this.f54273d;
        }
    }

    /* JADX INFO: compiled from: DivActionCopyToClipboardContent.kt */
    public static final class c extends DivActionCopyToClipboardContent {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final ContentUrl f54274d;

        public c(@NotNull ContentUrl contentUrl) {
            super(null);
            this.f54274d = contentUrl;
        }

        @NotNull
        public final ContentUrl c() {
            return this.f54274d;
        }
    }

    public DivActionCopyToClipboardContent() {
    }

    public /* synthetic */ DivActionCopyToClipboardContent(tn.i iVar) {
        this();
    }

    public final boolean a(@Nullable DivActionCopyToClipboardContent divActionCopyToClipboardContent, @NotNull ExpressionResolver expressionResolver, @NotNull ExpressionResolver expressionResolver2) {
        if (divActionCopyToClipboardContent == null) {
            return false;
        }
        if (this instanceof b) {
            ContentText contentTextC = ((b) this).c();
            Object objB = divActionCopyToClipboardContent.b();
            return contentTextC.a(objB instanceof ContentText ? (ContentText) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new NoWhenBranchMatchedException();
        }
        ContentUrl contentUrlC = ((c) this).c();
        Object objB2 = divActionCopyToClipboardContent.b();
        return contentUrlC.a(objB2 instanceof ContentUrl ? (ContentUrl) objB2 : null, expressionResolver, expressionResolver2);
    }

    @NotNull
    public final Object b() {
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f54272a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(getClass()).hashCode();
        if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else {
            if (!(this instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            iHash = ((c) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f54272a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().c0().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
