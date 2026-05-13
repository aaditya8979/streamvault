package io.bidmachine.analytics.internal;

import com.explorestack.protobuf.ListValue;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Timestamp;
import com.explorestack.protobuf.Value;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u001b\u0010\u0002\u001a\u00020\b*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0007H\u0000¢\u0006\u0004\b\u0002\u0010\t\u001a\u0017\u0010\u0002\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\nH\u0000¢\u0006\u0004\b\u0002\u0010\f¨\u0006\r"}, d2 = {"", "Lcom/explorestack/protobuf/Timestamp;", "a", "(J)Lcom/explorestack/protobuf/Timestamp;", "", "Lcom/explorestack/protobuf/StringValue;", "(Ljava/lang/String;)Lcom/explorestack/protobuf/StringValue;", "", "Lcom/explorestack/protobuf/Struct;", "(Ljava/util/Map;)Lcom/explorestack/protobuf/Struct;", "", "Lcom/explorestack/protobuf/ListValue;", "(Ljava/util/List;)Lcom/explorestack/protobuf/ListValue;", "bidmachine-android-sdk_bh_3_3_0"}, k = 2, mv = {1, 7, 1})
public final class b0 {
    public static final ListValue a(List<?> list) {
        ListValue.Builder builderNewBuilder = ListValue.newBuilder();
        for (Object obj : list) {
            try {
                Result.a aVar = Result.Companion;
                Result.m7534constructorimpl(builderNewBuilder.addValues((obj instanceof List ? Value.newBuilder().setListValue(a((List<?>) obj)) : obj instanceof Map ? Value.newBuilder().setStructValue(a((Map<?, ?>) obj)) : obj instanceof Boolean ? Value.newBuilder().setBoolValue(((Boolean) obj).booleanValue()) : obj instanceof Number ? Value.newBuilder().setNumberValue(((Number) obj).doubleValue()) : Value.newBuilder().setStringValue(String.valueOf(obj))).build()));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                Result.m7534constructorimpl(kotlin.c.a(th2));
            }
        }
        return builderNewBuilder.build();
    }

    public static final StringValue a(String str) {
        return StringValue.newBuilder().setValue(str).build();
    }

    public static final Struct a(Map<?, ?> map) {
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            try {
                Result.a aVar = Result.Companion;
                Result.m7534constructorimpl(builderNewBuilder.putFields(String.valueOf(key), (value instanceof List ? Value.newBuilder().setListValue(a((List<?>) value)) : value instanceof Map ? Value.newBuilder().setStructValue(a((Map<?, ?>) value)) : value instanceof Boolean ? Value.newBuilder().setBoolValue(((Boolean) value).booleanValue()) : value instanceof Number ? Value.newBuilder().setNumberValue(((Number) value).doubleValue()) : Value.newBuilder().setStringValue(String.valueOf(value))).build()));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                Result.m7534constructorimpl(kotlin.c.a(th2));
            }
        }
        return builderNewBuilder.build();
    }

    public static final Timestamp a(long j10) {
        long j11 = 1000;
        return Timestamp.newBuilder().setSeconds(j10 / j11).setNanos((int) ((j10 % j11) * ((long) 1000000))).build();
    }
}
