package com.yandex.div2;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import com.yandex.div2.DivPatch;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivPatch.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DivPatch implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f56481f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final Expression<Mode> f56482g = Expression.Companion.constant$default(Expression.Companion, Mode.PARTIAL, null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final sn.p<ParsingEnvironment, JSONObject, DivPatch> f56483h = new sn.p<ParsingEnvironment, JSONObject, DivPatch>() { // from class: com.yandex.div2.DivPatch$Companion$CREATOR$1
        @Override // sn.p
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final DivPatch mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return DivPatch.f56481f.a(parsingEnvironment, jSONObject);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<Change> f56484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Expression<Mode> f56485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f56486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final List<DivAction> f56487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Integer f56488e;

    /* JADX INFO: compiled from: DivPatch.kt */
    public static final class Change implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final a f56489e = new a(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final sn.p<ParsingEnvironment, JSONObject, Change> f56490f = new sn.p<ParsingEnvironment, JSONObject, Change>() { // from class: com.yandex.div2.DivPatch$Change$Companion$CREATOR$1
            @Override // sn.p
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final DivPatch.Change mo2invoke(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return DivPatch.Change.f56489e.a(parsingEnvironment, jSONObject);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f56491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final List<Div> f56492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Integer f56493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Integer f56494d;

        /* JADX INFO: compiled from: DivPatch.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @NotNull
            public final Change a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
                return BuiltInParserKt.getBuiltInParserComponent().F5().getValue().deserialize(parsingEnvironment, jSONObject);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Change(@NotNull String str, @Nullable List<? extends Div> list) {
            this.f56491a = str;
            this.f56492b = list;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f56494d;
            if (num != null) {
                return num.intValue();
            }
            int iPropertiesHash = propertiesHash();
            List<Div> list = this.f56492b;
            int iHash = 0;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    iHash += ((Div) it.next()).hash();
                }
            }
            int i10 = iPropertiesHash + iHash;
            this.f56494d = Integer.valueOf(i10);
            return i10;
        }

        @Override // com.yandex.div.data.Hashable
        public int propertiesHash() {
            Integer num = this.f56493c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = tn.t.b(Change.class).hashCode() + this.f56491a.hashCode();
            this.f56493c = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        @NotNull
        public JSONObject writeToJSON() {
            return BuiltInParserKt.getBuiltInParserComponent().F5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    /* JADX INFO: compiled from: DivPatch.kt */
    public enum Mode {
        TRANSACTIONAL("transactional"),
        PARTIAL("partial");


        @NotNull
        private final String value;

        @NotNull
        public static final a Converter = new a(null);

        @NotNull
        public static final sn.l<Mode, String> TO_STRING = new sn.l<Mode, String>() { // from class: com.yandex.div2.DivPatch$Mode$Converter$TO_STRING$1
            @Override // sn.l
            @NotNull
            public final String invoke(@NotNull DivPatch.Mode mode) {
                return DivPatch.Mode.Converter.b(mode);
            }
        };

        @NotNull
        public static final sn.l<String, Mode> FROM_STRING = new sn.l<String, Mode>() { // from class: com.yandex.div2.DivPatch$Mode$Converter$FROM_STRING$1
            @Override // sn.l
            @Nullable
            public final DivPatch.Mode invoke(@NotNull String str) {
                return DivPatch.Mode.Converter.a(str);
            }
        };

        /* JADX INFO: compiled from: DivPatch.kt */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(tn.i iVar) {
                this();
            }

            @Nullable
            public final Mode a(@NotNull String str) {
                Mode mode = Mode.TRANSACTIONAL;
                if (tn.p.f(str, mode.value)) {
                    return mode;
                }
                Mode mode2 = Mode.PARTIAL;
                if (tn.p.f(str, mode2.value)) {
                    return mode2;
                }
                return null;
            }

            @NotNull
            public final String b(@NotNull Mode mode) {
                return mode.value;
            }
        }

        Mode(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: compiled from: DivPatch.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        @NotNull
        public final DivPatch a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject) {
            return BuiltInParserKt.getBuiltInParserComponent().I5().getValue().deserialize(parsingEnvironment, jSONObject);
        }
    }

    public DivPatch(@NotNull List<Change> list, @NotNull Expression<Mode> expression, @Nullable List<DivAction> list2, @Nullable List<DivAction> list3) {
        this.f56484a = list;
        this.f56485b = expression;
        this.f56486c = list2;
        this.f56487d = list3;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f56488e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = tn.t.b(DivPatch.class).hashCode();
        Iterator<T> it = this.f56484a.iterator();
        int iHash2 = 0;
        int iHash3 = 0;
        while (it.hasNext()) {
            iHash3 += ((Change) it.next()).hash();
        }
        int iHashCode2 = iHashCode + iHash3 + this.f56485b.hashCode();
        List<DivAction> list = this.f56486c;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            iHash = 0;
            while (it2.hasNext()) {
                iHash += ((DivAction) it2.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode2 + iHash;
        List<DivAction> list2 = this.f56487d;
        if (list2 != null) {
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                iHash2 += ((DivAction) it3.next()).hash();
            }
        }
        int i11 = i10 + iHash2;
        this.f56488e = Integer.valueOf(i11);
        return i11;
    }

    @Override // com.yandex.div.json.JSONSerializable
    @NotNull
    public JSONObject writeToJSON() {
        return BuiltInParserKt.getBuiltInParserComponent().I5().getValue().serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
