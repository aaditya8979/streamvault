package io.bidmachine.utils;

import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.MessageLite;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import io.bidmachine.util.UtilsKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sn.l;
import tn.p;

/* JADX INFO: compiled from: ProtoUtils.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0003H\u0000\u001a.\u0010\u0004\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u0002H\u0006\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0000\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0005H\u0000\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0010H\u0000\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0011H\u0000\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0012\u001a\u00020\n*\u00020\u0005H\u0000\u001a\f\u0010\u0012\u001a\u00020\n*\u00020\u0013H\u0000\u001a\f\u0010\u0012\u001a\u00020\n*\u00020\u000fH\u0000\u001a\f\u0010\u0012\u001a\u00020\n*\u00020\fH\u0000\u001a\f\u0010\u0012\u001a\u00020\n*\u00020\u0010H\u0000\u001a\f\u0010\u0012\u001a\u00020\n*\u00020\u0011H\u0000\u001a\f\u0010\u0012\u001a\u00020\n*\u00020\u0001H\u0000¨\u0006\u0014"}, d2 = {"encodeToStringBase64Safely", "", "Lcom/explorestack/protobuf/MessageLite;", "Lcom/explorestack/protobuf/MessageLite$Builder;", "mapNotNullToProtoListValue", "Lcom/explorestack/protobuf/ListValue;", "T", "", "transform", "Lkotlin/Function1;", "Lcom/explorestack/protobuf/Value;", "putField", "Lcom/explorestack/protobuf/Struct$Builder;", "key", "value", "Lcom/explorestack/protobuf/Struct;", "", "", "toProtoValue", "Lcom/explorestack/protobuf/ListValue$Builder;", "bidmachine-android-sdk_bi_3_3_0"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ProtoUtilsKt {
    @Nullable
    public static final String encodeToStringBase64Safely(@NotNull MessageLite.Builder builder) {
        p.k(builder, "<this>");
        try {
            MessageLite messageLiteBuild = builder.build();
            p.j(messageLiteBuild, "build()");
            return encodeToStringBase64Safely(messageLiteBuild);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final String encodeToStringBase64Safely(@NotNull MessageLite messageLite) {
        p.k(messageLite, "<this>");
        try {
            byte[] byteArray = messageLite.toByteArray();
            p.j(byteArray, "toByteArray()");
            return UtilsKt.encodeToStringBase64$default(byteArray, 0, 1, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @NotNull
    public static final <T> ListValue mapNotNullToProtoListValue(@NotNull List<? extends T> list, @NotNull l<? super T, Value> lVar) {
        p.k(list, "<this>");
        p.k(lVar, "transform");
        ListValue.Builder builderNewBuilder = ListValue.newBuilder();
        p.j(builderNewBuilder, "newBuilder()");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Value valueInvoke = lVar.invoke(it.next());
            if (valueInvoke != null) {
                builderNewBuilder.addValues(valueInvoke);
            }
        }
        ListValue listValueBuild = builderNewBuilder.build();
        p.j(listValueBuild, "listValueBuilder.build()");
        return listValueBuild;
    }

    @NotNull
    public static final Struct.Builder putField(@NotNull Struct.Builder builder, @NotNull String str, @NotNull ListValue listValue) {
        p.k(builder, "<this>");
        p.k(str, "key");
        p.k(listValue, "value");
        builder.putFields(str, toProtoValue(listValue));
        return builder;
    }

    @NotNull
    public static final Struct.Builder putField(@NotNull Struct.Builder builder, @NotNull String str, @NotNull Struct struct) {
        p.k(builder, "<this>");
        p.k(str, "key");
        p.k(struct, "value");
        builder.putFields(str, toProtoValue(struct));
        return builder;
    }

    @NotNull
    public static final Struct.Builder putField(@NotNull Struct.Builder builder, @NotNull String str, @NotNull Number number) {
        p.k(builder, "<this>");
        p.k(str, "key");
        p.k(number, "value");
        builder.putFields(str, toProtoValue(number));
        return builder;
    }

    @NotNull
    public static final Struct.Builder putField(@NotNull Struct.Builder builder, @NotNull String str, @NotNull String str2) {
        p.k(builder, "<this>");
        p.k(str, "key");
        p.k(str2, "value");
        builder.putFields(str, toProtoValue(str2));
        return builder;
    }

    @NotNull
    public static final Struct.Builder putField(@NotNull Struct.Builder builder, @NotNull String str, boolean z10) {
        p.k(builder, "<this>");
        p.k(str, "key");
        builder.putFields(str, toProtoValue(z10));
        return builder;
    }

    @NotNull
    public static final Value toProtoValue(@NotNull ListValue.Builder builder) {
        p.k(builder, "<this>");
        ListValue listValueBuild = builder.build();
        p.j(listValueBuild, "build()");
        return toProtoValue(listValueBuild);
    }

    @NotNull
    public static final Value toProtoValue(@NotNull ListValue listValue) {
        p.k(listValue, "<this>");
        Value valueBuild = Value.newBuilder().setListValue(listValue).build();
        p.j(valueBuild, "newBuilder()\n        .se…ue(this)\n        .build()");
        return valueBuild;
    }

    @NotNull
    public static final Value toProtoValue(@NotNull Struct.Builder builder) {
        p.k(builder, "<this>");
        Struct structBuild = builder.build();
        p.j(structBuild, "build()");
        return toProtoValue(structBuild);
    }

    @NotNull
    public static final Value toProtoValue(@NotNull Struct struct) {
        p.k(struct, "<this>");
        Value valueBuild = Value.newBuilder().setStructValue(struct).build();
        p.j(valueBuild, "newBuilder()\n        .se…ue(this)\n        .build()");
        return valueBuild;
    }

    @NotNull
    public static final Value toProtoValue(@NotNull Number number) {
        p.k(number, "<this>");
        Value.Builder builderNewBuilder = Value.newBuilder();
        Double doubleOrDefault$default = UtilsKt.toDoubleOrDefault$default(number, null, 1, null);
        Value valueBuild = builderNewBuilder.setNumberValue(doubleOrDefault$default != null ? doubleOrDefault$default.doubleValue() : number.doubleValue()).build();
        p.j(valueBuild, "newBuilder()\n        .se…ouble())\n        .build()");
        return valueBuild;
    }

    @NotNull
    public static final Value toProtoValue(@NotNull String str) {
        p.k(str, "<this>");
        Value valueBuild = Value.newBuilder().setStringValue(str).build();
        p.j(valueBuild, "newBuilder()\n        .se…ue(this)\n        .build()");
        return valueBuild;
    }

    @NotNull
    public static final Value toProtoValue(boolean z10) {
        Value valueBuild = Value.newBuilder().setBoolValue(z10).build();
        p.j(valueBuild, "newBuilder()\n        .se…ue(this)\n        .build()");
        return valueBuild;
    }
}
